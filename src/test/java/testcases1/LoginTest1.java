package testcases1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import Pages1.LoginPage1;

public class LoginTest1 extends BaseClass1 {
	
	@Test
	public void loginPasstest () {
		
		
		LoginPage1 page = new LoginPage1 ();
		page.loginFunction("standard_user", "secret_sauce");
		
	}
	
	@Test
	public void LoginFailTest() {
		
		LoginPage1 page = new LoginPage1 ();
        page.loginFunction("shashi0203", "mac@1234");
        
		 WebElement Errmsg = driver.findElement(By.xpath("//h3[@data-test=\"error\"]"));
		 String Actualmsg = Errmsg.getText();
		 String Expectmgs = "Epic sadface: Username is required";
		 Assert.assertEquals(Actualmsg,Expectmgs);
		 
        
	}
	@Test
	 public void ExternalTest () {
		 
		 String Usernameval1 = sheet.getRow(1).getCell(0).getStringCellValue();
		 String passwordval1 = sheet.getRow(1).getCell(1).getStringCellValue();
			LoginPage1 page = new LoginPage1 ();
			page.loginFunction(Usernameval1,passwordval1 );
			
	}
	
	@Test		
	@Parameters({"username", "Password"})
	public void ParameterisedTest1 (String Usernameval1, String passwordval1) {
				
				LoginPage1 page = new LoginPage1 ();
				 page.loginFunction(Usernameval1, passwordval1);
				
	
				
			}

		 
	 }


