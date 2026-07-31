package com.Stepdefenition;



import java.awt.AWTException;

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
		switchparent();
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
		switchparent();
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
	
	@And ("User enter the new notes as {string}")
	public void user_enter_the_new_notes_as(String notes1 ) {
		click(details.publicedit);
		click(details.text2);
		sendKeys(details.text2,notes1);
		click(details.notesave);
		Assert.assertTrue("Note is not updated",isDisplayed(details.notelist));
		
	}

	
	@And ("User check the liked files")
	public void user_check_the_linked_files() {
		click(details.file);
		Assert.assertTrue(getUrl().contains("document.php"));
	}
	
	@And ("User adding new filess {string}")
	public void user_adding_new_filess(String file) throws Exception {
		click(details.plusbtn);
		uploadFile(details.uploadarea,file);
		closedialog();
		click(details.upload);
		Assert.assertTrue("File is not uploaded",isDisplayed(details.uploadverify));
	}
	@And ("User check the event")
	public void user_check_the_event() {
		waitforpageload();
		scrollToElement(details.event);
		waitForClikable(details.event);
		jsClick(details.event);
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
		Assert.assertTrue("Member is not selcted",isSelected(details.checkbox));
		}
	@And ("User select the action")
	public void user_select_the_action() {
		waitforpageload();
		scrollToElement(details.vali);
		waitForClikable(details.vali);
		click(details.vali);
	}
	@And ("User select the assigntag")
	public void user_select_the_assigntag() {
		waitforpageload();
		scrollToElement(details.tag);
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
		waitforpageload();
		scrollToElement(details.vali);
		click(details.vali);
		
		waitforpageload();
		scrollToElement(details.vali);
		click(details.term);
	}
	
	@And ("User click validate button")
	public void user_click_validate_button() {
		click(details.confirma);
	}
		
	@Then ("Verify action is performed")
	public void verify_action_is_performed() {
		Assert.assertFalse(driver.getPageSource().contains("Aruvi"));
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
		waitforpageload();
		scrollToElement(details.vali);
		click(details.vali);
		waitforpageload();
		scrollToElement(details.subs);
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
		String actual=getToastMessage(details.inverror);
		Assert.assertTrue(actual.contains("Record deleted"));
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
		String actual=getToastMessage(details.inverror);
		Assert.assertTrue(actual.contains("Record deleted"));
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
		String actual=getToastMessage(details.inverror);
		Assert.assertTrue(actual.contains("Record deleted"));
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
	
	@Given ("User is on commerce area page")
	public void user_is_on_commerce_area_page() {
		click(details.commerce);
		Assert.assertTrue(getUrl().contains("commercial"));;
	}
	@And ("Verifying page headings")
	public void verifying_page_heading() {
		Assert.assertTrue("Draft Vendor is not display",isDisplayed(details.comheading1));
		Assert.assertTrue("Draft Purchase is not display",isDisplayed(details.comheading2));
	}
	@When ("User clicks on vendor proposal")
	public void user_clicks_on_vendor_proposal() {
		click(details.venpropose);
		Assert.assertTrue(getUrl().contains("supplier_proposal"));
	}
	@And ("Verifying proposal page")
	public void verifying_proposal_page() {
		Assert.assertTrue("Statistics is not display",isDisplayed(details.venheading1));
		Assert.assertTrue("Draft Request is not display",isDisplayed(details.venheading2));
		Assert.assertTrue("Openprice is not display",isDisplayed(details.venheading3));
		
	}
	@And ("User clicks any proposal")
	public void user_clicks_any_proposal() {
		click(details.aaa);
		Assert.assertTrue(getUrl().contains("socid"));
	}
	@Then ("warning message should display")
	public void warning_message_should_display() {
		String actual=getText(details.erroraa);
		Assert.assertNotNull(actual);
		Assert.assertFalse(actual.trim().isEmpty());
	}
	
	@When ("User click the new price request")
	public void user_click_the_new_price_request() {
		click(details.newreq);
		Assert.assertTrue(getUrl().contains("card.php"));
	}
	@Then ("New price creating page is open")
	public void new_price_creating_page_is_open() {
		Assert.assertTrue("New Price Creating page is not open",isDisplayed(details.newheading));
	}
	@Then("User select the vendor {string}")
	public void user_select_the_vendor(String Vendor) {
 
		if(!Vendor.trim().isEmpty()) {
			click(details.vendrop);
		}if(Vendor.equalsIgnoreCase("aaa")) {
			click(details.venop);
		}
	}
			
			
	@And ("User select the payment term {string}")
	public void user_select_the_payment_term(String Term) {
		click(details.terms);
		if(Term.equalsIgnoreCase("30 days")) {
			click(details.days);
		}else
			if(Term.equalsIgnoreCase("Order")) {
				click(details.order2);
			}
	}
	@And ("User select the payment method {string}")
	public void user_select_the_payment_method(String Method) {
		click(details.method);
		if(Method.equalsIgnoreCase("Cash")) {
			click(details.cash);
		}else
			if(Method.equalsIgnoreCase("Check")){
				click(details.check2);
			}
	}
	@And  ("User select the delivery date")
	public void user_select_the_delivery_date() {
		click(details.now);
	}
	@And ("User select the tags")
	public void user_select_the_tags() {
		click(details.tags);
		click(details.advance);
	}
	@And ("User clicks the create draft button")
	public void user_clicks_the_create_draft_button() {
		click(details.creatdraft);
	}
	@Then ("New price will be created {string}")
	public void new_price_will_be_created(String Result) {
		 if(Result.equalsIgnoreCase("Success")) {
		    	Assert.assertTrue(getUrl().contains("card.php?id"));
		
	}else {
		Assert.assertTrue("Error meessage is not displayed",isDisplayed(details.venerror));
	}
	
	}
	
	
	@Given ("User is on price request page")
	public void user_is_on_price_request_page() {
		Assert.assertTrue(getUrl().contains("card.php?id"));
	}
	@When ("User select the type as {string}")
	public void user_select_the_type(String product) {
		selectDropdownByVisibleText(details.typeven,product)	;
	}
	
	@And ("User enter the descriptionn as {string}")
	public void user_enter_the_description_as(String desc3) {
		switchToFrame(details.descframe);
		click(details.descframe2);
		sendKeys(details.descframe2,desc3);
		switchback();
	}
	@And ("User enter the unit as {string}")
	public void user_enter_the_unit_as(String int5) {
		sendKeys(details.price3,int5);
	}
	@And ("User select quantity as {string}")
	public void user_select_quantity_as(String int6) {
		sendKeys(details.quantity,int6);
	}
	@And ("User select the discount as {string}")
	public void user_select_the_discount_as(String int7) {
		sendKeys(details.discount,int7);
	}
	@And ("User click add button")
	public void user_click_add_button() {
		click(details.add);
	}
	@And ("User click the validate buttonn")
	public void user_click_the_validate_buttonn() {
		click(details.validate2);
		click(details.yes2);
	}
	@Then ("the price is validated")
	public void the_price_is_validated() {
		Assert.assertTrue(getUrl().contains("confirm_validate"));
	}
	
	
	@Given ("User is on contact page")
	public void user_is_on_contact_page() {
		click(details.contact);
		Assert.assertTrue(getUrl().contains("contact.php"));
	}
	@And ("User click the add button")
	public void user_click_the_add_button() {
		click(details.add2);
		
	}
	@And ("User click the notess")
	public void user_click_the_notess() {
		click(details.note2);
		Assert.assertTrue(getUrl().contains("note.php"));
		Assert.assertTrue("Note is not updated",isDisplayed(details.notelist));
	}
	@And ("User enter the new note as {string}")
	public void user_enter_the_new_note_as(String notes ) {
		click(details.publicedit);
		click(details.text2);
		sendKeys(details.text2,notes);
	}
	@And ("User save the notes")
	public void user_save_the_notes() {
		click(details.notesave);
	}
	@And ("User click the linked files")
	public void user_click_the_linked_files() {
		click(details.link2);
		Assert.assertTrue(getUrl().contains("document.php"));
	}
	@And ("User adding new files {string}")
	public void user_adding_new_files(String file) throws Exception {
		click(details.plusbtn);
		uploadFile(details.uploadarea,file);
		closedialog();
		Assert.assertTrue("File is not uploaded",isDisplayed(details.uploadverify));
	}
	@And ("Click the upload button")
	public void click_the_upload_button() {
		click(details.upload);
		
	}
	@And ("User click the log")
	public void user_click_the_log() {
		click(details.log);
		Assert.assertTrue(getUrl().contains("info.php"));
	}
	@Then ("User went to back to list")
	public void user_went_to_back_to_list() {
		click(details.backlist1);
	}
	
	@Given ("User is on list in vendor")
	public void user_is_on_list_in_vendor() {
		click(details.venlist);
		Assert.assertTrue(getUrl().contains("list.php"));
	}
	@When ("User select the one vendor")
	public void user_select_the_one_vendor() {
		click(details.listid1);
	}
	@And ("User select an action")
	public void user_select_an_action() {
		click(details.vali);
		click(details.listdelete);
	}
	@And ("User click the confirmm button")
	public void user_click_the_confirmm_button() {
		click(details.confirma);
	}
	@And ("User select yes in dropdd")
	public void user_select_yes_in_dropdd() {
		selectDropdownByVisibleText(details.drop6,"Yes");
	}
	@And ("User click the validate btn")
	public void user_click_the_validate_btn() {
		click(details.vlid);
	}
	@Then ("Warning message is displayed")
	public void warning_message_is_displayed() {
		String actual=getText(details.errorlist);
		Assert.assertFalse(actual.trim().isEmpty());
	}
	
	@Given ("User is on statistics page in vendor")
	public void user_is_on_statistics_page_in_vendor() {
		click(details.statistic);
		Assert.assertTrue(getUrl().contains("stats"));
	}
	

	@Given("User select the thirdparty {string}")
	public void user_select_the_thirdparty(String Thirdparty) {
	
		click(details.thirdparty);
		if(Thirdparty.equalsIgnoreCase("Adem Demir")) {
		click(details.thirdparty1);
	}
	}
	
	@And ("User select the thirdparty type {string}")
	public void user_select_the_thirdparty_type(String type) {
		click(details.thirdtype);
		if(type.equalsIgnoreCase("Other")) {
		click(details.thirdtype2);
	}
	}
	@And ("User select the vendor tag {string}")
	public void user_select_the_vendor_tag(String tag) {
		click(details.tag1);
		if(tag.equalsIgnoreCase("Albunes")) {
		click(details.tag2);
	}
	}
	@And ("User select the vendor proposal {string}")
	public void user_select_the_vendor_proposal(String proposal) {
		click(details.venpro);
		if(proposal.equalsIgnoreCase("Advance")) {
		click(details.venpo2);
	}
	}
	@And ("User select the status {string}")
	public void user_select_the_status(String status) {
		click(details.sta1);
		if(status.equalsIgnoreCase("Accepted")) {
		click(details.sta2);
	}
	}
	@Then ("the click the refresh button")
	public void user_clilck_the_refresh_button() {
		click(details.refresh);
	}
	
	@Given ("User is on purchase orderr page")
	public void user_is_on_purchase_orderr_page() {
		click(details.purchaseorder);
		Assert.assertTrue(getUrl().contains("commande"));
	}
	@And ("User validate the page heading")
	public void user_validate_the_page_heading() {
		Assert.assertTrue("Purchase order statistics is not displayed",isDisplayed(details.purchasestate));
		Assert.assertTrue("Draft order  is not displayed",isDisplayed(details.neworderpurchase));
	}
	
	@When ("User click the new order request")
	public void user_click_the_new_order_request() {
		click(details.newpurchase);
	}
	@Then ("New order creating page is open")
	public void new_order_creating_page_is_open() {
		Assert.assertTrue(getUrl().contains("commande"));
		Assert.assertTrue("New purchase heading is not displayed",isDisplayed(details.purchaseheading));
	}
	@And ("User select the vendorr {string}")
	public void user_select_the_vendorr (String vendor) {
		if(!vendor.trim().isEmpty()) {
			click(details.vendrop);
		}if(vendor.equalsIgnoreCase("agri")) {
			click(details.agri);
		}
	}

	
	@And ("User select the payment termm {string}")
	public void user_select_the_payment_termm (String term) {
		click(details.terms);
		if(term.equalsIgnoreCase("30 days")) {
			click(details.days);
		}else
			if(term.equalsIgnoreCase("Order")) {
				click(details.order2);
			}

	}
	@And ("User select the payment methodd {string}")
	public void user_select_the_payment_methodd (String method) {
		click(details.method);
		if(method.equalsIgnoreCase("Cash")) {
			click(details.cash);
		}else
			if(method.equalsIgnoreCase("Check")){
				click(details.check2);
			}

	}
	@And ("User select the delivery datee")
	public void user_select_the_delivery_datee() {
		click(details.now);
	}
	@And ("User select the tags {string}")
	public void user_select_the_tags(String tags) {
		
		click(details.tags);
		if(tags.equalsIgnoreCase("BSK")) {
			click(details.bsk);
		}else
			if(tags.equalsIgnoreCase("Penne")){
				click(details.pen);
			}
	}
	@And ("User enter the public notes {string}")
	public void user_enter_the_public_notes(String note1) {
		sendKeys(details.pubnote,note1);
	}
	@And ("User enter the private notes {string}")
	public void user_enter_the_private_notes (String note2) {
		sendKeys(details.prinote,note2);
	}
	@And ("User clicks the create draft buttonn")
	public void user_click_the_create_draft_buttonn() {
		click(details.creatdraft);
	}
	@Then ("New price will be createdd {string}")
	public void new_price_will_be_createdd (String result4) {
		 if(result4.equalsIgnoreCase("Success")) {
		    	Assert.assertTrue(getUrl().contains("card.php?id"));
		
	}else {
		Assert.assertTrue("Error meessage is not displayed",isDisplayed(details.venerror));
	}
	

	}
	
	@Given ("User is on purchase order page")
	public void user_is_on_purchase_order_page() {
		
		Assert.assertTrue(getUrl().contains("card.php"));
	}
	@When ("User select the typee as {string}")
	public void user_select_the_typee_as(String prd) {
		selectDropdownByVisibleText(details.typeven,prd);
	}
	@And ("User enterr the description as {string}")
	public void user_enterr_the_description_as(String desc) {
		switchToFrame(details.descframe);
		click(details.descframe2);
		sendKeys(details.descframe2,desc);
		switchback();

	}
	@And ("User enter the unitt as {string}")
	public void user_enter_the_unitt_as(String unit2) {
		sendKeys(details.price3,unit2);
	}
	@And ("User select quantityy as {string}")
	public void user_select_quantityy_as(String qty) {
		sendKeys(details.quantity,qty);
	}
	
	@And ("User select the discountt as {string}")
	public void user_select_the_discountt_as(String dis) {
		sendKeys(details.discount,dis);
	}
	@And ("User click add buttonn")
	public void user_click_add_buttonn() {
		click(details.add);
	}
	@And ("User click the validatee button")
	public void user_click_the_validatee_button() {
		click(details.approve);
		click(details.yes2);

	}
	@Then ("the purchase is validated")
	public void the_purchase_is_validated() {
		Assert.assertTrue(getUrl().contains("card.php?id"));
	}
	
	@Given ("User is on contactt page")
	public void user_is_on_contactt_page() {
		click(details.contact);
		Assert.assertTrue(getUrl().contains("contact.php"));
	}
	@And ("User click the addd button")
	public void user_click_the_addd_button() {
		click(details.add2);
		
	}
	@And ("User click thee notes")
	public void user_click_thee_notes() {
		click(details.note3);
		Assert.assertTrue(getUrl().contains("note.php"));
		Assert.assertTrue("Note is not updated",isDisplayed(details.newnote));
	}
	
	@And ("User click the linkedd files")
	public void user_click_the_linkedd_files() {
		click(details.link2);
		Assert.assertTrue(getUrl().contains("document.php"));
	}
	@And ("User addingg new files {string}")
	public void user_addingg_new_files(String file) throws Exception {
		click(details.plusbtn);
		uploadFile(details.uploadarea,file);
		closedialog();
		
	}
	@And ("Click the uploadd button")
	public void click_the_uploadd_button() {
		click(details.upload);
		Assert.assertTrue("File is not uploaded",isDisplayed(details.upcheck));
	}
	@And ("User click the event")
	public void user_click_the_event() {
		waitforpageload();
		scrollToElement(details.agent);
		
		click(details.agent);
		Assert.assertTrue(getUrl().contains("info.php"));
	}
	@Then("User went back to list")
	public void user_went_back_to_list() {

		click(details.backlist1);
	}
	
	@Given("User is on list in purhase")
	public void user_is_on_list_in_purhase() {
	    Assert.assertTrue(getUrl().contains("list.php"));
	}
	@When("User select the one purchase")
	public void user_select_the_one_purchase() {
	    click(details.purchaseid);
	    Assert.assertTrue(validateElement(details.purchaseid));
	}
	@When("User select an action in purchase")
	public void user_select_an_action_in_purchase() {
		waitforpageload();
		scrollToElement(details.event);
		click(details.vali);
		click(details.deletepurchase);

	}
	@When("User clickk the confirm button")
	public void user_clickk_the_confirm_button() {
		click(details.confirma);
	}
	@When("User select yes in dropd")
	public void user_select_yes_in_dropd() {
		selectDropdownByVisibleText(details.drop6,"Yes");
	    }
	
	@When("User click the validatee btn")
	public void user_click_the_validatee_btn() {
		click(details.vlid);
	    
	}
	@Then("The record is deleted successfully")
	public void the_record_is_deleted_successfully() {
		String actual=getToastMessage(details.inverror);
		Assert.assertTrue(actual.contains("Record deleted"));
	}

	@Given("User is on draft in purhase")
	public void user_is_on_draft_in_purhase() {
		click(details.draftlink);
		Assert.assertTrue(getUrl().contains("orders_suppliers"));
	}
	@When("User select the one draft item")
	public void user_select_the_one_draft_item() {
		click(details.draftid);
		Assert.assertTrue(validateElement(details.draftid));
	}
	@When("User select an action in draft")
	public void user_select_an_action_in_draft() {
		waitforpageload();
		scrollToElement(details.vali);
		click(details.vali);
		click(details.validatepurchase);

	}
	@When("User clickk the confirm button in draft")
	public void user_clickk_the_confirm_button_in_draft() {
		click(details.confirma); 
	}
	@When("User select yess")
	public void user_select_yess() {
		selectDropdownByVisibleText(details.drop6,"Yes");
	}
	@When("User click the validte btn")
	public void user_click_the_validte_btn() {
		click(details.vlid);
	}
	@Then("The record is validated successfully")
	public void the_record_is_validated_successfully() {
		System.out.println("Record got validated");
	}
	
	@And ("User is on validate page")
	public void user_is_on_validate_page() {
		click(details.validatepage);
		Assert.assertTrue(getUrl().contains("orders_suppliers"));
	}
	@Then("User see the validate data")
	public void user_see_the_validate_data() {
 
		Assert.assertTrue("No data found",isDisplayed(details.norec));
		
	}

	@Given("User is on approved in purchase")
	public void user_is_on_approved_in_purchase() {
	    click(details.approved);
			Assert.assertTrue(getUrl().contains("orders_suppliers"));

	}
	@When("User select the one approved")
	public void user_select_the_one_approved() {
		waitforpageload();
		scrollToElement(details.approvedid);
	click(details.approvedid);
	Assert.assertTrue(validateElement(details.approvedid));

	}
	@When("User select an action in approved")
	public void user_select_an_action_in_approved() {
	waitforpageload();
			scrollToElement(details.vali);
			click(details.vali);
			click(details.deletepurchase);

	}
	@When("User click the confirm button in approved")
	public void user_click_the_confirm_button_in_approved() {
	    click(details.confirma);
	}
	@When("User select yes in dropd in approved")
	public void user_select_yes_in_dropd_in_approved() {
	selectDropdownByVisibleText(details.drop6,"Yes");
	}
	@When("User click the validate btn in approved")
	public void user_click_the_validate_btn_in_approved() {
	click(details.vlid);
	}
	@Then("The record is deleted successfullly")
	public void the_record_is_deleted_successfullly() {
		String actual=getToastMessage(details.inverror);
		Assert.assertTrue(actual.contains("Record deleted"));
	}

	@Given("User is on order in purchase")
	public void user_is_on_order_in_purchase() {
	  click(details.ordered);
			Assert.assertTrue(getUrl().contains("orders_suppliers"));
	  
	}
	@When("User select the one order item")
	public void user_select_the_one_order_item() {
	click(details.orderid);
			Assert.assertTrue(validateElement(details.orderid));

	}
	@When("User select an action in order")
	public void user_select_an_action_in_order() {
	    waitforpageload();
			scrollToElement(details.vali);
			click(details.vali);
			click(details.validatepurchase);

	}
	@When("User clickk the confirm button in order")
	public void user_clickk_the_confirm_button_in_order() {
	click(details.confirma);
	}
	@When("User select yes in order")
	public void user_select_yes_in_order() {
	selectDropdownByVisibleText(details.drop6,"Yes");
	}
	@When("User click the validate btn in order")
	public void user_click_the_validate_btn_in_order() {
	    click(details.vlid);
	}
	@Then("The record is validated successfullly")
	public void the_record_is_validated_successfullly() {
	System.out.println("Record got validated");
	}

	@Given("User is on order in cancelled")
	public void user_is_on_order_in_cancelled() {
	   click(details.canceled);
	Assert.assertTrue(getUrl().contains("list.php"));
	 
	}
	@When("User select the one cancel item")
	public void user_select_the_one_cancel_item() {
	    click(details.cancelid);
	Assert.assertTrue(validateElement(details.cancelid));

	}
	@When("User select an action in cancel")
	public void user_select_an_action_in_cancel() {
	       waitforpageload();
				scrollToElement(details.vali);
				click(details.vali);
				click(details.deletepurchase);

	}
	@When("User clickk the confirm button in cancel")
	public void user_clickk_the_confirm_button_in_cancel() {
	click(details.confirma);
	}
	@When("User select yes in cancel")
	public void user_select_yes_in_cancel() {
	    selectDropdownByVisibleText(details.drop6,"Yes");
	}
	@When("User click the validate btn in cancel")
	public void user_click_the_validate_btn_in_cancel() {
	  click(details.vlid);  
	}
	@Then("The record is deleted")
	public void the_record_is_deleted() {
		String actual=getToastMessage(details.inverror);
		Assert.assertTrue(actual.contains("record deleted"));
	}
	@Then("User is on Refused page")
	public void user_is_on_refused_page() {
	    click(details.refused);
			Assert.assertTrue(getUrl().contains("orders_suppliers"));

	}
	@Then("User see the refused data")
	public void user_see_the_refused_data() {
	Assert.assertTrue("No data found",isDisplayed(details.norec));
	}

	@Given("User is on statistics page in purchase")
	public void user_is_on_statistics_page_in_purchase() {
	    click(details.state2);
	Assert.assertTrue(getUrl().contains("stats"));

	}
	@Given("User select the thirdpartyy {string}")
	public void user_select_the_thirdpartyy(String  third)  {
	   if(third.equals("Akmal")) {
		   selectCustomdd(details.thirdparty,details.akmal);
	   }
	   
	String expected=third;
	String actual=getText(details.thirdparty);
	Assert.assertEquals(expected,actual);

	}
	@Given("User select the thirdpartyy type {string}")
	public void user_select_the_thirdpartyy_type(String  type) {
		 if(type.equals("Other")) {
			   selectCustomdd(details.thirdtype,details.thirdtype2);
		   }
		   
		String expected=type;
		String actual=getText(details.thirdtype);
		Assert.assertEquals(expected,actual);

	}
	@Given("User select the vendor tagg {string}")
	public void user_select_the_vendor_tagg(String  tag){
		 if(tag.equals("Albunes")) {
			   selectCustomdd(details.tag1,details.tag2);
		   }
		   
		String expected=tag;
		String actual=getText(details.tag1);
		Assert.assertEquals(expected,actual);

	    
	}
	@Given("User select the category {string}")
	public void user_select_the_category(String  category) {
		 if(category.equals("xContainer")) {
			   selectCustomdd(details.category,details.container);
			   }
	}
	
	@Then("the click the refresh buttonn")
	public void the_click_the_refresh_buttonn() {
		click(details.refresh);  
	}

	@Given("User is on billing area page")
	public void user_is_on_billing_area_page() {
	    click(details.billing1);
	Assert.assertTrue(getUrl().contains("billing"));;

	}
	@Given("Verifying invoice page headings")
	public void verifying_invoice_page_headings() {
	Assert.assertTrue("Customer invoice is not display",isDisplayed(details.cusheading));
	Assert.assertTrue("Vendor invoice is not display",isDisplayed(details.cusheading3));

	}
	@When("User clicks on customer invoice")
	public void user_clicks_on_customer_invoice() {
	click(details.cusinvoice);
	Assert.assertTrue(getUrl().contains("customers_bills"));

	}
	@When("Verifying customer invoice page")
	public void verifying_customer_invoice_page() {
	  Assert.assertTrue("Open invoice is not display",isDisplayed(details.cusheading1));
	Assert.assertTrue("Unpaid customer is not display",isDisplayed(details.cusheading2));
			

	}
	@When("User clicks any draft invoice")
	public void user_clicks_any_draft_invoice() {
	    click(details.teclib);
	Assert.assertTrue(getUrl().contains("socid"));

	}
	@Then("warning message should displayy")
	public void warning_message_should_displayy() {
	String actual=getText(details.cuserror);
	Assert.assertNotNull(actual);
	Assert.assertFalse(actual.trim().isEmpty());
	back();

	}
	

@When("User click the new invoice request")
public void user_click_the_new_invoice_request() {
click(details.newinvoice1);
}
@Then("New invoice creating page is open")
public void new_invoice_creating_page_is_open() {
   Assert.assertTrue(getUrl().contains("action"));
Assert.assertTrue("New Invoice heading is not displayed",isDisplayed(details.invheading));

}
@Then("User select the customer {string}")
public void user_select_the_customer(String customer) {
    		if(!customer.trim().isEmpty()) {
			click(details.custodrop);
		}if(customer.equalsIgnoreCase("aqua")) {
			click(details.aqua);
		}
	}


@Then("User select thee type {string}")
public void user_select_thee_type(String type1) {
	if(type1.equalsIgnoreCase("Down Payment"))
    		click(details.down2);
	}


@Then("User select the paymentt term {string}")
public void user_select_the_paymentt_term(String term) {
   click(details.terms);
		if(term.equalsIgnoreCase("30 days")) {
			click(details.days);
		}else
			if(term.equalsIgnoreCase("Order")) {
				click(details.order2);
			}


}
@Then("User select the paymentt method {string}")
public void user_select_the_paymentt_method(String method) {
    click(details.method);
		if(method.equalsIgnoreCase("Cash")) {
			click(details.cash);
		}else
			if(method.equalsIgnoreCase("Check")){
				click(details.check2);
			}


}
@Then("User select the default bank {string}")
public void user_select_the_default_bank(String default1) {
    click(details.defaultbank);
		if(default1.equalsIgnoreCase("Bank bs6tu")) {
			click(details.default1);
		}
}
@Then("User select the source {string}")
public void user_select_the_source(String source) {
    click(details.source);
		if(source.equalsIgnoreCase("Internet")) {
			click(details.source2);
		}else
			if(source.equalsIgnoreCase("Partner")){
				click(details.partner);
			}

}
@Then("User select the tag {string}")
public void user_select_the_tag(String tag1) {
        click(details.cate2);
		if(tag1.equalsIgnoreCase("Leistung")) {
			click(details.leiung);
		}else
			if(tag1.equalsIgnoreCase("Servicios")){
				click(details.servicio);
			}


}
@Then("User enter the public note as {string}")
public void user_enter_the_public_note_as(String note3) {
    sendKeys(details.pubnote,note3);
}

@Then("User enter the private note as {string}")
public void user_enter_the_private_note_as(String note4) {
    sendKeys(details.prinote,note4);
}

@Then("User clicks the create draft button in invoice")
public void user_clicks_the_create_draft_button_in_invoice() {
    click(details.creatdraft);
}
@Then("New invoice will be created {string}")
public void new_invoice_will_be_created(String result5) {
    if(result5.equalsIgnoreCase("Success")){ 
    	Assert.assertTrue(getUrl().contains("card.php?facid"));
		
	}else {
		Assert.assertTrue("Error meessage is not displayed",isDisplayed(details.inverror));
	}
}


@Given("User is on price request page in invoice")
public void user_is_on_price_request_page_in_invoice()
 {
	
	Assert.assertTrue(getUrl().contains("card.php"));
}
@When("User select the type in invoice  {string}")
public void user_select_the_type_in_invoice(String prdi)
 {
	selectDropdownByVisibleText(details.typeven,prdi);
}
@And ("User enter the description in invoice as {string}")
public void user_enter_the_description_in_invoice_as(String desc1) {
	switchToFrame(details.descframe);
	click(details.descframe2);
	sendKeys(details.descframe2,desc1);
	switchback();

}
@And ("User enter the unit in invoice as {string}")
public void user_enter_the_unit_in_invoice_as(String unit3) {
	sendKeys(details.price3,unit3);
}
@And ("User select quantity in invoice as {string}")
public void user_select_quantity_in_invoice_as(String qty1) {
	sendKeys(details.quantity,qty1);
}

@And ("User select the discount in invoice as {string}")
public void user_select_the_discount_in_invoice_as(String dis1) {
	sendKeys(details.discount,dis1);
}
@And ("User click add button in invoice")
public void user_click_add_button_in_invoice() {
	click(details.add);
}
@And ("User click the validate button in invoice")
public void user_click_the_validate_button_in_invoice() {
	click(details.validd);
	click(details.yes2);

}
@Then("the price is validated in invoice")
public void the_price_is_validated_in_invoice() 
 {
	Assert.assertTrue(getUrl().contains("facid"));
}


@Given("User is on contact page in invoice")
public void user_is_on_contact_page_in_invoice() {
click(details.contact);
Assert.assertTrue(getUrl().contains("contact.php"));

}
@Given("User click the add button in invoice")
public void user_click_the_add_button_in_invoice() {
    click(details.add2);
}
@Given("User click the notes in invoice")
public void user_click_the_notes_in_invoice() {
	click(details.note3);
	Assert.assertTrue(getUrl().contains("note.php"));
	Assert.assertTrue("Note is not updated",isDisplayed(details.notecon));

}
@Given("User click the linked files in invoice")
public void user_click_the_linked_files_in_invoice() {
click(details.link2);
Assert.assertTrue(getUrl().contains("document.php"));

}
@Given("User adding new invoice files {string}")
public void user_adding_new_invoice_files(String file2) throws AWTException {
  click(details.plusbtn);
uploadFile(details.uploadarea,file2);
closedialog();
}
@Given("Click the upload button in invoice")
public void click_the_upload_button_in_invoice() {
    click(details.upload);
String uploadfile=getText(details.uploadfile);
Assert.assertTrue(uploadfile.contains("crm2.png"));
	}



@Given("User click the event in invoice")
public void user_click_the_event_in_invoice() {
waitforpageload();
scrollToElement(details.agent);
		
click(details.agent);
Assert.assertTrue(getUrl().contains("agenda.php"));

}
@Then("User went back to list in invoice")
public void user_went_back_to_list_in_invoice() {
    click(details.backlist1);
}

@Given("User is on list in invoice")
public void user_is_on_list_in_invoice() {
	click(details.listhe);
    Assert.assertTrue(getUrl().contains("list.php"));
}
@When("User select the one invoice")
public void user_select_the_one_invoice() {
        click(details.listidd);
	Assert.assertTrue(validateElement(details.listidd));

}
@When("User select an action in invoice")
public void user_select_an_action_in_invoice() {
waitforpageload();
scrollToElement(details.vali);
		click(details.vali);
		click(details.listdeletedraft);


}
@When("User click the confirm button in invoice")
public void user_click_the_confirm_button_in_invoice() {
click(details.confirma);
}
@When("User select yes in invoice dd")
public void user_select_yes_in_invoice_dd() {
selectDropdownByVisibleText(details.drop6,"Yes");
}
@When("User click the validate btn in invoice")
public void user_click_the_validate_btn_in_invoice() {
    click(details.vlid);
}
@Then("The record is deleted successfully in invoice")
public void the_record_is_deleted_successfully_in_invoice() {
	
String actual=getToastMessage(details.inverror);
Assert.assertTrue(actual.contains("Record deleted"));
    
}


@Given("User is on draft in invoice")
public void user_is_on_draft_in_invoice() {
	click(details.listdraft);
Assert.assertTrue(getUrl().contains("customers_bills_draft"));
}
@When("User select the one draft item in invoice")
public void user_select_the_one_draft_item_in_invoice() {
            click(details.listidraft);
	Assert.assertTrue(validateElement(details.listidraft));

}
@When("User select an action in invoicee")
public void user_select_an_action_in_invoicee() {
waitforpageload();
scrollToElement(details.vali);
		click(details.vali);
		click(details.listvalidate);

}
@When("User click the confirm button in invoicee")
public void user_click_the_confirm_button_in_invoicee() {
click(details.confirma);

}
@Then("The record is validated successfully in invoice")
public void the_record_is_validated_successfully_in_invoice() {
	String validate=getToastMessage(details.errormessage);

Assert.assertTrue(validate.contains("to be validated"));

}


@Given("User is on paid item page")
public void user_is_on_paid_item_page() {
	click(details.paid);
        Assert.assertTrue(getUrl().contains("customers_bills_paid"));

}
@When("User select the one paid item")
public void user_select_the_one_paid_item() {
            click(details.listpaid);
	Assert.assertTrue(validateElement(details.listpaid));


}
@When("User select an action in paid")
public void user_select_an_action_in_paid() {
    waitforpageload();
scrollToElement(details.vali);
		click(details.vali);
		click(details.listdeletedraft);

}
@When("User click the confirm button in paid")
public void user_click_the_confirm_button_in_paid() {
    click(details.confirma);

}
@When("User select yes in dropd in paid")
public void user_select_yes_in_dropd_in_paid() {
selectDropdownByVisibleText(details.drop6,"Yes");

}
@When("User click the validate btn in paid")
public void user_click_the_validate_btn_in_paid() {
        click(details.vlid);

}
@Then("The record is deleted successfully in paid")
public void the_record_is_deleted_successfully_in_paid() {
	String actual=getToastMessage(details.inverror);
	Assert.assertTrue(actual.endsWith("record deleted"));

}


@Given("User is on abandoned in invoice")
public void user_is_on_abandoned_in_invoice() {
	click(details.Abandoned);
    Assert.assertTrue(getUrl().contains("customers_bills_canceled"));
}
@When("User select the one abandoned item")
public void user_select_the_one_abandoned_item() {
                click(details.listaban);
	Assert.assertTrue(validateElement(details.listaban));

}
@When("User select an action in abandoned")
public void user_select_an_action_in_abandoned() {
        waitforpageload();
scrollToElement(details.vali);
		click(details.vali);
		click(details.listvalidate);


}
@When("User click the confirm button in abandoned")
public void user_click_the_confirm_button_in_abandoned() {
    click(details.confirma);

}
@Then("The record is validated successfully in abandoned")
public void the_record_is_validated_successfully_in_abandoned() {
	String validate=getToastMessage(details.inverror);

Assert.assertTrue(validate.contains("to be validated"));

}

@Given("User is on list of templates page")
public void user_is_on_list_of_templates_page(){
click(details.template);
Assert.assertTrue(getUrl().contains("invoicetemplate"));

Assert.assertTrue("Template heading is not displayed",isDisplayed(details.templatehead));
}


@When ("User select one template")
public void user_select_one_template(){
click(details.templateid);
Assert.assertTrue(getUrl().contains("card.php?action"));

}
@And ("User select the type in templates")
public void user_select_the_type_in_templates(){
click(details.down2);
	}


@And ("User click the payment method as {string}")
public void user_click_the_payment_method_as(String cash){
click(details.method);
	if(cash.equalsIgnoreCase("Cash")) {
			click(details.cash);
}
}
@And ("User select the default bank account as {string}")
public void user_select_the_default_bank_account_as(String bank){
click(details.defaultbank);
		if(bank.equalsIgnoreCase("Bank bs6tu")) {
			click(details.default1);
		}

}
@And ("User select the category as {string}")
public void user_select_the_category_as(String cate){

click(details.cate2);
		if(cate.equalsIgnoreCase("Leistung")) {
			click(details.leiung);
		}
}
@And ("User enter the publicc note as {string}")
public void user_enter_the_publicc_note_as(String note5){

sendKeys(details.pubnote,note5);
}
@Then ("User click the create draft in template")
public void user_click_the_create_draft_in_template(){
click(details.creatdraft);
}


@Given("User is on customer invoice page in templates")
public void user_is_on_customer_invoice_page_in_templates()
 {
	
	Assert.assertTrue(getUrl().contains("card.php"));
}
@When("User select the type in templates  {string}")
public void user_select_the_type_in_templates(String prdd)
 {
	selectDropdownByVisibleText(details.typeven,prdd);
}
@And ("User enter the description in templates as {string}")
public void user_enter_the_description_in_templates_as(String desc2) {
	switchToFrame(details.descframe);
	click(details.descframe2);
	sendKeys(details.descframe2,desc2);
	switchback();

}
@And ("User enter the unit in templates as {string}")
public void user_enter_the_unit_in_templates_as(String unit4) {
	sendKeys(details.price3,unit4);
}
@And ("User select quantity in templates as {string}")
public void user_select_quantity_in_templates_as(String qty2) {
	sendKeys(details.quantity,qty2);
}

@And ("User select the discount in templates as {string}")
public void user_select_the_discount_in_templates_as(String dis1) {
	sendKeys(details.discount,dis1);
}
@And ("User click add button in templates")
public void user_click_add_button_in_templates() {
	click(details.add);
}
@And ("User click the validate button in templates")
public void user_click_the_validate_button_in_templates() {
	click(details.validd);
	click(details.yes2);

}
@Then("the price is validated in templates")
public void the_price_is_validated_in_templates() 
 {
	Assert.assertTrue(getUrl().contains("facid"));
}


@Given("User is on contact page in template")
public void user_is_on_contact_page_in_template() {
click(details.contact);
Assert.assertTrue(getUrl().contains("contact.php"));

}
@Given("User click the add button in template")
public void user_click_the_add_button_in_template() {
    click(details.add2);
}
@Given("User click the notes in template")
public void user_click_the_notes_in_template() {
	click(details.note3);
	Assert.assertTrue(getUrl().contains("note.php"));
	Assert.assertTrue("Note is not updated",isDisplayed(details.templatenotes));

}
@Given("User click the linked files in template")
public void user_click_the_linked_files_in_template() {
click(details.link2);
Assert.assertTrue(getUrl().contains("document.php"));

}
@Given("User adding new template files {string}")
public void user_adding_new_template_files(String file3)  throws AWTException {
  click(details.plusbtn);
uploadFile(details.uploadarea,file3);
closedialog();
}
@Given("Click the upload button in template")
public void click_the_upload_button_in_template() {
    click(details.upload);
String uploadfile=getText(details.uploadfile);
Assert.assertTrue(uploadfile.contains("crm2.png"));
	}

@Given("User click the event in template")
public void user_click_the_event_in_template() {
waitforpageload();
scrollToElement(details.agent);
		
click(details.agent);
Assert.assertTrue(getUrl().contains("agenda.php"));

}
@Then("User went back to list in template")
public void user_went_back_to_list_in_template() {
    click(details.backlist1);
}

@Given("User is on payment page")
public void user_is_on_payment_page() {
    click(details.payments);
Assert.assertTrue(getUrl().contains("customers_bills_payment"));
}
@When("User validate the payment page heading")
public void user_validate_the_payment_page_heading() {
    Assert.assertTrue("Payment heading is not displayed",isDisplayed(details.paymenthead));
}
@When("User select one payment id")
public void user_select_one_payment_id() {
	click(details.paymentid);
}

@When("User check the payment page")
public void user_check_the_payment_page() {
   Assert.assertTrue(getUrl().contains("paiement")); 
}
@When("User check the log")
public void user_check_the_log() {
	click(details.paylog);
	Assert.assertTrue(getUrl().contains("info.php")); 
}

@When("User check the linked filess")
public void user_check_the_linked_filess() {
	click(details.paylinked);
	Assert.assertTrue(getUrl().contains("document.php"));
}
    

@When("User add the new file {string}")
public void user_add_the_new_file(String file6) throws AWTException {
	click(details.plusbtn);
	uploadFile(details.uploadarea,file6);
	closedialog();
}

@Given("Click the upload button in payment")
public void click_the_upload_button_in_payment() {
    click(details.upload);
String uploadfile=getText(details.uploadfile);
Assert.assertTrue(uploadfile.contains("crm2.png"));
	}
    

@Then("User went back to listt")
public void user_went_back_to_listt() {
	 click(details.backlist1);
}

@And ("User create reporting")
public void user_create_reporting() {
	click(details.reporting);
	Assert.assertTrue(getUrl().contains("rapport.php"));
}
@Then ("user create the new report")
public void uer_create_the_new_report() {
	
	click(details.generate);
	
}


@Given("User is on statistics page in customer invoice")
public void user_is_on_statistics_page_in_customer_invoice() {
click(details.statiscus);
Assert.assertTrue(getUrl().contains("stats"));

}
@Given("User select the thirdparty in statistics {string}")
public void user_select_the_thirdparty_in_statistics(String name) {
if(name.equals("Ajmal")) {
		   selectCustomdd(details.thirdparty,details.ajmal);
	   }
	   
	String expected=name;
	String actual=getText(details.thirdparty);
	Assert.assertEquals(expected,actual);

}
@Given("User select the thirdparty type in statistics {string}")
public void user_select_the_thirdparty_type_in_statistics(String type1) {
if(type1.equals("Other")) {
selectCustomdd(details.thirdtype,details.thirdtype2);
		   }
		   
		String expected=type1;
		String actual=getText(details.thirdtype);
		Assert.assertEquals(expected,actual);

}
@Given("User select the category customer as {string}")
public void user_select_the_category_customer_as(String  categ) {

selectCustomdd(details.tagcat,details.ama);
		  }
@Given("User select the category customer invoice {string}")
public void user_select_the_category_customer_invoice(String cust) {

selectCustomdd(details.tagcat2,details.servic);
		  

}
@Given("User select the created by {string}")
public void user_select_the_created_by(String  name2) {
if(name2.equals("David Doe")) {
selectCustomdd(details.createdby,details.david);
		   }
		   
		String expected=name2;
		String actual=getText(details.createdby);
		Assert.assertEquals(expected,actual);

}
@Given("User select the status as {string}")
public void user_select_the_status_as(String sta4) {
if(sta4.equals("Paid")) {
selectCustomdd(details.statussta,details.statussta2);
		   }
		   
		String expected=sta4;
		String actual=getText(details.statussta);
		Assert.assertEquals(expected,actual);


}
@Then("the click the refresh button in statistics")
public void the_click_the_refresh_button_in_statistics() {
click(details.refresh);
}


@Given("User is on donation page")
public void user_is_on_donation_page() {
	click(details.donation);
	Assert.assertTrue(getUrl().contains("donations"));
}
@Given("User verify the donation heading")
public void user_verify_the_donation_heading() {
	Assert.assertTrue("Donation heading is not displayed",isDisplayed(details.donhead));
	Assert.assertTrue("Statistis heading is not displayed",isDisplayed(details.donhead2));
}
@When("User clicks the new donation button")
public void user_clicks_the_new_donation_button() {
    click(details.newdonation);
    Assert.assertTrue("New Donation heading is not displayed",isDisplayed(details.donationhead));
}
@When("User select the date in donation")
public void user_select_the_date_in_donation() {
	click(details.datenew);
}
@When("User enter the amount {string}")
public void user_enter_the_amount(String amount1) {
	click(details.donamount);
	if(!amount1.trim().isEmpty()) {
	sendKeys(details.donamount,amount1);
	}
	
}
@When("User enter the company {string}")
public void user_enter_the_company(String company) {
	sendKeys(details.doncompany,company);
}
@When("User enter the lastname in donation {string}")
public void user_enter_the_lastname_in_donation(String lastname1) {
	sendKeys(details.donlast,lastname1);
    
}
@When("User enter the firstname in donation {string}")
public void user_enter_the_firstname_in_donation(String firstname1) {
	sendKeys(details.donfirst,firstname1);
}
@When("User enter the address in donation {string}")
public void user_enter_the_address_in_donation(String address) {
	sendKeys(details.donaddress,address);
}

@And ("User select the country in donation")
public void uer_select_the_country_in_donation() {
	selectCustomdd(details.doncountry,details.india2);
}
@When("User enter the zipcode in donation {string}")
public void user_enter_the_zipcode_in_donation(String zip) {
	sendKeys(details.donzip,zip);
}
@When("User enter the email in donation {string}")
public void user_enter_the_email_in_donation(String email1) {
	sendKeys(details.email2,email1);
}
@When("User enter the note in public as {string}")
public void user_enter_the_note_in_public_as(String notepub){
	sendKeys(details.publicnote,notepub);
}
@When("User enter the note is private as {string}")
public void user_enter_the_note_is_private_as(String notepri){
	sendKeys(details.donprinote,notepri);
    
}
@When("User click the save button")
public void user_click_the_save_button() {
	click(details.donsave);
    
}
@Then("Verify the donation creation result {string}")
public void verify_the_donation_creation_result(String result5) {
	
	if(result5.equalsIgnoreCase("Success")) {
		Assert.assertTrue(getUrl().contains("card.php"));
	}else {
		String actual=getToastMessage(details.inverror);
		Assert.assertTrue(actual.contains("Field 'Amount' is required"));
		
	}
}


@Given("User is on new donation page")
public void user_is_on_new_donation_page() {
	Assert.assertTrue(getUrl().contains("card.php?id"));
    
}
@Given("User validate the new donation")
public void user_validate_the_new_donation() {
	click(details.pomie);
}
@Given("User click the notes in donation")
public void user_click_the_notes_in_donation() {
	click(details.note3);
	Assert.assertTrue(getUrl().contains("note.php"));
	Assert.assertTrue("Note is not updated",isDisplayed(details.donnotecheck));

	
}
@Given("User click the linked files in donation")
public void user_click_the_linked_files_in_donation() {
	click(details.link2);
	Assert.assertTrue(getUrl().contains("document.php"));

}
@Given("User adding new donation files {string}")
public void user_adding_new_donation_files(String file5)throws AWTException  {
	  click(details.plusbtn);
	  uploadFile(details.uploadarea,file5);
	  closedialog();
}


@Given("Click the upload button in donation")
public void click_the_upload_button_in_donation() {
	click(details.upload);
	String uploadfile=getText(details.uploadfile);
	Assert.assertTrue(uploadfile.contains("crm2.png"));

}
@Given("User click the log in donation")
public void user_click_the_log_in_donation() {
	waitforpageload();
	click(details.donlog);
	Assert.assertTrue(getUrl().contains("info.php"));
    
}
@Then("User went back to list in donation")
public void user_went_back_to_list_in_donation() {
	click(details.backlist1);
}

@Given("User is on list in donation")
public void user_is_on_list_in_donation() {
    click(details. donationlist);
    Assert.assertTrue(getUrl().contains("list.php"));

}
@When("User select the one donation")
public void user_select_the_one_donation() {
click(details.donlistid);
	Assert.assertTrue(validateElement(details.donlistid));
    
}
@When("User select an action in donation")
public void user_select_an_action_in_donation() {
    waitforpageload();
scrollToElement(details.vali);
		click(details.vali);
		click(details.donlistdelete);

}
@When("User click the confirm button in donation")
public void user_click_the_confirm_button_in_donation() {
click(details.confirma);

}
@When("User select yes in donation dd")
public void user_select_yes_in_donation_dd() {
    selectDropdownByVisibleText(details.drop6,"Yes");

}
@When("User click the validate btn in donation")
public void user_click_the_validate_btn_in_donation() {
    click(details.vlid);
}
@Then("The record is deleted successfully in donation")
public void the_record_is_deleted_successfully_in_donation() {
String actual=getToastMessage(details.inverror);
Assert.assertTrue(actual.contains("Record deleted"));

    
}


@Given("User is on payment page in donation")
public void user_is_on_payment_page_in_donation() {
click(details.donpayments);
Assert.assertTrue(getUrl().contains("donations"));

}
@Given("User validate the payment page")
public void user_validate_the_payment_page() {
Assert.assertTrue("Payment heading is not displayed",isDisplayed(details.payheading));

    
}
@When("User licks the ref sorting icon")
public void user_licks_the_ref_sorting_icon() {
    click(details.refsort);
}
@Then("Ref column should sorting in acending order")
public void ref_column_should_sorting_in_acending_order() {
Assert.assertTrue(getUrl().contains("sortfield=pd.rowid&sortorde"));
click(details.refsort);
}
@Then("User select one payment id in donation")
public void user_select_one_payment_id_in_donation() {
click(details.paylistid);
}
@Then("User check the donation payment page")
public void user_check_the_donation_payment_page() {
Assert.assertTrue(getUrl().contains("card.php?id"));
click(details.insideid);
}
@Then("User check the linked files in donation")
public void user_check_the_linked_files_in_donation() {
click(details.paylinked);
	Assert.assertTrue(getUrl().contains("document.php"));

}
@Then("User add the new file in {string}")
public void user_add_the_new_file_in(String  file7) throws AWTException {
click(details.plusbtn);
	uploadFile(details.uploadarea,file7);
	closedialog();

}
@Then("Click the upload button in donation payment")
public void click_the_upload_button_in_donation_payment() {
        click(details.upload);
String uploadfile=getText(details.uploadfile);
Assert.assertTrue(uploadfile.contains("crm2.png"));

}
@Then("User click the notes in donation payment")
public void user_click_the_notes_in_donation_payment() {
click(details.note2);
Assert.assertTrue(getUrl().contains("note.php"));

}
@Then("User enter the new notes in donation as {string}")
public void user_enter_the_new_notes_in_donation_as(String notes4)  {
    click(details.publicedit);
		click(details.text2);
		sendKeys(details.text2,notes4);
click(details.notesave);

}
@Then("User check the log in donation payment")
public void user_check_the_log_in_donation_payment() {
    click(details.paylog);
Assert.assertTrue(getUrl().contains("info.php")); 

}
@Then("User went back to list in donation payment")
public void user_went_back_to_list_in_donation_payment() {
    click(details.backlist1);
}

@Given("User is on statistics page in donation")
public void user_is_on_statistics_page_in_donation() {
    click(details.donstate);
Assert.assertTrue(getUrl().contains("stats"));

}
@Given("User select the thirdparty type in donation statis {string}")
public void user_select_the_thirdparty_type_in_donation_statis(String  type7 ) {
  if(type7.equals("Other")) {
selectCustomdd(details.thirdtype,details.thirdtype2);
		   }
		   
		String expected=type7;
		String actual=getText(details.thirdtype);
		Assert.assertEquals(expected,actual);
  
}
@Given("User select the category customer in statis")
public void user_select_the_category_customer_in_statis(){
selectCustomdd(details.tagcat,details.ama2);
}

@Given("User select the created by in donation statis {string}")
public void user_select_the_created_by_in_donation_statis(String name3){
    if(name3.equals("David Doe")) {
selectCustomdd(details.createdby,details.david);
		   }
		   
		String expected=name3;
		String actual=getText(details.createdby);
		Assert.assertEquals(expected,actual);

}
@Given("User select the status as in donation statis {string}")
public void user_select_the_status_as_in_donation_statis(String sta5) {
if(sta5.equals("Draft promise")) {
	
selectCustomdd(details.donstatus,details.draftstatus);
		   }
		   
		String expected=sta5;
		String actual=getText(details.donstatus);
		Assert.assertEquals(expected,actual);

}
@Then("the click the refresh button in donation statistics")
public void the_click_the_refresh_button_in_donation_statistics() {
click(details.refresh);
}


@Given("User is on list in salaries")
public void user_is_on_list_in_salaries() {
click(details.salary);
  Assert.assertTrue(getUrl().contains("salaries"));

}
@Given("User validate the list page in salaries")
public void user_validate_the_list_page_in_salaries() {
Assert.assertTrue("Payment heading is not displayed",isDisplayed(details.salheading));
}
@When("User licks the ref sorting icon in list")
public void user_licks_the_ref_sorting_icon_in_list() {
	doubleClick(details.refsalary);
}
@Then("Ref column should sorting in acending in list")
public void ref_column_should_sorting_in_acending_in_list() {
Assert.assertTrue(getUrl().contains("sortfield"));
}
@When("User select the one salaries")
public void user_select_the_one_salaries() {
    click(details.sallistid);
	Assert.assertTrue(validateElement(details.sallistid));

}
@When("User select an action in salaries")
public void user_select_an_action_in_salaries() {
waitforpageload();
scrollToElement(details.vali);
		click(details.vali);
		click(details.donlistdelete);

}
@When("User click the confirm button in salaries")
public void user_click_the_confirm_button_in_salaries() {
click(details.confirma);
    
}
@When("User select yes in salaries dd")
public void user_select_yes_in_salaries_dd() {
selectDropdownByVisibleText(details.drop6,"Yes");
}
@When("User click the validate btn in salaries")
public void user_click_the_validate_btn_in_salaries() {
click(details.vlid);
    
}
@Then("The record is deleted successfully in salaries")
public void the_record_is_deleted_successfully_in_salaries() {
String actual=getToastMessage(details.inverror);
Assert.assertTrue(actual.contains("record deleted"));

    
}


@Given("User is on payment page in salaries")
public void user_is_on_payment_page_in_salaries() {
    click(details.donpayments);
Assert.assertTrue(getUrl().contains("payments.php"));

}
@Given("User validate the payment page in salaries")
public void user_validate_the_payment_page_in_salaries() {
Assert.assertTrue("Payment heading is not displayed",isDisplayed(details.salpayheading));
}
@When("User licks the ref sorting icon in payment")
public void user_licks_the_ref_sorting_icon_in_payment() {
	doubleClick(details.refsort);
}
@Then("Ref column should sorting in acending in payment")
public void ref_column_should_sorting_in_acending_in_payment() {
  Assert.assertTrue(getUrl().contains("sortfield=s.rowid&sortorder"));  
}
@Then("User select one payment id in salaries")
public void user_select_one_payment_id_in_salaries() {
click(details.salpayid);
}
@Then("User check the salaries payment page")
public void user_check_the_salaries_payment_page() {
Assert.assertTrue(getUrl().contains("card.php?id"));
click(details.salpayinsideid);

}
@Then("User check the credit transfer page")
public void user_check_the_credit_transfer_page() {
click(details.creittrans);
Assert.assertTrue(getUrl().contains("virement_request.php"));

}
@Then("User check the linked files in salaries")
public void user_check_the_linked_files_in_salaries() {
click(details.paylinked);
	Assert.assertTrue(getUrl().contains("document.php"));

}

@Then("User check the log in salaries payment")
public void user_check_the_log_in_salaries_payment() {
  click(details.paylog);
Assert.assertTrue(getUrl().contains("info.php"));

}
@Then("User went back to list in salaries payment")
public void user_went_back_to_list_in_salaries_payment() {
click(details.backlist1);
}




@Given("User is on statistics page in salaries")
public void user_is_on_statistics_page_in_salaries() {
click(details.donstate);
Assert.assertTrue(getUrl().contains("stats"));

}
@Given("User select the year")
public void user_select_the_year() {
	click(details.salyear);
}
@Then("the click the refresh button in salaries statistics")
public void the_click_the_refresh_button_in_salaries_statistics() {
click(details.refresh);
    
}


@Given("User is on loan page")
public void user_is_on_loan_page() {
click(details.loan);
Assert.assertTrue(getUrl().contains("loan"));

}
@Given("User verify the loan heading")
public void user_verify_the_loan_heading() {
Assert.assertTrue("Loan heading is not displayed",isDisplayed(details. loanheading));
    }
@When("User clicks the new loan button")
public void user_clicks_the_new_loan_button() {
click(details.newloan);
    Assert.assertTrue("New Loan heading is not displayed",isDisplayed(details. loadheading));

}
@When("User enter the label {string}")
public void user_enter_the_label(String  label) {
    click(details.loanlabel);
	if(!label.trim().isEmpty()) {
	sendKeys(details.loanlabel,label);
	}

}
@When("User enter the bank account {string}")
public void user_enter_the_bank_account(String  account) {
if(!account.trim().isEmpty()) {
			click(details.bankacc);
		}if(account.equalsIgnoreCase("Account")) {
			click(details.bankacc1);
		}
		   
		 String expected=account;
		String actual=getText(details.bankacc);
		Assert.assertEquals(expected,actual);
	

}
@When("User enter the capital {string}")
public void user_enter_the_capital(String  capital) {
click(details.capital);
	if(!capital.trim().isEmpty()) {
	sendKeys(details.capital,capital);
	}

}
@When("User enter the start date")
public void user_enter_the_start_date() {
    click(details.start);
}
@When("User enter the End date")
public void user_enter_the_end_date() {
click(details.end);
}
@When("User enter the number of terms {string}")
public void user_enter_the_number_of_terms(String  terms) {
click(details.loanterms);
	if(!terms.trim().isEmpty()) {
	sendKeys(details.loanterms,terms);
	}

}
@When("User enter the rate {string}")
public void user_enter_the_rate(String rate) {
click(details.loanrate);
	if(!rate.trim().isEmpty()) {
	sendKeys(details.loanrate,rate);
	}

    
}

@And ("User enter the insurance amount as {string}")
public void user_enter_the_insurance_amount_as(String insurance) {
	sendKeys(details.insurance,insurance);
}
@When("User enter the note in publoan as {string}")
public void user_enter_the_note_in_publoan_as(String  note8) {
sendKeys(details.publicnote,note8);
}
@When("User enter the note is priloan as {string}")
public void user_enter_the_note_is_priloan_as(String note9) {
sendKeys(details.donprinote,note9);
}
@When("User select the account insurance {string}")
public void user_select_the_account_insurance(String  accins) {
if(!accins.trim().isEmpty()) {
			click(details.accinsurance);
		}if(accins.equalsIgnoreCase("106 - Réserves")) {
			click(details.accins1);
		}
		   
		 String expected=accins;
		String actual=getText(details.accinsurance);
		Assert.assertEquals(expected,actual);
    
}
@When("User select the account interest {string}")
public void user_select_the_account_interest(String  accint) {
if(!accint.trim().isEmpty()) {
			click(details.accint);
		}if(accint.equalsIgnoreCase("101 - Capital")) {
			click(details.accint1);
		}
		   
		 String expected=accint;
		String actual=getText(details.accint);
		Assert.assertEquals(expected,actual);

}
@When("User click the add button in loan")
public void user_click_the_add_button_in_loan() {
  click(details.addbtn);  
}

@Then ("Verify the loan creation result {string}")
public void verify_the_loan_creation_result(String result6){
if(result6.equalsIgnoreCase("Success")) {
		Assert.assertTrue(getUrl().contains("card.php"));
	}else {
		String actual=getToastMessage(details.inverror);
		Assert.assertTrue(actual.contains("is required"));
		
	}
}


@Given("User is on card page in loan")
public void user_is_on_card_page_in_loan() {
click(details.card);
Assert.assertTrue(getUrl().contains("card.php"));

}
@Given("User click the modify button in loan")
public void user_click_the_modify_button_in_loan() {
click(details.modifyloan);
}
@Given("User modify the rate and save {string}")
public void user_modify_the_rate_and_save(String rate1) {
 click(details.loanrate);
sendKeys(details.loanrate,rate1);   
click(details.loansave);
}
@Given("User click the financial commitment")
public void user_click_the_financial_commitment() {
	click(details.finanacial);
	Assert.assertTrue(getUrl().contains("schedule.php"));
}
@Given("User click create button in finance")
public void user_click_create_button_in_finance() {

 click(details.creatloan);
}
@Given("User click the linked files in loan")
public void user_click_the_linked_files_in_loan() {
	waitforpageload();
click(details.link2);
Assert.assertTrue(getUrl().contains("document.php"));

}
@Given("User adding new loan files {string}")
public void user_adding_new_loan_files(String  file10) throws AWTException {
click(details.plusbtn);
uploadFile(details.uploadarea,file10);
closedialog();

}
@Given("Click the upload button in loan")
public void click_the_upload_button_in_loan() {
click(details.upload);
String uploadfile=getText(details.uploadfile);
Assert.assertTrue(uploadfile.contains("crm2.png"));

}
@Given("User click the notes in loan")
public void user_click_the_notes_in_loan() {
click(details.note3);
	Assert.assertTrue(getUrl().contains("note.php"));
	Assert.assertTrue("Note is not updated",isDisplayed(details.notecheck));

}
@Given("User click the log in loan")
public void user_click_the_log_in_loan() {
waitforpageload();
	click(details.donlog);
	Assert.assertTrue(getUrl().contains("info.php"));

}
@Then("User went back to list in loan")
public void user_went_back_to_list_in_loan() {
    click(details.backlist1);
}



@Given("User is on miscellaneous payment page")
public void user_is_on_miscellaneous_payment_page() {
click(details.mispay);
Assert.assertTrue(getUrl().contains("compta"));

}
@Given("User verify the miscellaneous heading")
public void user_verify_the_miscellaneous_heading() {
Assert.assertTrue("Loan heading is not displayed",isDisplayed(details.mispayhead));
}
@When("User clicks the new miscellaneous button")
public void user_clicks_the_new_miscellaneous_button() {
click(details.newpay);
Assert.assertTrue("New Loan heading is not displayed",isDisplayed(details.newpayhead));

    
}
@When("User enter the date of payment")
public void user_enter_the_date_of_payment() {
click(details.datenew1);
}
@When("User enter the value date")
public void user_enter_the_value_date() {
click(details.datenew2);
}

@And ("User enter the amount in mis {string}")
public void user_enter_the_amount_in_mis(String amount) {
	click(details.mismaount);
	if(!amount.trim().isEmpty()) {
	sendKeys(details.mismaount,amount);
	}
}
@When("User select the bank account {string}")
public void user_select_the_bank_account(String bankacc) {
 
if(!bankacc.trim().isEmpty()) {
			click(details.bankacc);
		}if(bankacc.equalsIgnoreCase("Account (EUR)")) {
			click(details.bankaccount);
		}
		   
		 String expected=bankacc;
		String actual=getText(details.bankacc);
		Assert.assertEquals(expected,actual);

}
@When("User select the method {string}")
public void user_select_the_method(String paymethod) {
click(details.paymethod1);
		if(paymethod.equalsIgnoreCase("Cash")) {
			click(details.paycash);
		}else
			if(paymethod.equalsIgnoreCase("Check")){
				click(details.paycheck);
			}

}
@When("User enter the cheque number as {string}")
public void user_enter_the_cheque_number_as(String  checknum) {
click(details.numberpay);
	if(!checknum.trim().isEmpty()) {
	sendKeys(details.numberpay,checknum);

}
}
@When("User enter the sender {string}")
public void user_enter_the_sender(String sender) {
click(details.sender);
	if(!sender.trim().isEmpty()) {
	sendKeys(details.sender,sender);

}
}
@When("User enter the bank {string}")
public void user_enter_the_bank(String bank) {
click(details.bankcheck);
	if(!bank.trim().isEmpty()) {
	sendKeys(details.bankcheck,bank);

}
}
@When("User select the accounting account {string}")
public void user_select_the_accounting_account(String accounting) {
    if(!accounting.trim().isEmpty()) {
			click(details.acc);
		}if(accounting.equalsIgnoreCase("106 - Réserves")) {
			click(details.acc1);
		}
		   
		 String expected=accounting;
		String actual=getText(details.acc);
		Assert.assertEquals(expected,actual);

}
@When("User click the save button in mispay")
public void user_click_the_save_button_in_mispay() {
click(details.loansave);
 
}
@Then("Verify the miscellaneous creation result {string}")
public void verify_the_miscellaneous_creation_result(String  result7) {
if(result7.equalsIgnoreCase("Success")) {
		Assert.assertTrue(getUrl().contains("list.php"));
	}else {
		String actual=getToastMessage(details.inverror);
		Assert.assertTrue(actual.contains("is required"));
		
	}

}



@Given("User is on list in miscellanous")
public void user_is_on_list_in_miscellanous() {
click(details.mislist);
  Assert.assertTrue(getUrl().contains("list.php"));

}
@Given("User validate the list page in miscellanous")
public void user_validate_the_list_page_in_miscellanous() {
Assert.assertTrue("Miscellanous heading is not displayed",isDisplayed(details. misheading));
    
}
@When("User clicks the ref sorting icon in miscellanous")
public void user_clicks_the_ref_sorting_icon_in_miscellanous() {
doubleClick(details.refsalary);
    
}
@Then("Ref column should sorting in acending in miscellanous")
public void ref_column_should_sorting_in_acending_in_miscellanous() {
Assert.assertTrue(getUrl().contains("sortfield"));
}
@When("User select the one miscellaneous in list")
public void user_select_the_one_miscellaneous_in_list() {
click(details.mislistid);
}
@When("User select the clone button in payment")
public void user_select_the_clone_button_in_payment() {
    click(details.clone);
}
@When("User click the confirm button in miscellanous")
public void user_click_the_confirm_button_in_miscellanous() {
    click(details.confiryes);
}
@When("User check the linked files in miscellanous")
public void user_check_the_linked_files_in_miscellanous() {
click(details.paylinked);
	Assert.assertTrue(getUrl().contains("document.php"));

    
}
@When("User add the new file in miscellanous {string}")
public void user_add_the_new_file_in_miscellanous(String file8) throws AWTException {
click(details.plusbtn);
	uploadFile(details.uploadarea,file8);
	closedialog();

}



@When("Click the upload button in miscellanous")
public void click_the_upload_button_in_miscellanous() {
    
        click(details.upload);
String uploadfile=getText(details.uploadfile);
Assert.assertTrue(uploadfile.contains("crm2.png"));

}

@When("User check the log in miscellanous")
public void user_check_the_log_in_miscellanous() {
    click(details.paylog);
Assert.assertTrue(getUrl().contains("info.php")); 

}
@Then("User went back to list in miscellanous")
public void user_went_back_to_list_in_miscellanous() {
click(details.backlist1);
}






}





















	







	
	
