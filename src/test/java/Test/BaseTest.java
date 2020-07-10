package Test;

import Utils.PropertyReader;
import io.restassured.RestAssured;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;

public class BaseTest {

    protected static final Logger LOG = LogManager.getLogger(PropertyReader.class);

    @Before
    public void apiSetup(){
        RestAssured.baseURI = PropertyReader.getPropertyData("baseURI");
        RestAssured.basePath = PropertyReader.getPropertyData("basePath");
    }
}
