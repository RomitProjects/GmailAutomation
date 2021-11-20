package businessComponents;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import objectRepository.*;

public class GmailInboxPageComp {
	
	GmailInboxPage gmailInboxPage = new GmailInboxPage();
	
	// Method to verify Inbox Page navigation
	
	public void verifyInboxNavigation(WebDriver driver)
	{
		WebElement InboxLink = driver.findElement(gmailInboxPage.get_inbox_inboxLink());
		
		if(InboxLink.isDisplayed())
		{
			
			System.out.println("Inbox Page Navigation was successful.");
		}
		else
		{
			
			System.out.println("Inbox Page Navigation was unsuccessful.");
		}
	
	
	
    }
	
	
	
	
	
	
	// Method to click on Compose button
	
	public void clickCompose(WebDriver driver)
	{
		WebElement ComposeBtn = driver.findElement(gmailInboxPage.get_inbox_ComposeBtn());
		WebElement NewMessage = driver.findElement(gmailInboxPage.get_inbox_NewMsg_Title());
		
		if(ComposeBtn.isDisplayed())
		{
			ComposeBtn.click();
			
			System.out.println("The Compose Button was clicked.");
			
			if(NewMessage.isDisplayed())
			{
				System.out.println("The New Message popup was opened.");			
			}
			else
			{
				System.out.println("The New Message popup was not opened.");	
			}
			
		}
		else
		{
			
			System.out.println("The Compose Button was not found.");
		}
		
		
	}
	
	
	// Method to verify all interface elements of the New Message popup window
	
	public void verifyNewMessagePopupWindow(WebDriver driver)
	{
		WebElement NewMessageTitle = driver.findElement(gmailInboxPage.get_inbox_NewMsg_Title());
		WebElement Minimize = driver.findElement(gmailInboxPage.get_inbox_NewMsg_Minimize());
		WebElement Maximize = driver.findElement(gmailInboxPage.get_inbox_NewMsg_Maximize());
		WebElement Close = driver.findElement(gmailInboxPage.get_inbox_NewMsg_Close());
		WebElement To = driver.findElement(gmailInboxPage.get_inbox_NewMsg_To());
		WebElement Cc = driver.findElement(gmailInboxPage.get_inbox_NewMsg_Cc());
		WebElement Bcc = driver.findElement(gmailInboxPage.get_inbox_NewMsg_Bcc());
		WebElement Subject = driver.findElement(gmailInboxPage.get_inbox_NewMsg_Subject());
		WebElement Body = driver.findElement(gmailInboxPage.get_inbox_NewMsg_Body());
		WebElement SendBtn = driver.findElement(gmailInboxPage.get_inbox_NewMsg_SendBtn());
		WebElement SendOptions = driver.findElement(gmailInboxPage.get_inbox_NewMsg_SendOptions());
		WebElement FormattingOptions = driver.findElement(gmailInboxPage.get_inbox_NewMsg_FormattingOptions());
		WebElement Attachments = driver.findElement(gmailInboxPage.get_inbox_NewMsg_Attach());
		WebElement InsertLink = driver.findElement(gmailInboxPage.get_inbox_NewMsg_InsertLink());
		WebElement InsertEmoji = driver.findElement(gmailInboxPage.get_inbox_NewMsg_InsertEmoji());
		WebElement GoogleDrive = driver.findElement(gmailInboxPage.get_inbox_NewMsg_GoogleDrive());
		WebElement InsertImage = driver.findElement(gmailInboxPage.get_inbox_NewMsg_InsertImage());
		WebElement Confidential = driver.findElement(gmailInboxPage.get_inbox_NewMsg_ConfidentialMode());
		WebElement InsertSignature = driver.findElement(gmailInboxPage.get_inbox_NewMsg_InsertSign());
		WebElement Options = driver.findElement(gmailInboxPage.get_inbox_NewMsg_Options());
		WebElement Discard = driver.findElement(gmailInboxPage.get_inbox_NewMsg_Discard());
		
		if(NewMessageTitle.isDisplayed())
		{
			System.out.println("The title:New Message was displayed.");
		}
		else
		{
			System.out.println("The title:New Message was not displayed.");
		}
		
		if(Minimize.isDisplayed())
		{
			System.out.println("The Minimize icon was displayed.");
		}
		else
		{
			System.out.println("The Minimize icon was not displayed.");
		}
		
		if(Maximize.isDisplayed())
		{
			System.out.println("The Maximize icon was displayed.");
		}
		else
		{
			System.out.println("The Maximize icon was not displayed.");
		}
		
		if(Close.isDisplayed())
		{
			System.out.println("The Close icon was displayed.");
		}
		else
		{
			System.out.println("The Close icon was not displayed.");
		}
		
		if(To.isDisplayed())
		{
			System.out.println("The To field was displayed.");
		}
		else
		{
			System.out.println("The To field was not displayed.");
		}
		
		if(Cc.isDisplayed())
		{
			System.out.println("The Cc field was displayed.");
		}
		else
		{
			System.out.println("The Cc field was not displayed.");
		}
		
		if(Bcc.isDisplayed())
		{
			System.out.println("The Bcc field was displayed.");
		}
		else
		{
			System.out.println("The Bcc field was not displayed.");
		}
		
		if(Subject.isDisplayed())
		{
			System.out.println("The Subject field was displayed.");
		}
		else
		{
			System.out.println("The Subject field was not displayed.");
		}
		
		if(Body.isDisplayed())
		{
			System.out.println("The Body field was displayed.");
		}
		else
		{
			System.out.println("The Body field was not displayed.");
		}
		
		if(SendBtn.isDisplayed())
		{
			System.out.println("The Send Button was displayed.");
		}
		else
		{
			System.out.println("The Send Button was not displayed.");
		}
		
		if(SendOptions.isDisplayed())
		{
			System.out.println("The Send Options Button was displayed.");
		}
		else
		{
			System.out.println("The Send Options Button was not displayed.");
		}
		
		if(FormattingOptions.isDisplayed())
		{
			System.out.println("The Formatting Options Icon was displayed.");
		}
		else
		{
			System.out.println("The Formatting Options Icon was not displayed.");
		}
		
		if(Attachments.isDisplayed())
		{
			System.out.println("The Attachments Icon was displayed.");
		}
		else
		{
			System.out.println("The Attachments Icon was not displayed.");
		}
		
		if(InsertLink.isDisplayed())
		{
			System.out.println("The Insert Link Icon was displayed.");
		}
		else
		{
			System.out.println("The Insert Link Icon was not displayed.");
		}
		
		if(InsertEmoji.isDisplayed())
		{
			System.out.println("The Insert Emoji Icon was displayed.");
		}
		else
		{
			System.out.println("The Insert Emoji Icon was not displayed.");
		}
		
		if(GoogleDrive.isDisplayed())
		{
			System.out.println("The Google Drive Icon was displayed.");
		}
		else
		{
			System.out.println("The Google Drive Icon was not displayed.");
		}
		
		if(InsertImage.isDisplayed())
		{
			System.out.println("The Insert Image Icon was displayed.");
		}
		else
		{
			System.out.println("The Insert Image Icon was not displayed.");
		}
		
		if(Confidential.isDisplayed())
		{
			System.out.println("The Confidential Icon was displayed.");
		}
		else
		{
			System.out.println("The Confidential Icon was not displayed.");
		}
		
		if(InsertSignature.isDisplayed())
		{
			System.out.println("The Insert Signature Icon was displayed.");
		}
		else
		{
			System.out.println("The Insert Signature Icon was not displayed.");
		}
		
		if(Options.isDisplayed())
		{
			System.out.println("The Options Icon was displayed.");
		}
		else
		{
			System.out.println("The Options Icon was not displayed.");
		}
		
		if(Discard.isDisplayed())
		{
			System.out.println("The Discard Icon was displayed.");
		}
		else
		{
			System.out.println("The Discard Icon was not displayed.");
		}
		
		
		
	}
	

	
	// Method to input an email ID in the To field
	
