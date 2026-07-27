package com.Pageclass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page {
	public WebDriver driver;
	public page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//a[text()=\"Features\"]")
	public WebElement Feature;
	
	@FindBy(xpath="//a[text()=\"Blog\"]")
	public WebElement blog;

	
	@FindBy(xpath="//a[text()=\"Community\"]")
	public WebElement community;
	
	@FindBy(xpath="//a[text()=\"Documentation\"]")
	public WebElement documentation;
	
	@FindBy(xpath="//a[text()=\"Online demo\"]")
	public WebElement online;
	
	@FindBy(xpath="//a[text()=\"Downloads\"]")
	public WebElement download;
	
	@FindBy(xpath="//a[text()=\"Addons\"]")
	public WebElement addon;
	
	@FindBy(xpath="//a[text()=\"Forum\"]")
	public WebElement forum;

	@FindBy(xpath="//span[@title=\"Enterprise Resource Planning\"]")
	public WebElement main;
	
	@FindBy(xpath="//div[text()=\"SMEs, Large Companies, Freelancers, Associations\"]")
	public WebElement sub;
	
	@FindBy(xpath="//img[@class=\"imgimageweb play-youtube-video\"]")
	public WebElement banner;
	
	@FindBy(xpath="//span[text()=\"Test online\"]")
	public WebElement test;
	
	@FindBy(xpath="//span[text()=\"Download\"]")
	public WebElement down;
	
	@FindBy(xpath="//input[@name=\"s\"]")
	public WebElement search;
	
	@FindBy(xpath="//span[text()=\"Features\"]")
	public WebElement fheading;
	
	@FindBy(xpath="//h3[@class=\"dolibarrh2 inline-block\"]")
	public WebElement CRM;
	
	@FindBy(xpath="//div[text()=\"Prospects / Customers\"]")
	public WebElement pros;
	
	@FindBy(xpath="//div[text()=\"Opportunities\"]")
	public WebElement opp;
	
	@FindBy(xpath="//div[text()=\"Proposals\"]")
	public WebElement prop;
	
	@FindBy(xpath="//div[text()=\"Sale Orders\"]")
	public WebElement sale;
	
	@FindBy(xpath="//div[text()=\"Contracts / Subscriptions\"]")
	public WebElement contract;
	
	@FindBy(xpath="//div[text()=\"Help Desk / Tickets\"]")
	public WebElement help;
	
	@FindBy(xpath="//div[text()=\"Knowledge\"]")
	public WebElement know;
	
	@FindBy(xpath="//span[text()=\"Prospects and Customers\"]")
	public WebElement prosheading;
	
	@FindBy(xpath="//span[text()=\"Quotes and Proposals\"]")
	public WebElement propheading;
	
	@FindBy(xpath="//span[text()=\"Opportunities\"]")
	public WebElement oppheading;
	
	@FindBy(xpath="//span[text()=\"Sale Orders\"]")
	public WebElement saleheading;
	
	@FindBy(xpath="//span[text()=\"Contracts and Subscriptions\"]")
	public WebElement conheading;
	
	@FindBy(xpath="//span[text()=\"Help Desk | Tickets\"]")
	public WebElement helpheading;
	
	@FindBy(xpath="//span[text()=\"Knowledge Management\"]")
	public WebElement knowheading;
	
	@FindBy(xpath="//a[@title=\"Module Export / Import\"]")
	public WebElement foot;
	
	@FindBy(xpath="//div[text()=\"Employees\"]")
	public WebElement emp;
	
	@FindBy(xpath="//div[text()=\"Expense Reports\"]")
	public WebElement extend;
	
	@FindBy(xpath="//div[text()=\"Leave Requests\"]")
	public WebElement leave;
	
	@FindBy(xpath="//div[text()=\"Timesheets\"]")
	public WebElement time;
	
	@FindBy(xpath="//div[text()=\"Recruitment\"]")
	public WebElement recruit;
	
	@FindBy(xpath="//div[text()=\"Membership\"]")
	public WebElement member;
	
	@FindBy(xpath="//span[text()=\"Employees and Users\"]")
	public WebElement empheading;
	
	@FindBy(xpath="//span[text()=\"Expense Reports\"]")
	public WebElement exheading;
	
	@FindBy(xpath="//span[text()=\"Leaves\"]")
	public WebElement leaveheading;
	
	@FindBy(xpath="//span[text()=\"Timesheets\"]")
	public WebElement timeheading;
	
	@FindBy(xpath="//span[text()=\"Recruitment\"]")
	public WebElement recheading;
	
	@FindBy(xpath="//span[text()=\"Membership management\"]")
	public WebElement memheading;
	
	@FindBy(xpath="//h3[text()=\"Human Relationship Management (\"]")
	public WebElement hr;
	
	@FindBy(xpath="//div[@class=\"ytmCuedOverlayGradient\"]")
	public WebElement empfoot;
	
	@FindBy(xpath="//a[text()=\"Export module\"]")
	public WebElement timefoot;
	
	@FindBy(xpath="//h3[text()=\"Record applications automatically with the Email Collector\"]")
	public WebElement recfoot;
	
	@FindBy(xpath="//span[text()=\"Test online\"]")
	public WebElement testonline;
	
	@FindBy(xpath="//td[contains(.,'DoliCloud')]/following-sibling::td/a")
	public WebElement create;
	
	
	// Account Creation'
	
	@FindBy(xpath="//input[@name=\"username\"]")
	public WebElement email;
	
	@FindBy(xpath="//input[@name=\"orgName\"]")
	public WebElement company;
	
	@FindBy(xpath="//input[@name=\"phone\"]")
	public WebElement phone;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	public WebElement pass1;
	
	@FindBy(xpath="//input[@name=\"password2\"]")
	public WebElement confirm;
	
	@FindBy(xpath="//select[@id=\"selectcountry\"]")
	public WebElement country;
	
	@FindBy(xpath="//input[@name=\"newinstance\"]")
	public WebElement sign;
	
	@FindBy(xpath="//div[@class=\"alert alert-error\"]")
	public WebElement error;
	
	@FindBy(xpath="//a[text()=\"Take me to my Instance Dolibarr ERP & CRM \"]")
	public WebElement check;
	
	
	//login
	
	@FindBy(xpath="//input[@id=\"password\"]")
	public WebElement pass3;
	
	@FindBy(xpath="//input[@class=\"butAction butActionLogin noborderfocus\"]")
	public WebElement login;
	
	@FindBy(xpath="//div[@class=\"jnotify-message\"]")
	public WebElement error2;
	
	@FindBy(xpath="//div[text()=\"CMS / Website\"]")
	public WebElement web;
	
	@FindBy(xpath="//span[text()=\"CMS - Websites\"]")
	public WebElement webheading;
	
	@FindBy(xpath="//div[text()=\"Point Of Sale\"]")
	public WebElement point;
	
	@FindBy(xpath="//span[text()=\"Point Of Sale (POS)\"]")
	public WebElement pos;
	
	@FindBy(xpath="//span[text()=\"Windows - MAC - Linux - Docker - Cloud\"]")
	public WebElement allfoot;
	
	@FindBy(xpath="//div[text()=\"Products, Services\"]")
	public WebElement prod;
	
	@FindBy(xpath="//span[text()=\"Products and Services\"]")
	public WebElement prodheading;
	
	@FindBy(xpath="//div[text()=\"Shipments\"]")
	public WebElement ship;
	
	@FindBy(xpath="//span[text()=\"Shipments\"]")
	public WebElement shipheading;
	
	@FindBy(xpath="//div[text()=\"Billing & Payments\"]")
	public WebElement billing;
	
	@FindBy(xpath="//span[text()=\"Billing and Payments\"]")
	public WebElement billheading;
	
	@FindBy(xpath="//div[text()=\"Double entry accounting\"]")
	public WebElement entry;
	
	
	@FindBy(xpath="//span[text()=\"Double Entry Accounting\"]")
	public WebElement entryheading;
	
	@FindBy(xpath="//div[text()=\"Emailing\"]")
	public WebElement emaill;
	
	@FindBy(xpath="//div[text()=\"Surveys\"]")
	public WebElement survey;
	
	@FindBy(xpath="//span[text()=\"Mass Emailing\"]")
	public WebElement mass;
	
	@FindBy(xpath="//span[text()=\"Surveys and Polls\"]")
	public WebElement sur;
	
	@FindBy(xpath="//div[text()=\"Projects, Tasks\"]")
	public WebElement prj;
	
	@FindBy(xpath="//span[text()=\"Opportunities, Projects and Tasks\"]")
	public WebElement prjheading;
	
	@FindBy(xpath="//div[text()=\"Agenda\"]")
	public WebElement agenda;
	
	@FindBy(xpath="//span[text()=\"Agenda\"]")
	public WebElement age;
	
	@FindBy(xpath="//div[text()=\"API\"]")
	public WebElement api;
	
	@FindBy(xpath="//span[text()=\"API, Triggers, and Hooks\"]")
	public WebElement apiheading;
	
	@FindBy(xpath="//div[text()=\"Import, Export\"]")
	public WebElement impo;
	
	@FindBy(xpath="//span[text()=\"Import and Export\"]")
	public WebElement imp;
	
	@FindBy(xpath="//a[text()=\"Blog\"]")
	public WebElement blo;
	
	@FindBy(xpath="//div[@class=\"divblogpost leading-0 clearfix\"]/following::span[text()=\"June 13, 2026\"]")
	public WebElement june;
	
	@FindBy(xpath="//div[text()=\"Stocks\"]")
	public WebElement stock;
	
	@FindBy(xpath="//span[text()=\"Stock and Warehouse Management\"]")
	public WebElement stockheading;
	
	@FindBy(xpath="//div[text()=\"Purchase, Approvisionning\"]")
	public WebElement purchase;
	
	
	@FindBy(xpath="//span[text()=\"Purchase And Supply\"]")
	public WebElement purheading;
	
	@FindBy(xpath="//div[text()=\"Manufacturing\"]")
	public WebElement manu;
	
	@FindBy(xpath="//span[text()=\"Manufacturing\"]")
	public WebElement manheading;
	
	@FindBy(xpath="//div[text()=\"Bank reconciliation\"]")
	public WebElement bank;
	
	@FindBy(xpath="//span[text()=\"Banking and Reconciliation\"]")
	public WebElement bankheading;
	
	@FindBy(xpath="//div[text()=\"Interventions\"]")
	public WebElement inter;
	
	@FindBy(xpath="//span[text()=\"Latest news...\"]")
	public WebElement head2;
	
	@FindBy(xpath="//span[text()=\"Interventions\"]")
	public WebElement interheading;
	
	@FindBy(xpath="//iframe[contains(@id,'twitter-widget')]")
	public WebElement iframe;
	
	@FindBy(xpath="//a[.//span[normalize-space()=\"Post\"]]")
	public WebElement post;
	
	@FindBy(xpath="//span[text()=\"Reddit\"]")
	public WebElement reddit;
	
	@FindBy(xpath="//span[text()=\"Facebook\"]")
	public WebElement fb;
	
	@FindBy(xpath="//span[normalize-space()='Dolibarr was presented at Kigali']/following::a[@href=\"dolibarr-was-presented-at-kigali.php\"]")
	public WebElement image;
	
	@FindBy(xpath="//div[text()=\"Connectivity with external tools\"]")
	public WebElement connect;
	
	@FindBy(xpath="//span[text()=\"Connectivity and Interfaces\"]")
	public WebElement connheading;
	
	@FindBy(xpath="//div[text()=\"Module Builder for developers\"]")
	public WebElement build;
	
	@FindBy(xpath="//span[text()=\"Module Builder for Developers\"]")
	public WebElement buildheading;

	@FindBy(xpath="//span[text()=\"Latest news...\"]")
	public WebElement main2;
	
	@FindBy(xpath="//a[@title=\"Home\"]")
	public WebElement home;
	
	@FindBy(xpath="//a[text()=\"Click to test with the shared demo instance\"]")
	public WebElement linkk;
	
	@FindBy(xpath="//a[@href=\"/index.php?urlfrom=%2Fpublic%2Fdemo%2Findex.php&disablemodules=barcode,cashdesk,bom,commande,commercial,compta,comptabilite,contrat,expedition,externalsite,ficheinter,ftp,incoterm,mailmanspip,margin,mrp,prelevement,product,productbatch,projet,propal,propale,service,societe,stock,tax,takepos\"]")
	public WebElement shop;
	
	@FindBy(xpath="//input[@id=\"username\"]")
	public WebElement user;
	
	@FindBy(xpath="//input[@id=\"password\"]")
	public WebElement pass5;
	
	@FindBy(xpath="//input[@class=\"butAction butActionLogin noborderfocus\"]")
	public WebElement login1;
	
	@FindBy(xpath="//div[text()=\"Bad value for login or password\"]")
	public WebElement error3;
	
	@FindBy(xpath="//div[text()=\"Global view\"]")
	public WebElement global;
	
	@FindBy(xpath="//div[text()=\"Agenda\"]")
	public WebElement agen;
	
	@FindBy(xpath="//div[text()=\"Orders\"]")
	public WebElement order;
	
	@FindBy(xpath="//div[text()=\"Invoices\"]")
	public WebElement invoice;
	
	@FindBy(xpath="//a[@title=\"My Dashboard\"]")
	public WebElement dash;
	
	@FindBy(xpath="//span[@class=\"fas fa-user-alt  em092 infobox-adherent fa-fw pictofixedwidth\"]")
	public WebElement members;
	
	@FindBy(xpath="//a[text()=\"New member\"]")
	public WebElement newmem;
	
	@FindBy(xpath="//span[@id=\"select2-typeid-container\"]")
	public WebElement memtype;
	
	@FindBy(xpath="//label[text()=\"Individual\"]")
	public WebElement individual;
	
	@FindBy(xpath="//label[text()=\"Legal entity\"]")
	public WebElement legal;
	
	@FindBy(xpath="//input[@name=\"lastname\"]")
	public WebElement lastname;
	
	@FindBy(xpath="//input[@name=\"firstname\"]")
	public WebElement firstname;
	
	@FindBy(xpath="//input[@name=\"member_email\"]")
	public WebElement mail;
	
	@FindBy(xpath="//input[@class=\"button marginleftonly marginrightonly button-save \"]")
	public WebElement createmem;
	
	@FindBy(xpath="//div[@class=\"jnotify-message\"]")
	public WebElement errormem;
	
	@FindBy(xpath="//ul[@id=\"select2-typeid-results\"]//li[normalize-space()='Production']")
	public WebElement production;
	
	@FindBy(xpath="//ul[@id=\"select2-typeid-results\"]//li[normalize-space()='Aluminum']")
	public WebElement aluminium;
	
	@FindBy(xpath="//a[@id=\"subscription\"]")
	public WebElement contribution;
	
	@FindBy(xpath="//a[@id=\"note\"]")
	public WebElement note;
	
	@FindBy(xpath="//a[@id=\"document\"]")
	public WebElement file;
	
	@FindBy(xpath="//a[@title=\"Events/Agenda\"]")
	public WebElement event;
	
	@FindBy(xpath="//a[normalize-space()=\"Back to list\"]")
	public WebElement list;
	
	@FindBy(xpath="//input[@id=\"cb1108\"]")
	public WebElement checkbox;
	
	@FindBy(xpath="//span[@id=\"select2-massaction-container\"]")
	public WebElement vali;
	
	@FindBy(xpath="//ul[@id=\"select2-massaction-results\"]//li[normalize-space()=\"Assign a Tag\"]")
	public WebElement tag;
	
	@FindBy(xpath="//input[@name=\"confirmmassaction\"]")
	public WebElement confirma;
	
	@FindBy(xpath="//input[@placeholder=\"Select the tags/categories to assign\"]")
	public WebElement hah;
	
	@FindBy(xpath="//li[text()=\"Ados & Adultes\"]")
	public WebElement ados;
	
	@FindBy(xpath="//input[@class=\"button valignmiddle confirmvalidatebutton small\"]")
	public WebElement vlid;
	
	@FindBy(xpath="//a[text()=\"Validate\"]")
	public WebElement vbutton;
	
	@FindBy(xpath="//button[text()=\"Yes\"]")
	public WebElement yes;
	
	@FindBy(xpath="//*[@id=\"note_private\"]")
	public WebElement notes;
	
	@FindBy(xpath="//*[contains(test(),'1 member(s) closed']")
	public WebElement error6;
	
	@FindBy(xpath="//td[text()=\"Note (private)\"]/following-sibling::td//a")
	public WebElement gap;
	
	@FindBy(xpath="//input[@class=\"smallpaddingimp nomargingtop nomarginbottom button \"]")
	public WebElement save;
	
	
	@FindBy(xpath="//a[text()=\"Modify\"]")
	public WebElement modify;

	@FindBy(xpath="//input[@name=\"societe\"]")
	public WebElement commp;


	@FindBy(xpath="//span[@id=\"select2-civility_code-container\"]")
	public WebElement drop;

	@FindBy(xpath="//li[text()=\"Mr.\"]")
	public WebElement gen;
	
	@FindBy(xpath="//span[@id=\"select2-gender-container\"]")
	public WebElement drop2;
	
	@FindBy(xpath="//li[text()=\"Male\"]")
	public WebElement male;
	
	
	@FindBy(xpath="//input[@name=\"member_url\"]")
	public WebElement web2;
	
	@FindBy(xpath="//textarea[@name=\"address\"]")
	public WebElement addd;
	
	@FindBy(xpath="//input[@id=\"zipcode\"]")
	public WebElement zip;
	
	@FindBy(xpath="//input[@class=\"button marginleftonly marginrightonly button-save \"]")
	public WebElement savemem;
	
	@FindBy(xpath="//span[@id=\"select2-state_id-container\"]")
	public WebElement state;
	
	@FindBy(xpath="//li[text()=\"TN - Tamil Nadu\"]")
	public WebElement tamil;
	
	@FindBy(xpath="//input[@name=\"phone\"]")
	public WebElement bus;
	
	@FindBy(xpath="//input[@name=\"phone_perso\"]")
	public WebElement pers;
	
	@FindBy(xpath="//input[@id=\"birth\"]")
	public WebElement birth;
	
	@FindBy(xpath="//a[text()=\"Draft members\"]")
	public WebElement draft;
	
	@FindBy(xpath="//input[@id=\"cb1143\"]")
	public WebElement idd;
	
	@FindBy(xpath="//ul[@id=\"select2-massaction-results\"]//li[normalize-space()=\"Terminate\"]")
	public WebElement term;
	
	@FindBy(xpath="//a[text()=\"Validated members\"]")
	public WebElement valimem;
	
	@FindBy(xpath="//input[@id=\"cb1125\"]")
	public WebElement selmem;
	
	@FindBy(xpath="//ul[@id=\"select2-massaction-results\"]//li[normalize-space()=\"Create subscription\"]")
	public WebElement subs;
	
	@FindBy(xpath="//input[@name=\"amount\"]")
	public WebElement amount;
	
	@FindBy(xpath="//select[@id=\"confirm\"]")
	public WebElement drop6;
	
	@FindBy(xpath="//tr[@data-rowid=\"1125\"]//span[text()=\"Up to date\"]")
	public WebElement error7;
	
	@FindBy(xpath="//a[text()=\"Membership pending\"]")
	public WebElement membership;
	
	@FindBy(xpath="//input[@id=\"cb1137\"]")
	public WebElement id3;
	
	@FindBy(xpath="//a[normalize-space()=\"Up-to-date\"]")
	public WebElement uptodate;
	
	@FindBy(xpath="//input[@id=\"cb1135\"]")
	public WebElement upmem;
	
	@FindBy(xpath="//ul[@id=\"select2-massaction-results\"]//li[normalize-space()=\"Delete\"]")
	public WebElement delete;
	
	@FindBy(xpath="//a[text()=\"Out-of-date\"]")
	public WebElement outof;
	
	@FindBy(xpath="//span[text()=\"No record found\"]")
	public WebElement rec;
	
	@FindBy(xpath="//input[@id=\"cb1123\"]")
	public WebElement id5;
	
	@FindBy(xpath="//a[text()=\"Terminated members\"]")
	public WebElement termin;
	
	@FindBy(xpath="//a[text()=\"Excluded members\"]")
	public WebElement ex;
	
	@FindBy(xpath="(//a[text()=\"Statistics\"])[1]")
	public WebElement statis;
	
	@FindBy(xpath="//a[text()=\"Country\"]")
	public WebElement stacountry;
	
	@FindBy(xpath="//a[text()=\"Region\"]")
	public WebElement staregion;
	
	@FindBy(xpath="//a[text()=\"State/Province\"]")
	public WebElement stp;
	
	@FindBy(xpath="//a[text()=\"City\"]")
	public WebElement city;
	
	@FindBy(xpath="//a[text()=\"By nature\"]")
	public WebElement by;
	
	@FindBy(xpath="//a[text()=\"2026\"]")
	public WebElement yer;
	
	@FindBy(xpath="//span[text()=\"Contributions (Year 2026)\"]")
	public WebElement yerde;
	
	@FindBy(xpath="//tr[@class=\"liste_titre\"]")
	public WebElement listt;
	
	@FindBy(xpath="//a[text()=\"New membership\"]")
	public WebElement newmember;
	
	@FindBy(xpath="//input[@id=\"cb1115\"]")
	public WebElement contriid;
	
	@FindBy(xpath="//tr[@data-rowid=\"1115\"]//span[text()=\"Up to date\"]")
	public WebElement idvali;
	
	@FindBy(xpath="//input[@name=\"confirmmassaction\"]")
	public WebElement confirmm;
	
	@FindBy(xpath="//input[@id=\"cb568\"]")
	public WebElement listid;
	
	@FindBy(xpath="(//a[text()=\"List\"])[2]")
	public WebElement list2;
	
	@FindBy(xpath="//span[text()=\"Contributions\"]")
	public WebElement listhead;
	
	@FindBy(xpath="(//a[text()=\"Statistics\"])[2]")
	public WebElement stat2;
	
	@FindBy(xpath="(//td[text()=\" India\"])[1]")
	public WebElement india;
	
	@FindBy(xpath="//td[text()=\"Tamil Nadu\"]")
	public WebElement tn;
	
	@FindBy(xpath="//td[text()=\"Paris\"]")
	public WebElement paris;
	
	@FindBy(xpath="//td[text()=\"Individual\"]")
	public WebElement indi;
	
	@FindBy(xpath="//a[text()=\"Members types\"]")
	public WebElement memtypes;
	
	@FindBy(xpath="//span[text()=\"Members types\"]")
	public WebElement typehead;
	
	@FindBy(xpath="//a[text()=\"New\"]")
	public WebElement memnew;
	
	@FindBy(xpath="//span[text()=\"New member type\"]")
	public WebElement newcreate;
	
	@FindBy(xpath="//input[@class=\"minwidth300\"]")
	public WebElement labelmem;
	
	@FindBy(xpath="//span[@id=\"select2-morphy-container\"]")
	public WebElement drcontri;
	
	@FindBy(xpath="//ul[@id=\"select2-morphy-results\"]//li[normalize-space()=\"Individual\"]")
	public WebElement drindi;
	
	@FindBy(xpath="//input[@name=\"amount\"]")
	public WebElement amt;
	
	@FindBy(xpath="//input[@name=\"duration_value\"]")
	public WebElement durat;
	
	@FindBy(xpath="//iframe[@title=\"Editor, comment\"]")
	public WebElement editfra;
	
	@FindBy(xpath="//body[@aria-label=\"Editor, comment\"]")
	public WebElement editplace;
	
	@FindBy(xpath="//iframe[contains(@title,'Editor, mail_valid')]")
	public WebElement welediit;
	
	@FindBy(xpath="//body[@aria-label=\"Editor, mail_valid\"]")
	public WebElement editplace2;
	
	
	@FindBy(xpath="//input[@class=\"button marginleftonly marginrightonly button-save \"]")
	public WebElement save6;
	
	@FindBy(xpath="//td[text()=\"Production2026\"]")
	public WebElement verify2;
	
	@FindBy(xpath="(//a[@title=\"List\"])[3]")
	public WebElement list3;
	
	@FindBy(xpath="//a[text()=\"Back to list\"]")
	public WebElement back2;
	
	@FindBy(xpath="//select[@id=\"vote\"]")
	public WebElement vote;
	@FindBy(xpath="//a[@href=\"/adherents/type.php?action=edit&rowid=27\"]")
	public WebElement editicon;
	
	//Third parties
	
	@FindBy(xpath="(//a[@title=\"Third parties\"])[1]")
	public WebElement third;
	
	@FindBy(xpath="//span[text()=\"Third Parties/Contacts\"]")
	public WebElement thirdhead;
	
	@FindBy(xpath="//input[@id=\"cb6045\"]")
	public WebElement tpid;
	
	@FindBy(xpath="//span[@id=\"select2-massaction-container\"]")
	public WebElement tpsel;
	
	@FindBy(xpath="//ul[@id=\"select2-massaction-results\"]//li[normalize-space()=\"Send by email\"]")
	public WebElement send;
	
	@FindBy(xpath="//input[@name=\"confirmmassaction\"]")
	public WebElement confirmma;
	
	@FindBy(xpath="//span[@id=\"select2-modelmailselected-container\"]")
	public WebElement temdrop;
	
	@FindBy(xpath="//input[@name=\"modelselected\"]")
	public WebElement apply;
	@FindBy(xpath="//ul[@id=\"select2-modelmailselected-results\"]//li[normalize-space()=\"test\"]")
	public WebElement testt;
	
	@FindBy(xpath="//input[@id=\"sendto\"]")
	public WebElement to;
	
	@FindBy(xpath="//input[@id=\"addmaindocfile\"]")
	public WebElement attach;
	
	@FindBy(xpath="//iframe[@title=\"Editor, message\"]")
	public WebElement tpmail;
	
	@FindBy(xpath="//body[@aria-label=\"Editor, message\"]")
	public WebElement edittp;
	
	@FindBy(xpath="//input[@name=\"sendmail\"]")
	public WebElement  sendbtn;
	
	@FindBy(xpath="//span[text()=\"The latest 3 modified Third Parties\"]")
	public WebElement thirdhead2;
	
	@FindBy(xpath="//th[text()=\"Statistics\"]")
	public WebElement thirdhead3;
	
	@FindBy(xpath="//span[text()=\"The latest 3 modified contacts\"]")
	public WebElement thirdhead4;
	
	@FindBy(xpath="//a[text()=\"Vendors\"]")
	public WebElement vendd;
	
	@FindBy(xpath="//div[@class=\"jnotify-message\"]")
	public WebElement errormsg;
	
	@FindBy(xpath="//a[@href=\"/societe/card.php?socid=1768&save_lastsearch_values=1\"]")
	public WebElement tpid2;
	
	@FindBy(xpath="//td[text()=\"From\"]")
	public WebElement from;
	
	@FindBy(xpath="//span[@class=\"valignmiddle\"]")
	public WebElement hedtp;
	
	@FindBy(xpath="//span[normalize-space()=\"More...\"]")
	public WebElement more;
	
	@FindBy(xpath="//a[@id=\"customer\"]")
	public WebElement customer;
	
	@FindBy(xpath="//a[text()=\"Customer prices\"]")
	public WebElement cusprice;
	
	@FindBy(xpath="//td[text()=\"Customer Code\"]")
	public WebElement priceveri;
	
	@FindBy(xpath="//a[text()=\"Related items\"]")
	public WebElement related;
	
	@FindBy(xpath="//a[text()=\"Payment methods\"]")
	public WebElement paymentmethod;
	
	@FindBy(xpath="//a[text()=\"Tickets\"]")
	public WebElement tickets;
	
	@FindBy(xpath="//a[text()=\"Notifications\"]")
	public WebElement notification;
	
	@FindBy(xpath="//a[text()=\"Notes\"]")
	public WebElement notess;
	
	@FindBy(xpath="//a[@title=\"Linked files\"]")
	public WebElement linked;
	
	@FindBy(xpath="//span[text()=\"0000_FerranMota - Tickets\"]")
	public WebElement ticketcheck;
	
	@FindBy(xpath="//span[@class=\"inline-block valignmiddle print-barre-liste\"]")
	public WebElement links;
}

