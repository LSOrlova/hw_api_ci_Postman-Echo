import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

    class postmanEcho {

        @Test
        void shouldTestSomeData() {
            given()
                    .baseUri("https://postman-echo.com")
                    .contentType("text/plain; charset=UTF-8")
                    .body("Good Day")
                    .when()
                    .post("/post")
                    .then()
                    .statusCode(200)
                    .body("data", equalTo("Good Day"))
            ;
        }
}
