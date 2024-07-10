package My_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Heroku_firefox {
	 WebDriver driver;

	    @BeforeTest
	    public void setup() {
	       
	        driver = new FirefoxDriver();
	        driver.get("https://the-internet.herokuapp.com/login");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }

	    @Test
	    public void tc1() throws InterruptedException {
	        driver.findElement(By.cssSelector("[id=\"username\"]")).sendKeys("tomsmith");
	        driver.findElement(By.cssSelector("[name=\"password\"]")).sendKeys("SuperSecretPassword!");
	        driver.findElement(By.cssSelector("[class=\"fa fa-2x fa-sign-in\"]")).click();
	        
	   
	        String act =driver.getTitle();	 
	        System.out.println(act);
	        String exp = "The Internet";
	        Assert.assertEquals(exp, act);
	    }

	  
		
		@AfterTest
		public void teardwon() throws InterruptedException
		{
			Thread.sleep(3000);
			driver.quit();
		}

}
