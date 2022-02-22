package org.logo.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
	public class Base {
		public static WebDriver driver;
		/*
		 * To initialize the Webdriver
		 */
		public static void getDriver() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Krishnakishore\\eclipse-workspace\\AutomationPractice\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		/*
		 * Enter the Url
		  */
		public static void getUrl(String url) {
			driver.get(url);
			}

		/*  
		 * To get the title of the application
		  */
		public static String getTitle(){
			String title=driver.getTitle();
			return title;
		}
		/*  
		 * To get the current Url of the application
		  */
		public static String getCurrentUrl() {
			String currentUrl=driver.getCurrentUrl();
			return currentUrl;
		}
		/*
		 * Close the current browser
		 */
		public static void closeBrowser(){
			driver.close();
			}
		/* 
		 * To click button or link or radio button or checkbox
		 */
		public static void Click(WebElement element) {
			element.click();
		}
		/*
		 * To pass the values into textbox
		 */
		public void insertType(WebElement element, String value) {
			element.sendKeys(value);
		}
		
	    public static void scroll(WebElement element) {
	    	JavascriptExecutor js=(JavascriptExecutor) driver;
	    	js.executeScript("arguments[0].scrollIntoView(true)", element);
	    }
	    
	    public static String Text(WebElement element) {
	    	String text=element.getText();
	    	return text;
	    	
	    	
	    }
	    
	    public static String Attribute(WebElement element) {
	    	String text=element.getAttribute("placeholder");
	    	return text;
	    	 
	    }
		}

