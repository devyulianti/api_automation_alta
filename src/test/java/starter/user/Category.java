package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Category {

    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set POST endpoints new categories")
    public String setPOSTEndpointNewCategories() {
        return url + "categories";
    }
    @Step("I send POST HTTP request new categories")
    public void sendPOSTHTTPRequestNewCategories() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "gaming");
        requestBody.put("description", "for gaming purposes");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPOSTEndpointNewCategories());
    }
    @Step("I receive valid HTTP response code 200 new categories")
    public void receiveValidHTTPResponeCode200NewCategories() {
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data new categories")
    public void receiveValidDataNewCategories() {

    }


    @Step("I set GET endpoints all categories")
    public String setGETEndpointAllCategories() {
        return url + "categories";
    }
    @Step("I send GET HTTP request all categories")
    public void sendGETHTTPRequestAllCategories() {
        SerenityRest.given().get(setGETEndpointAllCategories());
    }
    @Step("I receive valid HTTP response code 200 all categories")
    public void receiveValidHTTPResponeCode200AllCategories() {
        restAssuredThat(response -> response.statusCode(200));
    }


    @Step("I set DELETE endpoints delete categories")
    public String setDELETEEndpointDeleteCategories() {
        return url + "categories/1";
    }
    @Step("I send DELETE HTTP request delete categories")
    public void sendDELETEHTTPRequestDeleteCategories() {
        SerenityRest.given().delete(setDELETEEndpointDeleteCategories());
    }
    @Step("I receive valid HTTP response code 200 delete categories")
    public void receiveValidHTTPResponeCode200DeleteCategories() {
        restAssuredThat(response -> response.statusCode(200));
    }

}
