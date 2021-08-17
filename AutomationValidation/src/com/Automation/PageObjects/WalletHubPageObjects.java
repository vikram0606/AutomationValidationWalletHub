package com.Automation.PageObjects;

import com.Automation.CoreUtilities.CoreUtils;

public class WalletHubPageObjects extends CoreUtils {
	
	public static String DropDown_review_Object = "//span[text()='Select...']";
	public static String Review_Object = "//textarea";
	public static String Submit_object = "//div[contains(.,'Submit')][1]";
	
	
	public static String getReviewStarXpath(String starNum) {
		
		String Xpath = "//h3[contains(.,'Rating')]//following::review-star[1]//child::*[name()='svg']["+starNum+"]";
		return Xpath;
				
	}
	
	public static String getDropDownLiText(String text) {
		
		String Xpath = "//span[text()='Select...']//following::li[text()='"+text+"']";
		return Xpath;
				
	}

}
