package TestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseClickTest {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		
		driver.navigate().to("http://demo.guru99.com/test/newtours/");
		
		WebElement link_home = driver.findElement(By.linkText("Home"));
		WebElement td_home = driver.findElement(By.xpath("//html/body/div"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr"));
		
		 Actions builder = new Actions(driver);
         Action mouseOverHome = builder
                 .moveToElement(link_home)
                 .build();
         String bgColor = td_home.getCssValue("background-color");
         System.out.println("Before hover: " + bgColor);        
         mouseOverHome.perform();        
         bgColor = td_home.getCssValue("background-color");
         System.out.println("After hover: " + bgColor);
        // driver.close();
		
	}

}
