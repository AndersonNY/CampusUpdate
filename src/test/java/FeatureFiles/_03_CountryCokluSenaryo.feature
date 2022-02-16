Feature: Country Multi Scenario

  #Senaryolarda aynı olan ilk kısımlar Background olarak yazılabilir
  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to country page


  Scenario: Create a country

    When Create a country
    Then Success message should be displayed


  Scenario: Create a country parameter data

    When Create a country name as "temurUlke2" and code as "code2"
    Then Success message should be displayed

    //  Webelement element=driver.findElement(by.id("Interview");

    Select list = new Select(element)

    SelectByVisibleText() select option based on test displayed. Takes String parameters.
    SelectByIndex() selects option based on the count.Takes int parameters.
    SelectByValue() select option based on the value of the value attribute. Takes string parameters.
    Xpath syntax= // tagnem[Qid='value']
    css=tagname[id=value]




