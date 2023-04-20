package week4.Day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.sukgu.Shadow;

public class BaseClass1 {
	public ChromeOptions opt;
	public ChromeDriver driver;
	public Actions act;
	@BeforeMethod
	
	public void preConditions() throws InterruptedException 
	{

	opt=new ChromeOptions();
	opt.addArguments("--disable-Notifications");
	driver=new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://login.salesforce.com");
	
	driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
	driver.findElement(By.id("password")).sendKeys("Leaf@123");
	driver.findElement(By.id("Login")).click();
	Thread.sleep(3000);
	String title = driver.getTitle();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[text()='Learn More']")).click();
	Set<String> windowHandles = driver.getWindowHandles();
	List<String> allList=new ArrayList<String>(windowHandles);
	Thread.sleep(3000);
	driver.switchTo().window(allList.get(1));
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='Confirm']")).click();
	String title2 = driver.getTitle();
	if(title.equals(title2))
	{
		System.out.println("Window is not Redirected");
	}
	else
	{
		System.out.println("Window is Redirected Successfully");
	}
	Thread.sleep(3000);
	Shadow shd=new Shadow(driver);
	shd.setImplicitWait(5);
	shd.findElementByXPath("//span[text()='Learning']").click();
	act=new Actions(driver);
	WebElement shadowpath = shd.findElementByXPath("//span[text()='Learning on Trailhead']");
	act.moveToElement(shadowpath).perform();
	Thread.sleep(3000);
	WebElement path2 = shd.findElementByXPath("//h2[text()='Learning on Trailhead']");
	act.moveToElement(path2).perform();
	shd.setImplicitWait(5);
	WebElement path3 = shd.findElementByXPath("//a[text()='Salesforce Certification']");
	act.scrollToElement(path3).perform();
	shd.setImplicitWait(5);
	shd.findElementByXPath("//a[text()='Salesforce Certification']").click();
	Thread.sleep(3000);
	
	}
@AfterMethod
	
	public void postConditions()
	{
		driver.close();

	}
}
