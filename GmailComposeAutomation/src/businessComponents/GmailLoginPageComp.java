package businessComponents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import objectRepository.*;


public class GmailLoginPageComp {
	
	GmailLoginPage gmailLoginPage = new GmailLoginPage();

	
	 // Method to input email ID and click on Next
	
	public void inputEmailID (WebDriver driver, String emailID)
	{
		//String mailID = "abc@gmail.com";
		
		WebElement LoginInput = driver.findElement(gmailLoginPage.get_login_EmailInput());
		WebElement NxtBtn = driver.findElement(gmailLoginPage.get_login_NextBtn());
		
		if(LoginInput.isDisplayed())
		{
		LoginInput.sendKeys(emailID);
		
		System.out.println("The Email Id was inputted");
		
		if(NxtBtn.isDisplayed())
		{
		
			NxtBtn.click();
			
			System.out.println("The Next Button was clicked");
		}
		else
		{
			System.out.println("Could Not Locate Next Button");
			
		}
		
		
		}
		else
		{
			System.out.println("Could not locate email ID input field");
		}
		
		
	}
	
	
	
	
	
}
