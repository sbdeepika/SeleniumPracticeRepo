package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundRadio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.leafground.com/radio.xhtml");
		
		driver.findElement(By.xpath("(//span[contains(@class,'ui-radiobutton-icon')])[12]")).click();
		
		driver.findElement(By.xpath("(//span[contains(@class,'ui-radiobutton-icon')])[17]")).click();

		//		Not able to find the default Radio button
		String attribute = driver.findElement(By.xpath("(//div[contains(@class,'ui-radiobutton-box')])[21]")).getAttribute("label");
	
		System.out.println(attribute);
		
		//Not able to check the age group selected or not?
		
		System.out.println(driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default ui-state-active'])[6]")).isSelected());
	}

}
