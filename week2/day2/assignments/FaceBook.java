package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.partialLinkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Deepika");
		
		driver.findElement(By.name("lastname")).sendKeys("S");
		
		driver.findElement(By.name("reg_email__")).sendKeys("dee@gmail.com");
		
		driver.findElement(By.id("password_step_input")).sendKeys("Dee123");
		
		WebElement day = driver.findElement(By.id("day"));
		
		Select D = new Select(day);
		
		D.selectByValue("24");
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select M = new Select(month);
		
		M.selectByVisibleText("Oct");
		
		WebElement year = driver.findElement(By.id("year"));
		
		Select Y = new Select(year);
		
		Y.selectByIndex(35);
		
		driver.findElement(By.xpath("//input[@name='sex']")).click();
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();

	}

}
