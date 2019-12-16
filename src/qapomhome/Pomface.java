package qapomhome;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pomface {
	
	@FindBy(xpath="//select[@title=\"Day\"]")private WebElement day;
	 
public Pomface(WebDriver driver) {
	
	PageFactory.initElements(driver, this);
}
public void day() 
{
	
	Select s=new Select(day);
	List <WebElement> a=s.getOptions();
	for(int i=0;i<=a.size()-1;i++) {
		
	System.out.println(	a.get(i).getText());
	}
	
}

}
