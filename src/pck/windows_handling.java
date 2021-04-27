package pck;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class windows_handling {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Demo\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement act = driver.findElement(By.xpath("//a[text()='Mobiles']"));
    Actions ac=new Actions(driver);
    ac.contextClick(act).build().perform();
Robot rb=new Robot();
rb.keyPress(KeyEvent.VK_DOWN);
rb.keyPress(KeyEvent.VK_ENTER);
Thread.sleep(3000);
WebElement act1 = driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));
ac.contextClick(act1).build().perform();
rb.keyPress(KeyEvent.VK_DOWN);
rb.keyPress(KeyEvent.VK_ENTER);
Thread.sleep(3000);
java.util.Set<String> WH = driver.getWindowHandles();
for (String ak : WH) {
	System.out.println(ak);
	String ay = driver.switchTo().window(ak).getTitle();
	System.out.println(ay);

}
	}}
