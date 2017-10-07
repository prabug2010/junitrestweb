package com.prabu.maven.junitrestweb;

import io.restassured.config.LogConfig;

import static io.restassured.RestAssured.get;
import static org.hamcrest.CoreMatchers.equalTo;
import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.RestAssured;

public class EmployeeRestTest {
    @BeforeClass
    public static void init() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8080;
    }
    @Test
    public void testUserFetchesSuccess() {
        get("/junitrestweb/webapi/employee/12")
        .then()
        .body("empId", equalTo(125472))
        .body("name", equalTo("Prabu"))
        .body("designation", equalTo("System Analyst"))
        .body("department", equalTo("DB"))
        .body("salary", equalTo(50000));
    }
}

