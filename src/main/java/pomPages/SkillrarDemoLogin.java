package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillrarDemoLogin {

	@FindBy(id="course")
		private WebElement coursetab;
	
	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")//.......me
	private WebElement seleniumtraining;	
	
	@FindBy(name="addresstype")
	private WebElement coursedd;
	
	public WebElement getCoursedd() {
		return coursedd;
	}

	public SkillrarDemoLogin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getCoursetab() {
		return coursetab;
	}
	public void selenium() {
		seleniumtraining.click();
	}
	
	
	
	}
	

