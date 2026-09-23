package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BestSellerPage {

	WebDriver driver;

	public BestSellerPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement wholeblock() {
		// all the background blocks on bestseller page
		return driver.findElement(By.id("ajaxLoadData"));
	}

	public WebElement block1() {
		// all the background blocks on bestseller page
		return driver.findElement(By.xpath("//*[@id=\"ajaxLoadData\"]/div[1]/div/div[2]/h2/a"));
	}

	public WebElement block2() {
		// all the background blocks on bestseller page
		return driver.findElement(By.xpath("//*[@id=\"ajaxLoadData\"]/div[2]/div/div[2]/h2/a"));
	}

	public WebElement block3() {
		// all the background blocks on bestseller page
		return driver.findElement(By.xpath("//*[@id=\"ajaxLoadData\"]/div[3]/div/div[2]/h2/a"));
	}

	public WebElement block4() {
		// all the background blocks on bestseller page
		return driver.findElement(By.xpath("//*[@id=\"ajaxLoadData\"]/div[4]/div/div[2]/h2/a"));
	}

	public WebElement block5() {
		// all the background blocks on bestseller page
		return driver.findElement(By.xpath("//*[@id=\"ajaxLoadData\"]/div[5]/div/div[2]/h2/a"));
	}

}
