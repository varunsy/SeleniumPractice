package bigbasket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//Declaration
	@FindBy (xpath="(//img[@class='img-responsive'])[22]")
	private WebElement newlaunchesTB;
	
	//Initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
    //Utilization
	public void launch()
	{
	   newlaunchesTB.click();
	}
}
