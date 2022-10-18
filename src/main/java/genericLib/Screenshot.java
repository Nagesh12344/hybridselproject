package genericLib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	public void getphoto(WebDriver driver,String name) throws IOException {
		
		
		Date d=new Date();
		String currentdate = d.toString().replaceAll(":","-");
		
		TakesScreenshot tc=(TakesScreenshot) driver;
		File src = tc.getScreenshotAs(OutputType.FILE);
		File dest=new File(AutoConstant.photopath+currentdate+name+".png");
		FileUtils.copyFile(src, dest);
	}

}
