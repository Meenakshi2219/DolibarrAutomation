package com.Stepdefenition;



import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import com.Baseclass.BaseClass;
import com.Pageclass.page;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends BaseClass {
	
	page details=new page(driver);
	

		 
	
	@Given("User Lanuches the application")
	public void user_lanuches_the_application() {
		
		String actualUrl=getUrl();
		if(actualUrl.contains("dolibarr")) {
			Assert.assertTrue(true);
			System.out.println("Application is lauched correctly");
		}else {
			Assert.fail("Application is not lauched correctly");
		}
	    
	}
		
	
	   
	
@Then("Verify application URL")
	public void verify_application_url() {
	
	String expectedurl="https://www.dolibarr.org/";
	String actualurl=getUrl();
	if(actualurl.equals(expectedurl)) {
		System.out.println("URL Verified successfully");
		Assert.assertEquals(actualurl,expectedurl);
		
	}else {
		System.out.println("URL Verification failed");
		Assert.fail("Expected URL:"+ expectedurl + "but Actual URL:" + actualurl);
	}
	}	
	
	@Then("Verify page title")
	public void verify_page_title() {
	    String title=getTitle();
	    Assert.assertNotNull(title);
	   Assert.assertFalse(title.trim().isEmpty());
	   System.out.println("Page Title:" +title);
	}
	
	@Then("Verify all header menus are displayed")
	public void verify_all_header_menus_are_displayed() {
		Assert.assertTrue(verifyElement (details.Feature));
		Assert.assertTrue(verifyElement (details.blog));
		Assert.assertTrue(verifyElement (details.community));
		Assert.assertTrue(verifyElement (details.documentation));
		Assert.assertTrue(verifyElement (details.online));
		Assert.assertTrue(verifyElement (details.download));
		Assert.assertTrue(verifyElement (details.addon));
		Assert.assertTrue(verifyElement (details.forum));
		
}
		
	@Then("Verify main heading is displayed")
	public void verify_main_heading_is_displayed() {
	    Assert.assertTrue("Heading is not displayed ",isDisplayed(details.main));
	    String heading=getText(details.main);
	    Assert.assertFalse(heading.trim().isEmpty());
	    System.out.println("Heading" +heading);
	}
	@Then("Verify sub heading is displayed")
	public void verify_sub_heading_is_displayed() {
		 Assert.assertTrue("Heading is not displayed ",isDisplayed(details.sub));
		    String Subheading=getText(details.sub);
		    Assert.assertFalse(Subheading.trim().isEmpty());
		    System.out.println("Heading" +Subheading);
	}
	@Then("Verify banner image is displayed")
	public void verify_banner_image_is_displayed() {
		
		 Assert.assertTrue("Banner image is not displayed",isDisplayed(details.banner));
		 Assert.assertTrue("Banner imge is not enabled",isEnabled(details.banner));
		 System.out.println("Banner image is displayed successfully");
	    
	}
	@Then("Verify Test Online button is displayed")
	public void verify_test_online_button_is_displayed() {
		Assert.assertTrue("Online button is not displayed",isDisplayed(details.test));
		 Assert.assertTrue("Online button  is not enabled",isEnabled(details.test));
		 System.out.println("TestOnline button is displayed successfully");
	}
	@Then("Verify Download button is displayed")
	public void verify_download_button_is_displayed() {
		
		Assert.assertTrue("Download button is not displayed",isDisplayed(details.down));
		 Assert.assertTrue("Download button  is not enabled",isEnabled(details.down));
		 System.out.println("Download button is displayed successfully");
	    
	}
	@Then("Verify Search textbox is displayed")
	public void verify_search_textbox_is_displayed() {
		Assert.assertTrue("Search bar is not displayed",isDisplayed(details.search));
		 Assert.assertTrue("Search bar is not enabled",isEnabled(details.search));
		 System.out.println("SearchBar is displayed successfully");
	}
	
	
	@When("User click on feature menu")
	public void user_click_on_feature_menu() {
	 click(details.Feature);
	}
	@When("Verify feature page is displayed")
	public void verify_feature_page_is_displayed() {
		Assert.assertTrue("Feature Page is not displayed",isDisplayed(details.fheading));
		Assert.assertTrue("CRM heading is not displayed",isDisplayed(details.CRM));
		Assert.assertFalse(getTitle().trim().isEmpty());
		Assert.assertFalse(getUrl().trim().isEmpty());
	}
	@When("Verify CRM & Sales section i displayed")
	public void verify_crm_sales_section_i_displayed() {
		Assert.assertTrue(verifyElement(details.opp));
		Assert.assertTrue (verifyElement(details.pros));
		Assert.assertTrue (verifyElement(details.prop));
		Assert.assertTrue (verifyElement(details.sale));
		Assert.assertTrue (verifyElement(details.contract));
		Assert.assertTrue	 (verifyElement(details.help));
		Assert.assertTrue (verifyElement(details.know));
	 
	}
	@When("user click the prospects customer module")
	public void user_click_the_prospects_customer_module() {
     Assert.assertTrue(Modulenavigate(details.pros));
  
}
	@When("Verify related page is displayed")
	public void verify_related_page_is_displayed() {
	    Assert.assertTrue("Prospects page is displayed",isDisplayed(details.prosheading));
	    scrollToBottom(details.foot);
	}
	@Then("user navigate back to Feature page")
	public void user_navigate_back_to_feature_page() {
	    back();
	}
	@When("user clicks proposal module")
	public void user_clicks_proposal_module() {
		Assert.assertTrue(Modulenavigate(details.prop));
	}
	@Then("Verify proposal page is displayed")
	public void verify_proposal_page_is_displayed() {
		Assert.assertTrue("Proposal page is displayed",isDisplayed(details.propheading));
		scrollToBottom(details.allfoot);
		
		back();
	}
	
	@When("user clicks opportunity module")
	public void user_clicks_opportunity_module() {
		Assert.assertTrue(Modulenavigate(details.opp));
		
	}
	@Then("Verify opportunity page is displayed")
	public void verify_opportunity_page_is_displayed() {
		Assert.assertTrue("opportunity page is not displayed",isDisplayed(details.oppheading));
		scrollToBottom(details.allfoot);
		back();
	}
	
	@When("user clicks sales order  module")
	public void user_clicks_sales_order_module() {
		Assert.assertTrue(Modulenavigate(details.sale)); 
	}
	@Then("Verify sales order page is displayed")
	public void verify_sales_order_page_is_displayed() {
		Assert.assertTrue("sales page is not displayed",isDisplayed(details.saleheading));
		scrollToBottom(details.allfoot);
		back();
	}
	@When("user clicks contracts  module")
	public void user_clicks_contracts_module() {
		Assert.assertTrue(Modulenavigate(details.contract)); 
	}
	@Then("Verify contract related page is displayed")
	public void verify_contract_related_page_is_displayed() {
		Assert.assertTrue("Contract page is not displayed",isDisplayed(details.conheading));
		scrollToBottom(details.foot);
		back();
	}
	@When("user clicks Help Desk  module")
	public void user_clicks_help_desk_module() {
		Assert.assertTrue(Modulenavigate(details.help)); 
	}
	@Then("Verify Helpdesk related page is displayed")
	public void verify_helpdesk_related_page_is_displayed() {
		Assert.assertTrue("Helpdesk page is not displayed",isDisplayed(details.helpheading));
		scrollToBottom(details.foot);
		back();
	}
	@When("user clicks knowledge  module")
	public void user_clicks_knowledge_module() {
		Assert.assertTrue(Modulenavigate(details.know)); 
		
	}
	@Then("Verify knowledge related page is displayed")
	public void verify_knowledge_related_page_is_displayed() {
		Assert.assertTrue("Knowledge page is not displayed",isDisplayed(details.knowheading));
		scrollToBottom(details.foot);
		back();
	}

	
	@When("User scroll to human relationship mnagement section")
	public void user_scroll_to_human_relationship_mnagement_section() {
		Assert.assertTrue(Modulenavigate(details.hr)); 
	}
	@When("verify human relationship mnagement is displayed")
	public void verify_human_relationship_mnagement_is_displayed() {
		Assert.assertTrue("HumanResource page is not displayed",isDisplayed(details.hr));
	}
	@When("User click the employee module")
	public void user_click_the_employee_module() {
		Assert.assertTrue(Modulenavigate(details.emp)); 
	}
	@Then("Verify employee related page is displayed")
	public void verify_employee_related_page_is_displayed() {
		Assert.assertTrue("Employee page is not displayed",isDisplayed(details.empheading));
		scrollToBottom(details.empfoot);
		back();
	}
	@When("User clicks Expense report module")
	public void user_clicks_expense_report_module() {
		Assert.assertTrue(Modulenavigate(details.extend)); 
	}
	@Then("Verify expense relate module is displayed")
	public void verify_expense_relate_module_is_displayed() {
		Assert.assertTrue("Expense page is not displayed",isDisplayed(details.exheading));
		scrollToBottom(details.empfoot);
		back();
	}
	@When("User clicks leave request module")
	public void user_clicks_leave_request_module() {
		Assert.assertTrue(Modulenavigate(details.leave)); 
	}
	@Then("Verify leave request module is displayed")
	public void verify_leave_request_module_is_displayed() {
		Assert.assertTrue("Expense page is not displayed",isDisplayed(details.leaveheading));
		scrollToBottom(details.empfoot);
		back();
	}
	@When("User clicks timesheet module")
	public void user_clicks_timesheet_module() {
		Assert.assertTrue(Modulenavigate(details.time)); 
	}
	@Then("Verify timesheet related module is displayed")
	public void verify_timesheet_related_module_is_displayed() {
		Assert.assertTrue("Expense page is not displayed",isDisplayed(details.timeheading));
		scrollToBottom(details.timefoot);
		back();
	}
	@When("User clicks recruitment module")
	public void user_clicks_recruitment_module() {
		Assert.assertTrue(Modulenavigate(details.recruit)); 
	}
	@Then("Verify recruitment relate module is displayed")
	public void verify_recruitment_relate_module_is_displayed() {
		Assert.assertTrue("Expense page is not displayed",isDisplayed(details.recheading));
		scrollToBottom(details.recfoot);
		back();
	}
	@When("User clicks membership module")
	public void user_clicks_membership_module() {
		Assert.assertTrue(Modulenavigate(details.member)); 
	}
	@Then("Verify membership relate module is displayed")
	public void verify_membership_relate_module_is_displayed() {
		Assert.assertTrue("Expense page is not displayed",isDisplayed(details.memheading));
	}
	
	@When ("User clicks testonline button")
	public void user_clicks_testonline_button() {
		click(details.testonline);
	}
	@And ("User select the valid plan to create instance")
	public void user_select_the_valid_to_create_instance() {
		click(details.create);
	}
	
	@Then("User switches to registration window")
	public void user_switches_to_registration_window() {
		getParentWindow();
	    switchToChildWindow();
	    Assert.assertTrue(getUrl().contains("register"));
	    Assert.assertTrue(verifyElement(details.email));
	}


	@When("user enteres email {string}")
	public void user_enteres_email(String Email) {
		sendKeys(details.email,Email);
	   
	}
	@When("User enters company name {string}")
	public void user_enters_company_name(String company) {
		sendKeys(details.company,company);
	}
	@When("User enters phone number {string}")
	public void user_enters_phone_number(String phone) {
		sendKeys(details.phone,phone);
	}
	@When("User enters password {string}")
	public void user_enters_password(String password) {
		sendKeys(details.pass1,password);
	   
	}
	@When("User enters confirm password {string}")
	public void user_enters_confirm_password(String Cpassword) {
		sendKeys(details.confirm,Cpassword);
	}
	@When("user select country {string}")
	public void user_select_country(String country) {
		selectDropdownByVisibleText(details.country,country);
	}
	    
	@When("User select signup button")
	public void user_select_signup_button() {
	    click(details.sign);
	}
	@Then("Verify registration result {string}")
	public void verify_registration_result(String result) {
	    if(result.equalsIgnoreCase("Success")) {
	    	Assert.assertFalse(getTitle().trim().isEmpty());
	    	Assert.assertFalse(getUrl().trim().isEmpty());
	    }else {
	    	if(result.equalsIgnoreCase("failure")) {
	    		String actual=getAttribute(details.pass1,"title");
	    	Assert.assertEquals("Password must contain at least 8 characters, including UPPER/lowercase and numbers", actual);
	    }
	}
	}
	@When ("User click the login credential link")
	public void user_click_the_login_credential_link() {
		String actualUrl=getUrl();
		Assert.assertTrue(actualUrl.contains("https://myaccount.dolicloud.com/"));
	}
	
	
	@When ("User close the current dashboard tab")
	public void user_close_the_current_dashboard_tab() {
		close();
		for(String window:driver.getWindowHandles()) {
			driver.switchTo().window(window);
			break;
		}
	}
	
	
	@When("User clicks the CMSwebsite")
	public void user_clicks_the_CMSwebsite(){
		click(details.Feature);
		Assert.assertTrue(Modulenavigate(details.web)); 
	}
	
	@Then ("the related website should be open")
	public void the_related_website_should_be_open() {
		Assert.assertTrue("Website page is not displayed",isDisplayed(details.webheading));
		scrollToElement(details.allfoot);
		back();
	}
	@And ("User clicks the point of sale")
	public void user_clicks_the_point_of_sale() {
		Assert.assertTrue(Modulenavigate(details.point)); 
	}
	@Then ("Related sales details should be open")
	public void related_sales_details_should_be_open() {
		Assert.assertTrue("Website page is not displayed",isDisplayed(details.pos));
		scrollToElement(details.allfoot);
		back();
	}
	
	
@When("User click product and service")
	public void user_click_product_and_service() {
	 
		Assert.assertTrue(Modulenavigate(details.prod)); 
	}

@And ("the related product page is open")
	public void the_related_product_page_is_open() {
		Assert.assertTrue("Product page is not displayed",isDisplayed(details.prodheading));
		scrollToElement(details.allfoot);
		back();
	}
	@And ("User click shipment")
	public void user_click_the_shipment() {
		Assert.assertTrue(Modulenavigate(details.ship)); 	
	}
	@Then ("Shipment related screen will open")
	public void shipment_related_screen_will_open() {
		Assert.assertTrue("Shipment page is not displayed",isDisplayed(details.shipheading));
		scrollToElement(details.allfoot);
		back();	
	}
	
	@And ("User click stocks")
	public void user_click_stocks() {
		Assert.assertTrue(Modulenavigate(details.stock)); 
	}
	@Then ("Stock related screen will open")
	public void stock_related_screen_will_open() {
		Assert.assertTrue("Stock page is not displayed",isDisplayed(details.stockheading));
		scrollToElement(details.allfoot);
		back();	
	}
	@And ("User click purchase")
	public void user_click_purchase() {
		Assert.assertTrue(Modulenavigate(details.purchase)); 
	}
	
	@Then ("Purchase related screen will open")
	public void purchase_related_screen_will_open() {
		Assert.assertTrue("Purchase page is not displayed",isDisplayed(details.purheading));
		scrollToElement(details.allfoot);
		back();	
	}
	
	@And ("User click manufacturing")
	public void user_click_manufacturing() {
		Assert.assertTrue(Modulenavigate(details.manu)); 
	}
	
	@Then ("Manufacturing related screen will open")
	public void manufacturing_related_screen_will_open() {
		Assert.assertTrue("Manufacture page is not displayed",isDisplayed(details.manheading));
		scrollToElement(details.allfoot);
		back();
	}
	@When ("User click the Billing")
	public void user_click_the_billing() {
		Assert.assertTrue(Modulenavigate(details.billing)); 
	}
	@Then ("Billing related servce should open")
	public void billing_related_servce_should_open() {
		Assert.assertTrue("Billing page is not displayed",isDisplayed(details.billheading));
		scrollToElement(details.allfoot);
		back();
		
	}
	@And ("User click the Double entry accounting")
	public void user_click_the_double_entry_accounting() {
		Assert.assertTrue(Modulenavigate(details.entry)); 
	}
	@Then ("entry related details displayed")
	public void entry_related_details_displayed() {
		Assert.assertTrue("Entry page is not displayed",isDisplayed(details.entryheading));
		scrollToElement(details.allfoot);
		back();
		
	}
	
	@And ("User click the Bank reconcilation")
	public void user_click_the_bank_reconcilation() {
		Assert.assertTrue(Modulenavigate(details.bank)); 
	}
	
	@Then ("bank related details displayed")
	public void bank_related_details_displayed() {
		Assert.assertTrue("Bank page is not displayed",isDisplayed(details.bankheading));
		scrollToElement(details.allfoot);
		back();
	}
	
	@When ("User click the Emailing")
	public void user_click_the_emailing() {
		Assert.assertTrue(Modulenavigate(details.emaill));	
	}
	@Then ("Email related page will display")
	public void email_related_page_will_display() {
		Assert.assertTrue("Mail page is not displayed",isDisplayed(details.mass));
		scrollToElement(details.allfoot);
		back();
	}
	@And ("User click the survey")
	public void user_click_the_survey() {
		Assert.assertTrue(Modulenavigate(details.survey));	
	}
	@Then ("survey related page is displayed")
	public void survey_related_page_is_displayed() {
		Assert.assertTrue("Survey page is not displayed",isDisplayed(details.sur));
		scrollToElement(details.allfoot);
		back();
	}
	
	@When ("User click the project")
	public void user_click_the_project() {
		Assert.assertTrue(Modulenavigate(details.prj));	
	}
	@Then ("project related page will display")
	public void project_related_page_will_display() {
		Assert.assertTrue("Project page is not displayed",isDisplayed(details.prjheading));
		scrollToElement(details.allfoot);
		back();	
	}
	@And ("User click the agenda")
	public void user_click_the_agenda() {
		Assert.assertTrue(Modulenavigate(details.agenda));		
	}
	@Then ("Agenda related page is displayed")
	public void agend_related_page_is_displayed() {
		Assert.assertTrue("Agenda page is not displayed",isDisplayed(details.age));
		scrollToElement(details.allfoot);
		back();	
	}
	
	@And ("User click the Intervention")
	public void user_click_the_intervention() {
		Assert.assertTrue(Modulenavigate(details.inter));
	}
	@Then ("Intervention related page is displayed")
	public void intervention_related_page_is_displayed() {
		Assert.assertTrue("Intervention page is not displayed",isDisplayed(details.interheading));
		scrollToElement(details.allfoot);
		back();		
	}
	
	@When ("User click the api")
	public void user_click_the_api() {
		Assert.assertTrue(Modulenavigate(details.api));		
	}
	
	@Then ("Api related page will display")
	public void api_related_page_will_display() {
		Assert.assertTrue("Api page is not displayed",isDisplayed(details.apiheading));
		scrollToElement(details.allfoot);
		back();	
	}
	@And ("User click the import and export")
	public void user_click_the_import_nd_export() {
		Assert.assertTrue(Modulenavigate(details.impo));	
	}
	@Then ("export related page is displayed")
	public void export_related_page_is_displayed() {
		Assert.assertTrue("Export page is not displayed",isDisplayed(details.imp));
		scrollToElement(details.allfoot);
		back();		
	}
	
	@And ("User click the module builder")
	public void user_click_the_module_builder() {
		Assert.assertTrue(Modulenavigate(details.build));		
	}
	@Then ("Builder related page is displayed")
	public void builder_related_page_is_displayed() {
		Assert.assertTrue("Builders page is not displayed",isDisplayed(details.buildheading));
		scrollToElement(details.allfoot);
		back();		
	}
	@And ("User click the connectivity tools")
	public void user_click_the_connectivity_tools() {
		Assert.assertTrue(Modulenavigate(details.connect));		
	}
	@Then ("Tools related page is displayed")
	public void tools_related_pge_is_displyed() {
		Assert.assertTrue("Tool page is not displayed",isDisplayed(details.connheading));
		scrollToElement(details.allfoot);
		back();		
	}
	
	@Given ("User is on blog page")
	public void user_is_on_blog_page() {
		click(details.blo);
	   Assert.assertTrue(getUrl().contains("lastnews")); 
		
	}
	@And ("Verify the latest news heading is displayed")
	public void verify_the_latest_news_heading_is_displayed() {
		Assert.assertTrue("Heading is not displayed ",isDisplayed(details.head2));
	    String heading=getText(details.head2);
	    Assert.assertFalse(heading.trim().isEmpty());
	    System.out.println("Heading" +heading);
		
	}
	@When ("User clicks the any blog image")
	public void user_clicks_the_any_blog_image() {
		click(details.image);
		
	}
	
	@And ("Verify the blog related page is displayed")
	public void verify_the_blog_related_page_is_diaplyed() {
		Assert.assertTrue(getUrl().contains("kigali"));
		
	}
	@When ("User clicks the post icon")
	public void user_clicks_the_post_icon() {
		switchToFrame(details.iframe);
		click(details.post);
		
	}
	@And ("Verify post windoe and switch to parent window")
	public void verify_post_windoe_and_switch_to_parent_window() {
		switchToChildWindow();
		Assert.assertTrue(getUrl().contains("x.com"));
		close();
		for(String window:driver.getWindowHandles()) {
			driver.switchTo().window(window);
			break;
		}
		
	}
	@When ("User clicks the Reddit icon")
	public void user_clicks_the_reddit_icon() {
		click(details.reddit);
		
	}
	@And ("Verify reddit page is open")
	public void verify_reddit_page_is_open() {
		Assert.assertTrue(getUrl().contains("www.reddit.com"));
		back();
		
	}
	@When ("User clicks the facebook icon")
	public void user_clicks_the_facebook_icon() {
		click(details.fb);
		
	}
	@Then ("Verify facebook page is opened")
	public void verify_facebook_page_is_opened() {
		Assert.assertTrue(getUrl().contains("www.facebook.com"));
		back();
		
	}
	
	@When ("User clicks the home icon")
	public void user_clicks_the_home_icon() {
		click(details.home);
		Assert.assertTrue(getUrl().contains("dolibarr"));
	}
	
	@And ("User clicks the test online")
	public void user_clicks_the_test_online() {
		click(details.testonline);
	}
	@And ("User select the second option")
	public void user_select_the_second_option() {
		click(details.linkk);
	}
	
	@And ("User select the selling application")
	public void user_select_the_selling_application() {
		switchToChildWindow();
		click(details.shop);
		Assert.assertTrue(getTitle().length()>0);
	}
	
	@Then ("login page is displayed")
	public void login_page_is_displayed() {
		Assert.assertTrue(getUrl().contains("index.php"));
	}
	
	@When ("User enter the username {string}")
	public void user_enter_the_username (String username1) {
		sendKeys(details.user,username1);
		
	}
	
	@And ("User enter the password {string}")
	public void user_enter_the_password(String password1) {
		sendKeys(details.pass5,password1);
	}
	@And ("User clicks the login button")
	public void user_click_the_login_button() {
		click(details.login1);
		
	}
	@Then ("Verify the login result {string}")
	public void verify_the_login_result(String result1) {
		  if(result1.equalsIgnoreCase("Success")) {
		    	Assert.assertTrue(getUrl().contains("index.php"));
		
	}else {
		Assert.assertTrue("Error meessage is not displayed",isDisplayed(details.error3));
	}
	
	}
	
	@Given ("application should open")
	public void application_should_open() {
		String actual=getUrl();
		Assert.assertTrue(actual.contains("index.php"));
		
	}
	@Then ("Verify the CRM Homepage")
	public void verify_the_crm_homepage() {
		
		Assert.assertTrue("Dashboard is not displayed",isDisplayed(details.dash));
	}
	@And ("Verify the home page tabs are displayed")
	public void verify_the_home_page_tabs_are_displayed() {
		Assert.assertTrue("Global view is not displayed",isDisplayed(details.global));
		Assert.assertTrue("Agenda  is not displayed",isDisplayed(details.agen));
		Assert.assertTrue("Invoice is not displayed",isDisplayed(details.invoice));
		
}
	@Given ("User is on member page")
	public void user_is_on_member_page() {
		click(details.members);
		Assert.assertTrue(getUrl().contains("members"));
		
	}
	@When ("User clicks the new member button")
	public void user_clicks_the_new_member_button() {
		click(details.newmem);
		
	}
	@And ("User select mmbertype {string}")
	public void user_select_mmbertype(String  MemberType) {
		click(details.memtype);
		if(MemberType.equalsIgnoreCase("Production")) {
			click(details.production);
		}else if (MemberType.equalsIgnoreCase("Aluminum")) {
			click(details.aluminium);
		}
		
	}
	
	@When("User select the natire of member {string}")
	public void user_select_the_natire_of_member(String nature) {
 
		if(nature.equalsIgnoreCase("Individual")) {
			selectRadio(details.individual);
		}else if (nature.equalsIgnoreCase("Legal entity")) {
			selectRadio(details.legal);
		}
		
	}
	
	@And ("User enter the email {string}")
	public void user_enter_the_email (String email) {
		sendKeys(details.mail,email);
		
	}
	
	@And ("User enter the lastname {string}")
	public void user_enter_lastname(String lastname) {
		sendKeys(details.lastname,lastname);
		
	}
	
	@And ("User enter the firstname {string}")
	public void user_enter_the_firstname(String firstname) {
		sendKeys(details.firstname,firstname);
	}
	
	@And ("User click he create member button")
	public void user_click_he_create_member_button() {
		click(details.createmem);
		
	}
	
	@Then ("Verify the member creation result {string}")
	public void verify_the_member_creation_result(String result4) {
		
		  if(result4.equalsIgnoreCase("Success")) {
		    	Assert.assertTrue(getUrl().contains("card.php"));
		
	}else {
		Assert.assertTrue("Error meessage is not displayed",isDisplayed(details.errormem));
	}
	}
	
	@When ("Verify new member data")
	public void verify_new_member_data() {
		Assert.assertTrue(getTitle().contains("Member"));
		
	}
	
	@And ("User validate the new member")
	public void user_validate_the_new_member() {
		click(details.vbutton);
		click(details.yes);
	}
	
	@And ("User can modify the member data")
	public void user_can_modify_the_member_data() {
		click(details.modify);
	}
	@And ("User modify the company name {string}")
	public void user_modify_the_company_name(String company) {
		sendKeys(details.commp,company);
	}
	@And ("User select the Title")
	public void user_select_the_title() {
		click(details.drop);
		click(details.gen);
	}
	@And ("User select the gender")
	public void user_select_the_gender() {
		click(details.drop2);
		click(details.male);
		
	}
	@And ("User enter the website {string}")
	public void user_enter_the_website(String web) {
		sendKeys(details.web2,web);
	}
	
	@And ("User enter the address {string}")
	public void user_enter_the_address(String address) {
	sendKeys(details.addd,address);
	}
	@And ("user enter the zipcode {string}")
	public void user_enter_the_zipcode(String zip) {
		sendKeys(details.zip,zip);
	}
	
	@And ("User select the state")
	public void user_select_the_state() {
		click(details.state);
		click(details.tamil);
	}
	
	@And ("User enter the bus phone {string}")
	public void user_enter_the_bus_phone (String bus) {
		sendKeys(details.bus,bus);
	}
	
	@And ("User enter the personal phone {string}")
	public void user_enter_the_personal_phone (String pers) {
		sendKeys(details.pers,pers);
	}
	
	@And ("User select the dob {string}")
	public void user_select_the_dob(String dob) {
		sendKeys(details.birth,dob);
	}
	
	@And ("User click save button")
	public void user_click_save_button() {
		click(details.savemem);
	}
	@And ("User check the contribution")
	public void user_check_the_contribution() {
		click(details.contribution);
		Assert.assertTrue(getUrl().contains("subscription.php"));
		
	}
	
	@And ("User check the notes")
	public void user_check_the_notes() {
		click(details.note);
		Assert.assertTrue(getUrl().contains("note.php"));
	}
	
	@And ("User check the liked files")
	public void user_check_the_linked_files() {
		click(details.file);
		Assert.assertTrue(getUrl().contains("document.php"));
	}
	@And ("User check the event")
	public void user_check_the_event() {
		click(details.event);
		Assert.assertTrue(getUrl().contains("agenda.php"));
		
	}
	@Then ("user go to list")
	public void user_go_to_list() {
		click(details.list);
		Assert.assertTrue(getUrl().contains("list.php"));
		}
	
	@When ("User select the member from the list")
	public void user_select_the_mmber_form_the_list() {
		click(details.checkbox);
		}
	@And ("User select the action")
	public void user_select_the_action() {
		click(details.vali);
		click(details.tag);
	}
	@And ("User click the confirm button")
	public void user_click_the_confirm_button() {
		click(details.confirma);
	}
	@And ("User select the tag")
	public void user_select_the_tag() {
		click(details.hah);
		click(details.ados);
		
	}
	@And ("User click validate")
	public void user_click_validate() {
		click(details.vlid);
		}
	
	@Then ("the action performed")
	public void the_action_performed() {
		System.out.println("Action performed successfully");
}
	
	@Given ("User is on draft member page")
	public void User_is_on_draft_member_page() {
		click(details.draft);
		Assert.assertTrue(getUrl().contains("list.php"));
	}
	@When ("User select the draft member")
	public void user_select_the_draft_member() {
		click(details.idd);
	}
	
	@And ("User choose the action from dropdown")
	public void user_choose_the_action_from_dropdown() {
		click(details.vali);
		click(details.term);
	}
	
	@And ("User click validate button")
	public void user_click_validate_button() {
		click(details.confirma);
	}
		
	@Then ("Verify action is performed")
	public void verify_action_is_performed() {
		Assert.assertFalse(driver.getPageSource().contains("kavi"));
}
	
	@Given ("User is on valid member page")
	public void user_is_on_valid_member_page(){
		click(details.valimem);
		Assert.assertTrue(getUrl().contains("list.php"));
	}
	@When ("User select the valid member")
	public void user_select_the_valid_member() {
		click(details.selmem);
	}
	
	@And ("User select the subscription")
	public void user_select_the_subscription() {
		click(details.vali);
		click(details.subs);
	}
	
	@And ("User click confirm button")
	public void user_click_confim_button() {
		click(details.confirma);
	}
	@And ("User enter the subscription amount {string}")
	public void user_enter_the_subscription_amount(String amt) {
		sendKeys(details.amount,amt);
	}
	
	@And ("User select yes in dropdown")
	public void user_select_yes_in_dropdowm() {
		selectDropdownByVisibleText(details.drop6,"Yes");
	}
	@And ("User click the validate")
	public void user_click_the_validate() {
		click(details.vlid);
	}
	@Then ("Verify the member subscription is added successfully")
	public void verify_the_member_subscription_is_added_successfully() {
		Assert.assertEquals(getText(details.error7).trim(), "Up to date");
}
	
	@Given ("User is on pending member page")
	public void user_is_on_pending_member_page() {
		click(details.membership);
		Assert.assertTrue(getUrl().contains("list.php"));
	}
	@When ("User select the pending member")
	public void user_select_the_pending_member() {
		click(details.id3);
	}
	
	@And ("User select the subscription policy")
	public void user_select_the_subscription_policy() {
		click(details.vali);
		click(details.subs);
	}
	
	@And ("User clicks confirm button")
	public void user_clicks_confirm_button() {
		click(details.confirma);
	}
	
	@And ("User enter subscription amount {string}")
	public void user_enter_subscription_amount(String sub2) {
		sendKeys(details.amount,sub2);
	}
	
	@And ("User select yes")
	public void user_select_yes() {
		selectDropdownByVisibleText(details.drop6,"Yes");
	}
	
	@And ("User click the validate button")
	public void user_click_the_validate_button() {
		click(details.vlid);
	}
	
	@Then ("Verify the Pending member is moved to uptodate")
	public void verify_the_pending_member_is_moved_to_uptodate() {
		Assert.assertTrue("member is not changed to upto date",isDisplayed(details.id3));
	}
	
	@Given ("User is on uptodate member page")
	public void user_is_on_uptodate_member_page() {
		click(details.uptodate);
		Assert.assertTrue(getUrl().contains("uptodate"));
	}
	
	@When ("User select the upto date member")
	public void user_select_the_upto_date_member() {
		click(details.upmem);
	}
	
	@And ("User selects the subscription policyy")
	public void user_select_the_subscription_policyy() {
		click(details.vali);
		click(details.delete);
	}
	
	@And ("User click the confirm buttonn")
	public void user_click_the_confirm_buttonn() {
		click(details.confirma);
	}
	
	@And ("User select yes in dd")
	public void user_select_yes_in_dd() {
		selectDropdownByVisibleText(details.drop6,"Yes");
	}
	
	@And ("User clicks validate buttonn")
	public void user_clicks_validate_buttonn() {
		click(details.vlid);
	}
	
	@Then ("Verify the uptodate member is deleted")
	public void verify_the_uptodate_member_is_deleted() {
		Assert.assertTrue("member is  deleted upto date",isDisplayed(details.upmem));
	}
	
	@Given ("User is on outofdate page")
	public void user_is_on_outofdate_page() {
		click(details.outof);
		Assert.assertTrue(getUrl().contains("outofdate"));
	}
	@And ("user see the member data")
	public void user_see_the_member_data() {
		Assert.assertTrue("No data found",isDisplayed(details.rec));
		
	}
	
	@And ("User clicks on excluded member")
	public void user_clicks_on_excluded_member() {
		click(details.ex);
	}
	
	@Then ("user verify the records")
	public void user_verify_the_records() {
		Assert.assertTrue("No data found",isDisplayed(details.rec));
	}
	
	@Given ("User is on termination member page")
	public void user_is_on_termination_member_page() {
		click(details.termin);
		Assert.assertTrue(getUrl().contains("leftmenu"));
	}
	
	@When ("User select the termination member")
	public void user_select_the_termination_member() {
		click(details.id5);
	}
	
	@And ("User selects the subscriptionn policyy")
	public void user_selects_the_subscriptionn_policyy() {
		click(details.vali);
		click(details.delete);
	}
	
	@And ("User clicks the confirm buttonn")
	public void user_clicks_the_confirm_button() {
		click(details.confirma);
	}
	
	@And ("User select yes in drop")
	public void user_select_yes_in_drop() {
		selectDropdownByVisibleText(details.drop6,"Yes");
	}
	
	@And ("User clicks validate buttton")
	public void user_clicks_validate_button() {
		click(details.vlid);
	}
	@Then ("Verify the termination member is deleted")
	public void verify_the_termination_member_is_deleted() {
		Assert.assertTrue("Member is not deleted",isDisplayed(details.id5));
	}
	
	@Given ("user is on statistic page")
	public void user_is_on_statistic_page() {
		click(details.statis);
	}
	
	@And ("User clicks the contribution")
	public void user_click_the_contribution() {
		click(details.yer);
	}
	
	@Then ("Current year contribution details displayed")
	public void current_year_contribution_details_displayed() {
		Assert.assertTrue("Current year details is not displayed",isDisplayed(details.yerde));
		back();
	}
	@And ("User clicks the country")
	public void user_clicks_the_country() {
		click(details.stacountry);
	}
	
	@Then ("Country details is  displayed")
	public void country_details_is_displayed() {
		Assert.assertTrue("Country details is displayed",isDisplayed(details.listt));
		
	}
	@And ("User clicks the Region")
	public void user_clicks_the_region() {
		click(details.staregion);
	}
	
	@Then ("Region details displayed")
	public void region_details_displayed() {
		Assert.assertTrue("Region details is displayed",isDisplayed(details.listt));	
	}
	@And ("User clicks the province")
	public void user_clicks_the_province() {
		click(details.stp);
	}
	@Then ("State details displayed")
	public void state_details_displayed() {
		Assert.assertTrue("State details is displayed",isDisplayed(details.listt));
	}
	
	@And ("User clicks the City")
	public void user_click_the_city() {
		click(details.city);
	}
	@Then ("City details displayed")
	public void city_details_displayed() {
		Assert.assertTrue("City details is displayed",isDisplayed(details.listt));
	}
	@And ("User clicks the By nature")
	public void user_clicks_the_by_nature() {
		click(details.by);
	}
	@Then ("By Nature details displayed")
	public void by_nature_details_displayed() {
		Assert.assertTrue("ByNature details is displayed",isDisplayed(details.listt));
	}
	
	@Given ("user is on contribution page")
	public void user_is_on_contribution_page() {
		click(details.contribution);
	}
	@And ("Contribution activities details displayed")
	public void contribution_activities_details_displayed() {
		Assert.assertTrue("Contribution details is displayed",isDisplayed(details.listt));
	}
	@And ("User clicks the new membership")
	public void user_clicks_the_new_membership() {
		click(details.newmember);
	}
	@And ("User select the one member")
	public void user_select_the_one_member() {
		click(details.contriid);
	}
	@And ("user select any action in the list")
	public void user_select_any_action_in_the_list() {
		click(details.vali);
		click(details.term);
	}
	@Given("user click th confirmation")
	public void user_click_th_confirmation() {
		click(details.confirmm);
	}
	@Then ("The particular action is performed")
	public void the_particular_action_is_performed() {
		Assert.assertTrue("Id is not terminated",isDisplayed(details.idvali));
	}
	
	@Given ("User is on list page")
	public void user_is_on_list_page() {
		click(details.list2);
		Assert.assertTrue("List page is not displayed",isDisplayed(details.listhead));
	}
	@And ("User select the contribution member")
	public void user_select_the_contribution_member() {
		
		click(details.listid);
	}
	@And ("User select the delete action")
	public void user_select_the_delete_action() {
		click(details.vali);
		click(details.delete);
	}
	
	@And ("User click the confirm buton")
	public void user_click_the_confirm_buton() {
		click(details.confirmm);
	}
	
	@And ("User validate the option")
	public void user_validate_the_option() {
		selectDropdownByVisibleText(details.drop6,"Yes");
		click(details.vlid);
	}
	@Then ("The user is deleted successfully")
	public void the_user_is_deleted_successfully() {
		try {
			Assert.assertFalse(details.listid.isDisplayed());
		}catch(StaleElementReferenceException e) {
			Assert.assertTrue(true);
		}
	}
	
	@Given ("user is on statistic page in contribution")
	public void user_is_on_statistic_page_in_contribution() {
		click(details.stat2);
	}
	
	@And ("User clicks the contributio")
	public void uer_clicks_the_contributio() {
		click(details.yer);
	}
	@Then ("Current year contribution detail displayed")
	public void current_year_contribution_detail_displayed() {
		Assert.assertTrue("Contibution details is displayed",isDisplayed(details.listt));
		Assert.assertTrue("Current country details is displayed",isDisplayed(details.yerde));
		back();
	}
	@And ("User clicks the country in contribution")
	public void user_clicks_the_country_in_contribution() {
		click(details.stacountry);
	}
	@Then ("Country details is  display")
	public void country_details_is_display() {
		Assert.assertTrue("Country details is displayed",isDisplayed(details.listt));
		Assert.assertTrue("Current country details is displayed",isDisplayed(details.india));
	}
	@And ("User clicks the Region in contribution")
	public void user_clicks_the_region_in_contribution() {
		click(details.staregion);
	}
	@Then ("Region detail is displayed")
	public void region_detail_is_displayed() {
		Assert.assertTrue("Country details is displayed",isDisplayed(details.listt));
		Assert.assertTrue("Country details is displayed",isDisplayed(details.india));
	}
	@And ("User clicks the province in contribution")
	public void user_clicks_the_province_in_contribution() {
		click(details.stp);
	}
	@Then ("State detail is displayed")
	public void state_detail_is_displayed() {
		Assert.assertTrue("Country details is displayed",isDisplayed(details.listt));
		Assert.assertTrue("Country details is displayed",isDisplayed(details.tn));
	}
	@And ("User clicks the City in contribution")
	public void user_clicks_the_city_in_contribution() {
		click(details.city);
	}
	@Then ("City detail is displayed")
	public void city_detail_is_displayed() {
		Assert.assertTrue("Country details is displayed",isDisplayed(details.listt));
		Assert.assertTrue("Country details is displayed",isDisplayed(details.paris));
	}
	@And ("User clicks the By nature in contribution")
	public void user_clicks_the_by_nature_in_contribution() {
		click(details.by);
	}
	@Then ("By Nature detail is displayed")
	public void by_nature_detail_is_displayed() {
		Assert.assertTrue("Country details is displayed",isDisplayed(details.listt));
		Assert.assertTrue("Country details is displayed",isDisplayed(details.indi));
	}
	
	@Given ("user is on membertypes page")
	public void user_is_on_membertypes_page() {
	click(details.memtypes)	;
	}
	@And ("Previous membertype is displayed")
	public void previous_membertype_is_displayed() {
		Assert.assertTrue(getUrl().contains("type.php"));
		Assert.assertTrue("Membertypes are not displayed",isDisplayed(details.typehead) );
	}
	@When ("User clicks new button")
	public void user_clicks_new_button() {
		click(details.memnew);
	}
	@Then ("Newly create membertype page should open")
	public void newly_create_membertype_page_should_open() {
		Assert.assertTrue("Page is not displayed",isDisplayed(details.newcreate));
	}
	@And ("User enter the label as{string}")
	public void user_enter_the_label_as (String label) {
		sendKeys(details.labelmem,label);
	}
	@And ("User select the nature of member")
	public void user_select_the_nature_of_member() {
		click(details.drcontri);
		click(details.drindi);
	}
	@Then("User select the amount as\"{int}\"")
	public void user_select_the_amount_as(Integer int1) {
    sendKey(details.amt,int1);
	}
	
	@Then("User enter the duration as {string}")
	public void user_enter_the_duration_as(String duration) {
 
		sendKeys(details.durat,duration);
	}
	@And ("User enter the description as {string}")
	public void user_enter_the_description(String desc) {
		switchtFrame(details.editfra);
		click(details.editplace);
		sendKeys(details.editplace,desc);
		switchback();
	}
	@And ("User enter the welcome email as {string}")
	public void user_enter_the_welcome_email_as(String email) {
		switchToFrame(details.welediit);
		click(details.editplace2);
		sendKeys(details.editplace2,email);
		switchback();
	}
			
	@And ("User clicks the save button")
	public void user_clicks_the_save_button() {
		click(details.save6);
	}
	@Then ("New Member details is displayed in the list")
	public void new_member_details_is_displayed_in_the_list() {
		Assert.assertTrue(getUrl().contains("type.php"));
	}
	
	@Given ("user is on list pagee")
	public void user_is_on_list_pagee() {
		click(details.list3);
	}
	@And ("User click the edit icon")
	public void user_click_the_edit_icon() {
		click(details.editicon);
	}
	@Given("User change the amount as “{int}”")
	public void user_change_the_amount_as(Integer int3) {
    sendKey(details.amt,int3);
	}
	@And ("User change the vote member")
	public void user_change_the_vote_member() {
		selectDropdownByVisibleText(details.vote,"Yes");
		}
	
	@And ("User change the duration as {string}")
	public void user_change_the_duration_as(String desc1) {
		sendKeys(details.durat,desc1);
	}
			
	@And ("User click the save btn")
	public void user_click_the_save_btn() {
		click(details.save6);
	}
			
	@Then ("the new data is saved successfully")
	public void the_new_data_is_saves_successfully() {
		Assert.assertTrue(getUrl().contains("rowid"));
		click(details.back2);
	}
	
	@When ("User clicks the thirdparty icon")
	public void user_clicks_the_thirdparty_icon() {
		click(details.third);
	}
	@Then ("Third party page is displayed")
	public void third_party_page_is_displayed() {
		Assert.assertTrue(getUrl().contains("societe"));
	}
	@And ("Verify thirdparty page heading displayed correctly")
	public void verify_thirdparty_page_heading_displayed_correctly() {
		Assert.assertTrue("Thirdparty heading is not displayed",isDisplayed(details.thirdhead));
		Assert.assertTrue("Statistics is not displayed",isDisplayed(details.thirdhead2));
		Assert.assertTrue("Latest modified is not displayed",isDisplayed(details.thirdhead3));
		Assert.assertTrue("Latest contact is not displayed",isDisplayed(details.thirdhead4));
	}
	@And ("User clicks on vendor")
	public void user_clicks_on_vendor() {
		click(details.vendd);
	}
	@And ("User select any one vendor")
	public void user_select_any_one_vendor() {
		click(details.tpid);
	}
	@And ("User select the mail option in the list")
	public void user_select_the_mail_option_in_the_list() {
		click(details.tpsel);
		click(details.send);
	}
	@And ("User click confirm btn")
	public void user_click_confirm_btn() {
		click(details.confirmma);
	}
	@Then ("The email page is open correctly")
	public void the_email_page_is_open_correctly() {
		Assert.assertTrue("Email page is not displyed",getUrl().contains ("list.php"));
	}
	
	@Given ("User is on email sending page")
	public void user_is_on_email_sending_page() {
		Assert.assertTrue("User is not on email page",isDisplayed(details.from));
	}
	@When ("User select the template")
	public void user_select_the_template() {
		click(details.temdrop);
		click(details.testt);
	}
	@And ("Click the apply button")
	public void click_the_apply_button() {
		click(details.apply);
	}
	@When("User enter the To address {string}")
	public void user_enter_the_to_address(String add) {
 
		sendKeys(details.to,add);
	}
	@And ("User select the attachment")
	public void user_select_the_attachment() {
		click(details.attach);
	}
	@And ("User draft the mail {string}")
	public void user_draft_the_email(String draft) {
		switchToFrame(details.tpmail);
		click(details.edittp);
		sendKeys(details.edittp,draft);
		switchback();
	}
	@And ("User click send email")
	public void user_click_send_email() {
		click(details.sendbtn);
	}

	@Then ("User received the warning messge")
	public void user_received_the_warning_message () {
		Assert.assertTrue("Email sent successfully",isDisplayed(details.errormsg));
	}
	
	@Given ("User is on vendor list page")
	public void user_is_on_vendor_list_page() {
		Assert.assertTrue("Page is not loaded",isDisplayed(details.links));
	}
	@When ("User select the particular vendor")
	public void user_select_the_particular_vendor() {
		click(details.tpid2);
		Assert.assertTrue("Page is not loaded",isDisplayed(details.hedtp));
		
	}
	@And ("User click the Customer")
	public void user_click_the_customer() {
		click(details.customer);
		back();
	}
	@When("User click the customer price")
	public void user_click_the_customer_price() {
      click(details.cusprice);
		Assert.assertTrue(getUrl().contains("price.php"));
	}
	@And ("User click the related items")
	public void user_click_the_related_item() {
		click(details.related);
		Assert.assertTrue(getUrl().contains("consumption.php"));
	}
	@And ("User click the payment method")
	public void user_click_the_payment_method() {
		click(details.paymentmethod);
		Assert.assertTrue(getUrl().contains("paymentmodes.php"));
	}
	@And ("User click the ticket")
	public void user_click_the_ticket() {
		click(details.tickets);
		Assert.assertTrue("Ticket is not loaded",isDisplayed(details.ticketcheck));
		back();
	}
	@And ("User click the notification")
	public void user_click_the_notification() {
		click(details.notification);
		Assert.assertTrue(getUrl().contains("notify"));
	}
	@And ("User click the notes")
	public void user_click_the_notes() {
		click(details.notess);
		Assert.assertTrue(getUrl().contains("note.php"));
	}
	@Then ("User go back to the main list")
	public void user_go_back_to_min_list() {
		click(details.back2);
	}
}






	
	
