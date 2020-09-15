package ca.qc.cegepsth;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class AddStepdefs {

    private Calculator calculator;
    private int value1;
    private int value2;
    private int result;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    // voir aussi https://cucumber.io/docs/cucumber/cucumber-expressions/#parameter-types
    @Given("Two input values, {int} and {int}")
    public void two_input_values_and(Integer first, Integer second) throws Throwable{
        value1 = first.intValue();
        value2 = second.intValue();
    }

    @When("I add the two values")
    public void iAddTheTwoValues() {
        result = calculator.add(value1, value2);
    }

    @Then("I expect the result {int}")
    public void iExpectTheResultResult(Integer result) {
        Assert.assertEquals(result.intValue(), this.result);
    }
}
