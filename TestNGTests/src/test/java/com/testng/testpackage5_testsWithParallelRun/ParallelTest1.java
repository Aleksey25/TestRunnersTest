package com.testng.testpackage5_testsWithParallelRun;

import demo.Tests;
import org.testng.annotations.Test;

public class ParallelTest1 {

    @Test (testName = "test 1 for parallel run")
    public void parallelTest1(){
        Tests.longTestMethod("1 for parallel run (class 1)");
    }

    @Test (testName = "test 2 for parallel run")
    public void parallelTest2(){
        Tests.longTestMethod("2 for parallel run (class 1)");
    }

    @Test (testName = "test 3 for parallel run")
    public void parallelTest3(){
        Tests.longTestMethod("3 for parallel run (class 1)");
    }

}
