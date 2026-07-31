package com.Runner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.Baseclass.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/Features",
glue= {"com.Stepdefenition"},
plugin= {"pretty","html:target/report.html"},
monochrome=true,
tags="@Meenu and not @skip"
)
public class Runner {
	
	@BeforeClass
	
	public static void setup() {
		BaseClass.Launchbrowser();
		BaseClass.maximize();
	}
	
	@AfterClass
	
	public static void teardown() {
		//BaseClass.Quitbrowser();
	}

}

