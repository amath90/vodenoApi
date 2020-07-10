package Pets;

import Pets.petbody.PetBody;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class AddPet {

    public static Long perform(PetBody example) {

        Response response =
                given()
                        .contentType("application/json")
                        .body(example).
                        when().
                        log().all().
                        post().
                        then().
                        log().all().
                        contentType(JSON).
                        extract().
                        response();
        Assert.assertEquals(200, response.statusCode());
        return new JsonPath(response.asString()).getLong("id");
    }
}
