Feature: Application Login

//Background:
//Given validate the browser
//When Browser is triggered
//Then check if browser is displayed

  Scenario: Home page default login
  Given user is on NetBanking page
  When User login into application with "zan" and password "4356"
  Then Home page is populated
  And Cards are displayed are "true"

  @MobileTest
  Scenario: Home page default login
Given user is on NetBanking page
  When User login into application with "rrzan" and password "43d56"
Then Home page is populated
  And Cards are displayed are "false"


  @RegTest
  Scenario: Home page default login
  Given user is on NetBanking page
  When Sign up with the following details
    | siphokazi | mbuyisa | amanda@gmail.com | 10206 |
    Then Home page is populated
  And Cards are displayed are "true"

  @SmokeTest
  Scenario Outline: Home page default login
    Given user is on NetBanking page
    When User login in to application with <username> and password <password>
    Then Home page is populated
    And Cards are displayed are "true"
    Examples:
      | username | password |
      | user1    | pass1    |
      | user2    | pass2    |
      | user3    |pass3     |