	public void inputEmailIDinToField(WebDriver driver, String ToMail)
	{
	
		WebElement To = driver.findElement(gmailInboxPage.get_inbox_NewMsg_To());
		
		//String mailID = "abc@gmail.com";
		
		if(To.isDisplayed())
		{
			To.sendKeys(ToMail);
			
			System.out.println("Email Id was inputted to the To field.");
			
		}
		else
		{
			System.out.println("Unable to locate To field");
		}
		
	
	}
	
	// Method to input subject
	
		public void inputSubject(WebDriver driver, String SubjectStr)
		{
		
			WebElement Subject = driver.findElement(gmailInboxPage.get_inbox_NewMsg_Subject());
			
		//	String SubjectStr = "Incubyte";
			
			if(Subject.isDisplayed())
			{
				Subject.sendKeys(SubjectStr);
				
				System.out.println("Subject has been inputted.");
				
			}
			else
			{
				System.out.println("Unable to locate Subject field");
			}
			
		
		}
		
		
		// Method to add email body 
		
		public void inputBody(WebDriver driver , String BodyStr)
		{
		
			WebElement Body = driver.findElement(gmailInboxPage.get_inbox_NewMsg_Body());
			
			// String BodyStr = "Automation QA test for Incubyte";
			
			if(Body.isDisplayed())
			{
				Body.sendKeys(BodyStr);
				
				System.out.println("Body has been added.");
				
			}
			else
			{
				System.out.println("Unable to locate Body field");
			}
			
		
		}
		
		// Method to send email
		
				
				public void sendEmail(WebDriver driver)
				{
				
					WebElement SendBtn = driver.findElement(gmailInboxPage.get_inbox_NewMsg_SendBtn());
					WebElement MsgSent = driver.findElement(gmailInboxPage.get_inbox_NewMsg_MsgSent());
					
					if(SendBtn.isDisplayed())
					{
						SendBtn.click();
						
						System.out.println("Send Button has been clicked.");
						
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
						
						if(MsgSent.isDisplayed())
						{
							System.out.println("Email was sent.");
						}
						 
						else
						{
							System.out.println("Email was not sent.");
							
						}
						
						
					}
					else
					{
						System.out.println("Unable to locate Send Button");
					}
					
				
				}
		
		
	
	

}
