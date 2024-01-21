package com.Provider.TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import Base.GenericMethod;
import Base.Xpath;
import config.Properties.propertiesfile;

public class provider_Login {
	@Test(priority=1)
	public static void LoginWithValidCredentials() throws IOException, InterruptedException
	{
		GenericMethod.openBrowser(propertiesfile.propertyfile("browser"));
		
		GenericMethod.open_url(propertiesfile.propertyfile("url"));
					
		Thread.sleep(4000);
			
		GenericMethod.click_SinginSingup(Xpath.Singin_Signup_button);	
		Thread.sleep(4000);
		
		GenericMethod.click_Select_button_On_Provider(Xpath.Select_button_On_provider);
			
		Thread.sleep(4000);
		
		GenericMethod.Enter_username_Provider(Xpath.provider_username,propertiesfile.propertyfile("providerusername"));
		Thread.sleep(4000);
		GenericMethod.Enter_password_Provider(Xpath.provider_password, propertiesfile.propertyfile("password"));
		Thread.sleep(4000);
		GenericMethod.ClickOn_Submit_button(Xpath.submitButton);
		Thread.sleep(4000);
		GenericMethod.tearDown();
	}
		@Test(priority=2)
		public static void LoginSuccessful_Dashboard() throws IOException, InterruptedException
		{
			GenericMethod.openBrowser(propertiesfile.propertyfile("browser"));
			
			GenericMethod.open_url(propertiesfile.propertyfile("url"));
						
			Thread.sleep(4000);
				
			GenericMethod.click_SinginSingup(Xpath.Singin_Signup_button);	
			Thread.sleep(4000);
			
			GenericMethod.click_Select_button_On_Provider(Xpath.Select_button_On_provider);
				
			Thread.sleep(4000);
			
			GenericMethod.Enter_username_Provider(Xpath.provider_username,propertiesfile.propertyfile("providerusername"));
			Thread.sleep(4000);
			GenericMethod.Enter_password_Provider(Xpath.provider_password, propertiesfile.propertyfile("password"));
			Thread.sleep(4000);
			GenericMethod.ClickOn_Submit_button(Xpath.submitButton);
			Thread.sleep(4000);
			GenericMethod.Loginsuccess_Dashboard(Xpath.loginsuccess_Dashboard);
			GenericMethod.tearDown();
	}
	@Test(priority=3)
	public static void LoginWithInvalidCredentials() throws IOException, InterruptedException
	{
		GenericMethod.openBrowser(propertiesfile.propertyfile("browser"));
		
		GenericMethod.open_url(propertiesfile.propertyfile("url"));
					
		Thread.sleep(4000);
			
		GenericMethod.click_SinginSingup(Xpath.Singin_Signup_button);	
		Thread.sleep(4000);
		
		GenericMethod.click_Select_button_On_Provider(Xpath.Select_button_On_provider);
			
		Thread.sleep(4000);
		
		GenericMethod.Enter_username_Provider(Xpath.provider_username,propertiesfile.propertyfile("Invalidproviderusername"));
		Thread.sleep(4000);
		GenericMethod.Enter_password_Provider(Xpath.provider_password, propertiesfile.propertyfile("Invalidpassword"));
		Thread.sleep(4000);
		GenericMethod.ClickOn_Submit_button(Xpath.submitButton);
		Thread.sleep(4000);
		GenericMethod.tearDown();
	}
	@Test(priority=4)
	public static void VerifyErrorMessage() throws IOException, InterruptedException
	{
		GenericMethod.openBrowser(propertiesfile.propertyfile("browser"));
		
		GenericMethod.open_url(propertiesfile.propertyfile("url"));
		Thread.sleep(4000);
		GenericMethod.click_SinginSingup(Xpath.Singin_Signup_button);	
		Thread.sleep(4000);
		GenericMethod.click_Select_button_On_Provider(Xpath.Select_button_On_provider);
		Thread.sleep(4000);
		GenericMethod.Enter_username_Provider(Xpath.provider_username,propertiesfile.propertyfile("Invalidproviderusername"));
		Thread.sleep(4000);
		GenericMethod.Enter_password_Provider(Xpath.provider_password, propertiesfile.propertyfile("Invalidpassword"));
		Thread.sleep(4000);
		GenericMethod.ClickOn_Submit_button(Xpath.submitButton);
		Thread.sleep(4000);
		GenericMethod.Verifymessage(Xpath.loginErrormsg);
		Thread.sleep(4000);
		GenericMethod.tearDown();
	}
	
	
	@Test(priority=5)
	public static void ForgotPassowordLink() throws IOException, InterruptedException
	{
		GenericMethod.openBrowser(propertiesfile.propertyfile("browser"));
		
		GenericMethod.open_url(propertiesfile.propertyfile("url"));
		Thread.sleep(4000);
		GenericMethod.click_SinginSingup(Xpath.Singin_Signup_button);	
		Thread.sleep(4000);
		GenericMethod.click_Select_button_On_Provider(Xpath.Select_button_On_provider);
		Thread.sleep(4000);
		GenericMethod.Forgotpassowrd(Xpath.ForgotPassword);
		Thread.sleep(4000);
		GenericMethod.Forgotpassowrdpopup(Xpath.forgotpasswordpopup);
		Thread.sleep(4000);	
		GenericMethod.tearDown();
	}
	@Test(priority=6)
	public static void ForgotPassowordpopup() throws IOException, InterruptedException
	{
		GenericMethod.openBrowser(propertiesfile.propertyfile("browser"));
		
		GenericMethod.open_url(propertiesfile.propertyfile("url"));
		Thread.sleep(4000);
		GenericMethod.click_SinginSingup(Xpath.Singin_Signup_button);	
		Thread.sleep(4000);
		GenericMethod.click_Select_button_On_Provider(Xpath.Select_button_On_provider);
		Thread.sleep(4000);
		GenericMethod.Forgotpassowrd(Xpath.ForgotPassword);
		Thread.sleep(4000);
		GenericMethod.resetpassword_username(Xpath.Resetpassword_username, propertiesfile.propertyfile("providerusername"));
		Thread.sleep(4000);
		GenericMethod.ResetPassowrdButton(Xpath.ResetMyPasswordButton);
		//Thread.sleep(4000);
		GenericMethod.tearDown();
	}

}
