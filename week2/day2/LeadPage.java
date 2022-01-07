package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeadPage {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		
		
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		
        WebElement userName = driver.findElement(By.xpath("//input[@id = 'username']"));
		
		userName.sendKeys("DemoSalesManager");
		
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.xpath("//input[@id = 'CRM/SFA']")).click();
		
		
		driver.findElement(By.xpath("//input[@id = 'Create Lead']")).click();
		
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_companyName']")).sendKeys("TestLeaf");
		
		driver.findElement(By.xpath("//input[@class = 'inputBox' and @name = 'first name']")).sendKeys("Haja");
		
		driver.findElement(By.xpath("//input[contains(@class,'input'and @name = 'lastname']")).sendKeys("J");
		
		WebElement dd = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
