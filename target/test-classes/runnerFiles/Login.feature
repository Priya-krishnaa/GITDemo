Feature: Login to the application

Scenario Outline: Positive log in test case
Given Initialise Driver
And Hit the Application URL "https://www.rahulshettyacademy.com/#/index"
And Check if pop up exists
When User Enters Valid Credentials <username> and <pwd>
Then Lands onto Homepage 
And Validate if search bar exists
And Close the browser

Examples:
|username				|pwd        |
|priya.77498@gmail.com  |88Priya@   |
|test99@gmail.com       |123456     |
