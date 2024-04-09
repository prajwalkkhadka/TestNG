package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.base.BasePage;

public class OppertunityPage extends BasePage {
	
	WebDriver driver;
	public OppertunityPage(WebDriver driver) {
		super(driver);

}
	@FindBy(xpath="//a[@title='Opportunities Tab']")
	WebElement opportunities;
	
	@FindBy(id="fcf")
	WebElement dropdown;
	
	@FindBy(name="new")
	WebElement newbutton;
	
	@FindBy(name="opp3")
	WebElement oppname;
	
	@FindBy(xpath="//img[@class='lookupIcon']")
	WebElement lookup;
	
	@FindBy(linkText="Opportunity Pipeline")
	WebElement pipeline;
	
	@FindBy(linkText="Stuck Opportunities")
	WebElement stuckopportunities;
	
	@FindBy(id="quarter_q")
	WebElement interval;
	
	@FindBy(id="open")
	WebElement include;
	
	@FindBy(xpath="//input[@value='Run Report']")
	WebElement RunReport;
	
	

	public void opportunitiestab () {
		waitforElement(opportunities);
		opportunities.click();
	}
	
	public void oppdropdown () {
		waitforElement(dropdown);
		dropdown.click();
	}
	
	public void pipelineopp () {
		waitforElement(pipeline);
		pipeline.click();	
	}

	public void stuckopp () {
		waitforElement(stuckopportunities);
		stuckopportunities.click();
		
	}
	
	public void quartSummlink () {
		waitforElement(interval);
		Select currentfq = new Select(interval);
		currentfq.selectByVisibleText("Current and Next FQ");
	}
	
	public void includeAllOpp () {
		waitforElement(include);
		Select AllOpp = new Select(include);
		AllOpp.selectByVisibleText("All Opportunities");
	}
	
	public void runReport () {
		waitforElement(RunReport);
		RunReport.click();
		
		
	}
	
	
}



