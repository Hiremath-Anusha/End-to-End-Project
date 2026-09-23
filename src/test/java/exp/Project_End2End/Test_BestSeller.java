package exp.Project_End2End;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import exceldata.BestSelllerReadWrite;
import objectRepository.BestSellerPage;
import objectRepository.HomePage;

public class Test_BestSeller extends TestBase {

	@BeforeMethod
	public void openbrowser() {

		TestBase tb = new TestBase();
		tb.openbrowser("chrome");

	}

	@AfterMethod
	public void closebrowser() {

		driver.close();

	}

	@Test
	public static void bstest1() throws IOException, InterruptedException {

		HomePage hp = new HomePage(driver);
		Thread.sleep(5000);
		hp.bestseller().click();
		BestSelllerReadWrite testdata = new BestSelllerReadWrite();
		int rowcount = testdata.rcount();

		for (int i = 1; i <= rowcount; i++) {
			String expectedtext = testdata.readdata(i, 0);

			BestSellerPage bs = new BestSellerPage(driver);
			String item1 = bs.block1().getText();
			String item2 = bs.block2().getText();
			String item3 = bs.block3().getText();
			String item4 = bs.block4().getText();
			String item5 = bs.block5().getText();

			if (item1.contains(expectedtext)) {
				testdata.writedata(i, 1, "valid data");
			} else if (item2.contains(expectedtext)) {
				testdata.writedata(i, 1, "valid data");
			} else if (item3.contains(expectedtext)) {
				testdata.writedata(i, 1, "valid data");
			} else if (item4.contains(expectedtext)) {
				testdata.writedata(i, 1, "valid data");
			} else if (item5.contains(expectedtext)) {
				testdata.writedata(i, 1, "valid data");
			} else {
				testdata.writedata(i, 1, "invalid data");
			}

		}

	}

}
