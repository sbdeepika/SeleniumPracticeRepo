package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		driver.findElement(By.name("phoneCountryCode")).sendKeys("");
		
		driver.findElement(By.name("phoneAreaCode")).sendKeys("044");
		
		driver.findElement(By.name("phoneNumber")).sendKeys("22108938");
			
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		
		String leadId = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
	
		System.out.println("lead id"+leadId);
		
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		System.out.println("test");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
		
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);
		
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		
		boolean displayed = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).isDisplayed();
				
		if(displayed)
		{
			System.out.println("NO Records found");
		}
		else
		{
			System.out.println("Records are found!!!");
		}
		
		//18	Close the browser (Do not log out)
		
		driver.close();
	}

}
