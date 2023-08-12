package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\Features\\SignINpage.feature",glue = "Stepdefenition",plugin = {"pretty","html:target/cucumber-report/homepage.html"})
public class SigININ extends AbstractTestNGCucumberTests {
}
