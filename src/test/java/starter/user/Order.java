package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Order {
    protected static String url = "https://altashop-api.fly.dev/api/";
    protected String bearerToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkpvaG4gRG9lIiwiRW1haWwiOiJzb21lb25lQG1haWwuY29tIn0.WvBSxcQEqqniC1v08LzkrHcELegs0b7vtjGPWiaEWcI";


    @Step("I set GET api endpoints get all order")
    public String setGETAPIEndpointsGetAllOrder() {
        return url + "orders";
    }
    @Step("I send GET HTTP request get all order")
    public void sendGETHTTPRequestAllOrder() {
        SerenityRest.given().header("Authorization", "Bearer " + bearerToken).get(setGETAPIEndpointsGetAllOrder());
    }
    @Step("I receive valid HTTP response code 200 get all order")
    public void receiveValidHTTPResponseCode200GetAllOrder() {
        restAssuredThat(response -> response.statusCode(200));
    }


    @Step("I set GET api endpoints to get order by ID")
    public String setGETAPIEndpointsToGetOrderByID() {
        return url + "orders/1";
    }
    @Step("I send GET HTTP request to get order by ID")
    public void sendGETHTTPRequestToGetOrderByID() {
        SerenityRest.given().header("Authorization", "Bearer " + bearerToken).get(setGETAPIEndpointsToGetOrderByID());
    }
    @Step("I receive valid data order")
    public void receiveValidDataOrder() {

    }
}
