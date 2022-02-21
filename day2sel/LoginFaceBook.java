package week2.day2sel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFaceBook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("thanishka.new@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Kumar309");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
