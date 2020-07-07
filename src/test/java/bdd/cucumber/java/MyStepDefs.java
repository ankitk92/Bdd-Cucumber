package bdd.cucumber.java;

import bdd.cucumber.code.Calculator;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import static org.junit.Assert.assertEquals;

public class MyStepDefs {

    Calculator calObj = new Calculator();
    int result = 0;
    @Given("^I have numbers (\\d+) and (\\d+) and I want to (.*)$")
    public void iHaveNumbersAnd(int num1, int num2, String operator) {
        switch(operator.toLowerCase()) {
            case "add":
                result = calObj.add(num1,num2);
                break;
            case "multiply":
                result = calObj.multiply(num1, num2);
                break;
            case "divide":
                result = calObj.divide(num1, num2);
                break;
            case "subtract":
                result = calObj.subtract(num1, num2);
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


    @Then("^I should get answer as (\\d+)$")
    public void iShouldGetAnswerAs(int answer) {
        assertEquals(answer,result);
    }
}

