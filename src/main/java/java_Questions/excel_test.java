package java_Questions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



public class excel_test {

	public static void main(String[] args) throws IOException {
		DataRead("C:\\Work\\BlueStone_TestData.xlsx","SampleData", "TC01");
			}

	private static void DataRead(String Location, String Sheet, String TestCaseName) throws IOException {
		
		/*
		FileInputStream file 	= new FileInputStream(Location);
		XSSFWorkbook 	wb 		= new XSSFWorkbook(file);
		XSSFSheet 		sheet 	= wb.getSheet(Sheet);
		
		int rowCount 			= sheet.getLastRowNum()-sheet.getFirstRowNum();
		
		for(int i = 0;i<rowCount+1;i++)
		{
			Row row = sheet.getRow(i);
			
			if(row.getCell(0).getStringCellValue().equalsIgnoreCase(TestCaseName))
			{
				for(int j=0;j<row.getLastCellNum();j++)
				{
					System.out.println(row.getCell(j).getStringCellValue());
				}
					
			}
			
			
			
		}
		
		*/
		
	}



}
