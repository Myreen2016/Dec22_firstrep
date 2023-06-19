package seleniumTools;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnJUnit {
	WebDriver driver;
	
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("this is a before class");
	}
	
	
	@AfterClass
	public static void afterclass() {
		System.out.println("this is a after  class");
	}
	
	
    @Before
	public void init() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://objectspy.space/");
	}
    
    @Test
    public void loginTest() throws InterruptedException {
    	driver.findElement(By.xpath("//html/body/div/div[2]/div[2]/form/div[7]/input")).sendKeys("Selenium");
    	driver.findElement(By.xpath("//html/body/div/div[2]/div[2]/form/div[10]/input")).sendKeys("Selenium is fun");
    	driver.findElement(By.xpath("//html/body/div/div[2]/div[2]/form/div[13]/input")).sendKeys("abc123");
    	Thread.sleep(5000);
    	
    	
    	
    }
    
    @After
    public void TearDown() {
    	driver.quit();
    	
    }
    
    
    

}
