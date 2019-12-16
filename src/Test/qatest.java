package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import qapomhome.homepage;
import qapomhome.practicepage;

public class qatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\SOFTWARES\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.qaclickacademy.com/");
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		homepage h=new homepage(driver);
		h.homepagepr();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		practicepage p=new practicepage(driver);
		p.practice();

	}

}
