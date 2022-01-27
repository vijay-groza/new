@numbers
Feature: Number count


  Scenario: one to five count
    Given all the numbers
    When number one
    When number two
    When number three
    When number four
    When number five

  Scenario: six to ten count
    Given all the numbers
    When number six
    When number seven
    When number eight
    When number nine
    When number ten
