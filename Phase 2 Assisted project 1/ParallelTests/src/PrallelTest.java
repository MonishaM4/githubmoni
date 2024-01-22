    
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Test;

	public class PrallelTest {

		ChromeDriver driver;
		@Test(groups="Chrome")
		public void LaunchChrome() {
			System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		@Test(groups="Chrome", dependsOnMethods="LaunchChrome")
		public void TryFacebook1() {
			System.out.println(Thread.currentThread().getId());
			((WebDriver) driver).findElement(By.id("email")).sendKeys("ravi10thstudent@gmail.com");
			((WebDriver) driver).findElement(By.id("pass")).sendKeys("12345");
			((WebDriver) driver).findElement(By.id("loginbutton")).click();
		}
		
		@Test(groups="Firefox")
		public void LaunchFirefox() {
			System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
			driver = new FirefoxDriver();
			((WebDriver) driver).get("https://www.facebook.com");
			try {
				Thread.sleep(4000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		@Test(groups="Firefox", dependsOnMethods="LaunchFirefox")
		public void TryFacebook2() {
			System.out.println(Thread.currentThread().getId());
			((WebDriver) driver).findElement(By.id("email")).sendKeys("ravi10thstudent@gmail.com");
			((WebDriver) driver).findElement(By.id("pass")).sendKeys("ravi28394");
			((WebDriver) driver).findElement(By.id("loginbutton")).click();
			System.out.println(Thread.currentThread().getId());
		}
	}



