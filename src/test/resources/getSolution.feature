Feature: Get a solution for a problem

  Scenario Outline: Get the solution for a known problem
    Given problem "<description_problem>" exist
    And solution "<solution_content>" for the problem exists
    When a ask for a solution for the problem "<description_problem>"
    Then i should get the solution "<solution_content>"

  Examples:
      | description_problem | solution_content |
      | JAVA ne compile pas | Installer le sdk |