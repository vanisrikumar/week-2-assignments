package week2.day2sel;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String text=driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("sri");
		driver.findElement(By.id("lastNameField")).sendKeys("N");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("harsini");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Kumar");
		driver.findElement(By.name("departmentName")).sendKeys("XYZ");
		driver.findElement(By.name("description")).sendKeys("vkjyff");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("hggf.new@gmail.com");
		WebElement dropDown=driver.findElement(By.name("generalStateProvinceGeoId"));
		Select value=new Select(dropDown);
	    value.selectByVisibleText("Arkansas");
	    driver.findElement(By.className("smallSubmit")).click();
	    driver.findElement(By.className("subMenuButton")).click();
	    driver.findElement(By.name("description")).clear();
	    driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("jndjhocncnio");
	    driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	    String title=driver.getTitle();
		String title2="View Contact | opentaps CRM";
		if(title.equals(title2)) {
			System.out.println("testcase pass");
		}
		else {
			System.err.println("testcase fail");
		}
		String text2=driver.findElement(By.id("viewContact_fullName_sp")).getText();
		System.out.println("Name "+text2);
		driver.close();
		
		
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
