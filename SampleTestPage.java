package main.java;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import main.java.util.Utilities;

public class SampleTestPage extends Utilities{

	public SampleTestPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how = How.ID, using = "lbl_val_1")
	public WebElement labelValueOne;
	
	@FindBy(how = How.ID, using = "lbl_val_2")
	public WebElement labelValueTwo;
	
	@FindBy(how = How.ID, using = "lbl_val_3")
	public WebElement labelValueThree;
	
	@FindBy(how = How.ID, using = "lbl_val_4")
	public WebElement labelValueFour;
	
	@FindBy(how = How.ID, using = "lbl_val_5")
	public WebElement labelValueFive;
	
	@FindBy(how = How.ID, using = "txt_val_1")
	public WebElement textValueOne;

	@FindBy(how = How.ID, using = "txt_val_2")
	public WebElement textValueTwo;
	
	@FindBy(how = How.ID, using = "txt_val_3")
	public WebElement textValueThree;
	
	@FindBy(how = How.ID, using = "txt_val_4")
	public WebElement textValueFour;
	
	@FindBy(how = How.ID, using = "txt_val_5")
	public WebElement textValueFive;
	
	@FindBy(how = How.ID, using = "txt_ttl_val")
	public WebElement textTotalValue;
	
	
	
	public boolean verifyRightCountValueAppear() {
		boolean flag=false;
		try {
			// using Find elements as starting of locator is same
		    List<WebElement> allInputElements = driver.findElements(By.xpath("//*[contains()='txt_val']"));
		 
		    for(WebElement elements : allInputElements) {
		    	if(elements.isDisplayed()) {
		    		flag=true;
		    	}else {
		    		flag=false;
		    		break;
		    		// here if element is not displayed it will come out
		    	}
		    }
		}catch(Exception e) {
			//Can add e exception to logs 
			e.printStackTrace();
		}
		return flag;
	}



	public boolean verifyValuesGreateThenZero() {
		boolean flag=false;
		try {
			// using Find elements as starting of locator is same
		    List<WebElement> allInputElements = driver.findElements(By.xpath("//*[contains()='txt_val']"));
		 int totalSize = allInputElements.size();
		 for(WebElement elements : allInputElements) {
			 String value = elements.getText();
			 int NumValue = Integer.parseInt(value);
		    	if(NumValue>=0) {
		    		flag=true;
		    	}else {
		    		flag=false;
		    		break;
		    		// here if element is not displayed it will come out
		    	}
		    }
		    
		}catch(Exception e) {
			//Can add e exception to logs 
			e.printStackTrace();
		}
		return flag;
	}


	public boolean verifyTotalBalance() {
		boolean flag=false;
		String value;
		int NumValue;
		int sumOfTotalValue = 0;
		try {
			// using Find elements as starting of locator is same
		    List<WebElement> allInputElements = driver.findElements(By.xpath("//*[contains()='txt_val']"));
		 int totalSize = allInputElements.size();
		 for(WebElement elements : allInputElements) {
			  value = elements.getText();
			  NumValue = Integer.parseInt(value);
			  sumOfTotalValue = sumOfTotalValue+NumValue;
		    }
		 String totalBal =textTotalValue.getText();
		 int totalBalValue = Integer.parseInt(totalBal);
		 
		 if(sumOfTotalValue==totalBalValue) {
			 System.out.println("total sum of all values matched with final value");
			 flag = true;
			 
		 }  else {
			 System.out.println("missmatch of total sum of all values with final value");
			 flag=false;
		 } 
		}catch(Exception e) {
			//Can add e exception to logs 
			e.printStackTrace();
		}
		return flag;
	}


	public boolean verifyFinalValueCurrencyFormat() {
		boolean flag=false;
		try {
			String totalBal =textTotalValue.getText();
			 if(totalBal.startsWith("$")) {
				 System.out.println("value started with curruency format");
				 flag=true;
			 }else {
				 System.out.println("value is not in a curruency format");
				 flag= false;
			 }
			 	    
		}catch(Exception e) {
			//Can add e exception to logs 
			e.printStackTrace();
		}
		return flag;
	}


}
