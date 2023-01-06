package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDefinition {

	WebDriver driver = null;

	@Given("user launch- Login URL")
	public void user_launch_login_url() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

	}

	@Given("Currently in Username Input box")
	public void currently_in_username_input_box() {
		// we can achieve this by finding element

	}

//	@When("user enters username and password")
//	public void user_enters_username_and_password() throws InterruptedException {
//		Thread.sleep(2000);
//		driver.findElement(By.id("username")).sendKeys("student");
//		driver.findElement(By.id("password")).sendKeys("Password123");
//		
//	}
	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username , String password) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		
	}

	@When("clicks submit")
	public void clicks_submit() throws InterruptedException {
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
	}

	@Then("login shoulb be successfull")
	public void login_shoulb_be_successfull() throws InterruptedException {
		if (driver.getPageSource().contains("Congratulations student. You successfully logged in!") == true) {
			System.out.println("TEST LOGIN NOW PASSED");
		} else {
			System.out.println("TEST Login Now FAILED  ");
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
