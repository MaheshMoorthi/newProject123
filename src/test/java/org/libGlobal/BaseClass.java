package org.libGlobal;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public static WebDriver driver;

public static  WebDriver launchBrowser() {
	 WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 return driver;
}

public static void loadUrl(String url) {
	driver.manage().window().maximize();
	driver.get(url);
}

public static  void fillText(WebElement e,  String text) {
	e.clear();
	
		e.sendKeys(text);
}


public static void jsFillText(String text,WebElement e) {
	e.clear();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('value','"+text+"')",e);
	

}

public static void click(WebElement e) {
	e.click();
}


}

