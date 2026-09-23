package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement bestseller() {

		return driver.findElement(By.xpath("/html/body/header/div[3]/div[2]/div/div[2]/div/div/div/div/nav/ul/li[4]/a"));

	}

	public WebElement todaysdeals() {

		return driver.findElement(By.linkText("Today`s Deal"));

	}

}
