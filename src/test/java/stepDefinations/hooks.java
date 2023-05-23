package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
    @Before ("@MobileTest")
    public void beforevalidation(){

        System.out.println("Mobile before hook");
    }
    @After("@MobileTest")
    public void aftervalidation(){

        System.out.println("Mobile After hook");
    }
}
