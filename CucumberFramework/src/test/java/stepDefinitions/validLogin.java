package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class validLogin {
	
	public WebDriver driver;
	
	@When("^user launch the application$")
	public void user_launch_the_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\Utilities\\chromedriver.exe");
		 driver=new ChromeDriver();
	   
	}

	@Then("^login page should appear$")
	public void login_page_should_appear() throws Throwable {
	  
	}

	@When("^user put the username and password$")
	public void user_put_the_username_and_password() throws Throwable {
	  
	}

	@Then("^logout link should be appear on home page$")
	public void logout_link_should_be_appear_on_home_page() throws Throwable {
	  
	}

}
