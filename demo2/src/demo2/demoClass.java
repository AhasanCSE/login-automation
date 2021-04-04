package demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.org.apache.bcel.internal.generic.Select;

public class demoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("http://automationpractice.com/index.php");
	   System.out.println(driver.getTitle());
	   
	   driver.findElement(By.linkText("Sign in")).click();
	   WebElement email = driver.findElement(By.id("email_create"));
	   email.sendKeys("abcdef6fvfn@gmail.com");
	   WebElement accsubmit=driver.findElement(By.name("SubmitCreate"));
	   accsubmit.click();
	   
	   driver.findElement(By.id("id_gender1")).click();
	   WebElement fname = driver.findElement(By.id("customer_firstname"));
	   WebElement lname = driver.findElement(By.id("customer_lastname"));
	   WebElement password = driver.findElement(By.id("passwd"));
	   fname.sendKeys("Ahasan");
	   lname.sendKeys("Habib");
	   password.sendKeys("badhon");
	   
	   Select day = new Select(driver.findElement(By.name("days")));
		day.selectByVisibleText("10");
	}

}
