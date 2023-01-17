package com.testng.testpackage5_testsWithParallelRun;

import demo.Web;
import org.testng.annotations.Test;

public class ParallelTest1 {

    @Test (testName = "test 1 for parallel run")
    public void parallelTest1(){
        Web.runUI("https://www.google.com/");
    }

    @Test (testName = "test 2 for parallel run")
    public void parallelTest2(){
        Web.runUI("https://www.youtube.com/");
    }

    @Test (testName = "test 3 for parallel run")
    public void parallelTest3(){
        Web.runUI("https://www.facebook.com/");
    }

}
