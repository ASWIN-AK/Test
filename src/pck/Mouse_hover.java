package pck;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Demo\\driver\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("http://automationpractice.com/index.php");
    driver.manage().window().maximize();
    WebElement wmn = driver.findElement(By.xpath("//a[@title='Women']"));
    Actions ac =new Actions(driver);
    ac.moveToElement(wmn).build().perform();
    WebElement tsht = driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
    tsht.click();
    WebElement drz = driver.findElement(By.xpath("(//div[@class='product-count'])[1]"));
    JavascriptExecutor ak=(JavascriptExecutor)driver;
    ak.executeScript("arguments[0].scrollIntoView()", drz);
    WebElement grl = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
     grl.click();
}
}
