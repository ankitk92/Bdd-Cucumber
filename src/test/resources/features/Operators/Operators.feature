Feature: Perform operations

  @operations
  Scenario Outline: Performing operations
    Given I have numbers <number1> and <number2> and I want to <Operation>
    Then I should get answer as <result>

    Examples:
      | number1 | number2 | Operation | result |
      | 2       | 3       | Add       | 5      |
      | 5       | 10      | Multiply  | 50     |
      | 50      | 7       | Divide    | 7      |