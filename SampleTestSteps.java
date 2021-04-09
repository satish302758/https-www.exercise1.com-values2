package main.resources.steps;

import java.util.Properties;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import main.java.SampleTestPage;
import main.java.util.Utilities;

public class SampleTestSteps {
	
	SampleTestPage pageClass = new SampleTestPage();
	Properties prop;
	Utilities util = new Utilities();
	String FileLocn=System.getProperty("user.dir")+"\\src\\test\\java\\sampledata.properties";
	
	@Given("load chrome browser and navigate to demo project")
	public void load_chrome_browser_and_navigate_to_demo_project() {
	    util.loadChromeBrowserNavigateUrl();
	}


	
	@Given("i load testdata from sample data properties files")
	public void i_load_testdata_from_sample_data_properties_files() throws Exception {
		 prop = util.readPropertiesFile(FileLocn);
		 //Can utilize prop file and validate user data
		System.out.println(prop.getProperty("validateUserData1"));
		System.out.println(prop.getProperty("validateUserData2"));
	}
	

	@Then("i verify the right count of values appear on the screen")
	public void i_verify_the_right_count_of_values_appear_on_the_screen() {
	    boolean resultFlag=false;
		if(pageClass.verifyRightCountValueAppear()) {
			//Here we can use resultFlag to use in generating a report
			resultFlag=true;
	    }else {
	    	//Here we can use resultFlag to use in generating a report
	    	resultFlag=false;
	    }
	}

	@Then("i verify the values on the screen are greater than zero")
	public void i_verify_the_values_on_the_screen_are_greater_than_zero() {
		boolean resultFlag=false;
		if(pageClass.verifyValuesGreateThenZero()) {
			//Here we can use resultFlag to use in generating a report
			resultFlag=true;
	    }else {
	    	//Here we can use resultFlag to use in generating a report
	    	resultFlag=false;
	    }
	}

	@Then("i verify the total balance is correct based on the values listed on the screen")
	public void i_verify_the_total_balance_is_correct_based_on_the_values_listed_on_the_screen() {
		boolean resultFlag=false;
		if(pageClass.verifyTotalBalance()) {
			//Here we can use resultFlag to use in generating a report
			resultFlag=true;
	    }else {
	    	//Here we can use resultFlag to use in generating a report
	    	resultFlag=false;
	    }
	}

	@Then("i verify the values are formatted as currencies")
	public void i_verify_the_values_are_formatted_as_currencies() {
		boolean resultFlag=false;
		if(pageClass.verifyFinalValueCurrencyFormat()) {
			//Here we can use resultFlag to use in generating a report
			resultFlag=true;
	    }else {
	    	//Here we can use resultFlag to use in generating a report
	    	resultFlag=false;
	    }
	}

	@Then("i verify the total balance matches the sum of the values")
	public void i_verify_the_total_balance_matches_the_sum_of_the_values() {
		boolean resultFlag=false;
		if(pageClass.verifyTotalBalance()) {
			//Here we can use resultFlag to use in generating a report
			resultFlag=true;
	    }else {
	    	//Here we can use resultFlag to use in generating a report
	    	resultFlag=false;
	    }
	}


}
