package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	
	WebDriver driver;
	String userName = "demo@techfios.com";
	String password = "abc123";
	String DashboardValidationText= "Dashboard";
	
	@Test
	public void validUserShouldAbleToLogin()
	{
		driver = BrowserFactory.init();
		
		LoginPage LogInPage = PageFactory.initElements(driver, LoginPage.class);
		
		LogInPage.insertUserName(userName);
		LogInPage.insertPassword(password);
		LogInPage.clickSignInButton();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPage(DashboardValidationText);
		
		BrowserFactory.tearDown();
	}

}
