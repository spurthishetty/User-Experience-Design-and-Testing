import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class logoutclass {
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "/Users/poojapingle/desktop/chromedriver");

	ChromeDriver driver = new ChromeDriver();

	driver.get("file:///Users/poojapingle/Documents/Axure/HTML/Final%20(1)%20(1)/sidebar_1.html");
	

	driver.findElement(By.id("u303_text")).click();
	
	}

}
