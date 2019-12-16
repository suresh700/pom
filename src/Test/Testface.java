package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import qapomhome.Pomface;
import qapomhome.homepage;

public class Testface
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\seleinum\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		Pomface f=new  Pomface(driver);
		f.day();
	}

}
