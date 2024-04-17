package tester;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QuizLogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:9013/");
		
		String title = driver.getTitle();
		System.out.println("Il titolo della pagina è "+title);
		
		WebElement titoloForm = driver.findElement(By.xpath("/html/body/main/div/div/h2"));
		System.out.println("Il titolo del form è "+titoloForm.getText());
		
		WebElement userID = driver.findElement(By.id("elUsername"));
		WebElement userPASS = driver.findElement(By.id("elPassword"));
		userID.sendKeys("Angelo");
		userPASS.sendKeys("qualsiasi");
		
		WebElement btnLogin = driver.findElement(By.id("btnLogin"));
		btnLogin.click();
		
		title = driver.getTitle();
		System.out.println("Il titolo della pagina è "+title);
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\"btnInvia\"]"));
		
		//Explicit wait 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		
		wait.until(ExpectedConditions.visibilityOf(button)); //aspetta la visibilità del bottone
		button.click();
		
		
		
//		driver.close();
		
		
		
		
	}

}
