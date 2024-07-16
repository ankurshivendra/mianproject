package cucumberrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="src/test/java/features",glue={"stepddefination","Mainclass"},tags = "@tag" ,
plugin= "json:target/jsonReports/report.json")

public class TestRunner extends AbstractTestNGCucumberTests {



}