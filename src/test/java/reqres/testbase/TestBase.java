package reqres.testbase;


import io.restassured.RestAssured;
import org.junit.BeforeClass;
import reqres.constants.Path;
import reqres.utils.PropertyReader;


public class TestBase {
    public static PropertyReader propertyReader;

    @BeforeClass
    public static void init() {
        propertyReader = PropertyReader.getInstance();
        RestAssured.baseURI = propertyReader.getProperty("baseUrl");
        RestAssured.basePath = Path.USERS;

        //RestAssured.port = Integer.parseInt(propertyReader.getProperty("port"));
    }

}
