package com.Automation.ActionClass;

import java.io.IOException;

import com.Automation.PageObjects.WalletHubPageObjects;

public class WalletHubActionClass extends WalletHubPageObjects {
	
	public void launchWalletHubPageandPost() throws IOException, InterruptedException {		
		launchApplication();  
		for(int i=1;i<4;i++) {
		Mouse_hover(getReviewStarXpath(String.valueOf(i)));
		}
		click_it(getReviewStarXpath("4"));
		
		click_it(DropDown_review_Object);
		click_it(getDropDownLiText("Health Insurance"));
		
		Type_Text(Review_Object, "sdlkaasdadasdakjdakjsd;akjd;lakjd;alkklajdoaiwdj;ajid;aijdi;ajd;aijd;aijd;ajdi;aoijd;awidj;aoidja;oidja;oidwj;aoiwdj;aoidja;oiwdja;wiodj;aowidj;awoidja;wodija;wiodj");
		
		Action_Move_to_Click(Submit_object);
		
		closeWebBrowser();
	}

}
