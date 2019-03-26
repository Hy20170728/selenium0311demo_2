package baidu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baidu1 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   driver.get("http://www.baidu.com");
	   driver.findElement(By.id("kw")).sendKeys("selenium");
	   driver.findElement(By.id("su")).click();
	   Thread.sleep(3000);
	   driver.close();
	   }
	}
