package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Authentication {

    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set POST api endpoints Login")
    public String setPOSTAPIEndpointLogin() {
        return url + "auth/login";
    }
    @Step("I send POST HTTP request login")
    public void sendPostHttpRequestLogin() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "someone@mail.com");
        requestBody.put("password", "123123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPOSTAPIEndpointLogin());
    }
    @Step("I receive valid HTTP response code 200 to login")
    public void receiveValidHTTPResponseCode200Login() {
        restAssuredThat(response -> response.statusCode(200));
    }
}

