package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Khaled\\eclipse-workspace\\crm\\src\\main\\java\\Features\\tagging.feature"
,glue = {"StepDefinations"},
plugin = { "pretty","junit:junit_xml/cucumber.xml" },
monochrome = true,
dryRun = false,
tags = {"~@SmokeTest", "@RegrassionTest"}
)

public class RunnerClass {

}
