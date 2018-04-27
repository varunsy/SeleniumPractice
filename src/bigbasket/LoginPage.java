package bigbasket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Declaration
		@FindBy (name="username")
		private WebElement emailTB;
		
		@FindBy (id="password")
		private WebElement passwordTB;
		
		@FindBy (name="Submit")
		private WebElement loginBTN;
		
		//initialization
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
	
		//Utilization
		public void enterEmail()
		{
			emailTB.sendKeys("shweta19.meti@gmail.com");
	
        	passwordTB.sendKeys("7259967607");
        
        	loginBTN.click();
        }
}
