package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {

    @Test
    void shouldReturnBodyResponse() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Значение поля data, возвращаемое в Response")
                .when()
                        .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Значение поля data, возвращаемое в Response"))
        ;
    }
}
