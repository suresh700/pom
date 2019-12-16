package pomlogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout {
	
	@FindBy(id="userNavigationLabel")private WebElement N;
	@FindBy(xpath="//*[@id=\"js_dx\"]/div/div/ul/li[8]/a/span/span")private WebElement L;
			
	public logout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void nvbutton()
	 {
		N.click();
	 }
	 public void logoutbutton()
	 {
		L.click();
		
	 }
}
