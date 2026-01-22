package test2JavaPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scripttoautomationtestcase {
	public static void main(String[]args) {
		ChromeDriver driver = new ChromeDriver();
		  driver.get("https://www.saucedemo.com/v1/");
		  
		  //enter the user name
		  driver.findElement(By.xpath("//input[@id='user-name']"))
	      .sendKeys("standard_user");
		  
		  //enter the password
		  driver.findElement(By.name("password"))
		  .sendKeys("secret_sauce");
		  
		  //click the login button
		  
		  driver.findElement(By.id("login-button")).click();
		  
	        
		    WebElement firstProductName = driver.findElement(
	                By.xpath("(//div[@class='inventory_item_name'])[1]"));
	        System.out.println("First Product Name: " + firstProductName.getText());
          

	}
	
   
}
