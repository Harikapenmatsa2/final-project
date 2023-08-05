package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\Features",glue = "Stepdefenition",plugin = {"pretty","html:target/cucumber-report/homepage.html"})
public class Executios extends AbstractTestNGCucumberTests{

}
