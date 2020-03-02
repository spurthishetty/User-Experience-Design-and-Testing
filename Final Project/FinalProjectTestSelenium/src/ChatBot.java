import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChatBot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/poojapingle/desktop/chromedriver");

		ChromeDriver driver = new ChromeDriver();

		driver.get("file:///Users/poojapingle/Documents/Axure/HTML/Final%20(1)%20(1)/chatbot.html");
		
		driver.findElement(By.id("u232_img")).click();
		driver.findElement(By.className("u233_input")).sendKeys("Hello John");
		driver.findElement(By.id("u234")).click();
		
		
	}

}
