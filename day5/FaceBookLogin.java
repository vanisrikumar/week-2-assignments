package week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookLogin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("thanishka.new@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("kumar309");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("lulu");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kumar");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9786763459");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("lulu309");
		WebElement day = driver.findElement(By.id("day"));
		Select index = new Select(day);
		index.selectByIndex(10);
		
		WebElement month = driver.findElement(By.id("month"));
		Select kambu = new Select(month);
		kambu.selectByVisibleText("july");
		
		WebElement year = driver.findElement(By.id("year"));
		Select sombu = new Select(year);
		sombu.selectByValue("2000");
		
		driver.findElement(By.xpath("//input[@value='2']")).click();

	}

}
