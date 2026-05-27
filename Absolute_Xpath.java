package seleniumMKT_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath 
{
  public static void main(String[] args)
  {
	  ChromeDriver driver=new ChromeDriver();	
		driver.get("file:///C:/Users/geeta/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement e1=	driver.findElement(By.xpath("(/html/body/input)[1]"));
		e1.sendKeys("Geeta");
		WebElement e2=	driver.findElement(By.xpath("(/html/body/input)[2]"));
		e2.sendKeys("Meduri");
		WebElement e3=	driver.findElement(By.xpath("(/html/body/input)[3]"));
		e3.sendKeys("geeta@123");
		WebElement e4=	driver.findElement(By.xpath("((/html/body/form)[1]/input)[1]"));
		e4.sendKeys("Geetajyothi");
		WebElement e5=	driver.findElement(By.xpath("((/html/body/form)[1]/input)[2]"));
		e5.sendKeys("Meduri");
		WebElement e6=	driver.findElement(By.xpath("((/html/body/form/)[1]/input)[3]"));
		e6.click();
		WebElement e7=	driver.findElement(By.xpath("((/html/body/form)[2]/input)/[1]"));
		e7.click();
		
		
		
}
}
