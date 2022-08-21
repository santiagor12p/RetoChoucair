Feature: Register user in utest page
  As a page utest user
  I want to register in the utest page
  So that I login

  Scenario: Successfull register
    Given the user is on the utest page
    And go to the register module
    When enter his dates in the module
    Then shoul see the welcome message