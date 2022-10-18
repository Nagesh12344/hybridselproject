package genericLib;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
	public void dropdown(WebElement ele,String text) {
		Select s=new Select(ele);
		s.selectByVisibleText(text);
		
	}
	public void mouseHover(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();	
	}
	public void doubeClick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	public void draganddrop(WebDriver driver,WebElement src,WebElement dest) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src, dest).perform();
		
	}
	public void switchFrame(WebDriver driver) {
		driver.switchTo().frame(0);
	}
	public void switchBack(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	public void alretpop(WebDriver driver) {
		driver.switchTo().alert().accept();	
	}
	public void scrollBar(WebDriver driver,int X,int Y) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+X+","+Y+")");
		
	}
	public void switchTabs(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
	      for(String b:child) {
	    	  driver.switchTo().window(b);
	    	 		
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
