Feature: Verify Google Search
@test1
  Scenario: Verify Google Search is Working
    Given Brwoser is open and Google URL is loaded
    When Serach by Text
    Then Page should be loaded
