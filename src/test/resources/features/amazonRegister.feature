Feature:  when the user enters the correct information should see "Verify email address" text
  @amazon
  Scenario Outline: user with the the correct information for registering should see whether Verify email address" text is displayed

    Given user goes to "https://www.amazon.com"
    Then hover over to account&signs
    Then click startHereLink link
    And fill the create account part "<name>", "<email>","<password>","<passwordCheck>"
    When then click the continue Button
    Then "Verify email address" text


    Examples:

      |name|email|password|passwordCheck|
    |esra|esrasey_men@hotmail.com |3434!uK|3434!uK|