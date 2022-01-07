package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com");
		
		
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//input[@id ='navElements']"));
		
		
		
		

	}

}
