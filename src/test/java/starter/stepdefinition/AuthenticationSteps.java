package starter.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Authentication;

public class AuthenticationSteps {

    @Steps
    Authentication authentication;

    @Given("I set POST api endpoints Login")
    public void setPOSTAPIEndpointLogin() {
        authentication.setPOSTAPIEndpointLogin();
    }
    @When("I send POST HTTP request Login")
    public void sendPOSTHTTPRequestLogin() {
        authentication.sendPostHttpRequestLogin();
    }
    @Then("I receive valid HTTP response code 200 Login")
    public void receiveValidHTTPResponseCode200Login() {
        authentication.receiveValidHTTPResponseCode200Login();
    }
}
