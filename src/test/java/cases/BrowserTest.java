package cases;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tasks.baiduSearch;
import util.Browser;

import java.io.FileNotFoundException;
import java.io.IOException;


public class BrowserTest {
	private static Logger logger= Logger.getLogger(Test.class);
	WebDriver dr;
	
	@DataProvider(name="muke")
	public Object[][] getData() throws IOException{
//		String filepath="d:/testmk.xlsx";
//		Object[][] array= RangeDatabyPOI.poiRangeData(filepath);
		Object[][] array = {{"fengluo","shuai"},{"muke","bang"}};
		return array;
	}
	
	@Parameters({"browser","url"})
	@BeforeTest
	public void beforetest(String browser,String url){
		logger.info("browser is "+browser+"&url is "+url);
		dr=Browser.openBrowser(dr, browser, url);
	}
	

	@Test(dataProvider ="muke")
	public void browser(String s1,String s2) throws InterruptedException, FileNotFoundException, IOException{
		baiduSearch.search(dr, s1);
		baiduSearch.search(dr, s2);
	}
	
	@AfterTest
	public void quit(){
		Browser.closeBrowser(dr);
	}
	
	
}
