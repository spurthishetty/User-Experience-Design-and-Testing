import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "/Users/poojapingle/desktop/chromedriver");

		ChromeDriver driver = new ChromeDriver();

		driver.get("file:///Users/poojapingle/Documents/Axure/HTML/Final%20(1)%20(1)/login.html");

		System.out.println("hi" + driver.getTitle());
		driver.findElement(By.id("u194_input")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("u195_input")).sendKeys("abc");
		
		driver.findElement(By.id("u196")).click();
		

	}

}
