package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	WebDriver  driver;
@Given("I am able to navigate to the login page")
public void i_am_able_to_navigate_to_the_login_page() {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver","C:\\Users\\PremkumarS\\eclipse-workspace\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
}

@When("I enter the username as {string}")
public void i_enter_the_username_as(String string) {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("txtUsername")).sendKeys(string);
}
@When("I enter the password as {string}")
public void i_enter_the_password_as(String string) {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("txtPassword")).sendKeys(string);
}
@When("I clicked the login button")
public void i_clicked_the_login_button() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("btnLogin")).click();
}

@Then("I should see the username as {string}")
public void i_should_see_the_username_as(String string) {
    // Write code here that turns the phrase above into concrete actions
	String name = driver.findElement(By.id("welcome")).getText();
	String Actualdata= string;
	Assert.assertEquals(name, Actualdata);
	System.out.println("login successful");
	driver.close();
    
}

@Then("I should see the an error message as {string}")
public void i_should_see_the_an_error_message_as(String string) {
    // Write code here that turns the phrase above into concrete actions
	String name1 = driver.findElement(By.id("spanMessage")).getText();
	String Actualdata= "Invalid credentials";
	
	Assert.assertEquals(Actualdata,name1);
	driver.close();
}


}
