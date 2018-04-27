package bigbasket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BeveragePage {
	//Declaration
		//@FindBy (xpath="(//div[@class='col-sm-12 col-xs-5 prod-view ng-scope']/..)[1]//button[.='Add ']")
		@FindBy(xpath="(//button[@class='btn btn-add col-xs-9'])[1]")
		private WebElement addBTN;
		
		//Initialization
			public BeveragePage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
		//Utilization
			public void add(WebDriver driver) //throws InterruptedException
			{
				Actions act=new Actions(driver);
				act.moveToElement(addBTN).click().perform();
				//addBTN.click();
				//Thread.sleep(2000);
			}

}
