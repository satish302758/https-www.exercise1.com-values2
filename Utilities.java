package main.java.util;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utilities {

	String ChromeDriverLocn = System.getProperty("user.dir")+"\\driver\\chromedriver.exe";
	public WebDriver driver;
	
	public Properties readPropertiesFile(String fileName) throws Exception {
	      FileInputStream fis = null;
	      Properties prop = null;
	      try {
	         fis = new FileInputStream(fileName);
	         prop = new Properties();
	         prop.load(fis);
	      } catch(Exception e) {
	         e.printStackTrace();
	      }  finally {
	         fis.close();
	      }
	      return prop;
	   }
	
	public void loadChromeBrowserNavigateUrl() {
		
		System.setProperty("webdriver.chrome.driver", "ChromeDriverLocn");  
		driver=new ChromeDriver(); 
		driver.navigate().to("DemoProjectName");
		driver.manage().window().maximize();
		driver.findElement(By.id("Locator")).sendKeys("userName");
		driver.findElement(By.id("Locator")).sendKeys("Password");
				
	}
}
