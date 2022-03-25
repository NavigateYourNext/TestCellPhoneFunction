Feature: Validate SAPhoneNumber method with different type of data

  Scenario: Validate SAPhoneNumber method with valid dataset 1
    Given Data to validate method is "0794463558"
    When Call the validateSAPhoneNumber method
    Then Method must returns "true"

  Scenario: Validate SAPhoneNumber method with valid dataset 2
    Given Data to validate method is "+27794463558"
    When Call the validateSAPhoneNumber method
    Then Method must returns "true"

  Scenario: Validate SAPhoneNumber method with valid dataset 3
    Given Data to validate method is "27794463558"
    When Call the validateSAPhoneNumber method
    Then Method must returns "true"

  Scenario: Validate SAPhoneNumber method with invalid dataset 1
    Given Data to validate method is "794463558"
    When Call the validateSAPhoneNumber method
    Then Method must returns "false"

  Scenario: Validate SAPhoneNumber method with invalid dataset 2
    Given Data to validate method is "+270794463558"
    When Call the validateSAPhoneNumber method
    Then Method must returns "false"


  Scenario: Validate SAPhoneNumber method with invalid dataset 3
    Given Data to validate method is "+27079446355854"
    When Call the validateSAPhoneNumber method
    Then Method must returns "false"