package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
         features = {"src/test/resources/features/testCases.feature"}
        ,glue={"stepdefinition"}
        ,plugin = {"pretty",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        "rerun:target/failedFeaturesAndScenarios.txt"
}
)
public class TestRunner {
}



