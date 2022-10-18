package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import genericLib.BaseClass;
import pomPages.CoursePage;
import pomPages.SkillrarDemoLogin;
import pomPages.SkillraryLoginPage;

public class Testcase2 extends BaseClass {
	public void tc2() throws IOException, InterruptedException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsButton();
		s.SkillraryDemoapp();
		
		SkillrarDemoLogin sd=new SkillrarDemoLogin(driver);
		driverutilities.switchTabs(driver);
		driverutilities.dropdown(sd.getCoursedd(),pdata.getData("coursedd"));
		
		CoursePage cp=new CoursePage(driver);	
		driverutilities.draganddrop(driver, cp.getSelenium(),cp.getCartarea());
		WebElement loc = cp.getLinkedin();
		Point l = loc.getLocation();
		int x = l.getX();
		int y = l.getY();
	driverutilities.scrollBar(driver, x, y);
		cp.linkedinicon();
	
		
		
		
	}

}
