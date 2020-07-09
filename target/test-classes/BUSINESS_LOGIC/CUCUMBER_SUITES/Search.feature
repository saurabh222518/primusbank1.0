Feature: Search Feature

Background: User is sucessfully logged in and on Admin page
When user opens the "chrome" browser and exe "D:\\bankmaven\\src\\test\\resources\\DRIVERS\\chromedriver.exe"
When user enters the url "http://primusbank.qedgetech.com/"
When user enters "Admin" as username
When user enters "Admin" as password
When user click on login button


@SmokeTest
Scenario: S Test
When user click on branches
When user select "INDIA" as country
When user select "MAHARASTRA" as state
When user select "MUMBAI" as city
When user click on Search button
Then Application shows search result for "MUMBAI" city
