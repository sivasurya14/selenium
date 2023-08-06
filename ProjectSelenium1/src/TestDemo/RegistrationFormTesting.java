package TestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RegistrationFormTesting {
	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		
		driver.navigate().to("https://mytestingthoughts.com/Sample/home.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("first_name")).sendKeys("siva");
		
		driver.findElement(By.name("last_name")).sendKeys("subbiramani");
		
		driver.findElement(By.id("inlineRadioMale")).click();
		
		
		
	}

}
