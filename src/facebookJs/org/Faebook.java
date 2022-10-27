package facebookJs.org;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Faebook {
	private static WebElement findElement;
	private static WebElement findElement2;
	private static WebElement findElement3;
	private static WebElement findElement4;
	private static WebElement findElement5;
	private static WebElement findElement6;
	private static WebElement findElement7;
	private static File screenshotAs;
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\petta\\eclipse-workspace\\selinium\\Facebook js\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php");
		driver.manage().window().maximize();
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		findElement = driver.findElement(By.name("firstname"));
		findElement2 = driver.findElement(By.name("lastname"));
		findElement3 = driver.findElement(By.name("reg_email__"));
		findElement4 = driver.findElement(By.name("reg_passwd__"));
		findElement5 = driver.findElement(By.name("birthday_day"));
		findElement6 = driver.findElement(By.name("birthday_month"));
		findElement7 = driver.findElement(By.name("birthday_year"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("argument[0].setAttribute('value','peter')",findElement );
		js.executeScript("argument[0].setAttribute('value','sajith')", findElement2);
		js.executeScript("argument[0].setAttribute('value','petersajith11@gmail.com')", findElement3);
		js.executeScript("argument[0].setAttribute('value','petersajith11')", findElement4);
		
		Select first= new Select(findElement5);		
		first.selectByVisibleText("11");
		Select first1= new Select(findElement6);
		first1.selectByVisibleText("Apr");
		Select first2= new Select(findElement7);
		first2.selectByVisibleText("1996");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		//File des= new file();
		
		
	
		
		
	}

}
