package com.testng.tetspackage4_testsWithParams;

import demo.Tests;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestsWithParams {

    @Parameters({"x", "a", "b"})
    @Test(testName = "Тест с параметрами сьюта и теста")
    public void TestWithSuiteParam(String x, String a , String b){
        Tests.testMethod("с параметром сьюта " + x + " с параметрами теста " + a + "/" + b);
    }
}
