package api.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReqResAPITest {

    @Test
    public void validateUserListPage2() {
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");

        Assert.assertEquals(response.getStatusCode(), 200, "Status code should be 200");

        int userCount = response.jsonPath().getList("data").size();
        Assert.assertTrue(userCount > 0, "User list should not be empty");

        String firstEmail = response.jsonPath().getString("data[0].email");
        Assert.assertTrue(firstEmail.contains("@"), "Email should be valid");
    }
}
