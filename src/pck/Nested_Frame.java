package pck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_Frame {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Demo\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Frames.html");
	driver.manage().window().maximize();
	WebElement nested = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	nested.click();
	WebElement nframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
    driver.switchTo().frame(nframe);
    WebElement iframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	driver.switchTo().frame(iframe);
	WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
	text.sendKeys("ASHWIN");
	driver.switchTo().defaultContent();
	WebElement fin = driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
	fin.click();
	}
}
