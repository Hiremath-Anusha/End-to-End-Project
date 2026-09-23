package exceldata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BestSelllerReadWrite {

	//static String excelpathinfo = "D:\\Anusha\\Testdata\\Easycom_Bestseller.xlsx";
	static String excelpathinfo = "C:\\Users\\sachi\\eclipse-newworkspace\\Project_End2End\\resources\\testdata\\Easycom_Bestseller.xlsx";
	static FileInputStream fis;
	static XSSFWorkbook wb;

	public int rcount() throws IOException {

		fis = new FileInputStream(excelpathinfo);

		wb = new XSSFWorkbook(fis);
		return wb.getSheet("Sheet1").getLastRowNum();
	}

	public String readdata(int row, int col) {
		return wb.getSheet("Sheet1").getRow(row).getCell(col).getStringCellValue();

	}

	public void writedata(int row, int col, String value) throws IOException {
		wb.getSheet("Sheet1").getRow(row).createCell(col).setCellValue(value);
		FileOutputStream fos = new FileOutputStream(excelpathinfo);
		wb.write(fos);
		fos.close();

	}

}
