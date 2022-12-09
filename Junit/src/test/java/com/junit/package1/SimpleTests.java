package com.junit.package1;

import org.junit.jupiter.api.*;

import static demo.Test.simple;

public class SimpleTests {

    @BeforeAll
    public static void beforeAll(){
        simple("beforeAll");
    }

    @AfterAll
    public static void afterAll(){
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
    public void RunTest1(){
        simple("тест 1");
    }

    @Test
    public void RunTest2(){
        simple("тест 2");
    }
}
