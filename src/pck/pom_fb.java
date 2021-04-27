package pck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pom_fb {
public static void main(String[] args) throws Throwable {
                  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Demo\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		pom_fb1 ak=new pom_fb1(driver);
		ak.getUser().sendKeys("ashwinkumar2421@gmail.com");
		ak.getPass().sendKeys("805624219");
		ak.getSubmit().click();
}
}