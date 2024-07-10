package day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

//Excel file -> Workbook -> Sheet -> Rows -> Cells 


public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Arkusz1");
		
		int totalRows = sheet.getLastRowNum();
		
		int totalCells = sheet.getRow(1).getLastCellNum();
		
		System.out.println("number of rows : "+totalRows);
		System.out.println("number of cells "+totalCells);
		System.out.println();
		for(int r=0;r<=totalRows;r++)
		{
			XSSFRow currentRow = sheet.getRow(r);
			
			for(int c=0;c<totalCells;c++)
			{
				XSSFCell cell = currentRow.getCell(c);
				System.out.println(cell.toString()+"	");
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();
	}

}
