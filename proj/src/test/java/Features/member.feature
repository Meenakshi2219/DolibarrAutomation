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

@Meenu
Scenario: Verifying ThirdParties/contacts section
When User clicks the thirdparty icon
Then Third party page is displayed
And Verify thirdparty page heading displayed correctly
And User clicks on vendor 
And User select any one vendor
And User select the mail option in the list
And User click confirm btn
Then The email page is open correctly

@Meenu
Scenario: Sending mail to vendor
Given User is on email sending page
When User select the template
And Click the apply button
And User enter the To address "test@gmail.com"
And User select the attachment
And User draft the mail "Hi...Nice to meet you"
And User click send email
Then User received the warning messge

@Meenu
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

