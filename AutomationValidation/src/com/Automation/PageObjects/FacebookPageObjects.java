package com.Automation.PageObjects;

import com.Automation.CoreUtilities.CoreUtils;

public class FacebookPageObjects extends CoreUtils {
	
	public static String fb_Email_object = "//input[@id='email']";
	public static String fb_Password_object = "//input[@id='pass']";
	public static String fb_Login_object = "//button[@name='login']";
	public static String fb_add_symbol = "//div[@aria-label='Menu']//i";
	public static String fb_add_post = "//span[text()='Post']";
	public static String fb_text_placeholder = "//div[contains(@id,'placeholder')]//following::div[@role='textbox']";
	public static String fb_post_button = "//div[@aria-label='Post']//span[text()='Post']"; 
	

}
