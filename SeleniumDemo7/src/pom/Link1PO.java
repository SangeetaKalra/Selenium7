package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Link1PO {
	public Link1PO(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='REGISTER']")
	private WebElement reg;

	public WebElement reg() {
		return reg;
	}

	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement fName;

	public WebElement fName() {
		return fName;
	}

	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement lName;

	public WebElement lName() {
		return lName;
	}

	@FindBy(xpath = "//input[@name='phone']")
	private WebElement ph;

	public WebElement ph() {
		return ph;
	}

	@FindBy(xpath = "//input[@name='userName']")
	private WebElement eMail;

	public WebElement eMail() {
		return eMail;
	}

	@FindBy(xpath = "//input[@name='address1']")
	private WebElement add1;

	public WebElement add1() {
		return add1;
	}

	@FindBy(xpath = "//input[@name='city']")
	private WebElement City;

	public WebElement City() {
		return City;
	}

	@FindBy(xpath = "//input[@name='state']")
	private WebElement State;

	public WebElement State() {
		return State;
	}

	@FindBy(xpath = "//input[@name='postalCode']")
	private WebElement pCode;

	public WebElement pCode() {
		return pCode;
	}

	@FindBy(xpath = "//select[@name='country']")
	private WebElement Country;

	public WebElement Country() {
		return Country;
		
		
	}
/*
	@FindBy(xpath = "//input[@name='email']")
	private WebElement uName;

	public WebElement uName() {
		return uName;
	}

	@FindBy(xpath = "//input[@name='password']")
	private WebElement pwd;

	public WebElement pwd() {
		return pwd;
	}

	@FindBy(xpath = "//input[@name='confirmPassword']")
	private WebElement cPwd;

	public WebElement cPwd() {
		return cPwd;
	}
	*/
	public void regist(String fname, String lname, String pho, String emai, String add2, String city1, 
			String state1, String pinCd, String countr) {
		fName.sendKeys(fname);
		lName.sendKeys(lname);
		ph.sendKeys(pho);
		eMail.sendKeys(emai);
		add1.sendKeys(add2);
		City.sendKeys(city1);
		State.sendKeys(state1);
		pCode.sendKeys(pinCd);
		Country.sendKeys(countr);
		
		
	}


}
