package demo2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class demoClass {
public static void main(String[] args) {
	
		
	System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://automationpractice.com/index.php");
	
	driver.manage().window().maximize();

	//System.out.println(driver.getTitle());
	//click sign in
	driver.findElement(By.linkText("Sign in")).click();
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	WebElement email = driver.findElement(By.id("email_create"));
	email.sendKeys("ahasanhabibbadhoneng@gmail.com");
	
	WebElement submit = driver.findElement(By.id("SubmitCreate"));
	submit.click();
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	//cur_URL
	//driver.getCurrentUrl();
	
	
	WebElement radio = driver.findElement(By.id("id_gender1"));
	radio.click();
	
	WebElement fname = driver.findElement(By.name("customer_firstname"));
	fname.sendKeys("Ahasan");
	
	WebElement lname = driver.findElement(By.id("customer_lastname"));
	lname.sendKeys("Habib");
	
	WebElement pass = driver.findElement(By.id("passwd"));
	pass.sendKeys("asdf@1234");
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	
	driver.findElement(By.id("days")).sendKeys("10");
	driver.findElement(By.id("months")).sendKeys("August");
	driver.findElement(By.id("years")).sendKeys("1985");
	
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	
	WebElement newsletter = driver.findElement(By.id("newsletter"));
	newsletter.click();
	
	driver.findElement(By.id("address1")).sendKeys("Arizona");
	driver.findElement(By.id("city")).sendKeys("Phoenix");
	
	driver.findElement(By.id("id_state")).sendKeys("Arizona");
	driver.findElement(By.id("postcode")).sendKeys("85001");
	driver.findElement(By.id("phone_mobile")).sendKeys("01968062770");
	driver.findElement(By.id("alias")).clear();
	driver.findElement(By.id("alias")).sendKeys("Dhaka-1217");
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	
	driver.findElement(By.id("submitAccount")).click();
	
		
		
		
		
		
		
		

	}
	
	

}
