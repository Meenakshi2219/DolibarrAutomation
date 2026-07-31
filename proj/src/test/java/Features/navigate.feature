Feature: Validating CRM application


Scenario: Validating list of templates
Given User is on list of templates page
When User select one template
And User select the type in templates
And User click the payment method as "Cash"
And User select the default bank account as "Bank bs6tu"
And User select the category as "Leistung"
And User enter the publicc note as "This is new template"
Then User click the create draft in template


Scenario: Validating newly created Templates 
Given User is on customer invoice page in templates
When User select the type in templates  "Product"
And User enter the description in templates as "Sample proudct"
And User enter the unit in templates as "300"
And User select quantity in templates as "6"
And User select the discount in templates as "30"
And User click add button in templates
And User click the validate button in templates
Then the price is validated in templates


Scenario: Verifying other details in new Template data
Given User is on contact page in template
And User click the add button in template
And User click the notes in template
And User click the linked files in template
And User adding new template files "D:\picture demo\crm2.PNG"
And Click the upload button in template
And User click the event in template	
Then User went back to list in template


Scenario: Validating payment page in invoice
Given User is on payment page
When User validate the payment page heading
And User select one payment id
And User check the payment page
And User check the log
And User check the linked filess 
And User add the new file "D:\picture demo\crm2.PNG"
And Click the upload button in payment
Then User went back to listt
And User create reporting
Then user create the new report



Scenario: Validating statistics in Customer Invoice
Given User is on statistics page in customer invoice
And User select the thirdparty in statistics "Ajmal"
And User select the thirdparty type in statistics "Other"
And User select the category customer as "AMA"
And User select the category customer invoice "Servicios"
And User select the created by "David Doe"
And User select the status as "Paid"
Then the click the refresh button in statistics


Scenario Outline: Create a new donation
Given User is on donation page
And User verify the donation heading
When User clicks the new donation button
And User select the date in donation
And User enter the amount "<amount1>"
And User enter the company "<company>"
And User enter the lastname in donation "<lastname1>"
And User enter the firstname in donation "<firstname1>"
And User enter the address in donation "<address>"
And User enter the zipcode in donation "<zip>"
And User select the country in donation
And User enter the email in donation "<email1>"
And User enter the note in public as "This is new donation"
And User enter the note is private as "Started donating"
And User click the save button
Then Verify the donation creation result "<result5>"

Examples:

| amount1 | company   | lastname1 |  firstname1| address          |zip   | email1         | result5| 

|        |abc pvt ltd| Kaviya    |  murli     |5th street,rayapet|641333|meenu@gmail.com |failure  | 

|        |kaveri ltd |k          |            |3/422,Nallur      |634567|gori@gmail.com  | failure |

|amt     | aruvi ltd | Ammu      | Aruvi      |3rd street,Annur  |613456|kaviya@gmail.com |failure |  

|        |xyz pvt ltd| 123       | 456        | 5th street,rayapet|kavi |madhu@           |failure |

|800     |Madhu ltd  |Madhu      |mitha       |5th street,rayapet | 634567|madhu@gmail.com|Success |




Scenario: Verifying other details in donation
Given User is on new donation page
And User validate the new donation
And User click the notes in donation
And User click the linked files in donation
And User adding new donation files "D:\picture demo\crm2.PNG"
And Click the upload button in donation
And User click the log in donation	
Then User went back to list in donation



Scenario: Validating list in donation
Given User is on list in donation
When User select the one donation
And User select an action in donation
And User click the confirm button in donation
And User select yes in donation dd
And User click the validate btn in donation
Then The record is deleted successfully in donation


Scenario: Validating payment page in donation
Given User is on payment page in donation
And User validate the payment page
When User licks the ref sorting icon
Then Ref column should sorting in acending order
And User select one payment id in donation
And User check the donation payment page
And User check the linked files in donation 
And User add the new file in "D:\picture demo\crm2.PNG"
And Click the upload button in donation payment
And User click the notes in donation payment
And User enter the new notes in donation as "Donating amount"
And User check the log in donation payment
Then User went back to list in donation payment



