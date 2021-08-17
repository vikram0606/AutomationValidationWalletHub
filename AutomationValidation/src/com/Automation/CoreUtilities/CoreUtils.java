package com.Automation.CoreUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CoreUtils {
	WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--disable-notifications"));
	WebDriverWait wait = new WebDriverWait(driver,30);

	
	
	
	public void chromeDrivers() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
	}

	public String readPropertiersFile(String FieldName) throws IOException {
		 InputStream input = new FileInputStream(System.getProperty("user.dir")+"/Resources/Application.properties");
         Properties prop = new Properties();
         prop.load(input);         
         String value = prop.getProperty(FieldName);
         return value;
	}
	
	public void launchApplication() throws IOException{
		driver.get((readPropertiersFile(readPropertiersFile("Application"))));
		driver.manage().window().maximize();
		
	}
	
	public void click_it(String Xpath) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath)));
		driver.findElement(By.xpath(Xpath)).click();		
	}
	
	public void Type_Text(String Xpath, String Text) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath)));
		driver.findElement(By.xpath(Xpath)).sendKeys(Text);		
	}
	
	public void SelectText(String Text, String Xpath) {
		WebElement mainMenu = driver.findElement(By.xpath(Xpath));
		Select sec = new Select(mainMenu);
		
		sec.selectByVisibleText(Text);
		
	}
	
	public String caesarCipherDecrypte(String secret) {
		   StringBuilder tmp = new StringBuilder();
		   final int OFFSET = 4;
		   for (int i = 0; i < secret.length(); i++) {
		      tmp.append((char)(secret.charAt(i) - OFFSET));
		   }

		   String reversed = new StringBuffer(tmp.toString()).reverse().toString();
		   return new String(Base64.getDecoder().decode(reversed));
		}
	
	public void Mouse_hover(String Xpath) {
		Actions actions = new Actions(driver);
		WebElement mainMenu = driver.findElement(By.xpath(Xpath));
		actions.moveToElement(mainMenu).perform();		
//		actions.click().build().perform();
	}
	
	public void Action_Move_to_Click(String Xpath) {
		driver.findElement(By.cssSelector("input.btn")).click();	
		
	}
	
	public void closeWebBrowser() {
		driver.close();
	}
	
}
