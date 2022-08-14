package kiteBASE;

import java.io.IOException;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;


import kiteUTILITY.UtilityNew;

public class BaseNew 
{
protected WebDriver driver;
public void openApplication() throws IOException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Evening Batch\\Selenium\\chromedriver.exe ");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get(UtilityNew.readDataFromPropertyFile("URL"));
Reporter.log("launching Kite APP",true);
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
}

}



