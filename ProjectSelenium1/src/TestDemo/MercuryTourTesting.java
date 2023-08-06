package TestDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MercuryTourTesting {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();

		driver.navigate().to("http://demo.guru99.com/test/ajax.html");

		// String expectedtitle = "Welcome: Mercury Tours";

		List<WebElement> elements = driver.findElements(By.name("name"));

		System.out.println("number of elements " + elements.size());

		for (int i = 0; i < elements.size(); i++) {

			System.out.println("Radio button :" + elements.get(i).getAttribute("value"));
		}
	}

}
