package runTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature/LoginPageFeature.feature", glue = { "stepDefinitions" }, monochrome = true, plugin = {
		"pretty","json:target/JSONReports/loginPageJSON" }

)
public class LoginPageTestRunner {

}
