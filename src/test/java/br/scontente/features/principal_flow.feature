
@Flow
Feature: Principal flow core of Zen
Requirements
- Automate tests for the expected product flow described above
- Feel free to use any tool that you think is more suitable to automate testing
- Please add a short step to step guide on how to run the tests


Background: Access the Application
Given a user goes into login with 'qachallenge@zenklub.com' and 'qachallenge'
And after login should not have any session scheduled


Scenario: Open Professional page
When user clicks on “NOSSOS ESPECIALISTAS” to goes to Page busca
And user clicks on “Gostei quero saber mais” on the first professional that appear on the list to goes to that professional page
Then see more information about the professional choosed


