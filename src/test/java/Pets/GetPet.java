package Pets;

import io.restassured.response.Response;
import org.junit.Assert;

import java.math.BigDecimal;

import static io.restassured.RestAssured.when;
import static io.restassured.http.ContentType.JSON;

public class GetPet {

    public static void perform(final Long petId){
        Response response =
                when().
                        get("/" + petId).
                        then().
                        log().all().
                        contentType(JSON).
                        extract().
                        response();
        Assert.assertEquals(200, response.statusCode());
    }


    public static int getPetsByStatus(final BigDecimal petId){
        Response response =
                when().
                        get("/" + petId).
                        then().
                        contentType(JSON).
                        extract().
                        response();

        return response.statusCode();
    }


}
