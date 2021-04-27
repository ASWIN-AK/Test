package pck;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base_class1 extends base_class{
	public static void main(String[] args) throws Throwable {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Demo\\driver\\chromedriver.exe");
	//WebDriver driver=new ChromeDriver();
	//driver.get("https://www.amazon.in/s?k=nike+shoe");
	//driver.manage().window().maximize();
//	WebElement white = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-medium a-text-center'])[4]"));
	// clickonmethod(white);
	browserlaunch("chrome");
	driver.get("https://www.amazon.in/s?k=nike+shoe");
	WebElement snd = driver.findElement(By.id("twotabsearchtextbox"));
	sendkey(snd, "white shoe");
	WebElement click = driver.findElement(By.id("nav-search-submit-button"));
	actn(KeyEvent.VK_ENTER);
	
	
	
	
	}
	

} 
