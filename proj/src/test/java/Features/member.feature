Feature: Validating CRM application

Scenario: Validating Statistics details
Given user is on statistic page
And User clicks the contribution
Then Current year contribution details displayed
And User clicks the country
Then Country details is  displayed
And User clicks the Region
Then Region details displayed
And User clicks the province
Then State details displayed
And User clicks the City
Then City details displayed
And User clicks the By nature
Then By Nature details displayed


Scenario: Validating contribution details
Given user is on contribution page
And Contribution activities details displayed
And User clicks the new membership
And User select the one member
And user select any action in the list
And user click th confirmation 
Then The particular action is performed


Scenario: Validating Contribution list details
Given User is on list page
And User select the contribution member
And User select the delete action
And User click the confirm buton
And User validate the option
Then The user is deleted successfully


Scenario: Validating Contribution Statistics details
Given user is on statistic page in contribution
And User clicks the contributio
Then Current year contribution detail displayed
And User clicks the country in contribution
Then Country details is  display
And User clicks the Region in contribution
Then Region detail is displayed
And User clicks the province in contribution
Then State detail is displayed
And User clicks the City in contribution
Then City detail is displayed
And User clicks the By nature in contribution
Then By Nature detail is displayed



Scenario: Creating New MemberTypes 
Given user is on membertypes page
And Previous membertype is displayed
When User clicks new button
Then Newly create membertype page should open
And User enter the label as"Production indico"
And User select the nature of member
And User select the amount as"900"
And User enter the duration as "2"
And User enter the description as "New Member"
And User enter the welcome email as "Welcome to the community"
And User clicks the save button
Then New Member details is displayed in the list


Scenario: Modifying the membertype 
Given user is on list pagee
And User click the edit icon
And User change the amount as “750”
And User change the vote member
And User change the duration as "5"
And User click the save btn
Then the new data is saved successfully


Scenario: Verifying ThirdParties/contacts section
When User clicks the thirdparty icon
Then Third party page is displayed
And Verify thirdparty page heading displayed correctly
And User clicks on vendor 
And User select any one vendor
And User select the mail option in the list
And User click confirm btn
Then The email page is open correctly


Scenario: Sending mail to vendor
Given User is on email sending page
When User select the template
And Click the apply button
And User enter the To address "test@gmail.com"
And User select the attachment
And User draft the mail "Hi...Nice to meet you"
And User click send email
Then User received the warning messge


Scenario: Verifying particular Vendor details
Given User is on vendor list page
When User select the particular vendor
And User click the Customer
And User click the customer price 
And User click the related items
And User click the payment method
And User click the ticket
And User click the notification
And User click the notes
Then User go back to the main list

@Meenu
Scenario: Validating commerce area page
Given User is on commerce area page
And Verifying page headings 
When User clicks on vendor proposal
And Verifying proposal page
And User clicks any proposal
Then warning message should display


Scenario Outline: Creating New Price Request
When User click the new price request
Then New price creating page is open
And User select the vendor "<Vendor>"
And User select the payment term "<Term>"
And User select the payment method "<Method>"
And  User select the delivery date
And  User select the tags
And User clicks the create draft button
Then New price will be created "<Result>"

Examples:
|Vendor        | Term        | Method      | Result  |
|              | 30 days     | Cash        |failure   |
|              |Order        | Check       |failure   |
|              |Order        |  Cash	   | failure   |
| aaa          | 30 days     | Cash        | Success |



Scenario: Validating newly created data
Given User is on price request page
When User select the type as "Product"
And User enter the descriptionn as "Sample prouct"
And User enter the unit as "300"
And User select quantity as "2"
And User select the discount as "12"
And User click add button
And User click the validate buttonn
Then the price is validated



Scenario: Verifying other details in new data
Given User is on contact page
And User click the add button
And User click the notess 
And User enter the new note as "New price is added"
And User save the notes
And User click the linked files 
And User adding new files "D:\picture demo\crm2.PNG"
And Click the upload button
And User click the log
Then User went to back to list


