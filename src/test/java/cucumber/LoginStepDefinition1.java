package cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition1 {

	@Given("User on Login Page")
	public void gotoLoginPage() {
		System.out.println("Inside Login Page");
	}
	@When("User enters username and password")
	public void enterCredentials() {
		System.out.println("Inside Cred");
	}
	@And("User clicked Login Page")
	public void clickLogin() {
		System.out.println("Inside Click Login");
		
	}
	@Then("login should be successful")
	public void verifyLogin() {
		System.out.println("Inside Verifiy Login");
	}
}
