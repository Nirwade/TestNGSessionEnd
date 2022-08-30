package Pages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import testcases1.BaseClass1;


public class LoginPage1 {
	
		WebDriver driver = BaseClass1.driver ;
		ExtentTest test = BaseClass1.test;
		
//=========================================== WebElements ==============================================================
		
		@FindBy(name="user-name")
		WebElement Username;
		
		@FindBy(id="password")
		WebElement Password;
		
		@FindBy(id="login-button")
		WebElement Loginlink;
			
		
		public LoginPage1 () {
			PageFactory.initElements(driver, this);
		}
		
//=========================================== Functions ========================================================================	
		
		public void loginFunction (String Usernameval1, String passwordval1) {
			
			WebDriverWait wait= new WebDriverWait(driver,5000);   //add WebDriver driver = BaseClass.driver inside the LoginPage class and 
			                                                    //we can avoid creating separate obj for individual tests

             wait.until(ExpectedConditions.elementToBeClickable(Loginlink));
			 
			 Loginlink.click();
		test.log(LogStatus.PASS, "Loginlink clicked successfully");
		 Username.sendKeys(Usernameval1);
		 test.log(LogStatus.PASS, "Click on Username, username clicked successfully");
		 Password.sendKeys(passwordval1);
		 test.log(LogStatus.PASS, "Click on password, password clicked successfully");
				
		}
		
		 public void UICheck () {
				
				Assert.assertTrue(Username.isDisplayed());
			}
		
		
	}


