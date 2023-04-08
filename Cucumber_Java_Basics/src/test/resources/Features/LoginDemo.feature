Feature: Verigy Login

  @test2
  Scenario Outline: Verify User Login to Test Application
    Given Load Browser and Navigate to Test Application
    When Enter <username> and <password> and Click on login
    Then User should redirect to Home Page

    Examples: 
      | username | password |
      | Arathi   |    12345 |
      | Seena    |    12345 |
