package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swag_labs {
	 public static void main(String []args) throws  InterruptedException {
	        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://www.saucedemo.com/");
	        driver.findElement(By.id("user-name")).sendKeys("standard_user");
	        Thread.sleep(1000);
	        driver.findElement(By.id("password")).sendKeys("secret_sauce");
	        Thread.sleep(1000);
	        WebElement login=driver.findElement(By.id("login-button"));
	        login.click();
	        String actualUrl="https://www.saucedemo.com/inventory.html";
	        String expectedUrl= driver.getCurrentUrl();
	        if(actualUrl.equalsIgnoreCase(expectedUrl))
	        {System.out.println("Login is Successfull");}
	        else 
	        {System.out.println("Login is not successfull");}
	    }
	}


