@CompleteTest
Feature: Retail Home Page

# we can write comment using HashTag

@loginTest
Scenario: Login to Retail Website
Given user is on Retail home
When user click on MyAccount
And user click on Login option
And user enter userName "zaheer@test.com" and password "test123"
And user click on login button
Then user should be logged into myAccount Page
