package cucumber;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import cucumber.gerkin.ScreenShotDemo;
public class LauchBrowser {

	static WebDriver driver;
	
	
    @Given("the user opens the browser")
    public void openBrowser() {
        // Initialize WebDriver (e.g., ChromeDriver)
        driver = new EdgeDriver();
    }
	
	
    @When("the user navigates to the login page")
    public void navigateToLoginPage() {
        // Navigate to the login page
        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();
    }

	
    @And("enters the {string}")
    public void enterUsername(String username) {
        
    	  // Enter the username into the appropriate field
        driver.findElement(By.id("user-name")).sendKeys(username);
    }
	
    @And("enters the password {string}")
    public void enterPassword(String password) {
        // Enter the password into the appropriate field
        driver.findElement(By.id("password")).sendKeys(password);
    }
	
	
    @And("clicks the login button")
    public void clickLoginButton() {
        // Click the login button
        driver.findElement(By.cssSelector("input#login-button")).click();
        
    }
    
	
    @And("the user login in checked")
    public String verifyLogin() throws IOException {
        // Click the login button
        
        try{
        WebElement elementNDisp=driver.findElement(By.cssSelector("div#shopping_cart_container"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		if (elementNDisp.isDisplayed()) {
            return "Success";
        } 
		
        }catch(NoSuchElementException e) {
        	
        	takeScreenShot("errorpage");
        	System.out.println(e.getMessage());
        	return "Failed";
        }
		return null;
    }
	
	
    @Then("the user login reuslt")
    public void loginResult() throws IOException {
    	String result=verifyLogin();
    	if(result.equals("Success")) {
    		System.out.println(result);
    	}
    	else {
    		System.out.println(result);
    		System.out.println("Element not found");
    	}
    }
    
	/*
	 * @Then("the user should be unable to log in") public void verifyLoginFailed()
	 * { // Perform verification for successful login
	 * System.out.println("login is failed"); }
	 */
    public static void takeScreenShot(String ScreenShot) throws IOException {
		File snap=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(snap, new File("C:\\Users\\prath\\Documents\\shiash\\New folder\\cucumber.gerkin\\test-output\\"+ScreenShot+".jpg"));
	}
    
    
    @After
    public void closeBrowser() {
        // Close the browser
        driver.quit();
    }
    
    
    
	/*
	 * public static void loginSuccess() { System.out.println("login is success"); }
	 * 
	 * public static void loginFailed() { System.out.println("login is failed"); }
	 */
}
