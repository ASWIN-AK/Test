package pck;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
		
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Demo\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement crtacct = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		crtacct.click();
		Thread.sleep(2000);
		
		WebElement date = driver.findElement(By.xpath("//select[@title  = 'Day']"));
		Select sc = new Select(date);
		sc.selectByIndex(3);
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.id("month"));
		Select sc1 = new Select(month);
		sc1.selectByValue("3");
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.id("year"));
		Select sc2 = new Select(year);
		sc2.selectByValue("2018");
		
		//Actions ac = new Actions(driver);
		//ac.contextClick(date).build().perform();
		
		
		//Robot rb = new Robot();
		//rb.keyPress(KeyEvent.VK_DOWN); 
		//rb.keyPress(KeyEvent.VK_ENTER);
		
		}
}