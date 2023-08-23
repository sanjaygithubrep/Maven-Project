package DemoTest.SeleniumMaven;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        System.out.println("Page title: " + driver.getTitle());
      
        driver.findElement(By.xpath("//input[@name='alert']")).click(); 
		// Switching to Alert        
        Alert alert = driver.switchTo().alert();		
        		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
       // Displaying alert message		
        System.out.println(alertMessage);	
       // Thread.sleep(5000);
        		
        // Accepting alert		
        alert.accept();		
	}

}
