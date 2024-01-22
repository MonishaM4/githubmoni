
public class Test_01 {

	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import base.Baseclass;

	public class TEST_01 extends Baseclass {
		
		@Test
		public void t_001() 
		{
		       driver.findElement(By.xpath("(//*[contains(text(),'Categories')])[1]")).click();
		       driver.findElement(By.xpath("//*[contains(text(),'Central')]")).click();
		       System.out.println("Test_01 executed successfully");
		}
		

	}



