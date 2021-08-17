package com.Automation.Runner;

import java.io.IOException;

import com.Automation.ActionClass.FacebookActionClass;
import com.Automation.ActionClass.WalletHubActionClass;

public class RunnerClass {

	public static void main(String[] args) throws IOException, InterruptedException {

//		FacebookActionClass fac = new FacebookActionClass();
		WalletHubActionClass wac = new WalletHubActionClass();
		
//		fac.launchFacebookPageandPost();
		
		wac.launchWalletHubPageandPost();
		

	}

}
