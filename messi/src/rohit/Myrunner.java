package rohit;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Myrunner 
{

	public static void main(String[] args) throws Exception
	{
		//connect to excel file
		File f=new File("KANTH.xls");
		//open excel file for reading purpose
		Workbook rwb=Workbook.getWorkbook(f);
		Sheet rsh1=rwb.getSheet(0);
		int nour1=rsh1.getRows();
		int nouc1=rsh1.getColumns();
		Sheet rsh2=rwb.getSheet(1);
		int nour2=rsh2.getRows();
		int nouc2=rsh2.getColumns();
		//open same excel file for written
		WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
		WritableSheet wsh1=wwb.getSheet(0);
		WritableSheet wsh2=wwb.getSheet(1);
		

	}

}
