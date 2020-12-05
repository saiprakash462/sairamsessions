package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDefinition {

	WebDriver driver;

@Given("^user is on Login page.$")
	public void user_is_on_Login_page() {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://ui.freecrm.com/");
		

	}
	
@When("^user enters user Name and password correct.$")
	public void user_enters_user_Name_and_password_correct() {
		driver.findElement(By.name("email")).sendKeys("saiprakash.polavarapu@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Saisri46297#");
         
	}
	
	@When("^click on login button.$")
	public void click_on_login_button() {
	    driver.findElement(By.xpath("//input[@name = 'password']/ancestor::div[@class = 'ui left icon input']/parent::div[@class = 'field']/following-sibling::div[@class = 'ui fluid large blue submit button']")).click();
	}
	
	@Then("^user is on home page.$")
	public void user_is_on_home_page() throws Throwable {
	 String title =   driver.getTitle();
	 
	 System.out.println("  output title: " +title);
	    
	}

}
