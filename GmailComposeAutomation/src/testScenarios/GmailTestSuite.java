package testScenarios;

import businessComponents.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.*;


public class GmailTestSuite {
	
	
	
	public static void TC01_VerifyNewMessagePopUpOnComposeButtonClick() throws FileNotFoundException, IOException
	{
		GmailLoginPageComp gmailLoginPageComp = new GmailLoginPageComp();
		GmailPassordPageComp gmailPasswordPageComp = new GmailPassordPageComp();
		GmailInboxPageComp gmailInboxPageComp = new GmailInboxPageComp();
		
		JSONObject data = new JSONObject();
	    data = readData();
	    
	    String Email = data.getJSONObject("TC01_VerifyNewMessagePopUpOnComposeButtonClick").getString("EmailID");
	    String Pass = data.getJSONObject("TC01_VerifyNewMessagePopUpOnComposeButtonClick").getString("Password");
		
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signin");
		
		gmailLoginPageComp.inputEmailID(driver ,Email );
		gmailPasswordPageComp.inputPassword(driver, Pass );
		gmailInboxPageComp.verifyInboxNavigation(driver);
		gmailInboxPageComp.clickCompose(driver);
		gmailInboxPageComp.verifyNewMessagePopupWindow(driver);
		
		driver.close();
		
	}
	
	
	public static void TC02_VerifySimpleSendMailFlow() throws FileNotFoundException, IOException
	{
		GmailLoginPageComp gmailLoginPageComp = new GmailLoginPageComp();
		GmailPassordPageComp gmailPasswordPageComp = new GmailPassordPageComp();
		GmailInboxPageComp gmailInboxPageComp = new GmailInboxPageComp();
		
		
		JSONObject data = new JSONObject();
	    data = readData();
	   
		String Email = data.getJSONObject("TC02_VerifySimpleSendMailFlow").getString("EmailID");
		String Pass = data.getJSONObject("TC02_VerifySimpleSendMailFlow").getString("Password");
		String To = data.getJSONObject("TC02_VerifySimpleSendMailFlow").getString("ToEmail");
		String Subject = data.getJSONObject("TC02_VerifySimpleSendMailFlow").getString("Subject");
		String Body = data.getJSONObject("TC02_VerifySimpleSendMailFlow").getString("Body");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signin");
		
		gmailLoginPageComp.inputEmailID(driver , Email);
		gmailPasswordPageComp.inputPassword(driver, Pass);
		gmailInboxPageComp.verifyInboxNavigation(driver);
		gmailInboxPageComp.clickCompose(driver);
		gmailInboxPageComp.inputEmailIDinToField(driver, To);
		gmailInboxPageComp.inputSubject(driver, Subject);
		gmailInboxPageComp.inputBody(driver, Body);
		gmailInboxPageComp.sendEmail(driver);
		
		
		driver.close();
		
	}
	
	public static JSONObject readData()  throws FileNotFoundException, IOException
	{
		
		FileReader reader = new FileReader(".\\DataTables\\TestData.json");
		
		StringBuilder sb = new StringBuilder();
		
		while(reader.read() != -1)
		{
			sb.append(reader.read());
		}
		
		String jsonString = sb.toString() ;
		
		reader.close();
		
		JSONObject obj = new JSONObject(jsonString);
		
		return obj;		
	}
	
	
	

	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		
		TC01_VerifyNewMessagePopUpOnComposeButtonClick();
		
		TC02_VerifySimpleSendMailFlow();
		
	}
	
	
}
