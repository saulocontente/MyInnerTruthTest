# new feature
# Tags: optional

@login
Feature: Login


  Scenario Outline: Validate Login Rules
    Given a user goes into login with '<email>' and '<password>'
    When clicks on Entrar button
    Then must show an error '<message>'
    Examples:
      |             email           |   password   |        message         |
      |                             |              |    E-mail inválido     |
      |   qachallenge@zenklub.com   |              |    Senha é necessária  |