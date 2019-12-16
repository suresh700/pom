package pomlogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	@FindBy(name="email")private WebElement UN;
	@FindBy(name="pass")private WebElement pass;
	@FindBy(id="loginbutton")private WebElement button;
	@FindBy(xpath="//*[@id=\"globalContainer\"]/div[3]/div/div/div")
	private WebElement text;
	
	
  
public  Login(WebDriver driver)
 {
	PageFactory.initElements(driver, this);
	
 }
 public void loginUN(String u)
 {
	UN.sendKeys(u);
 }
 public void loginpass(String p)
 {
	pass.sendKeys(p);
	
 }
 public void loginbutton()
 {
	button.click();
 }
public void text()
{String xt = text.getText();
		System.out.println(xt);
	}
}