package StepDefinations;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import PageObjects.MercurySteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;


public class GmailStepdefinations {
	public WebDriver driver;

public MercurySteps ml =new MercurySteps(driver);
   
@Given("^initialize browser$")
public void initialize_browser() throws Throwable {
   System.out.println("hi");
}

@When("^user login$")
public void user_login() throws Throwable {
   System.out.println("hi1");
}

@Then("^successful login operation$")
public void successful_login_operation() throws Throwable {
   System.out.println("hi2");
}
/*

	
	@Given("^initialize browser$")
    public void initialize_browser() throws Throwable {
   
   	WebDriverManager.firefoxdriver().setup();
    driver=new FirefoxDriver();
    driver.get("https://demo.guru99.com/test/newtours/");
     
    }
    
   @When("^user login$")
    public void user_login() throws Throwable {
    	ml.username("sushma");
    	ml.password("1234");
    	ml.submit();
    	
    }

   @Then("^successful login operation$")
    public void successful_login_operation() throws Throwable {
    	if(driver.getTitle().equals("Find aflight:Mercury Tours")) {
    		Reporter.log("successful login operatio",true);
    	}
    	else {
    		Reporter.log("unsuccessful login operation",true);
    	}
        

}*/
}
