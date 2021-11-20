package objectRepository;

import org.openqa.selenium.By;

public class GmailPasswordPage {

	protected By pwd_PassInput = By.xpath("//input[@type='password']");
	protected By pwd_NextBtn = By.xpath("//span[contains(text(),'Next')]");
	
	public By get_pwd_PassInput()
	{
		return pwd_PassInput;
	}
	
	public By get_pwd_NextBtn()
	{
		return pwd_NextBtn;
	}	
}
