package kiteUTILITY;

import java.io.File;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class UtilityNew 
{
public static String readDataFromPropertyFile(String key) throws IOException
{
Properties prop= new Properties();// created object of properties class
FileInputStream myFile= new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\9thAprilSelenium\\PropertyFile.properties");
prop.load(myFile);// loaded the file
String value = prop.getProperty(key);
return value;
}
public static void captureScreenShot(WebDriver driver,String TCID) throws IOException
{
File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File dest= new File("C:\\Users\\HP\\\\Java_Selenium\\SnapShot\\TC\"+TCID+\".jpeg");
FileHandler.copy(src, dest);
Reporter.log("Taken SCreenshot",true);
}

}

