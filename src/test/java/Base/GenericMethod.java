package Base;



public class GenericMethod {
	
	
	/*=====================Browser Open==========*/
	public static void openBrowser(String browser)
	{
		baseMethods.browserselect(browser);
	}
	
	/*===================Open URL======================*/
	public static void open_url(String url) {
		baseMethods.openurl(url);
		
		
	}
	/*========Login for Provider==========*/
	public static void click_SinginSingup(String path)
	{
		baseMethods.clickOnElement(path);
	}
	
	
	public static void click_Select_button_On_Provider(String path)
	{
		baseMethods.clickOnElement(path);
	}
	
	public static void Enter_username_Provider(String xpath,String username)
	{
		
		baseMethods.SendkeyData(xpath,username);
		
	}
	
	public static void Enter_password_Provider(String xpath,String password)
	{
		
		baseMethods.SendkeyData(xpath,password);
		
	}
	public static void ClickOn_Submit_button(String xpath)
	{
		baseMethods.clickOnElement(xpath);
	}
	public static void Loginsuccess_Dashboard(String path)
	{
		baseMethods.LoginAftersucessful(path);
	}	

	public static void Verifymessage(String path)
	{
		baseMethods.Verifyerror_message(path);
	}	
	/*============Forgot Password Link============*/
	public static void Forgotpassowrd(String path)
	{
		baseMethods.clickOnElement(path);
	}
	public static void Forgotpassowrdpopup(String path)
	{
		baseMethods.clickOnElement(path);
	}
	public static void resetpassword_username(String xpath, String username)
	{
		baseMethods.SendkeyData(xpath, username);
	}
	
	public static void ResetPassowrdButton(String path)
	{
		baseMethods.clickOnElement(path);
	}
		/*============================View Profile====================*/
	public static void ViewProfileButton(String path)
	{
		baseMethods.clickOnElement(path);
	}
	
	/*============================Personal Information Guide====================*/
	public static void PersonalInfoGuide(String path)
	{
		baseMethods.clickOnElement(path);
	}
	
	public static void AddSignature(String path)
	{
		baseMethods.AddSign(path);
	}
	/*============Browser Close==========*/
	public static void tearDown()
	{
		baseMethods.CloseBrowser();
	}
	
}
