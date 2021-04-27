package pck;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class robot {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Demo\\driver\\chromedriver.exe");
	
    WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement user = driver.findElement(By.id("email"));
	user.sendKeys("ashwin");
	Actions a = new Actions(driver);
	a.contextClick(user).build().perform();
	Robot rt = new Robot();
	rt.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	rt.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	rt.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	rt.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	rt.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	rt.keyPress(KeyEvent.VK_ENTER);
	a.contextClick(user).build().perform();
	rt.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	rt.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	rt.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	rt.keyPress(KeyEvent.VK_ENTER);
	
	WebElement pass = driver.findElement(By.id("passContainer"));
	a.contextClick(pass).build().perform();
	rt.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	rt.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	rt.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	rt.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	rt.keyPress(KeyEvent.VK_ENTER);
	
}
	
}

