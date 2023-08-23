package DemoTest.SeleniumMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      driver.get("https://demo.guru99.com/test/upload/");
      System.out.println("Page title: " + driver.getTitle());
      
      WebElement File_to_upload = driver.findElement(By.xpath("//input[@name='uploadfile_0']"));
      File_to_upload.sendKeys("C:\\Users\\Acer\\Downloads\\dummy.xlsx");
      
      driver.findElement(By.xpath("//button[@name='send']")).click();
      driver.findElement(By.xpath("//center[contains(text(),'1 file ')]")).isDisplayed();

	}

}
