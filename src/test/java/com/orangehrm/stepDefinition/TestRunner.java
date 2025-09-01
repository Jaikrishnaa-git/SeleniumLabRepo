package com.orangehrm.stepDefinition;
 
import org.junit.runner.RunWith;
 
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Dell\\Desktop\\Git repo\\Selenium\\src\\test\\resources\\Features"
,glue= {"com.orangehrm.stepDefinition"}
,tags= "@smoke"
,dryRun=false
,monochrome=true)
 
 
public class TestRunner {

 
}