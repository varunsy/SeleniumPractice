package bigbasket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewlaunchPage {
	
	//Declaration
	@FindBy (xpath="(//span[.='Beverages'])[1]")
	private WebElement beverageLink;
	
	//Initialization
		public NewlaunchPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
	//Utilization
		public void beverage()
		{
		   beverageLink.click();
		}
	}

	

