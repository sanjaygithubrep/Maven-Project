package DemoTest.SeleniumMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessUploadDownloadFile {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeOptions options = new ChromeOptions();
	     options.setHeadless(true);
	     WebDriver driver = new ChromeDriver(options);
		
//		WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/upload/");
        System.out.println("Page title: " + driver.getTitle());
        
        WebElement File_to_upload = driver.findElement(By.xpath("//input[@name='uploadfile_0']"));
        File_to_upload.sendKeys("C:\\Users\\Acer\\Downloads\\dummy.xlsx");
        
        driver.findElement(By.xpath("//button[@name='send']")).click();
//   WebElement Upload_Msg = driver.findElement(By.xpath("//center[contains(text(),'1 file ')]"));
//        System.out.println("File successfully uploaded:" + driver.getText(Upload_Msg));
   System.out.println("File Uploaded! "+ driver.findElement(By.xpath("//center[contains(text(),'1 file ')]")).getText());
   
	}

}
