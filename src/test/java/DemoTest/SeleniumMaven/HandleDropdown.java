package DemoTest.SeleniumMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.saucedemo.com");
		System.out.println("Page title: " + driver.getTitle());

		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		Select sort = new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
		sort.selectByIndex(2);
		//driver.quit() : Quit the all tabs of browser
	       //driver.close() : The close() method closes the currently focused window
		
		
	}
	

}
