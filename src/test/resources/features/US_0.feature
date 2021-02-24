@wip
Feature: Login functionality


  Scenario Outline:

    Given user login as a truck driver using "<username>" and "<password>"
    Then user is on the home page and the title is "Dashboard"
    Examples:
      | username | password  |
      | driver1  | password1 |
      | driver2  | password1 |
      | driver3  | password1 |

  Scenario Outline:
    Given user login as a sales manager using "<username>" and "<password>"
    Then user is on the home page and the title is "Dashboard"
    Examples:
      | username      | password  |
      | salesManager1 | password1 |
      | salesManager2 | password1 |
      | salesManager3 | password1 |

  Scenario Outline:
    Given user login as a store manager using "<username>" and "<password>"
    Then user is on the home page and the title is "Dashboard"
    Examples:
      | username      | password  |
      | storeManager1 | password1 |
      | storeManager2 | password1 |

