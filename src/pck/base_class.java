package pck;

import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class base_class {
	public static WebDriver driver;

	public static WebDriver browserlaunch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Admin\\eclipse-workspace\\Demo\\driver\\chromedriver.exe");
			driver = new ChromeDriver();

		} else {
			System.out.println("invalid browser");

		}
		driver.manage().window().maximize();

		return driver;

	}

	public static void geturl(String url) {
		driver.get(url);

	}

	public static void clickonmethod(WebElement clk) {
		clk.click();

	}

	public static void sendkey(WebElement send, String s) {
		send.click();
	}

	public static void actn(int vkEnter) throws Throwable {
      Actions ac=new Actions(driver);
      Robot rb=new Robot();
	

}
}
