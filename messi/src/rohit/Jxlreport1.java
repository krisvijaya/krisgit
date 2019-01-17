package rohit;

import java.io.File;

import org.apache.tools.ant.types.resources.comparators.Date;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.DateTime;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Jxlreport1 
{

	public static void main(String[] args) throws Exception
	{
	//open excel sheet
	File f=new File("book1.xls");
	Workbook rwb=Workbook.getWorkbook(f);
	Sheet rsh=rwb.getSheet(0);
	int nour=rsh.getRows();
	int nouc=rsh.getColumns();
	//open same excel file 
	WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
	WritableSheet wsh=wwb.getSheet(0);
	//automarions
	try
	{
		Date d=new Date();
		Label l1=new Label(nouc,0,"result on"+d.toString());
		wsh.addCell(l1);
	}
	catch(Exception ex)
	{
		
	}

	
	}

}
