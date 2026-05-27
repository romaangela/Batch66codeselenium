package Homepractice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosugesstion3 
{
public static void main(String[] args) throws InterruptedException 
{
        ChromeDriver driver=new ChromeDriver();        
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();

        Thread.sleep(3000);
        for(int i=0;i<5;i++) 
        {
        WebElement searchTextBox=        driver.findElement(By.id("twotabsearchtextbox"));
        searchTextBox.sendKeys("shoes");
        Thread.sleep(3000);
//get autosuggestion
        
        List<WebElement> allProduct= driver.findElements(By.xpath("//div[@role='rowgroup']/div/div"));
        int count=allProduct.size();
        System.out.println(count);
        
        Thread.sleep(3000);
        
        	allProduct.get(i).click();
        	Thread.sleep(3000);
        	
        	driver.navigate().back();

			Thread.sleep(3000);
        }
        
      }
}
