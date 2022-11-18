package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MercurySteps {
	WebDriver driver;
	public MercurySteps(WebDriver driver) {
		  this.driver=driver;
	        PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="userName")
	WebElement uname;
	

	@FindBy(name="password")
	WebElement pwd;
	

	@FindBy(name="submit")
	WebElement button;
	
	

	public void username(String usname) {

		uname.sendKeys(usname);
	}
	       
	       public void password(String pname) {

	           pwd.sendKeys(pname);}
	           
	           public void submit() {

	               button.click();
	           }


}
