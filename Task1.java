package assign8;
/*Open ​​https://www.facebook.com/
Capture the below text and verify text contains the below text
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement textMsg=driver.findElement(By.xpath("//h2[text()='Connect with friends and the world around you on Facebook.']"));
		String msg=textMsg.getText();
		System.out.println(msg);
		System.out.println(msg.contentEquals("Connect with friends and the world around you on Facebook."));
	}

}
