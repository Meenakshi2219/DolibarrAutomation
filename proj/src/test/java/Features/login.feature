Feature: Dolibar Home Page Validation 
Scenario: Verify all elements in Home Page
Given User Lanuches the application
Then Verify application URL
And Verify page title
And Verify all header menus are displayed
And Verify main heading is displayed
And Verify sub heading is displayed
And Verify banner image is displayed
And Verify Test Online button is displayed
And Verify Download button is displayed
And Verify Search textbox is displayed


Scenario: Verify feature page and CRM & Sales modulee
When User click on feature menu
And Verify feature page is displayed
And Verify CRM & Sales section i displayed
And user click the prospects customer module
And Verify related page is displayed
Then user navigate back to Feature page


When user clicks proposal module
Then Verify proposal page is displayed


When user clicks opportunity module
Then Verify opportunity page is displayed


When user clicks sales order  module
Then Verify sales order page is displayed


When user clicks contracts  module
Then Verify contract related page is displayed


When user clicks Help Desk  module
Then Verify Helpdesk related page is displayed


When user clicks knowledge  module
Then Verify knowledge related page is displayed



Scenario: Verify HR Management in feature page
When User scroll to human relationship mnagement section
And verify human relationship mnagement is displayed
And User click the employee module
Then Verify employee related page is displayed

When User clicks Expense report module
Then Verify expense relate module is displayed

When User clicks leave request module
Then Verify leave request module is displayed

When User clicks timesheet module
Then Verify timesheet related module is displayed

When User clicks recruitment module
Then Verify recruitment relate module is displayed

When User clicks membership module
Then Verify membership relate module is displayed


Rule: Remaining scenario
Scenario: Verify create membership
When User clicks testonline button
And User select the valid plan to create instance
Then User switches to registration window


Scenario Outline: Verify Dolicloud Instance Creation with valid and invalid data
When user enteres email "<Email>"
And User enters company name "<company>"
And User enters phone number "<phone>"
And User enters password "<password>"
And User enters confirm password "<Cpassword>"
And user select country "<country>"
And User select signup button
Then Verify registration result "<result>"

Examples:
|    Email         |  company    |    phone   |  password   |  Cpassword   | country  |  result  |

|meenu@test.com    | abc pvt ltd | 9786543678 | test        |  test        | India (IN)   | failure  |
|meena123@gmail.com| abc         | 8907654324 | veer        |  test@123    | India (IN)   | failure  |
|meena123@gmail.com| abc pvt ltd | 96778      | t3          |  eg          | India (IN)    | failure  |
|meena123@gmail.com| abc pvt ltd | 9677878965 | T           |  T           | India (IN)   | failure  |
|meena123@gmail.com| abc pvt ltd | 9677878965 | kil         |  test@       | India (IN)   | failure  |
|meena520@gmail.com| Arivuiii    | 9677878965 | Ammu@2216    |  Ammu@2216   |India (IN)   | Success |



Scenario: Installed instance and switch back to parent
When User click the login credential link
And User close the current dashboard tab


Scenario: Verify CMS,WEbsite and pos in features pge
When User clicks the CMSwebsite
Then the related website should be open
And User clicks the point of sale
Then Related sales details should be open

Scenario: Verify poduct & Stock in features
When User click product and service 
And the related product page is open
And User click shipment
Then Shipment related screen will open
And User click stocks
Then Stock related screen will open
And User click purchase
Then Purchase related screen will open
And User click manufacturing
Then Manufacturing related screen will open


Scenario: Verify Finance and billing in features
When User click the Billing
Then Billing related servce should open
And User click the Double entry accounting
Then entry related details displayed
And User click the Bank reconcilation
Then bank related details displayed


Scenario: Verify Marketing in features
When User click the Emailing
Then Email related page will display
And User click the survey
Then survey related page is displayed

Scenario: Verify Productivity in features
When User click the project
Then project related page will display
And User click the agenda
Then Agenda related page is displayed
And User click the Intervention
Then Intervention related page is displayed


