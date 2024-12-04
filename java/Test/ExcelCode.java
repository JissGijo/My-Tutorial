package Test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {
	
	public static FileInputStream f;
	public static XSSFWorkbook w;
	public static XSSFSheet s;
	
	
public static String readStringData(int row, int column) throws IOException
{
	f=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\Sheet1.xlsx");
	w= new  XSSFWorkbook();
	s=w.getSheet("Sheet1");
	Row r =s.getRow(row);
	Cell c=r.getCell(column);
	return c.getStringCellValue();
}

	public static String readIntegerData(int row, int column) throws IOException
	{f=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\Sheet1.xlsx");
	w= new  XSSFWorkbook();
	s=w.getSheet("Sheet1");
	Row r =s.getRow(row);
	Cell c=r.getCell(column);
	int a=(int) c.getNumericCellValue();
	return String.valueOf(a);
	
	
		
	}}

