package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS));
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ashok");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("leyland");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("87868584");
		
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("abCd@123");
		
		WebElement dd1 = driver.findElement(By.xpath("//select[@id='day']"));
		Select dropdown1 = new Select(dd1);
		dropdown1.selectByVisibleText("10");
		
		//dropdown.selectByIndex(1);
		//dropdown.getFirstSelectedOption();
		WebElement dd2 = driver.findElement(By.xpath("//select[@id='month']"));
		Select dropdown2 = new Select(dd2);
		dropdown2.selectByValue("12");
		
		WebElement dd3 = driver.findElement(By.xpath("//select[@id='year']"));
		Select dropdown3 = new Select(dd3);
		dropdown3.selectByVisibleText("2000");
		
		driver.findElement(By.xpath("(//span[@data-name='gender_wrapper']//input)[1]")).click();
		
	}

}
