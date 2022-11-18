package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\91863\\eclipse-workspace\\CucumberDemo3\\Features\\login.feature", 
glue = "C:\\Users\\91863\\eclipse-workspace\\CucumberProject\\src\\test\\java\\StepDefinations", 
plugin= {"pretty","html:test-output"},
monochrome = true)

public class Testrunner {

}
