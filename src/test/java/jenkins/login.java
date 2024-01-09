package jenkins;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.loginPage;

public class login {
	WebDriver driver=null;
	static loginPage login;
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shivamchoubey\\eclipse-workspace\\Jenkins\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

		login = new loginPage(driver);

		login.enterUsername(null);
		login.clickcontinue();
		login.enterPassword(null);
		login.clicklogin();
		
//		driver.findElement(By.id("ap_email")).sendKeys("chaubeys123456@gmail.com");
//		
//		
//		driver.findElement(By.className("a-button-input")).sendKeys(Keys.RETURN);
//		driver.findElement(By.id("ap_password")).sendKeys("Abc@123456");
//		driver.findElement(By.id("signInSubmit")).sendKeys(Keys.RETURN);
		
		
		
		
	}

}
