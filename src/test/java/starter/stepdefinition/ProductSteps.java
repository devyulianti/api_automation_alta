package starter.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Product;

public class ProductSteps {

    @Steps
    Product product;

    @Given("I set GET api endpoints")
    public void setGETAPIEnpoint() {
        product.setGETAPIEnpoint();
    }
    @When("I send GET HTTP request Product")
    public void sendGETHTTPRequestProduct() {
        product.sendGETHTTPRequestProduct();
    }
    @Then("I receive valid HTTP response code 200 Product")
    public void receiveValidHTTPResponeCode200Product() {
        product.receiveValidHTTPResponeCode200Product();
    }


    @Given("I am set POST api endpoint create product")
    public void IamSetPOSTAPIEnpointCreateProduct() {
        product.IamSetGETAPIEnpointCreateProduct();
    }
    @When("I am send POST HTTP request")
    public void IamSendPOSTHTTPRequest() {
        product.IamSendPOSTHTTPRequest();
    }
    @Then("I receive valid data post")
    public void receiveValidDataPost() {
        product.receiveValidDataPost();
    }


    @Given("I set DELETE api endpoint")
    public void setDELETEAPIEndpoint() {
        product.setDELETEAPIEndpoint();
    }
    @When("I send DELETE HTTP request")
    public void sendDELETEHTTPRequest() {
        product.sendDELETEHTTPRequest();
    }
    @Then("I receive valid HTTP response code 200 delete")
    public void receiveValidHTTPResponeCodeDelete() {
        product.receiveValidHTTPResponeCodeDelete();
    }
}
