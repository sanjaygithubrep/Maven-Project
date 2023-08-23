package DemoTest.SeleniumMaven;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondTest {
	 public static void main(String[] args) {
	        // Setup WebDriverManager
	        WebDriverManager.chromedriver().setup();

	        // Create a new instance of ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Perform actions with the WebDriver
	        driver.get("https://www.google.com");
	        System.out.println("Page title: " + driver.getTitle());

	        // Quit the WebDriver
//	        driver.quit();
	    }
	}


