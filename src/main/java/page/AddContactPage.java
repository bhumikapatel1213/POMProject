package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class AddContactPage extends BasePage {
	WebDriver driver;
	 public AddContactPage(WebDriver driver){
		 this.driver = driver;
	 }

	 @FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")WebElement fullNameElement;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")WebElement companyElement;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")WebElement emailElement;
	 
	 public void insertFullName(String fullName) {
		 fullNameElement.sendKeys(fullName + generateRandomNum(999));;
	 }
	 public void selectCompany(String company) {
		 selectFromDropDown(companyElement, company);
	 }
	 public void insertEmail(String email) {
		 emailElement.sendKeys(generateRandomNum(999) + email);;
	 }
}
