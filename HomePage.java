package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.training.base.BasePage;


public class HomePage extends BasePage{


	@FindBy(xpath="//span[@id='userNavLabel']")
	WebElement usernavigation;
	
	@FindBy(xpath = "//a[normalize-space()='My Profile']")
	WebElement myprofile;
	
	@FindBy(xpath="//img[@title='Edit Profile']")
	WebElement editbutton;
	
	@FindBy(xpath="//iframe[@id='contactInfoContentId']")
	WebElement iframeforabout;
	
	@FindBy(xpath="//a[contains(text(),'About')]")
	WebElement AboutTab;
	
	@FindBy(xpath="//*[@id='lastName']")
	WebElement LastName;
	
	@FindBy(xpath= "/*[@id='TabPanel']/div/div[2]/form/div/input[1]")
	WebElement SaveButton;
	
	@FindBy(xpath ="//*[@id='publisherAttachTextPost']/span[1]")
	WebElement postlink;
	
	@FindBy(xpath="//iframe[@class='cke_wysiwyg_frame cke_reset']")
	WebElement textboxiframe;
	
	@FindBy(xpath="//body")
	WebElement textbox;
	
	@FindBy(xpath="//input[@id='publishersharebutton']")
	WebElement Sharebutton;
	
	@FindBy(xpath="//span[normalize-space()='File']")
	WebElement filelink;
	
	@FindBy(xpath="//a[normalize-space()='Upload a file from your computer'])[1]")
	WebElement uploadfilebutton;
	
	@FindBy(xpath="//input[@id='chatterFile']")
	WebElement chooseFile;
	
	@FindBy(xpath ="//input[@id='j_id0:uploadFileForm:photoVisibility']")
	WebElement showmyphoto;
	
	@FindBy(xpath="//input[@id='j_id0:uploadFileForm:save']")
	WebElement saveButton;
	
	
	@FindBy(xpath="//a[contains(text(),'My Settings')]")
	WebElement mysettings;
	
	@FindBy(xpath="//span[@id='PersonalInfo_font']" )
	WebElement personalLink;
	
	@FindBy(xpath="//span[@id='LoginHistory_font']")
	WebElement loginhistory;
	
	@FindBy(xpath="a[href='/servlet/servlet.LoginHistory?id=005bm0000009ZBR']")
	WebElement downloadlink;
	
	@FindBy(xpath="//span[@id='DisplayAndLayout_font']")
	WebElement displayandlayout;
	
	@FindBy(xpath="//span[@id='CustomizeTabs_font']")
	WebElement customizetab;
	
	@FindBy(xpath="//select[@id='p4']")
	WebElement selectsalesforcechatter;
	
	@FindBy(xpath="(//select[@id='duel_select_1'])[1]")
	WebElement selectedtab;
	
	@FindBy(xpath="//img[@title='Remove']")
	WebElement removetab;
	
	@FindBy(xpath="//select[@id='duel_select_0'])[1]")
	WebElement availabletab;
	
	@FindBy(xpath="//img[@title='Add']")
	WebElement addbutton;
	
	@FindBy(xpath="//input[@title='Save']")
	WebElement savebutton;
	
	@FindBy(xpath="//span[@id='EmailSetup_font']")
	WebElement emaillink;
	
	@FindBy(xpath="//span[@id='EmailSettings_font']")
	WebElement myemailsettings;
	
	@FindBy(xpath="//input[@id='sender_name']")
	WebElement emailname;
	
	@FindBy(xpath="//input[@id='sender_email']")
	WebElement emailaddress;
	
	@FindBy(xpath="//input[@id='auto_bcc1'])[1]")
	WebElement radiobutton;
	
	//@FindBy(xpath="//input[@title='Save']")
	//WebElement savebutton2;
	
	@FindBy(xpath="//span[@id='CalendarAndReminders_font']")
	WebElement calender;
	
	@FindBy(xpath="//span[@id='Reminders_font']")
	WebElement activity;
	
	@FindBy(xpath="//input[@id='testbtn']")
	WebElement testreminder;
	
	@FindBy(xpath="//a[contains(text(),'Developer Console')]")
	WebElement devConsole;
	
	@FindBy(xpath="//a[@title='Logout']")
	WebElement logout;
	
	




	//public void enterintoUsername(String strusername) {
	//waitforElement(username);
	//username.sendKeys(strusername);

	//}
	//public void enterintoPassword(String strpassword) {
	//password.sendKeys(strpassword);

	//}
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void userNav () {
		waitforElement(usernavigation);
		usernavigation.click(); 

	}
	
	public void editprofile () {
		waitforElement(myprofile);
		myprofile.click();
	}
	public void editbutton() {
		waitforElement(editbutton);
		editbutton.click();
	
		
	}
	
	public void aboutbutton() {
		waitforElement(AboutTab);
		AboutTab.click();
	}
	
	public void lastName(String lastName) {
		waitforElement(LastName);
		LastName.clear();
		LastName.sendKeys(lastName);
		
	}
	
	
	public void savebutton() {
		waitforElement(SaveButton);
		SaveButton.click();
	}
	
	public void postlink () {
		waitforElement(postlink);
		postlink.click();
	
	}
	
	public void textboxiframe () {
	
	
	}
	
	public void textbox(String text) {
		waitforElement(textbox);
		textbox.clear();
		textbox.sendKeys(text);
	
	}
	
	public void sharebutton( ) {
		waitforElement(Sharebutton);
		Sharebutton.click();
	}
	
	public void FileLink () {
		waitforElement(filelink);
		filelink.click();
	}
	
	
	public void UploadFileButton () {
		waitforElement(uploadfilebutton);
		uploadfilebutton.click();
	}
	
	public void ChooseFile (String filepath){
		waitforElement(chooseFile);
		chooseFile.clear();
		chooseFile.sendKeys(filepath);
		
	}
	
	public void ShowMyPhoto () {
		waitforElement(showmyphoto);
		showmyphoto.click();
	}
	
	public void savinphotobutton () {
		waitforElement(savebutton);
		savebutton.click();
		}
	
	public void devconsole() {
		devConsole.click();
	}
	
	public void parentwindow() {
	
	}

	public void switchToFrame(WebDriver driver) {
		waitforElement(iframeforabout);
		driver.switchTo().frame(iframeforabout);
		
	}
	

	

	//public void logout() {
	//	logout.click();
	//}

	//public void clickLogout () {
	//	logout.click();


}


