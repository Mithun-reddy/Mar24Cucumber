package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/main/java/features/", glue = "stepdefinitions", tags = "@regression",
plugin = {"pretty","html:target/cucumeberReports.html"}, monochrome = true, dryRun = false)
public class TestNgRunner extends AbstractTestNGCucumberTests {

}
