package excelReadProgram;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel_Read_Program {
	
	static FileInputStream	f;
	static XSSFWorkbook w;
	static XSSFSheet s;

	public static String getStringdata(int a,int b) throws IOException
	{
		f=new FileInputStream("C:\\Users\\rejoy\\Documents\\Angel Mary Wilson\\Sample.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("sheet1");
		Row r=s.getRow(a);
		Cell c=r.getCell(b);
		return c.getStringCellValue();

	}
	
	public static String getIntegerdata(int a, int b) throws IOException
	{
		f=new FileInputStream("C:\\Users\\rejoy\\Documents\\Angel Mary Wilson\\Sample.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("sheet1");
		Row r=s.getRow(a);
		Cell c=r.getCell(b);
		int x=(int) c.getNumericCellValue();
		return String.valueOf(x);
 	}
	

}
