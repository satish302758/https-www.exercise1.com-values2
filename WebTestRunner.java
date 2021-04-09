package main.resources;



import cucumber.api.CucumberOptions;

@CucumberOptions(features = { "src.test.resources" }, glue = "sec.main.resources.steps", 
		plugin = { "pretty", 
		"json:target/cucumber-reports/CucumberTestReport.json",
		"rerun:target/cucumber-reports/rerun.txt" }, 
		monochrome = true, 
		strict = true, 
		dryRun = false
		)


public class WebTestRunner  {
}