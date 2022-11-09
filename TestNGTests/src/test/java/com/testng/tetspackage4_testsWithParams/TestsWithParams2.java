package com.testng.tetspackage4_testsWithParams;

import demo.Tests;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestsWithParams2 {


    //@Parameters ({"x", "a"})
    @Parameters ({"x"})
    @Test(testName = "Тест с параметром сьюта и без параметров теста")
    public void TestWithSuiteParam(String x){
    //public void TestWithSuiteParam(String x, String a){
        Tests.testMethod("с параметром сьюта " + x);
    }
}
