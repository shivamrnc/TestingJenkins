package jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GoogleSearchPage;

public class GoogleSeachPage {
	
	
	WebDriver driver = null;
	static GoogleSearchPage Google;
	
	
	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shivamchoubey\\eclipse-workspace\\Jenkins\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Google = new GoogleSearchPage(driver);
		driver.navigate().to("https://google.com");
		
		Google.enterText();
		Google.clickEnter();
//		driver.findElement(By.name("q")).sendKeys("Facebook");
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
	}
	
	public void teardown() {
		//System.out.println("Inside Login - browser is close");

	
		//driver.close();
		

}}
