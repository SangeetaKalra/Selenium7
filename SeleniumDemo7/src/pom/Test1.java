package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://www.newtours.demoaut.com/");
	Link1PO linkpo=new Link1PO(driver);
	linkpo.reg().click();
	linkpo.fName().sendKeys("Sangeeta");
	linkpo.lName().sendKeys("Kalra");
	linkpo.ph().sendKeys("9820778481");
	linkpo.eMail().sendKeys("kalra.sangeeta@gmail.com");
	linkpo.add1().sendKeys("Ranka Colony Road");
	linkpo.City().sendKeys("Bangalore");
	linkpo.State().sendKeys("Karnataka");
	linkpo.pCode().sendKeys("560076");
	linkpo.Country().click();
	

	
}}