package com.junit.package1;

import org.junit.jupiter.api.*;

import static demo.Test.simple;

@DisplayName("NamedClass")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SimpleTests2 {

    @BeforeAll
    public void beforeAll(){
        simple("beforeAll");
    }

    @AfterAll
    public void afterAll(){
        simple("afterAll");
    }


    @BeforeEach
    public void beforeEach(){
        simple("beforeEach");
    }

    @AfterEach
    public void afterEach(){
        simple("afterEach");
    }



    @Test
    @DisplayName("Test 1")
    @Order(2)
    public void RunTest1(){
        simple("тест 1");
    }

    @Test
    @DisplayName("Test 2")
    @Order(1)
    public void RunTest2(){
        simple("тест 2");
    }
}