Scenario: Validating statistics in Donation 
Given User is on statistics page in donation
And User select the thirdparty type in donation statis "Other"
And User select the category customer in statis
And User select the created by in donation statis "David Doe"
And User select the status as in donation statis "Draft promise"
Then the click the refresh button in donation statistics


Scenario: Validating list in salaries
Given User is on list in salaries
And User validate the list page in salaries
When User licks the ref sorting icon in list
Then Ref column should sorting in acending in list
When User select the one salaries
And User select an action in salaries
And User click the confirm button in salaries
And User select yes in salaries dd
And User click the validate btn in salaries
Then The record is deleted successfully in salaries


Scenario: Validating payment page in salaries
Given User is on payment page in salaries
And User validate the payment page in salaries
When User licks the ref sorting icon in payment
Then Ref column should sorting in acending in payment
And User select one payment id in salaries
And User check the salaries payment page
And User check the credit transfer page
And User check the linked files in salaries 
And User check the log in salaries payment
Then User went back to list in salaries payment


Scenario: Validating statistics in Salaries 
Given User is on statistics page in salaries
And User select the year
Then the click the refresh button in salaries statistics


Scenario Outline: Create a new loan
Given User is on loan page
And User verify the loan heading
When User clicks the new loan button
And User enter the label "<label>"
And User enter the bank account "<account>"
And User enter the capital "<capital>"
And User enter the start date
And User enter the End date
And User enter the number of terms "<terms>"
And User enter the rate "<rate>"
And User enter the insurance amount as "4000"
And User enter the note in publoan as "New loan"
And User enter the note is priloan as "Capital invested"
And User select the account insurance "<accins>"
And User select the account interest "<accint>"
And User click the add button in loan
Then Verify the loan creation result "<result6>"

Examples:

| label          |account   | capital  |  terms |rate  |  accins       |accint        | result6| 
|                | Account  |          | 2      |10    |106 - Réserves | 101 - Capital|failure|
| New  Loan apply| Account  |          | 2      |      |106 - Réserves | 101 - Capital|failure|
| New  Loan apply| Account  |          | 2      |10    |106 - Réserves | 101 - Capital|failure|
| New  Loan apply| Account  |          |        |10    |106 - Réserves | 101 - Capital|failure|
| New  Loan apply| Account  |          | 2      |      |106 - Réserves | 101 - Capital|failure|
| New  Loan apply| Account  |100000    | 2      |10    |106 - Réserves | 101 - Capital|Success|




Scenario: Verifying other details in new Loan data
Given User is on card page in loan
And User click the modify button in loan
And User modify the rate and save "25"
And User click the financial commitment
And User click create button in finance
And User click the linked files in loan
And User adding new loan files "D:\picture demo\crm2.PNG"
And Click the upload button in loan
And User click the notes in loan
And User click the log in loan	
Then User went back to list in loan



Scenario Outline: Create a miscellaneous payment
Given User is on miscellaneous payment page
And User verify the miscellaneous heading
When User clicks the new miscellaneous button
And User enter the date of payment
And User enter the value date
And User enter the amount in mis "<amount>"
And User select the bank account "<bankacc>" 
And User select the method "<paymethod>"
And User enter the cheque number as "12"
And User enter the sender "Madhavi"
And User enter the bank "Karur Vysys Bank"
And User select the accounting account "<accounting>"
And User click the save button in mispay
Then Verify the miscellaneous creation result "<result7>"

Examples:

| amount  |bankacc        | paymethod |  accounting  |result7|     
|         |Account (EUR)  |Cash       |106 - Réserves|failure|
| 500000  |Account (EUR)  |           |106 - Réserves|failure|
|         |Account (EUR)  |           |106 - Réserves|failure|
| 150000  |Account (EUR)  |  Check    |106 - Réserves|Success|



Scenario: Validating list in miscellanous
Given User is on list in miscellanous
And User validate the list page in miscellanous
When User clicks the ref sorting icon in miscellanous 
Then Ref column should sorting in acending in miscellanous
When User select the one miscellaneous in list
And User select the clone button in payment
And User click the confirm button in miscellanous
And User check the linked files in miscellanous
And User add the new file in miscellanous "D:\picture demo\crm2.PNG"
And Click the upload button in miscellanous 
And User check the log in miscellanous
Then User went back to list in miscellanous

