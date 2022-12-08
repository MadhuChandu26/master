package pomscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomFblogin {
	
	@FindBy(id="email")
	 private WebElement unTbox;
	
	@FindBy(id="pass")
	 private WebElement pwdtbox;

	@FindBy(name="login")
	 private WebElement loginbtn;
	
	public PomFblogin (WebDriver driver) 
	{
	
	PageFactory.initElements(driver,this);
	}
	public void usname(String un)
	{
		unTbox.sendKeys(un);
		
	}
	public void passwd (String pwd)
	{
		pwdtbox.sendKeys(pwd);
		
	}
	public void  clicklogin()
	{
		loginbtn.click();
		
	}


}



