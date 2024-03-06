package maven.test;

import java.time.Duration;
import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	
	WebDriver driver;
	@BeforeTest
	public void launchb() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}
	@AfterTest
	public void close() {
		driver.quit();
	}
	 
	//a[text()='Logout']
	//input[@name='username']
	//input[@name='password']
	
	
	ResourceBundle rbl=ResourceBundle.getBundle("config");
	String un=rbl.getString("username");
	String pw=rbl.getString("password");
	@Test
	public void login() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pw);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//header/div[1]/div[2]/ul[1]/li[1]/span[1]/i[1]")).click();
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//a[text()='Logout']"))).click();
		

	
	}
}


