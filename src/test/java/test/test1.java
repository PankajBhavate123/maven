package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {


 @Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
	}
	
}
