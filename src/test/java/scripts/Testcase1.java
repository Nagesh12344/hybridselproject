package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddtocartPage;
import pomPages.SkillrarDemoLogin;
import pomPages.SkillraryLoginPage;

public class Testcase1 extends BaseClass {
	@Test
	public void tc1() {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsButton();
		s.SkillraryDemoapp();
		
		SkillrarDemoLogin sd=new SkillrarDemoLogin(driver);
		driverutilities.switchTabs(driver);
		driverutilities.mouseHover(driver, sd.getCoursetab());
		sd.selenium();
		
		AddtocartPage ad=new AddtocartPage (driver);
		driverutilities.doubeClick(driver, ad.getAddbtn());
		ad.addtocartbutton();
		driverutilities.alretpop(driver);
		
	}

}
