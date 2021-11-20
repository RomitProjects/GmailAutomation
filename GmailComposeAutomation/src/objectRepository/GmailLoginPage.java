package objectRepository;

import org.openqa.selenium.By;

public class GmailLoginPage {
	protected By login_EmailInput = By.xpath("//input[@type='email']");
	protected By login_NextBtn = By.xpath("//span[contains(text(),'Next')]");
	
	public By get_login_EmailInput()
	{
		return login_EmailInput;
	}
	
	public By get_login_NextBtn()
	{
		return login_EmailInput;
	}
}
