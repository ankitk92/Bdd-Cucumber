package bdd.cucumber.java;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import static org.junit.Assert.assertEquals;

public class MyStepDefs {

    int result = 0;
    @Given("^I have numbers (\\d+) and (\\d+) and I want to (.*)$")
    public void iHaveNumbersAnd(int num1, int num2, String operator) {
        switch(operator) {
            case "add":
                result = num1 + num2;
                break;
            case "multiply":
                result = num1 * num2;
                break;
        }
    }

    @Then("^I should get sum as (\\d+)$")
    public void iShouldGetSumAs(int sum) {
        assertEquals(sum,result);
    }

    @Then("^I should get product as (\\d+)$")
    public void iShouldGetProductAs(int product) {
        assertEquals(result,product);
    }
}

