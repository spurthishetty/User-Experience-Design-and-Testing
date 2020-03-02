import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/poojapingle/desktop/chromedriver");

		ChromeDriver driver = new ChromeDriver();

		driver.get("file:///Users/poojapingle/Documents/Axure/HTML/Final%20(1)%20(1)/category.html");
		
		
		driver.findElement(By.id("u84_img")).click();
		
	}

}
