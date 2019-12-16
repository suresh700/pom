package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pomlogin.Login;
import pomlogin.logout;

public class Testm 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\SOFTWARES\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login.php");
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		Login l=new Login(driver);
		l.loginUN("loharhemant@yahoo.in");
		l.loginpass("8765467854");
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		l.loginbutton();
		//l.text();
		logout lg=new logout(driver);
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		lg.nvbutton();
		lg.logoutbutton();
		//driver.close();

	}

}
