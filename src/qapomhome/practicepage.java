package qapomhome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class practicepage {
	
	@FindBy(name="radioButton")
	private WebElement rb;

public practicepage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void practice() 
{
	rb.click();
	}
}
