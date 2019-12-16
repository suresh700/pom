package qapomhome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage 
{
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement pr;
	
	
public  homepage(WebDriver driver)
 {
	PageFactory.initElements(driver, this);
		
 }

public void homepagepr()
{
	pr.click();
	}
	


}
