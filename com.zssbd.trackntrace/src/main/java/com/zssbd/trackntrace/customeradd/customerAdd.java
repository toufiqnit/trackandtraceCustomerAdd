package com.zssbd.trackntrace.customeradd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


import com.zssbd.trackntrace.utility.IdentifierDepot;
import com.zssbd.trackntrace.utility.baseClass;

public class customerAdd {
	
	
	
		private RandomPhone cell =new RandomPhone();
       WebDriver driver = baseClass.getDriver();
		
		
		
		
	@Test
	public void addingcustomer() throws InterruptedException {
		for(int n=0;n<=4;n++) { 
			 
			driver.get(IdentifierDepot.CustomerAddUrl); 
		 
		
		
		driver.findElement(By.xpath(IdentifierDepot.Name)).sendKeys("Oka1");
		driver.findElement(By.xpath(IdentifierDepot.PhoneNumber)).sendKeys(cell.phonenumbergenerate());
		driver.findElement(By.xpath(IdentifierDepot.Email)).sendKeys("test@gmail.com");
		driver.findElement(By.xpath(IdentifierDepot.Address)).sendKeys("Road:17,H:61");
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(IdentifierDepot.Submission)).click();
		
		System.out.println("Submitted");	
		
		
		Thread.sleep(10000);
		
		
		}
	
		 
		 
	}
}

	


