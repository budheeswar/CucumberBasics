package cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// complete path of feature and package name of step definition

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature1.feature", 
				glue = {"cucumber"},
				monochrome = true ,
				plugin = {"pretty", "html:target/HTMlReports"} //html report
				
		)
public class LoginTestRunner {

}
