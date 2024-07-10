package My_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Heroku_Login {
	 WebDriver driver;

	    @BeforeTest
	    public void setup() {
	       
	        driver = new ChromeDriver();
	        driver.get("https://the-internet.herokuapp.com/login");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }

	    @Test
	    public void tc1() throws InterruptedException {
	        driver.findElement(By.cssSelector("[value=\"radio1\"]")).click();
	    }

	  
		
		@AfterTest
		public void teardwon() throws InterruptedException
		{
			Thread.sleep(3000);
			driver.quit();
		}

}