Scenario: Validating list in Vendor Proposal
Given User is on list in vendor
When User select the one vendor
And User select an action
And User click the confirmm button
And User select yes in dropdd
And User click the validate btn
Then Warning message is displayed


Scenario Outline: Validating statistics in Vendor Proposal
Given User is on statistics page in vendor
And User select the thirdparty "<Thirdparty>"
And User select the thirdparty type "<type>"
And User select the vendor tag "<tag>"
And User select the vendor proposal "<proposal>"
And User select the status "<status>"
Then the click the refresh button

Examples:
|Thirdparty     |  type   |  tag    |    proposal  | status   |
|Adem Demir     | Other   | Albunes | Advance      | Accepted |



Scenario: Validating Purchase Order page
Given User is on purchase orderr page
And User validate the page heading

Scenario Outline: Creating New Purchase Request
When User click the new order request
Then New order creating page is open
And User select the vendorr "<vendor>"
And User select the payment termm "<term>"
And User select the payment methodd "<method>"
And User select the delivery datee
And User select the tags "<tags>"
And User enter the public notes "This is new note"
And User enter the private notes "This is new private note"
And User clicks the create draft buttonn
Then New price will be createdd "<result4>"

Examples:
|vendor        | term        | method      | result4   |
|              | 30 days     | Cash        |failure    |
|              |Order        | Check       |failure    |
|              |Order        |  Cash	   |failure    |
| agri         | 30 days     | Cash        |Success    |



Scenario: Validating newly created purchase data
Given User is on purchase order page
When User select the typee as "Product"
And User enterr the description as "Sample product"
And User enter the unitt as "300"
And User select quantityy as "2"
And User select the discountt as "12"
And User click add buttonn
And User click the validatee button
Then the purchase is validated



Scenario: Verifying other details in new purchase data
Given User is on contactt page
And User click the addd button
And User click thee notes
And User click the linkedd files
And User addingg new files "D:\picture demo\crm2.PNG"
And Click the uploadd button
And User click the event	
Then User went back to list


Scenario: Validating list in Purchase Order
Given User is on list in purhase
When User select the one purchase
And User select an action in purchase
And User clickk the confirm button
And User select yes in dropd
And User click the validatee btn
Then The record is deleted successfully


Scenario: Validating Draft in Purchase Order
Given User is on draft in purhase
When User select the one draft item
And User select an action in draft
And User clickk the confirm button in draft
And User select yess
And User click the validte btn
Then The record is validated successfully
And User is on validate page
And User see the validate data


Scenario: Validating approved item in Purchase Order
Given User is on approved in purchase
When User select the one approved
And User select an action in approved
And User click the confirm button in approved
And User select yes in dropd in approved
And User click the validate btn in approved
Then The record is deleted successfullly


Scenario: Validating Ordered in Purchase Order
Given User is on order in purchase
When User select the one order item
And User select an action in order
And User clickk the confirm button in order
And User select yes in order
And User click the validate btn in order
Then The record is validated successfullly


Scenario: Validating Cancelled in Purchase Order
Given User is on order in cancelled
When User select the one cancel item
And User select an action in cancel
And User clickk the confirm button in cancel
And User select yes in cancel
And User click the validate btn in cancel
Then The record is deleted
And User is on Refused page
And User see the refused data


Scenario: Validating statistics in Purchase Order
Given User is on statistics page in purchase
And User select the thirdpartyy "Akmal"
And User select the thirdpartyy type "Other"
And User select the vendor tagg "Albunes"
And User select the category "xContainer"
Then the click the refresh buttonn

@Meenu
Scenario: Validating billing area page
Given User is on billing area page
And Verifying invoice page headings 
When User clicks on customer invoice
And Verifying customer invoice page
And User clicks any draft invoice
Then warning message should displayy

