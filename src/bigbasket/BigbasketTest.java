package bigbasket;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BigbasketTest {
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bigbasket.com/auth/login/?nc=nb");
		

		LoginPage lp=new LoginPage(driver);
		lp.enterEmail();
		
		HomePage hp=new HomePage(driver);
		hp.launch();
		
		NewlaunchPage np=new NewlaunchPage(driver);
		np.beverage();
		Thread.sleep(2000);
		
		BeveragePage bp=new BeveragePage(driver);
		bp.add(driver);
		
	}


}
