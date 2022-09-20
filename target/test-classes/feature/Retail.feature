@CompleteTest
Feature: Tek School Retail Website

Background:
Given user is on Retail home
When user click on MyAccount



@Test
Scenario Outline: login to Retail webiste with multiple credentials
 And user click on Login option
 And user enter userName "<userName>" and password "<password>"
 And user click on login button
 Then user should be logged into myAccount Page
 Examples:
 |userName|password|
 |zaheer@test.com|test123|
 |test1@test.com|test1|

@register
 Scenario: Register to Retail Website
 And user click on Register option
 And user fill the register form with below information
 |firstName|lastName|email|telephone|password|PasswordConfirm|subscribe|
 |mustafa|zaheer|mus11@tek.com|2021010007|mus123|mus123|Yes|
 And user accept privacyPolicy
 And user click on Continue Button
 Then user should see a successfull message "Your Account Has Been Created!"

 