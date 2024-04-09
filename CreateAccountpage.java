package com.training.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.base.BasePage;

public class CreateAccountpage extends BasePage{

	WebDriver driver;
	public CreateAccountpage(WebDriver driver) {
		super(driver);

	}

	@FindBy(linkText="Accounts")
	WebElement Accounttab;

	@FindBy(xpath="//input[@value=' New ' and @type='button']")
	WebElement newButton;

	@FindBy(xpath="//input[@name='acc2']")
	WebElement accountName;

	@FindBy(id="acc6")
	WebElement type;

	@FindBy(css="#acc6 > option:nth-child(7)")
	WebElement dropdown;

	@FindBy(xpath="//select[@tabindex='26']")
	WebElement priority;

	@FindBy(xpath="//option[contains(text(),'High')]")
	WebElement High;

	@FindBy(xpath = "//input[@value=' Save ' and @type='submit']")
	WebElement saveButton;

	@FindBy(linkText="Create New View")
	WebElement NewViewLink;

	@FindBy(id="fname")
	WebElement viewName;

	@FindBy(id="devname")
	WebElement uniqueName;

	//@FindBy(xpath="//input[@value=' Save ' and @type='submit']")
	//WebElement savebutton;

	@FindBy(name="go")
	WebElement Go;

	@FindBy(linkText="Edit")
	WebElement Edit;

	@FindBy(id="fname")
	WebElement clear;

	@FindBy(id="fcol1")
	WebElement accName;

	@FindBy(id="fop1")
	WebElement opeName;

	@FindBy(name="fval1")
	WebElement Value;

	@FindBy(xpath="//*[@id='editPage']/div[1]/table/tbody/tr/td[2]/input[1]")
	WebElement editSavebutton;

	@FindBy(linkText="Merge Accounts")
	WebElement mergeAcc;
	
	@FindBy(id="srch")
	WebElement searchAcc;
	
	@FindBy(name="srchbutton")
	WebElement searchButton;
	
	@FindBy(id="cid0")
	WebElement checkbox1;
	
	@FindBy(id="cid1")
	WebElement checkbox2;
	
	@FindBy(name="goNext")
	WebElement nextButton;
	
	@FindBy(xpath="//*[@id='stageForm']/div/div[2]/div[1]/div/input[2]")
	WebElement MergeFinal;
	
	

	public void accountTab () throws InterruptedException {
		Accounttab.click();
		Thread.sleep(2000);

	}
	public void button () {
		newButton.click();
	}

	public void AccountName (String straccountName) {
		waitforElement(accountName);
		accountName.sendKeys("IBM");	
	}

	public void dropdown() {
		dropdown.click();
	}
	public void priority() {
		priority.click();
	}

	public void selectHigh() {
		High.click();
	}

	public void saveButton() {
		saveButton.click();
	}

	public void viewlink() {
		NewViewLink.click();
	}

	public void go () {
		Go.click();
	}

	public void ViewName () {
		viewName.sendKeys("EastWest");
	}
	public void ViewNameclear () {
		viewName.clear();

	}
	public void newViewName () {
		viewName.sendKeys("NewoneViewName");

	}
	public void UniqueName1 () {
		uniqueName.clear();
	}

	public void UniqueName () {
		uniqueName.sendKeys("SouthNorth");
	}

	public void Edit () {
		Edit.click();
	}

	public void clearfield () {
		clear.clear();
	}

	public void accountname () throws InterruptedException {
		accName.click();
		Select acount = new Select(accName);
		acount.selectByVisibleText("Account Name");
		Thread.sleep(1000);
	}

	public void OperatorName () {
		opeName.click();
		Select operator = new Select(opeName);
		operator.selectByVisibleText("equals");
	}	
	public void value () {
		Value.sendKeys("<a>");

	}

	public void editSaveButton () {
		editSavebutton.click();


	}
	public void MergeAccount () {
		mergeAcc.click();

	}
	
	public void SearchAccount (String strIBM) {
		searchAcc.sendKeys("IBM");
	}
	
	public void SearchButton () {
		searchButton.click();
	}
	
	public void checkbox1() {
		if(!checkbox1.isSelected()) {
			checkbox1.click();
		}}
		
	public void checkbox2() {
			if(!checkbox2.isSelected()) {
				checkbox2.click();
			}
	}	
	public void nextButton () {
				nextButton.click();
				
	}
	
	public void MergeFinalButton () throws InterruptedException {
		MergeFinal.click();
		Alert confirmationAlert = driver.switchTo().alert();
		confirmationAlert.accept();
		Thread.sleep(3000);
		
		
		
		
		
			
		
	
	}
}

