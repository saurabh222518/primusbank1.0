Feature: Login feature

Background: user is sucessfully logged in
When user opens the "chrome" browser and exe "D:\\bankmaven\\src\\test\\resources\\DRIVERS\\chromedriver.exe"
When user enters the url "http://primusbank.qedgetech.com/"


Scenario: Login Functionality for valid username and password
When user enters "Admin" as username
When user enters "Admin" as password
When user click on login button
Then useris on the "Admin" main page and get message as Welcome to Admin