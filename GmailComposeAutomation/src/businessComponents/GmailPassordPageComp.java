package businessComponents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import objectRepository.*;

public class GmailPassordPageComp {
	
	GmailPasswordPage gmailPwdPage = new GmailPasswordPage();
	
	
	// Method to input Password and click on Next
	
	public void inputPassword (WebDriver driver , String pass)
	{
		//String pass = "abc";
		
		WebElement PwdInput = driver.findElement(gmailPwdPage.get_pwd_PassInput());
		WebElement NxtBtn = driver.findElement(gmailPwdPage.get_pwd_NextBtn());
		
		
		
		if(PwdInput.isDisplayed())
		{
			PwdInput.sendKeys(pass);
		
		System.out.println("The Password was inputted");
		
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
			System.out.println("Could not locate Password input field");
		}
		
		
	
	}

}
