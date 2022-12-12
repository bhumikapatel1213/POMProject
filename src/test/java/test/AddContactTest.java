package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddContactPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

//Run
public class AddContactTest {
	WebDriver driver;
	String userName = "demo@techfios.com";
	String password = "abc123";
	String DashboardValidationText= "Dashboard";
	String fullName = "John";
	String company = "Techfios";
	String email = "abc@techfios.com";
	
	@Test
//	Run | Debug
	public void UserShouldAbleToAddCustomer()
	{
		driver = BrowserFactory.init();
		
		LoginPage LogInPage = PageFactory.initElements(driver, LoginPage.class);
		
		LogInPage.insertUserName(userName);
		LogInPage.insertPassword(password);
		LogInPage.clickSignInButton();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPage(DashboardValidationText);
		dashboardPage.clickCustomerbutton();
		dashboardPage.clickAddCustomerButton();
		
		AddContactPage addContactPage = PageFactory.initElements(driver, AddContactPage.class);
		addContactPage.insertFullName(fullName);
		addContactPage.selectCompany(company);
		addContactPage.insertEmail(email);
	}
}
