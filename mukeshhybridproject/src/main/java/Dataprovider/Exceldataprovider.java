package Dataprovider;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldataprovider {
	XSSFWorkbook wb;

	public Exceldataprovider()
	{
		
		try 
		{
		wb=new XSSFWorkbook(new FileInputStream(new File(".\\Testdata\\Login1.xlsx")));
		} catch (Exception e) {
			
			System.out.println("Failed to load excel sheet");
		} 
		

	}

	
	public String getData(String sheetName, int row, int column) {
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	}

	public String getData(int sheetindex, int row, int column) {
		return wb.getSheetAt(sheetindex).getRow(row).getCell(column).getStringCellValue();

	}

	public double getNumericData(String sheetName, int row, int column) {

		return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();

	}

	public double getNumericData(int sheetIndex, int row, int column) {
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getNumericCellValue();
	}
	
	public int getNumberOfRows(String sheetName)
	{
		return wb.getSheet(sheetName).getPhysicalNumberOfRows();
	}
	
	public int getNumberOfRows(int sheetIndex)
	{
		return wb.getSheetAt(sheetIndex).getPhysicalNumberOfRows();
	}
	
	
}


