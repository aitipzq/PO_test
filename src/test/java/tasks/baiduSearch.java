package tasks;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.ReadProperties;

public class baiduSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void search(WebDriver dr,String s1) throws InterruptedException, FileNotFoundException, IOException{
		dr.findElement(By.xpath(ReadProperties.getprop("element", "elements", "baiducontent"))).clear();
		Thread.sleep(2000);
		dr.findElement(By.xpath(ReadProperties.getprop("element", "elements", "baiducontent"))).sendKeys(s1);
		dr.findElement(By.xpath(ReadProperties.getprop("element", "elements", "baidusearch"))).click();
		Thread.sleep(2000);
	}
}
