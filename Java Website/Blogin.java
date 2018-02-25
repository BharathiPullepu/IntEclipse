package testLoign;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
public class Blogin {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","\\D:\\Selenium_Training\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String baseUrl = "http://13.127.152.107:8080/LoginJSP/";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bharathi.pullepu@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@value='login']")).click();
		driver.close();
	}
}
