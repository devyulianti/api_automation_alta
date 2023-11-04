package starter.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Order;

public class OrderSteps {

    @Steps
    Order order;

    @Given("I set GET api endpoints get all order")
    public void setGETAPIEndpointsGetAllOrder() {
        order.setGETAPIEndpointsGetAllOrder();
    }
    @When("I send GET HTTP request get all order")
    public void sendGETHTTPRequestAllOrder() {
        order.sendGETHTTPRequestAllOrder();
    }
    @Then("I receive valid HTTP response code 200 get all order")
    public void receiveValidHTTPResponseCode200GetAllOrder() {
        order.receiveValidHTTPResponseCode200GetAllOrder();
    }


    @Given("I set GET api endpoints to get order by ID")
    public void setGETAPIEndpointsToGetOrderByID() {
        order.setGETAPIEndpointsToGetOrderByID();
    }
    @When("I send GET HTTP request to get order by ID")
    public void sendGETHTTPRequestToGetOrderByID() {
        order.sendGETHTTPRequestToGetOrderByID();
    }
    @Then("I receive valid data order")
    public void receiveValidDataOrder() {
        order.receiveValidDataOrder();
    }
}
