package edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EdurekaLoginPage {
static WebDriver driver;
	
	
    @Given("the user launches the browser")
    public void openBrowser() {
        // Initialize WebDriver (e.g., ChromeDriver)
        driver = new EdgeDriver();
    }
    
    @When("the user navigates to the Edureka login page")
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
    
    @And("the user navigates to the profile page")
    	public void navigateToProfile() {
    	driver.findElement(By.xpath("//img[@class='img30']")).click();
    	driver.findElement(By.xpath("//a[text()='My Profile']")).click();
    }
    @And("the user navigates to the profile editing page")
    	public void profileEditingPage() {
    	// xpath for click to edit details
    	driver.findElement(By.xpath("//*[@class='details-heading']//h4//i[@class='icon-profile-professional']//following::a[1]")).click();
    	
    }
    
    @And("the user populates the page1 with values")
	public void profilePopulating() {
	
	driver.findElement(By.id("input#fullName")).sendKeys("Prathosh V");
	driver.findElement(By.xpath("//span[text()='Experience * ']")).click();
	driver.findElement(By.xpath("(//div[@class='ngx-dropdown-list-container']//following::li)[1]")).click();
	driver.findElement(By.xpath("//span[text()='Industry* ']")).click();
	driver.findElement(By.xpath("(//div[@class='ngx-dropdown-container']//following::li)[7]")).click();
//	driver.findElement(By.xpath("(//button[@class='ngx-dropdown-button'])[3]")).click();	//
//	driver.findElement(By.xpath("(//div[@class='ngx-dropdown-container']//following::li)[7]")).click();//
	driver.findElement(By.xpath("input#designation")).click();
	driver.findElement(By.xpath("(//span[text()='Select '])[1]")).click();
	driver.findElement(By.xpath("(//div[@class='ngx-dropdown-container']//following::li)[12]")).click();
	driver.findElement(By.xpath("(//span[text()='Select '])[2]")).click();
	driver.findElement(By.xpath("(//div[@class='ngx-dropdown-container']//following::li)[15]")).click();
	driver.findElement(By.xpath("(//span[text()='Select '])[2]")).click();
	driver.findElement(By.xpath("(//div[@class='ngx-dropdown-container']//following::li)[4]")).click();
	driver.findElement(By.xpath("(//span[text()='Select '])[2]")).click();
	driver.findElement(By.xpath("(//div[@class='ngx-dropdown-container']//following::li)[8]")).click();
	
	
	driver.findElement(By.xpath("//button[text()='Save and Continue']")).click();
	
    }
    
    
    
    
    
    
}
