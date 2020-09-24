package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        Belly belly = new Belly();
        belly.eat(cukes);
    }

    @Then("my belly {int} should growl")
    public void myBellyShouldGrowl(int arg0) {
    }

    @When("I wait {int} hour for {string}")
    public void iWaitHourFor(int arg0, String arg1) {
    }
}
