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
	
	@FindBy(xpath="//input[@id=\"cb1207\"]")
	public WebElement checkbox;
	
	@FindBy(xpath="//span[@id=\"select2-massaction-container\"]")
	public WebElement vali;
	
	@FindBy(xpath="//ul[@id=\"select2-massaction-results\"]//li[text()=\"Assign a Tag\"]")
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
	
	@FindBy(xpath="//input[@id=\"cb1218\"]")
	public WebElement idd;
	
	@FindBy(xpath="//ul[@id=\"select2-massaction-results\"]//li[normalize-space()=\"Terminate\"]")
	public WebElement term;
	
	@FindBy(xpath="//a[text()=\"Validated members\"]")
	public WebElement valimem;
	
	@FindBy(xpath="//input[@id=\"cb1208\"]")
	public WebElement selmem;
	
	@FindBy(xpath="//ul[@id=\"select2-massaction-results\"]//li[normalize-space()=\"Create subscription\"]")
	public WebElement subs;
	
	@FindBy(xpath="//input[@name=\"amount\"]")
	public WebElement amount;
	
	@FindBy(xpath="//select[@id=\"confirm\"]")
	public WebElement drop6;
	
	@FindBy(xpath="//tr[@data-rowid=\"1208\"]//span[text()=\"Up to date\"]")
	public WebElement error7;
	
	@FindBy(xpath="//a[text()=\"Membership pending\"]")
	public WebElement membership;
	
	@FindBy(xpath="//input[@id=\"cb1215\"]")
	public WebElement id3;
	
	@FindBy(xpath="//a[normalize-space()=\"Up-to-date\"]")
	public WebElement uptodate;
	
	@FindBy(xpath="//input[@id=\"cb1208\"]")
	public WebElement upmem;
	
	@FindBy(xpath="//ul[@id=\"select2-massaction-results\"]//li[normalize-space()=\"Delete\"]")
	public WebElement delete;
	
	@FindBy(xpath="//a[text()=\"Out-of-date\"]")
	public WebElement outof;
	
	@FindBy(xpath="//span[text()=\"No record found\"]")
	public WebElement rec;
	
	@FindBy(xpath="//input[@id=\"cb1212\"]")
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
	
	//Commerce
	
	@FindBy(xpath="//a[@id=\"mainmenua_commercial\"]")
	public WebElement commerce;
	
	@FindBy(xpath="//span[text()=\"Draft vendor proposals\"]")
	public WebElement comheading1;
	
	@FindBy(xpath="//span[text()=\"Draft purchase orders\"]")
	public WebElement comheading2;
	
	@FindBy(xpath="//a[@title=\"Vendor proposals\"]")
	public WebElement venpropose;
	
	@FindBy(xpath="//th[text()=\"Statistics - Price requests\"]")
	public WebElement venheading1;
	
	@FindBy(xpath="//th[text()=\"Open price requests \"]")
	public WebElement venheading2;
	
	@FindBy(xpath="//th[text()=\"Latest 5 modified price requests\"]")
	public WebElement venheading3;
	
	@FindBy(xpath="//a[text()=\"New price request\"]")
	public WebElement newreq;
	
	@FindBy(xpath="(//a[@href=\"/comm/card.php?socid=9075\"])[1]")
	public WebElement aaa;
	
	@FindBy(xpath="//div[@class=\"error\"]")
	public WebElement erroraa;
	
	@FindBy(xpath="//span[text()=\"New price request\"]")
	public WebElement newheading;
	
	@FindBy(xpath="//span[@id=\"select2-socid-container\"]")
	public WebElement vendrop;
	
	@FindBy(xpath="//ul[@id=\"select2-socid-results\"]//li[text()=\"aaa \"]")
	public WebElement venop;
	
	@FindBy(xpath="//span[@id=\"select2-cond_reglement_id-container\"]")
	public WebElement terms;
	
	@FindBy(xpath="//ul[@id=\"select2-cond_reglement_id-results\"]//li[text()=\"30 days\"]")
	public WebElement days;
	
	@FindBy(xpath="//ul[@id=\"select2-cond_reglement_id-results\"]//li[text()=\"Order\"]")
	public WebElement order2;
	
	@FindBy(xpath="//span[@id=\"select2-selectmode_reglement_id-container\"]")
	public WebElement method;
	
	@FindBy(xpath="//ul[@id=\"select2-selectmode_reglement_id-results\"]//li[text()=\"Cash\"]")
	public WebElement cash;
	
	@FindBy(xpath="//ul[@id=\"select2-selectmode_reglement_id-results\"]//li[text()=\"Check\"]")
	public WebElement check2;
	
	@FindBy(xpath="//button[text()=\"Now\"]")
	public WebElement now;
	
	@FindBy(xpath="//span[@class=\"select2-selection select2-selection--multiple multiselect multiselectononeline minwidth100 widthcentpercentminusxx\"]")
	public WebElement tags;
	
	@FindBy(xpath="//ul[@id=\"select2-categories-results\"]//li[text()=\"Advance\"]")
	public WebElement advance;
	
	@FindBy(xpath="//input[@class=\"button marginleftonly marginrightonly button-save \"]")
	public WebElement creatdraft;
	
	@FindBy(xpath="//div[@class=\"jnotify-message\"]")
	public WebElement venerror;
	
	@FindBy(xpath="//select[@id=\"select_type\"]")
	public WebElement typeven;
	
	@FindBy(xpath="//iframe[@title=\"Editor, dp_desc\"]")
	public WebElement descframe;
	
	@FindBy(xpath="//body[@aria-label=\"Editor, dp_desc\"]")
	public WebElement descframe2;
	
	@FindBy(xpath="//input[@name=\"qty\"]")
	public WebElement quantity;
	
	@FindBy(xpath="//input[@name=\"remise_percent\"]")
	public WebElement discount;
	
	@FindBy(xpath="//input[@name=\"price_ht\"]")
	public WebElement price3;
	
	@FindBy(xpath="//input[@class=\"button reposition\"]")
	public WebElement add;
	
	@FindBy(xpath="//a[text()=\"Validate\"]")
	public WebElement validate2;
	
	@FindBy(xpath="//button[text()=\"Yes\"]")
	public WebElement yes2;
	
	@FindBy(xpath="//a[@title=\"Contacts/Addresses\"]")
	public WebElement contact;
	
	@FindBy(xpath="(//input[@class=\"button small\"])[1]")
	public WebElement add2;
	
	@FindBy(xpath="//a[@id=\"note\"]")
	public WebElement note2;
	
	@FindBy(xpath="(//span[@title=\"Edit\"])[1]")
	public WebElement publicedit;
	
	@FindBy(xpath="//form//textarea[@id=\"note_public\"]")
	public WebElement text2;
	
	@FindBy(xpath="//input[@class=\"smallpaddingimp nomargingtop nomarginbottom button \"]")
	public WebElement notesave;
	
	@FindBy(xpath="//a[@title=\"Linked files\"]")
	public WebElement link2;
	
	@FindBy(xpath="(//span[@class=\"fa fa-plus-circle valignmiddle btnTitle-icon\"])[1]")
	public WebElement plusbtn;
	
	@FindBy(xpath="//input[@name=\"userfile[]\"]")
	public WebElement uploadarea;
	
	@FindBy(xpath="//input[@name=\"sendit\"]")
	public WebElement upload;
	
	@FindBy(xpath="//a[text()=\"Log\"]")
	public WebElement log;
	
	@FindBy(xpath="//a[text()=\"Back to list\"]")
	public WebElement backlist1;
	
	//list
	
	@FindBy(xpath="(//a[@title=\"List\"])[1]")
	public WebElement venlist;
	
	@FindBy(xpath="//input[@id=\"cb1387\"]")
	public WebElement listid1;
	
	@FindBy(xpath="//ul[@id=\"select2-massaction-results\"]//li[text()=\"Delete\"]")
	public WebElement listdelete;
	
	@FindBy(xpath="//div[@class=\"jnotify-message\"]")
	public WebElement errorlist;
	
	//Ven Statistic
	
	@FindBy(xpath="(//a[@title=\"Statistics\"])[1]")
	public WebElement statistic;
	
	@FindBy(xpath="//span[text()=\"Vendor proposals statistics\"]")
	public WebElement statheading;
	
	@FindBy(xpath="(//span[@class=\"select2-selection select2-selection--single flat widthcentpercentminusx maxwidth300\"])[1]")
	public WebElement thirdparty;
	
	@FindBy(xpath="//ul[@id=\"select2-socid-results\"]//li[text()=\"Adem Demir\"]")
	public WebElement thirdparty1;
	
	@FindBy(xpath="//span[@id=\"select2-typent_id-container\"]")
	public WebElement thirdtype;
	
	@FindBy(xpath="//ul[@id=\"select2-typent_id-results\"]//li[text()=\"Other\"]")
	public WebElement thirdtype2;
	
	@FindBy(xpath="//span[@id=\"select2-select_categ_categ_id-container\"]")
	public WebElement tag1;
	
	@FindBy(xpath="//ul[@id=\"select2-select_categ_categ_id-results\"]//li[text()=\"Albunes\"]")
	public WebElement tag2;
	
	@FindBy(xpath="//span[@class=\"select2-selection select2-selection--multiple multiselect multiselectononeline widthcentpercentminusx maxwidth300\"]")
	public WebElement venpro;
	
	@FindBy(xpath="//ul[@id=\"select2-select_categ_propal_id-results\"]//li[text()=\"Advance\"]")
	public WebElement venpo2;
	
	@FindBy(xpath="//span[@id=\"select2-object_status-container\"]")
	public WebElement sta1;
	
	@FindBy(xpath="//ul[@id=\"select2-object_status-results\"]//li[text()=\"Accepted\"]")
	public WebElement sta2;
	
	@FindBy(xpath="//input[@name=\"submit\"]")
	public WebElement refresh;
	
	@FindBy(xpath="//a[text()=\"crm2.png\"]")
	public WebElement uploadverify;
	
	@FindBy(xpath="//div[normalize-space()=\"New price is added\"]")
	public WebElement notelist;
	
	//Purchase Order
	
	@FindBy(xpath="//a[@title=\"Purchase orders\"]")
	public WebElement purchaseorder;
	
	@FindBy(xpath="//th[text()=\"Statistics - Purchase orders\"]")
	public WebElement purchasestate;
	
	@FindBy(xpath="//th[text()=\"Draft orders\"]")
	public WebElement neworderpurchase;
	
	@FindBy(xpath="//span[text()=\"Select a third party\"]")
	public WebElement vendordrop;
	
	@FindBy(xpath="//ul[@id=\"select2-socid-results\"]//li[text()=\"agri \"]")
	public WebElement agri;
	
	@FindBy(xpath="//textarea[@id=\"note_public\"]")
	public WebElement pubnote;
	
	@FindBy(xpath="//textarea[@id=\"note_private\"]")
	public WebElement prinote;
	
	@FindBy(xpath="//a[text()=\"New order\"]")
	public WebElement newpurchase;
	
	@FindBy(xpath="//span[text()=\"New Purchase Order\"]")
	public WebElement purchaseheading;
	
	@FindBy(xpath="//ul[@id=\"select2-categories-results\"]//li[text()=\"BSK\"]")
	public WebElement bsk;
	
	@FindBy(xpath="//ul[@id=\"select2-categories-results\"]//li[text()=\"Penne\"]")
	public WebElement pen;
	
	@FindBy(xpath="//a[text()=\"Events/Agenda\"]")
	public WebElement agent;
	
	@FindBy(xpath="//a[text()=\"Validate and Approve\"]")
	public WebElement approve;
	
	@FindBy(xpath="//a[@id=\"note\"]")
	public WebElement note3;
	
	@FindBy(xpath="//div[normalize-space()=\"This is new note\"]")
	public WebElement newnote;
	
	@FindBy(xpath="(//a[@class=\"paddingright valignmiddle\"])[1]")
	public WebElement upcheck;
	
	//list
	
	@FindBy(xpath="//input[@id=\"cb4586\"]")
	public WebElement purchaseid;
	
	@FindBy(xpath="//ul[@id=\"select2-massaction-results\"]//li[text()=\"Delete\"]")
	public WebElement deletepurchase;
	
	@FindBy(xpath="//a[text()=\"Draft\"]")
	public WebElement draftlink;
	
	@FindBy(xpath="//input[@id=\"cb878\"]")
	public WebElement draftid;
	
	@FindBy(xpath="//ul[@id=\"select2-massaction-results\"]//li[text()=\"Validate and Approve\"]")
	public WebElement validatepurchase;
	
	@FindBy(xpath="//a[@title=\"Validated\"]")
	public WebElement validatepage;
	
	@FindBy(xpath="//span[text()=\"No record found\"]")
	public WebElement norec;
	
	@FindBy(xpath="//a[@title=\"Approved\"]")
	public WebElement approved;
	
	@FindBy(xpath="//input[@id=\"cb4587\"]")
	public WebElement approvedid;
	
	@FindBy(xpath="//a[@title=\"Ordered\"]")
	public WebElement ordered;
	
	@FindBy(xpath="//input[@id=\"cb4472\"]")
	public WebElement orderid;
	
	@FindBy(xpath="//a[@title=\"Canceled\"]")
	public WebElement canceled;
	
	@FindBy(xpath="//input[@id=\"cb2733\"]")
	public WebElement cancelid;
	
	@FindBy(xpath="//a[@title=\"Refused\"]")
	public WebElement refused;
	
	@FindBy(xpath="(//a[text()=\"Statistics\"])[2]")
	public WebElement state2;
	
	@FindBy(xpath="//ul[@id=\"select2-socid-results\"]//li[text()=\"Akmal\"]")
	public WebElement akmal;
	
	@FindBy(xpath="//span[@class=\"select2-selection select2-selection--multiple multiselect multiselectononeline widthcentpercentminusx maxwidth300\"]")
	public WebElement category;
	
	@FindBy(xpath="//ul[@id=\"select2-select_categ_comande_id-results\"]//li[text()=\"Container\"]")
	public WebElement container;
	
	@FindBy(xpath="//span[@class=\"select2-selection select2-selection--multiple multiselect multiselectononeline\"]")
	public WebElement status3;
	
	@FindBy(xpath="//ul[@id=\"select2-object_status-results\"]//li[text()=\"Approved\"]")
	public WebElement status4;
	
	//Billing
	
	@FindBy(xpath="(//a[@title=\"Billing | Payment\"])[2]")
	public WebElement billing1;
	
	@FindBy(xpath="//a[@title=\"Customer invoices\"]")
	public WebElement cusinvoice;
	
	@FindBy(xpath="//td[text()=\"Number of open invoices - Customer invoice\"]")
	public WebElement cusheading;
	
	@FindBy(xpath="//td[text()=\"Number of open invoices - Vendor invoice\"]")
	public WebElement cusheading3;
	
	@FindBy(xpath="//th[text()=\"Customer draft invoices\"]")
	public WebElement cusheading1;
	
	@FindBy(xpath="//th[text()=\"Unpaid customer invoices \"]")
	public WebElement cusheading2;
	
	@FindBy(xpath="//a[@href=\"/comm/card.php?socid=2\"]")
	public WebElement teclib;
	
	@FindBy(xpath="//div[@class=\"error\"]")
	public WebElement cuserror;
	
	@FindBy(xpath="(//a[@title=\"New invoice\"])[3]")
	public WebElement newinvoice1;
	
	@FindBy(xpath="//span[@id=\"select2-socid-container\"]")
	public WebElement custodrop;
	
	@FindBy(xpath="//ul[@id=\"select2-socid-results\"]//li[text()=\"aqua \"]")
	public WebElement aqua;
	
	@FindBy(xpath="//label[text()=\"Down payment invoice\"]")
	public WebElement down2;
	
	@FindBy(xpath="//span[@id=\"select2-cond_reglement_id-container\"]")
	public WebElement payterm;
	
	@FindBy(xpath="//span[@id=\"select2-selectfk_account-container\"]")
	public WebElement defaultbank;
	
	@FindBy(xpath="//ul[@id=\"select2-selectfk_account-results\"]//li[text()=\"Bank bs6tu\"]")
	public WebElement default1;
	
	@FindBy(xpath="//span[@id=\"select2-select_input_reason_id-container\"]")
	public WebElement source;
	
	@FindBy(xpath="//ul[@id=\"select2-select_input_reason_id-results\"]//li[text()=\"Internet\"]")
	public WebElement source2;
	
	@FindBy(xpath="//ul[@id=\"select2-select_input_reason_id-results\"]//li[text()=\"Partner\"]")
	public WebElement partner;
	
	@FindBy(xpath="//span[@class=\"select2-selection select2-selection--multiple multiselect multiselectononeline minwidth100 widthcentpercentminusxx\"]")
	public WebElement cate2;
	
	@FindBy(xpath="//ul[@id=\"select2-categories-results\"]//li[text()=\"Leistung\"]")
	public WebElement leiung;
	
	@FindBy(xpath="//ul[@id=\"select2-categories-results\"]//li[text()=\"Servicios\"]")
	public WebElement servicio;
	
	@FindBy(xpath="//div[@class=\"jnotify-message\"]")
	public WebElement inverror;
	
	@FindBy(xpath="//span[text()=\"New invoice\"]")
	public WebElement invheading;
	
	@FindBy(xpath="//div[normalize-space()=\"This is customer invoice\"]")
	public WebElement notecon;
	
	@FindBy(xpath="//span[text()=\"Validate\"]")
	public WebElement validd;
	
	@FindBy(xpath="//a[contains(text(),'crm2.png')]")
	public WebElement uploadfile;
	
	//list
	
	@FindBy(xpath="//input[@id=\"cb27325\"]")
	public WebElement listidd;
	
	@FindBy(xpath="//a[@title=\"Draft\"]")
	public WebElement listdraft;
	
	@FindBy(xpath="//a[@title=\"Paid\"]")
	public WebElement paid;
	
	
	@FindBy(xpath="//a[@title=\"Abandoned\"]")
	public WebElement Abandoned;
	
	@FindBy(xpath="(//a[@title=\"List\"])[1]")
	public WebElement listhe;
	
	@FindBy(xpath="//ul[@id=\"select2-massaction-results\"]//li[text()=\"Validate\"]")
	public WebElement listvalidate;
	
	@FindBy(xpath="//ul[@id=\"select2-massaction-results\"]//li[text()=\"Delete draft\"]")
	public WebElement listdeletedraft;
	
	@FindBy(xpath="//input[@id=\"cb27317\"]")
	public WebElement listidraft;
	
	@FindBy(xpath="//input[@id=\"cb27174\"]")
	public WebElement listpaid;
	
	@FindBy(xpath="//input[@id=\"cb27196\"]")
	public WebElement listaban;
	
	@FindBy(xpath="//div[@class='jnotify-message']//div")
	public WebElement errormessage;
	
	//Template
	
	@FindBy(xpath="//a[@title=\"List of templates\"]")
	public WebElement template;
	
	@FindBy(xpath="//span[text()=\"Template invoices\"]")
	public WebElement templatehead;
	
	@FindBy(xpath="//a[@href=\"/compta/facture/card.php?action=create&socid=32&fac_rec=194\"]")
	public WebElement templateid;
	
	@FindBy(xpath="//div[normalize-space()=\"This is new template\"]")
	public WebElement templatenotes;
	
	
  @FindBy(xpath="//a[@title=\"Payments\"]")
  public WebElement payments;
  
  @FindBy(xpath="//span[text()=\"Payments received from customers\"]")
  public WebElement paymenthead;
  
  @FindBy(xpath="//a[@href=\"/compta/paiement/card.php?id=1963\"]")
  public WebElement paymentid;
  
  @FindBy(xpath="//a[text()=\"Log\"]")
  public WebElement paylog;
  
  @FindBy(xpath="//a[text()=\"Linked files\"]")
  public WebElement paylinked;
  
  @FindBy(xpath="//a[@title=\"Reporting\"]")
  public WebElement reporting;
  
  @FindBy(xpath="//input[@value=\"Create\"]")
  public WebElement generate;
  
  @FindBy(xpath="(//table//tr[td])[2]")
 public List<WebElement> tablecount;
  
  @FindBy(xpath="(//a[@title=\"Statistics\"])[1]")
  public WebElement statiscus;
  
  @FindBy(xpath="//ul[@id=\"select2-socid-results\"]//li[text()=\"Ajmal\"]")
  public WebElement ajmal;
  
  @FindBy(xpath="(//span[@class=\"select2-selection select2-selection--multiple multiselect multiselectononeline widthcentpercentminusx maxwidth300\"])[1]")
  public WebElement tagcat;
  
  @FindBy(xpath="(//span[@class=\"select2-selection select2-selection--multiple multiselect multiselectononeline widthcentpercentminusx maxwidth300\"])[2]")
  public WebElement tagcat2;
  
  @FindBy(xpath="//ul[@id=\"select2-select_categ_categ_id-results\"]//li[text()=\"AMA\"]")
  public WebElement ama;
  
  @FindBy(xpath="//ul[@id=\"select2-select_categ_invoice_id-results\"]//li[text()=\"Servicios\"]")
  public WebElement servic;
  
  @FindBy(xpath="//span[@id=\"select2-userid-container\"]")
  public WebElement createdby;
  
  @FindBy(xpath="//ul[@id=\"select2-userid-results\"]//li[text()=\" David Doe\"]")
  public WebElement david;
  
  @FindBy(xpath="//span[@id=\"select2-object_status-container\"]")
  public WebElement statussta;
  
  @FindBy(xpath="//ul[@id=\"select2-object_status-results\"]//li[text()=\"Paid\"]")
  public WebElement statussta2;
  
  //Donation
  
  @FindBy(xpath="//a[@title=\"Donations\"]")
  public WebElement donation;
  
  @FindBy(xpath="//span[text()=\"Donations area\"]")
  public WebElement donhead;
  
  @FindBy(xpath="//th[text()=\"Statistics\"]")
  public WebElement donhead2;
  
  @FindBy(xpath="//a[@title=\"New donation\"]")
  public WebElement newdonation;
  
  @FindBy(xpath="//span[text()=\"Create a donation\"]")
  public WebElement donationhead;
  
  @FindBy(xpath="//button[@id=\"reButtonNow\"]")
  public WebElement datenew;
  
  @FindBy(xpath="//input[@name=\"amount\"]")
  public WebElement donamount;
  
  @FindBy(xpath="//input[@name=\"societe\"]")
  public WebElement doncompany;
  
  @FindBy(xpath="//input[@name=\"lastname\"]")
  public WebElement donlast;
  
  @FindBy(xpath="//input[@name=\"firstname\"]")
  public WebElement donfirst;
  
  @FindBy(xpath="//textarea[@name=\"address\"]")
  public WebElement donaddress;
  
  @FindBy(xpath="//input[@id=\"zipcode\"]")
  public WebElement donzip;
  
  @FindBy(xpath="//span[@id=\"select2-selectcountry_id-container\"]")
  public WebElement doncountry;
  
  @FindBy(xpath="//ul[@id=\"select2-selectcountry_id-results\"]//li[text()=\" India \"]")
  public WebElement india2;
  
  @FindBy(xpath="//input[@name=\"email\"]")
  public WebElement email2;
  
  @FindBy(xpath="//ul[@id=\"select2-selectmodepayment-results\"]//li[text()=\"Cash\"]")
  public WebElement donmethod;
  
  @FindBy(xpath="(//span[@class=\"select2-selection__rendered\"])[3]")
  public WebElement methodpay;
  
  @FindBy(xpath="//textarea[@id=\"note_public\"]")
  public WebElement publicnote;
  
  @FindBy(xpath="//textarea[@id=\"note_private\"]")
  public WebElement donprinote;
  
  @FindBy(xpath="//input[@name=\"save\"]")
  public WebElement donsave;
  
  @FindBy(xpath="//a[text()=\"Validate promise\"]")
  public WebElement pomie;
  
  @FindBy(xpath="//a[@title=\"Log\"]")
  public WebElement donlog;
  
  @FindBy(xpath="//div[normalize-space()=\"This is new donation\"]")
  public WebElement donnotecheck;
  
  @FindBy(xpath="(//a[@title=\"List\"])[2]")
  public WebElement donationlist;
  
  @FindBy(xpath="//input[@id=\"cb88\"]")
  public WebElement donlistid;
  
  @FindBy(xpath="//ul[@id=\"select2-massaction-results\"]//li[text()=\"Delete\"]")
  public WebElement donlistdelete;
  
  @FindBy(xpath="(//a[@title=\"Payments\"])[2]")
  public WebElement donpayments;
  
  @FindBy(xpath="//span[text()=\"Donation payments\"]")
  public WebElement payheading;
  
  @FindBy(xpath="//a[@href=\"/don/payment/card.php?id=44\"]")
  public WebElement paylistid;
  
  @FindBy(xpath="//a[normalize-space()=\"Ref. payment\"]")
  public WebElement refsort;
  
  @FindBy(xpath="//a[@href=\"/don/card.php?id=76\"]")
  public WebElement insideid;
  
  @FindBy(xpath="(//a[text()=\"Statistics\"])[2]")
  public WebElement donstate;
  
  @FindBy(xpath="//ul[@id=\"select2-custcats-results\"]//li[text()=\"AMA\"]")
  public WebElement ama2;
  
  @FindBy(xpath="//span[@id=\"select2-status-container\"]")
  public WebElement donstatus;
  
  @FindBy(xpath="//ul[@id=\"select2-status-results\"]//li[text()=\"Draft promise\"]")
  public WebElement draftstatus;
  
  //Salaries
  
  @FindBy(xpath="//a[@title=\"Salaries\"]")
  public WebElement salary;
  
  @FindBy(xpath="//span[text()=\"Salaries\"]")
  public WebElement salheading;
  
  @FindBy(xpath="//span[text()=\"Salaries payments\"]")
  public WebElement salpayheading;
  
  @FindBy(xpath="//a[@href=\"/salaries/payment_salary/card.php?id=296\"]")
  public WebElement salpayid;
  
  @FindBy(xpath="//a[@href=\"/salaries/card.php?id=267\"]")
  public WebElement salpayinsideid;
  
  @FindBy(xpath="//a[text()=\"Credit transfer\"]")
  public WebElement creittrans;
  
  @FindBy(xpath="//a[text()=\"2043\"]")
  public WebElement salyear;
  
  @FindBy(xpath="//a[text()=\"Ref.\"]")
  public WebElement refsalary;
  
  @FindBy(xpath="//input[@id=\"cb266\"]")
  public WebElement sallistid;
  
  //Loans
  
  @FindBy(xpath="//a[@title=\"Loans\"]")
  public WebElement loan;
  
  @FindBy(xpath="//span[text()=\"Loans\"]")
  public WebElement loanheading;
  
  @FindBy(xpath="//a[@title=\"New Loan\"]")
  public WebElement newloan;
  
  @FindBy(xpath="//span[text()=\"New Loan\"]")
  public WebElement loadheading;
  
  @FindBy(xpath="//input[@name=\"label\"]")
  public WebElement loanlabel;
  
  
  @FindBy(xpath="//input[@name=\"capital\"]")
  public WebElement capital;
  
  @FindBy(xpath="//span[@id=\"select2-selectaccountid-container\"]")
  public WebElement bankacc;
  
  @FindBy(xpath="//ul[@id=\"select2-selectaccountid-results\"]//li[text()=\"Account\"]")
  public WebElement bankacc1;
  
  @FindBy(xpath="//input[@name=\"nbterm\"]")
  public WebElement loanterms;
  
  @FindBy(xpath="//input[@name=\"rate\"]")
  public WebElement loanrate;
  
  @FindBy(xpath="//input[@name=\"insurance_amount\"]")
  public WebElement insurance;
  
  @FindBy(xpath="//span[@id=\"select2-accountancy_account_insurance-container\"]")
  public WebElement accinsurance;
  
  @FindBy(xpath="//ul[@id=\"select2-accountancy_account_insurance-results\"]//li[text()=\"106 - Réserves\"]")
  public WebElement accins1;
  
  @FindBy(xpath="//span[@id=\"select2-accountancy_account_interest-container\"]")
  public WebElement accint;
  
  @FindBy(xpath="//ul[@id=\"select2-accountancy_account_interest-results\"]//li[text()=\"101 - Capital\"]")
  public WebElement accint1;
  
  @FindBy(xpath="//input[@name=\"add\"]")
  public WebElement addbtn;
  
  @FindBy(xpath="//button[@id=\"startButtonNow\"]")
  public WebElement start;
  
  @FindBy(xpath="//button[@id=\"endButtonNow\"]")
  public WebElement end;
  
  @FindBy(xpath="//a[text()=\"Modify\"]")
  public WebElement modifyloan;
  
  @FindBy(xpath="//input[@name=\"save\"]")
  public WebElement loansave;
  
  @FindBy(xpath="//a[@id=\"FinancialCommitment\"]")
  public WebElement finanacial;
  
  @FindBy(xpath="//input[@value=\"Create\"]")
  public WebElement creatloan;
  
  @FindBy(xpath="//a[@id=\"card\"]")
  public WebElement card;
  
  @FindBy(xpath="//div[normalize-space()=\"New loan\"]")
  public WebElement notecheck;
  
  
  // Miscellaneous payments
  
  @FindBy(xpath="//a[@title=\"Miscellaneous payments\"]")
  public WebElement mispay;
  
  @FindBy(xpath="//span[text()=\"Miscellaneous payments\"]")
  public WebElement mispayhead;
  
  @FindBy(xpath="//a[@title=\"New\"]")
  public WebElement newpay;
  
  @FindBy(xpath="//span[text()=\"New miscellaneous payment\"]")
  public WebElement newpayhead;
  
  @FindBy(xpath="(//button[text()=\"Now\"])[1]")
  public WebElement datenew1;
  
  @FindBy(xpath="(//button[text()=\"Now\"])[2]")
  public WebElement datenew2;
  
  @FindBy(xpath="//input[@name=\"amount\"]")
  public WebElement mismaount;
  
  @FindBy(xpath="//input[@name=\"num_payment\"]")
  public WebElement numberpay;
  
  @FindBy(xpath="//input[@id=\"fieldchqemetteur\"]")
  public WebElement sender;
  
  @FindBy(xpath="//input[@id=\"chqbank\"]")
  public WebElement bankcheck;
  
  @FindBy(xpath="//ul[@id=\"select2-selectaccountid-results\"]//li[text()=\"Account \"]")
  public WebElement bankaccount;
  
  @FindBy(xpath="//span[@id=\"select2-selectpaymenttype-container\"]")
  public WebElement paymethod1;
  
  @FindBy(xpath="//ul[@id=\"select2-selectpaymenttype-results\"]//li[text()=\"Cash\"]")
  public WebElement paycash;
  
  @FindBy(xpath="//ul[@id=\"select2-selectpaymenttype-results\"]//li[text()=\"Check\"]")
  public WebElement paycheck;
  
  @FindBy(xpath="//span[@id=\"select2-accountancy_code-container\"]")
  public WebElement acc;
  
  @FindBy(xpath="//ul[@id=\"select2-accountancy_code-results\"]//li[text()=\"106 - Réserves\"]")
  public WebElement acc1;
  
  //mis list
  
  @FindBy(xpath="//a[text()=\"Clone\"]")
  public WebElement clone;
  
  @FindBy(xpath="//button[text()=\"Yes\"]")
  public WebElement confiryes;
  
  @FindBy(xpath="(//a[@title=\"List\"])[2]")
  public WebElement mislist;
  
  @FindBy(xpath="//span[text()=\"Miscellaneous payments\"]")
  public WebElement misheading;
  
  @FindBy(xpath="//a[@href=\"/compta/bank/various_payment/card.php?id=280&save_lastsearch_values=1\"]")
  public WebElement mislistid;
}

