package objectRepository;

import org.openqa.selenium.By;

public class GmailInboxPage {
	
	protected By inbox_inboxLink = By.xpath("//a[contains(text(),'Inbox')]");
	
	protected By inbox_ComposeBtn = By.xpath("//div[@class='T-I T-I-KE L3']");
	
	protected By inbox_NewMsg_Title = By.xpath("//span[contains(text(),'New Message')]");
	
	protected By inbox_NewMsg_Minimize = By.xpath("//img[@alt='Minimize']");
	
	protected By inbox_NewMsg_Maximize = By.xpath("//img[@alt='Pop-out']");
	
	protected By inbox_NewMsg_Close = By.xpath("//img[@alt='Close']");
	
	protected By inbox_NewMsg_To = By.xpath("//span[@id=':qf']");
	
	protected By inbox_NewMsg_Cc = By.xpath("//span[@id=':nk']");
	
	protected By inbox_NewMsg_Bcc = By.xpath("//span[@id=':nj']");
	
	protected By inbox_NewMsg_Subject = By.xpath("//input[@placeholder='Subject']");
	
	protected By inbox_NewMsg_Body = By.xpath("//div[@id=':rf']");
	
	protected By inbox_NewMsg_SendBtn = By.xpath("//div[@id=':pz']");
	
	protected By inbox_NewMsg_SendOptions = By.xpath("//div[@id=':pv']");
	
	protected By inbox_NewMsg_FormattingOptions = By.xpath("//div[@class='dv']");
	
	protected By inbox_NewMsg_Attach = By.xpath("//div[@id=':rs']");
	
	protected By inbox_NewMsg_InsertLink = By.xpath("//div[@id=':ru']");
	
	protected By inbox_NewMsg_InsertEmoji = By.xpath("//div[@id=':rw']");
	
	protected By inbox_NewMsg_GoogleDrive = By.xpath("//div[@id=':ry']");
	
	protected By inbox_NewMsg_InsertImage = By.xpath("//div[@id=':s0']");
	
	protected By inbox_NewMsg_ConfidentialMode = By.xpath("//div[@id=':s2']");
	
	protected By inbox_NewMsg_InsertSign = By.xpath("//div[@id=':s4']");
	
	protected By inbox_NewMsg_Options = By.xpath("//div[@id=':sf']");
	
	protected By inbox_NewMsg_Discard = By.xpath("//div[@id=':o0']");
	
	protected By inbox_NewMsg_MsgSent = By.xpath("//span[contains(text(),'Message sent.')]");
	
	
	public By get_inbox_inboxLink()
	{
		return inbox_inboxLink;
	}
	
	public By get_inbox_ComposeBtn()
	{
		return inbox_ComposeBtn;
	}

	public By get_inbox_NewMsg_Title()
	{
		return inbox_NewMsg_Title;
	}
	
	public By get_inbox_NewMsg_Minimize()
	{
		return inbox_NewMsg_Minimize;
	}
	
	public By get_inbox_NewMsg_Maximize()
	{
		return inbox_NewMsg_Maximize;
	}
	
	public By get_inbox_NewMsg_Close()
	{
		return inbox_NewMsg_Close;
	}
	
	public By get_inbox_NewMsg_To()
	{
		return inbox_NewMsg_To;
	}
	
	public By get_inbox_NewMsg_Cc()
	{
		return inbox_NewMsg_Cc;
	}

	public By get_inbox_NewMsg_Bcc()
	{
		return inbox_NewMsg_Bcc;
	}
	
	public By get_inbox_NewMsg_Subject()
	{
		return inbox_NewMsg_Subject;
	}
	
	public By get_inbox_NewMsg_Body()
	{
		return inbox_NewMsg_Body;
	}
	
	public By get_inbox_NewMsg_SendBtn()
	{
		return inbox_NewMsg_SendBtn;
	}
	
	public By get_inbox_NewMsg_SendOptions()
	{
		return inbox_NewMsg_SendOptions;
	}
	
	public By get_inbox_NewMsg_FormattingOptions()
	{
		return inbox_NewMsg_FormattingOptions;
	}
	
	public By get_inbox_NewMsg_Attach()
	{
		return inbox_NewMsg_Attach;
	}
	
	public By get_inbox_NewMsg_InsertLink()
	{
		return inbox_NewMsg_InsertLink;
	}
	
	public By get_inbox_NewMsg_InsertEmoji()
	{
		return inbox_NewMsg_InsertEmoji;
	}
	
	public By get_inbox_NewMsg_GoogleDrive()
	{
		return inbox_NewMsg_GoogleDrive;
	}
	
	public By get_inbox_NewMsg_InsertImage()
	{
		return inbox_NewMsg_InsertImage;
	}
	
	public By get_inbox_NewMsg_ConfidentialMode()
	{
		return inbox_NewMsg_ConfidentialMode;
	}
	
	public By get_inbox_NewMsg_InsertSign()
	{
		return inbox_NewMsg_InsertSign;
	}
	
	public By get_inbox_NewMsg_Options()
	{
		return inbox_NewMsg_Options;
	}
	
	public By get_inbox_NewMsg_Discard()
	{
		return inbox_NewMsg_Discard;
	}
	
	public By get_inbox_NewMsg_MsgSent()
	{
		return inbox_NewMsg_MsgSent;
	}
	
}
