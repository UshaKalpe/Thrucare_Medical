package Base;

public class Xpath {

	
	/*============================================Home page=======================================================*/
	public static String Singin_Signup_button="//a[normalize-space()='Sign-in/Sign-up']";
	/*============================================Select button for Provider =======================================================*/
	public static String Select_button_On_provider="//div[2]//div[1]//div[3]//button[1]";
	
	/*=======================================Login Page============================================================*/
	public static String provider_username="//div[contains(@class,'panel-left-border')]//div//div//form[@name='cognitoSignInForm']//div//input[@id='signInFormUsername']";
	
	public static String provider_password="//div[contains(@class,'panel-left')]//div//div//form[@name='cognitoSignInForm']//div//input[@id='signInFormPassword']";

	public static String submitButton="//div[contains(@class,'panel-left-border')]//div//div//form[@name='cognitoSignInForm']//input[@name='signInSubmitButton']";

	public static String loginsuccess_Dashboard="//div[@class='btn component-title']//span";
	/*==============================Login Page -Invalid Credentials=================================*/
	public static String loginErrormsg="//div[contains(@class,'panel-left')]//div//div//form[@name='cognitoSignInForm']//p[@id='loginErrorMessage']";
	
	
	/*=================================Forgot Password======================================*/
	public static String ForgotPassword="//div[contains(@class,'panel-left-border')]//div//div//form[@name='cognitoSignInForm']//div//a[@class='redirect-customizable'][normalize-space()='Forgot your password?']";
		
	public static String forgotpasswordpopup="//div[@class='modal-dialog']//div//div/h1";
	
	public static String Resetpassword_username="//div[@class='modal-dialog']//div//div//form//input[@id='username']";
	
	public static String ResetMyPasswordButton="//div[@class='modal-dialog']//div//div//form//button[@type='submit']";
	
	
	/*=================================Provider Dashboard=============================*/
	public static String profileStatusLable="";
	
	public static String ViewProfileButton="//span[normalize-space()='View Profile']";
	
	/*===========================Personal Information==============================*/
	public static String PersonalInfoGuide="//div//ul[@class='wizard-progressbar']//li[2]";
	public static String AddSignature="//canvas[@class='sigCanvas']";
}

	