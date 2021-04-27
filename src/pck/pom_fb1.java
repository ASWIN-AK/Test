package pck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_fb1 {
	public static WebDriver driver1;
public static WebDriver getDriver1() {
		return driver1;
	}
	public WebElement getUser() {
		return user;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getSubmit() {
		return submit;
	}
public pom_fb1(WebDriver driver) {
		// TODO Auto-generated constructor stub//
	this.driver1=driver;
	PageFactory.initElements(driver1, this);
	}
@FindBy(id="email")
private WebElement user;
@FindBy(id="pass")
private WebElement pass;
@FindBy(xpath ="//button[@type=\"submit\"]")
private WebElement submit;
}
