package pck;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicXpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Demo\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/men-casual-shirts");
	driver.manage().window().maximize();
	List<WebElement>span = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span"));
	List<Integer>number=new ArrayList<>();
	for (int i = 0; i < span.size(); i++) {
		String replace = span.get(i).getText().replace("Rs. ", "");
	int value = Integer.parseInt(replace);	
	number.add(value);
	}
	System.out.println(number);
	System.out.println("minimumvalue:"+Collections.min(number));
	
	}
	
}
