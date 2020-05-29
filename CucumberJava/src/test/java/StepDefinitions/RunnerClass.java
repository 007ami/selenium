package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"StepDefinitions"},
monochrome= true,
plugin= {"pretty","junit:target/JUnitReports/reports.xml",
		          "json:target/JSONReports/reports.json",
		          "html:target/HTMLReports"},
tags="@SmokeFeature"
		)
public class RunnerClass {

}
