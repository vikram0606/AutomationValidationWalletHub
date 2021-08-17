package com.Automation.ActionClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Automation.PageObjects.FacebookPageObjects;

public class FacebookActionClass extends FacebookPageObjects {
	

	public void launchFacebookPageandPost() throws IOException, InterruptedException {		
		launchApplication();             
		Type_Text(fb_Email_object, readPropertiersFile(caesarCipherDecrypte("fb_email")));
		Type_Text(fb_Password_object, readPropertiersFile(caesarCipherDecrypte("fb_pass")));
		click_it(fb_Login_object);     
		click_it(fb_add_symbol);
		click_it(fb_add_post);    
		Type_Text(fb_text_placeholder, "Automation Test Validation Post");		
		click_it(fb_post_button);                        
		closeWebBrowser();
	}

}
