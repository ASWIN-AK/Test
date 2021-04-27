package pck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Demo\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	WebElement frst = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	frst.click();
	driver.switchTo().alert().accept();
	WebElement scd = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	scd.click();
	WebElement thrd = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	thrd.click();
	driver.switchTo().alert().dismiss();
    WebElement frth = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
    frth.click();
    WebElement ffth = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
    ffth.click();
    driver.switchTo().alert().sendKeys("ashwin");
    driver.switchTo().alert().accept();

}
}
