package projectonesource;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class loginfailsinvalid {
	
	ChromeDriver driver;
    @FindBy(name="email")
    WebElement usernamemobile;
    
    @FindBy(id="continue")
    WebElement continue_button;
    
    @FindBy(name="password")
    WebElement pass;
    
    @FindBy(xpath="//span[@class='a-button-inner']")
    WebElement signinbutton;
    
    
    public void email()
    {
  	  usernamemobile.sendKeys("8999399584");
    }
    
    public void continubutton()
    {
  	  continue_button.click();
    }
    
    public void pass()
    {
  	  pass.sendKeys("dhanubkr");
    }
    
    public void login(ChromeDriver driver)
    {
  	  signinbutton.click();
 	//Assert.assertEquals(driver.getTitle(), "Your Amazon.in ","Your Amazon.in");
  Assert.assertEquals(driver.getTitle(), "Amazon Sign In","error in the page");
  	//Assert.assertEquals(true, false);
  	
  	
    }
    public loginfailsinvalid(ChromeDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	}



