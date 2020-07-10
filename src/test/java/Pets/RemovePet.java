package Pets;

import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.when;
import static io.restassured.http.ContentType.JSON;

public class RemovePet {

    public static void removePet(final Long petId) {
        Response response =
                when().
                        delete("/" + petId).
                        then().
                        contentType(JSON).
                        extract().
                        response();
        Assert.assertEquals(response.statusCode(), 200);
    }
}
