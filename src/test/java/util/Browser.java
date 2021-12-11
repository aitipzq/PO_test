package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static WebDriver openBrowser(WebDriver dr,String browser,String url){
		if (browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe");
			dr= new ChromeDriver();
			}
		else if (browser.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "d:\\geckodriver.exe");
			dr= new FirefoxDriver();	
			}
		else if (browser.equals("edge")){
				
			}
		else if (browser.equals("ie")){
				
			}
		else{
			}
			dr.manage().window().maximize();
			dr.get(url);
			return dr;
	}
	
	public static void closeBrowser(WebDriver dr){
		dr.quit();
	}
}