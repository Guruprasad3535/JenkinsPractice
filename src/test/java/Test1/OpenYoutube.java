package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class OpenYoutube {
	
	@Test
	public void main() throws InterruptedException {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		System.out.println("Youtube launched");
		driver.get("https://www.youtube.com/");
		System.out.println("Youtube closed");
		Thread.sleep(2000);
		driver.quit();
	}

}
