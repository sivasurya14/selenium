package TestDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandleTest {
	 public static void main(String[] args) throws InterruptedException {									
     	WebDriver driver=new EdgeDriver();			
     		
     //Launching the site.				
         driver.get("https://demo.guru99.com/popup.php");			
     driver.manage().window().maximize();		
             		
driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();			
     		
   //  String MainWindow=driver.getWindowHandle();		
     		
     // To handle all new opened window.				
//         Set<String> s1=driver.getWindowHandles();		
//         System.out.println("this is printing S1 :"+s1);
//     Iterator<String> i1=s1.iterator();		
//     		System.out.println("this is printing value of i1 : "+i1);
//     while(i1.hasNext())			
//     {		
//    	 
//         String ChildWindow=i1.next();		
//         	System.out.println("this is printing value of childwindow : "+ChildWindow);
//         	System.out.println("this is printing value of Mainwindo :"+MainWindow);
//         	
//         if(!MainWindow.equalsIgnoreCase(ChildWindow))			
//         {    		
              
                 // Switching to Child window
               //  driver.switchTo().window(ChildWindow);                                                                                                           
                 driver.findElement(By.name("emailid"))
                 .sendKeys("gaurav.3n@gmail.com");                			
                 
                 driver.findElement(By.name("btnLogin")).click();			
                              
			// Closing the Child Window.
                     driver.close();		
//         }		
//     }		
     // Switching to Parent window i.e Main Window.
       // driver.switchTo().window(MainWindow);				
 }
}		

