package DemoTest.SeleniumMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Locator {
	 public static void main(String[] args) {
	        // Setup WebDriverManager
	        WebDriverManager.chromedriver().setup();

	        // Create a new instance of ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Perform actions with the WebDriver
	        driver.get("http://www.saucedemo.com");
	        
	        System.out.println("Page title: " + driver.getTitle());
	        //driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

	        driver.findElement(By.name("password")).sendKeys("secret_sauce");
	        driver.findElement(By.name("login-button")).click();
	        String expectedMsg = "Epic sadface: Username is required";
	        String originalMsg = driver.findElement(By.xpath("//h3[contains(text(),'Epic sadface: Username is required')]")).getText();
	        Assert.assertEquals(originalMsg,expectedMsg);

	    }

}
