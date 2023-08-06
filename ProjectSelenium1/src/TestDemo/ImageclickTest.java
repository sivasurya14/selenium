package TestDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class ImageclickTest {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		
		driver.navigate().to("https://demo.guru99.com/test/newtours/index.php");
		
//		WebElement headingdiv = driver.findElement(By.cssSelector("div.mouseOut"));
//		
//		WebElement span = headingdiv.findElement(By.tagName("a"));
//		
//		System.out.println("span value is ; " +span);
//		
//		System.out.println("href link "+ span.getAttribute("href"));
//		
		//driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.partialLinkText("REG")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("Sivasuriyan");
		driver.findElement(By.name("lastName")).sendKeys("Subbiramani");
		driver.findElement(By.name("phone")).sendKeys("8072400412");
		driver.findElement(By.name("address1")).sendKeys("Saravana nagar");
		driver.findElement(By.name("city")).sendKeys("chennai");
		driver.findElement(By.name("state")).sendKeys("Tamlinadu");
		driver.findElement(By.name("postalCode")).sendKeys("604601");
		Select drop = new Select(driver.findElement(By.name("country")));
		drop.selectByVisibleText("BULGARIA");
		
		driver.findElement(By.name("email")).sendKeys("Siva");
	    driver.findElement(By.name("password")).sendKeys("Sivasuriyan");
		driver.findElement(By.name("confirmPassword")).sendKeys("Sivasuriyan");
		
	
		driver.findElement(By.name("submit")).click();

		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("sign-in")).click();	

		
		driver.findElement(By.name("userName")).sendKeys("Siva");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("submit")).click();
	    
		
		System.out.println("Test passed ");
	}

}
