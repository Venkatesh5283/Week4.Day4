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
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class Assignment2 extends BaseClass1 {

	@Test(priority=1, invocationCount=2, threadPoolSize=2)

	public void salesforceArchitect() throws InterruptedException {

//		Assignment-2: Architect Certifications
//		=======================================
//		1. Launch Salesforce application https://login.salesforce.com/
//		2. Login with Provided Credentials
//		3. Click on Learn More link in Mobile Publisher
//		4. Click  On Learning
//		5. And mouse hover on Learning On Trailhead
//		6. Click on Salesforce Certifications
//		7. Choose Your Role as Salesforce Architect
//		8. Get the Text(Summary) of Salesforce Architect 
//		9. Get the List of Salesforce Architect Certifications Available
//		10.Click on Application Architect 
//		11.Get the List of Certifications available

		driver.findElement(By.xpath("//a[@href='/en/credentials/architectoverview']//div[1]")).click();
		String Summary = driver
				.findElement(By.xpath("//div[contains(@class,'cert-site_text slds-text-align--center')]")).getText();

		List<String> allList1 = new ArrayList<String>();

		String text = driver.findElement(By.xpath(
				"(//div[@class='slds-grid slds-wrap slds-grid--align-center slds-grid--pull-padded slds-grid--vertical-stretch']/div[1]/div)/div[3]/a"))
				.getText();
		allList1.add(text);
		String text1 = driver.findElement(By.xpath(
				"(//div[@class='slds-grid slds-wrap slds-grid--align-center slds-grid--pull-padded slds-grid--vertical-stretch']/div[2]/div)/div[3]/a"))
				.getText();
		allList1.add(text1);
		String text2 = driver.findElement(By.xpath(
				"(//div[@class='slds-grid slds-wrap slds-grid--align-center slds-grid--pull-padded slds-grid--vertical-stretch']/div[3]/div)/div[3]/a"))
				.getText();
		allList1.add(text2);
		String text3 = driver.findElement(By.xpath(
				"(//div[@class='slds-grid slds-wrap slds-grid--align-center slds-grid--pull-padded slds-grid--vertical-stretch']/div[4]/div)/div[3]/a"))
				.getText();
		allList1.add(text3);
		String text4 = driver.findElement(By.xpath(
				"(//div[@class='slds-grid slds-wrap slds-grid--align-center slds-grid--pull-padded slds-grid--vertical-stretch']/div[5]/div)/div[3]/a"))
				.getText();
		allList1.add(text4);
		String text5 = driver.findElement(By.xpath(
				"(//div[@class='slds-grid slds-wrap slds-grid--align-center slds-grid--pull-padded slds-grid--vertical-stretch']/div[6]/div)/div[3]/a"))
				.getText();
		allList1.add(text5);
		String text6 = driver.findElement(By.xpath(
				"(//div[@class='slds-grid slds-wrap slds-grid--align-center slds-grid--pull-padded slds-grid--vertical-stretch']/div[7]/div)/div[3]/a"))
				.getText();
		allList1.add(text6);
		Thread.sleep(3000);
		driver.findElement(By.linkText("Application Architect")).click();
		Thread.sleep(5000);

		List<String> allList2 = new ArrayList<String>();

		String txt = driver.findElement(By.xpath(
				"(//div[@class='slds-grid slds-wrap slds-grid--align-center slds-grid--pull-padded slds-grid--vertical-stretch']/div[1]/div)/div[3]/a"))
				.getText();
		allList2.add(txt);
		String txt1 = driver.findElement(By.xpath(
				"(//div[@class='slds-grid slds-wrap slds-grid--align-center slds-grid--pull-padded slds-grid--vertical-stretch']/div[2]/div)/div[3]/a"))
				.getText();
		allList2.add(txt1);
		String txt2 = driver.findElement(By.xpath(
				"(//div[@class='slds-grid slds-wrap slds-grid--align-center slds-grid--pull-padded slds-grid--vertical-stretch']/div[3]/div)/div[3]/a"))
				.getText();
		allList2.add(txt2);
		String txt3 = driver.findElement(By.xpath(
				"(//div[@class='slds-grid slds-wrap slds-grid--align-center slds-grid--pull-padded slds-grid--vertical-stretch']/div[4]/div)/div[3]/a"))
				.getText();
		allList2.add(txt3);
		Thread.sleep(3000);
		System.out.println("Summary Of Salesforce Architect: " + Summary);
		System.out.println(allList1);
		System.out.println(allList2);

		Thread.sleep(2000);

	}

}
