package week4.Day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class Assignment1 extends BaseClass1 {

	@Test(priority=2, dependsOnMethods="week4.Day4.Assignment2.salesforceArchitect", enabled=false)

	public void saleforceAdministrator() throws InterruptedException {
		// TODO Auto-generated method stub

//		1. Launch Salesforce application https://login.salesforce.com/
//			2. Login with username as "hari.radhakrishnan@qeagle.com" 
//			    and password as "Leaf@123"
//			3. Click on Learn More link in Mobile Publisher
//			4. Click confirm on Confirm redirect
//			5. Click Learning 
//			6. And mouse hover on Learning On Trailhead
//			7. Clilck on Salesforce Certifications
//			8. Click on first resulting Ceritificate
//			9. verify - Administrator Overview page
//			10.Print the Certifications available for Administrator Certifications (List)

		driver.findElement(By.xpath("//a[text()='Administrator']")).click();
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.contains("administrator")) {
			System.out.println("Page is Verified Successfully and it was in Administator");
		} else {
			System.out.println("Page is Verified Successfully and it was not in Administator");
		}
		List<String> allList1 = new ArrayList<String>();
		WebElement path4 = driver.findElement(By.xpath(
				"//div[@class='slds-grid slds-wrap slds-grid--align-center slds-grid--pull-padded slds-grid--vertical-stretch']"));
		act.scrollToElement(path4).perform();
		Thread.sleep(5000);
//		for(int i=1;i<=8;i++)
//		{
//		
//		String text = driver.findElement(By.xpath("(//div[@class='slds-grid slds-wrap slds-grid--align-center slds-grid--pull-padded slds-grid--vertical-stretch']/div[i]/div)/div[3]/a")).getText();
//		Thread.sleep(5000);
//		allList1.add(text);
//		}
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
		String text7 = driver.findElement(By.xpath(
				"(//div[@class='slds-grid slds-wrap slds-grid--align-center slds-grid--pull-padded slds-grid--vertical-stretch']/div[8]/div)/div[3]/a"))
				.getText();
		allList1.add(text7);

		System.out.println(allList1);

	}

}
