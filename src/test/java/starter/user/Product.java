package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Product {

    protected static String url = "https://altashop-api.fly.dev/api/";
    protected String bearerToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkpvaG4gRG9lIiwiRW1haWwiOiJzb21lb25lQG1haWwuY29tIn0.WvBSxcQEqqniC1v08LzkrHcELegs0b7vtjGPWiaEWcI";

    @Step("I set GET api endpoints")
    public String setGETAPIEnpoint() {
        return url + "products";
    }
    @Step("I send GET HTTP request Product")
    public void sendGETHTTPRequestProduct() {
        SerenityRest.given().get(setGETAPIEnpoint());
    }
    @Step("I receive valid HTTP response code 200 Product")
    public void receiveValidHTTPResponeCode200Product() {
        restAssuredThat(response -> response.statusCode(200));
    }


    @Step("I am set POST api endpoint create product")
    public String IamSetGETAPIEnpointCreateProduct() {
        return url + "products";
    }
    @Step("I am send POST HTTP request")
    public void IamSendPOSTHTTPRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Sony PS5");
        requestBody.put("description", "play has no limits");
        requestBody.put("price", 299);

        SerenityRest.given().header("Content-Type", "application/json").header("Authorization", "Bearer " + bearerToken).body(requestBody.toJSONString()).post(IamSetGETAPIEnpointCreateProduct());
    }
    @Step("I receive valid data post")
    public void receiveValidDataPost() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set DELETE api endpoint")
    public String setDELETEAPIEndpoint() {
        return url + "products/1";
    }
    @Step("I send DELETE HTTP request")
    public void sendDELETEHTTPRequest() {
        SerenityRest.given().delete(setDELETEAPIEndpoint());
    }
    @Step("I receive valid HTTP response code 200 delete")
    public void receiveValidHTTPResponeCodeDelete() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
