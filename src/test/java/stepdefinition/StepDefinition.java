package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static util.ValidatePhoneNumber.validateSAPhoneNumber;

public class StepDefinition {

    String cellPhoneNumber;
    boolean actualResult;

    @Given("Data to validate method is {string}")
    public void data_to_validate_method_is(String ValidateCellPhoneNumber) {
        cellPhoneNumber = ValidateCellPhoneNumber;
    }
    @When("Call the validateSAPhoneNumber method")
    public void call_the_validateSAPhoneNumber_method() {
        actualResult = validateSAPhoneNumber(cellPhoneNumber);
    }
    @Then("Method must returns {string}")
    public void method_must_returns(String expectedResult) {
        Assert.assertEquals(String.valueOf(actualResult),expectedResult);
    }

}
