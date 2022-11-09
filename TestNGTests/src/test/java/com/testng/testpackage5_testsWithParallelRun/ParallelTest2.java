package com.testng.testpackage5_testsWithParallelRun;

import demo.Tests;
import org.testng.annotations.Test;

public class ParallelTest2 {
    @Test(testName = "test 1 for parallel run")
    public void parallelTest1(){
        Tests.longTestMethod("1 for parallel run (class 2)");
    }

    @Test(testName = "test 2 for parallel run")
    public void parallelTest2(){
        Tests.longTestMethod("2 for parallel run (class 2)");
    }

    @Test(testName = "test 3 for parallel run")
    public void parallelTest3(){
        Tests.longTestMethod("3 for parallel run (class 2)");
    }

    @Test(testName = "test 4 for parallel run")
    public void parallelTest4(){
        Tests.longTestMethod("4 for parallel run (class 2)");
    }

    @Test(testName = "test 5 for parallel run")
    public void parallelTest5(){
        Tests.longTestMethod("5 for parallel run (class 2)");
    }
}
