package cucumber;
/*
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EdurekaLogin {
static WebDriver driver;
	
	
    @Given("the user launches the browser")
    public void openBrowser() {
        // Initialize WebDriver (e.g., ChromeDriver)
        driver = new EdgeDriver();
    }
    
    @When("the user navigates to the login page")
    public void navigateToLoginPage() {
        // Navigate to the login page
        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[@data-button-name='Login']")).click();
        
    }
    
    @And("the user enters the right login credentials")
    public void enterCredentials() {
        
    	  // Enter the username into the appropriate field
        driver.findElement(By.xpath("//input[@class='form-control popusreml top_banner_input']")).sendKeys("prathosh2309@gmail.com");
        driver.findElement(By.id("//input[@id='si_popup_passwd']")).sendKeys("Pr@th0sh");
        driver.findElement(By.xpath("//button[text()='Login']")).click();
    }
    
    @Then("the user should be logged in successfully")
    public void loginCheck() {
    	WebElement profile=driver.findElement(By.xpath("//img[@class='img30']"));
    	if(profile.isDisplayed()) {
    		System.out.println("Logged in successfully");
    	}
    }
    
    
    
}
*/