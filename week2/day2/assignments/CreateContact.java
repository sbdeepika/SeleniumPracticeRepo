package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		driver.findElement(By.partialLinkText("Contacts")).click();
		
		driver.findElement(By.partialLinkText("Create Contact")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Deepika");
		
		driver.findElement(By.id("lastNameField")).sendKeys("S");
		
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Adhi");
		
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("M");
		
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Validation");
		
		driver.findElement(By.id("createContactForm_description")).sendKeys("Firmware Validation Engineer");
		
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Adhi@gmail.com");
		
		WebElement State = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		
		Select st = new Select(State);
		
		st.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.partialLinkText("Edit")).click();
		
		driver.findElement(By.id("updateContactForm_description")).clear();
		
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Contact has been updated");
		
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		
		System.out.println(driver.getTitle());
	}

}
