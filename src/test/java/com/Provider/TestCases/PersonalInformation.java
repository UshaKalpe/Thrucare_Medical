package com.Provider.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.GenericMethod;
import Base.Xpath;
import config.Properties.propertiesfile;

public class PersonalInformation {
	@Test
	public static void AddSignature() throws IOException, InterruptedException 
	{
		GenericMethod.openBrowser(propertiesfile.propertyfile("browser"));
		Thread.sleep(4000);
		GenericMethod.open_url(propertiesfile.propertyfile("url"));
		Thread.sleep(4000);
		GenericMethod.click_SinginSingup(Xpath.Singin_Signup_button);
		Thread.sleep(4000);
		GenericMethod.click_Select_button_On_Provider(Xpath.Select_button_On_provider);
		Thread.sleep(4000);
		GenericMethod.Enter_username_Provider(Xpath.provider_username, propertiesfile.propertyfile("providerusername"));
		Thread.sleep(4000);
		GenericMethod.Enter_password_Provider(Xpath.provider_password, propertiesfile.propertyfile("password"));
		Thread.sleep(4000);
		GenericMethod.ClickOn_Submit_button(Xpath.submitButton);
		Thread.sleep(4000);
		GenericMethod.ViewProfileButton(Xpath.ViewProfileButton);
		Thread.sleep(4000);
		GenericMethod.PersonalInfoGuide(Xpath.PersonalInfoGuide);
		Thread.sleep(4000);
		GenericMethod.AddSignature(Xpath.AddSignature);
		//GenericMethod.tearDown();
		
		
	}

}
