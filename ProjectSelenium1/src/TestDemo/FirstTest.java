package TestDemo;

import javax.swing.plaf.ActionMapUIResource;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstTest {

	public static void main(String[] args) {
		
	    System.setProperty("webdriver.edge.driver","C:\\Users\\ELCOT\\Downloads\\edgedriver_win32 (1)\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		
		driver.navigate().to("http://www.google.com/");
		
		String expectedURL = "https://www.google.com/";
		
		String actualUrl = driver.getCurrentUrl();
		
		String title = driver.getTitle();
		
		System.out.println("title is :"+title);
		
		if (actualUrl.equals(expectedURL)){  
			
			System.out.println("Verification is successful correct url is opened");
			
		}
		else 
			System.out.println("verification is failed expected URL is: " + expectedURL + "\n But got this URL:       " + actualUrl);
		//String ActualURL = driver.get
		driver.manage().window().maximize();  
		
		driver.findElement(By.id("APjFqb")).sendKeys("javatpoint tutorial");
		driver.findElement(By.name("btnK")).click();
		//driver. find_element_by_css_selector("input[class='gsc-input']").

		//driver.findElement(By.name("LC20lb MBeuO DKV0Md")).click();
		
		driver.navigate().back(); 
		driver.quit();
		
		
	}

	
	}

