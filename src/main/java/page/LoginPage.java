package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	 WebDriver driver;
	 public LoginPage(WebDriver driver){
		 this.driver = driver;
	 }
	 
	//WebElement userNameElement = driver.findElement(By.xpath("//input [@id = 'username']"));
	//By userNameField = By.xpath("//input [@id = 'username']");
	 
	 //Page Object model uses annotation @FindBy
	 @FindBy(how = How.XPATH, using = "//input [@id = 'username']") WebElement userNameElement;
	 @FindBy(how = How.XPATH, using = "//input [@id = 'password']") WebElement passwordElement;
	 @FindBy(how = How.XPATH, using = "//button[@type = 'submit']") WebElement signInButton;
	 
	 //Corresponding Elements
	 public void insertUserName(String userName) {
		 userNameElement.sendKeys(userName);
	 }
	 public void insertPassword(String password) {
		 passwordElement.sendKeys(password);
	 }
	 public void clickSignInButton() {
		 signInButton.click();
	 }
}
