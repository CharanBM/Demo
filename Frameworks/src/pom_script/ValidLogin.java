package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidLogin {
	
	//declaration
	@FindBy(xpath="//input[@id='email']")
	private WebElement Un;
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement Pwd;

	@FindBy(xpath="//button[@name='login']")
	private WebElement LoginBtn;
	
	//initialization
	public ValidLogin(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	
	public void Username(String un)
	{
		Un.sendKeys(un);
	}
	
	public void Password(String pwd)
	{
		Pwd.sendKeys(pwd);
	}
	public void clickLogin()
	{
		LoginBtn.click();
	}
	
}
