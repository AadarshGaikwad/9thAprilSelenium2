package kitePOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
	//1.
		@FindBy(xpath="//span[@class='user-id']")private WebElement uID;
		
		@FindBy(xpath="//a[@target='_self']")private WebElement logoutButton;
		
	//2.
		public KiteHomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
	//3.
		public void valiteUserId(String expectedUID) 
		{
			String actualUserID=uID.getText();
			if(actualUserID.equals(expectedUID))
			{
				System.out.println("Actual and Expected are matching TC is passed");
			}
			else
			{
				System.out.println("Actual and Expected are not  matching TC is failed");
			}
			
		}
		public String getActualUserID()
		{
			String actualUserID=uID.getText();
			return actualUserID;
			
		}
		public void clickOnlogOutButton() throws InterruptedException
		{
			uID.click();
			Thread.sleep(200);
			logoutButton.click();
		}
		

}