Scenario: Verify Integration and Development in feature
When User click the api
Then Api related page will display
And User click the import and export
Then export related page is displayed
And User click the module builder
Then Builder related page is displayed
And User click the connectivity tools
Then Tools related page is displayed


Scenario: Blog page validation
Given User is on blog page
And Verify the latest news heading is displayed
When User clicks the any blog image
And Verify the blog related page is displayed
When User clicks the post icon
And Verify post windoe and switch to parent window
When User clicks the Reddit icon
And Verify reddit page is open 
When User clicks the facebook icon
Then Verify facebook page is opened


@Meenu

Scenario: Validating new selling application
When User clicks the home icon
And User clicks the test online
And User select the second option 
And User select the selling application
Then login page is displayed

@Meenu
Scenario Outline: Login with valid and invalid credential
When User enter the username "<username1>"
And User enter the password "<password1>"
And User clicks the login button
Then Verify the login result "<result1>"

Examples:

|username1 | password1  | result1 |
#|doli      | doli       | failure |
#| doli     | deenu      | failure |
#|deenu     |            | failure |
|demo      | demo       | Success |


@Meenu
Scenario: Verify CRM Home page
Given application should open
Then Verify the CRM Homepage
And Verify the home page tabs are displayed



Scenario Outline: Create a new member
Given User is on member page
When User clicks the new member button
And User select mmbertype "<MemberType>"
And User select the natire of member "<nature>"
And User enter the email "<email>"
And User enter the lastname "<lastname>"
And User enter the firstname "<firstname>"
And User click he create member button
Then Verify the member creation result "<result4>"

Examples:

|MemberType   | nature      | email           |  lastname  |   firstname  |  result4   |
|Production   |Individual   |meenu@           | Kaviya     |  murli       | failure    |
|Aluminum     |Individual   |meenu@gmail.com  |k           |              | failure    |
|Production   |Legal entity |meenu67@gmail.com|            |      kumar   | failure    |
#|Production   |Legal entity |meenu67@gmail.com|   123      |      kumar   | failure    |
|Production   |Individual   |meenu54@gmail.com|Ammu     |Kalai          | Success    |


Scenario: New Mwmber Verification
When Verify new member data
And User validate the new member
And User can modify the member data
And User modify the company name "abc pvt ltd"
And User select the Title
And User select the gender
And User enter the website "www.abc.com"
And User enter the address "3/456,arakkonam,chennai"
And user enter the zipcode "638102"
And User select the state
And User enter the bus phone "9876543277"
And User enter the personal phone "9786543789"
And User select the dob "22/09/2007"
And User click save button
And User check the contribution
And User check the notes
And User enter the new notes as "New price is added"
And User check the liked files
And User adding new filess "D:\picture demo\crm2.PNG"
And User check the event
Then user go to list



Scenario: Validate list item
When User select the member from the list
And User select the action
And User select the assigntag
And User click the confirm button
And User select the tag
And User click validate
Then the action performed


Scenario: Perorm action on draft member
Given User is on draft member page
When User select the draft member
And User choose the action from dropdown
And User click validate button
Then Verify action is performed


Scenario: Add Subscription or valid member

Given User is on valid member page
When User select the valid member
And User select the subscription
And User click confirm button
And User enter the subscription amount "900"
And User select yes in dropdown
And User click the validate
Then Verify the member subscription is added successfully


Scenario: Verify Pending membership
Given User is on pending member page
When User select the pending member
And User select the subscription policy
And User clicks confirm button
And User enter subscription amount "800"
And User select yes
And User click the validate button
Then Verify the Pending member is moved to uptodate


Scenario: Delete the Up To Date member
Given User is on uptodate member page
When User select the upto date member
And User selects the subscription policyy
And User click the confirm buttonn
And User select yes in dd
And User clicks validate buttonn
Then Verify the uptodate member is deleted


Scenario: Verify out of date page 
Given User is on outofdate page
And user see the member data
And User clicks on excluded member
Then user verify the records


Scenario: verifying Termination member details
Given User is on termination member page
When User select the termination member
And User selects the subscriptionn policyy
And User clicks the confirm buttonn
And User select yes in drop
And User clicks validate buttton
Then Verify the termination member is deleted



