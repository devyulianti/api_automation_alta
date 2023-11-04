package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Category;

public class CategorySteps {

    @Steps
    Category category;

    @Given("I set POST endpoints new categories")
    public void setPOSTEndpointNewCategories() {
        category.setPOSTEndpointNewCategories();
    }
    @When("I send POST HTTP request new categories")
    public void sendPOSTHTTPRequestNewCategories() {
        category.sendPOSTHTTPRequestNewCategories();
    }
    @And("I receive valid HTTP response code 200 new categories")
    public void receiveValidHTTPResponeCode200NewCategories() {
        category.receiveValidHTTPResponeCode200NewCategories();
    }
    @Then("I receive valid data new categories")
    public void receiveValidDataNewCategories() {
        category.receiveValidDataNewCategories();
    }


    @Given("I set GET endpoints all categories")
    public void setGETEndpointAllCategories() {
        category.setGETEndpointAllCategories();
    }
    @When("I send GET HTTP request all categories")
    public void sendGETHTTPRequestAllCategories() {
        category.sendGETHTTPRequestAllCategories();
    }
    @Then("I receive valid HTTP response code 200 all categories")
    public void receiveValidHTTPResponeCode200AllCategories() {
        category.receiveValidHTTPResponeCode200AllCategories();
    }


    @Given("I set DELETE endpoints delete categories")
    public void setDELETEEndpointDeleteCategories() {
        category.setDELETEEndpointDeleteCategories();
    }
    @When("I send DELETE HTTP request delete categories")
    public void sendDELETEHTTPRequestDeleteCategories() {
        category.sendDELETEHTTPRequestDeleteCategories();
    }
    @Then("I receive valid HTTP response code 200 delete categories")
    public void receiveValidHTTPResponeCode200DeleteCategories() {
        category.receiveValidHTTPResponeCode200DeleteCategories();
    }
}
