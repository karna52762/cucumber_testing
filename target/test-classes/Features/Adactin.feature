Feature: Verifing the adactin web page

  Scenario Outline: Verify the login  with valid creditals
    Given User is on adaction page
    When User enters "<username>" and "<password>"
    And User clicks login button
    Then user verify success message

    Examples: 
      | username     | password |
      | karnamoorthy | 03THRF   |

  Scenario Outline: Verify the Search Hotel page
    When User select "<Location>" and "<Hotels>" and "<Room Type>" and "<Number of Rooms>" and "<Adults per Room>" and "<Children per Room>"
    And User click search button

    Examples: 
      | Location | Hotels      | Room Type | Number of Rooms | Adults per Room | Children per Room |
      | Sydney   | Hotel Creek | Standard  | 1 - One         | 1 - One         | 1 - One           |

  Scenario: verify the Select Hotel page
    When User select the Hotel
    And User click the continue button

  Scenario Outline: verify the search hotel page
    When enter "<First Name>" and "<Last Name>" and "<Billing Address>" and "<Credit Card No.>" and "<Credit Card Type>" and "<Select Month>" and "<Select Year>" and "<CVV Number>"
    And User click BookNow button

    Examples: 
      | First Name | Last Name | Billing Address | Credit Card No.  | Credit Card Type | Select Month | Select Year | CVV Number |
      | karan      | selvam    | Chennai         | 1234567890123456 | VISA             | January      |        2022 |        826 |

  Scenario: verify the confirmation page
    When User click search hotel
