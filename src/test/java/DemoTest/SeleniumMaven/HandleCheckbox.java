package DemoTest.SeleniumMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckbox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://only-testing-blog.blogspot.com/");
        System.out.println("Page title: " + driver.getTitle());
        
        driver.findElement(By.xpath("//input[@name='vehicle' and @id='check1']")).isSelected();

	}

}
