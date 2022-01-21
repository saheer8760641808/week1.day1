package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Delete {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		// Open browser
		ChromeDriver driver = new ChromeDriver();

		// Load url
		driver.get("http://leaftaps.com/opentaps/");

		// maximize
		driver.manage().window().maximize();

		// enter username
		WebElement userName = driver.findElement(By.id("username"));

		userName.sendKeys("DemoCSR");

		// enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Login
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Click Contact tab
		driver.findElement(By.linkText("Contacts")).click();

		// Create Contact
		driver.findElement(By.linkText("Create Contact")).click();

		// Enter first name
		driver.findElement(By.id("firstNameField")).sendKeys("Saheer");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Sah");
		// Enter last name
		driver.findElement(By.id("lastNameField")).sendKeys("haja");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("moideen");
		
		
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("Saheer");

		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Thaja");
		
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("kumar.testleaf@gmail.com");
		
		WebElement dd = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dropdown = new Select(dd);
		dropdown.selectByVisibleText("london");

		// Click Create Contact Button
		driver.findElement(By.className("smallSubmit")).click();

		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		driver.findElement(By.xpath("//textarea[@name='description']")).clear();
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("TestLeaf Selenium Assignment");
		
		
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		String title = driver.getTitle();
		System.out.println("Browser title is : " + title);

		// Close browser
		driver.close();
	

	}

}
