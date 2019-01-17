package preethi;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

//import com.sun.java.util.jar.pack.Package.Class.Method;

import jxl.Sheet;
import jxl.Workbook;
import jxl.format.Alignment;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableSheet;
//import jxl.read.biff.BiffException;
import jxl.write.WritableWorkbook;

public class RunnerKey 
{

	public static void main(String[] args) throws Exception
	{
		
		
		File f = new File("D:\\batch239\\preeti.xls");
		Workbook rwb = Workbook.getWorkbook(f);
		//for sheet1
		Sheet rsh1 = rwb.getSheet(0);
		int nour1 = rsh1.getRows();
		int nouc1 = rsh1.getColumns();
		//for sheet2
		Sheet rsh2 = rwb.getSheet(1);
		int nour2 = rsh2.getRows();
		int nouc2 = rsh2.getColumns();
		WritableWorkbook wwb = Workbook.createWorkbook(f, rwb);
		WritableSheet wsh1 = wwb.getSheet(0);
		WritableSheet wsh2 = wwb.getSheet(1);
		WritableCellFormat wcf = new WritableCellFormat();
		wcf.setAlignment(Alignment.JUSTIFY);
		wcf.setWrap(true);
		//set name to result column
		Date dt= new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy-hh-mm-ss");
		String cname= sdf.format(dt);
		//set name to result column in sheet1
		Label l1 = new Label(nouc1,0,cname,wcf);
		//Label l1= new Label(nouc1,0,cname,wcf);
		wsh1.addCell(l1);
		//set name to result column in sheet2
		Label l2 = new Label(nouc2,0,cname,wcf);
		wsh2.addCell(l2);
		//create object to method class
		KeyDriMethod km = new KeyDriMethod();
		Method m[] = km.getClass().getMethods();
		try
		{
		
	   for(int i=1;i<nour1;i++)
	   {
		   int flag=0;
		   String tid = rsh1.getCell(0,i).getContents();
		   String mode = rsh1.getCell(2, i).getContents();
		   if(mode.equalsIgnoreCase("yes"))
		   {
			   for(int j=1;j<nouc1;i++)
			   {
				   String sid = rsh2.getCell(0, j).getContents();
				   if(tid.equalsIgnoreCase(sid))
				   {
					   String mn = rsh1.getCell(2, j).getContents();
					   String e = rsh1.getCell(3, j).getContents();
					   String d = rsh1.getCell(4, j).getContents();
					   String c = rsh1.getCell(5, j).getContents();
					   System.out.println(mn+" "+e+" "+d+" "+c);
		
	                     for(int k=0;k<m.length;k++)
	                         {
		                          if(m[k].getName().equals(km))
		                           {
			   String r = (String) m[k].invoke(km,e,d,c);
			   Label lb = new Label(nouc2,j,r,wcf);
			   wsh2.addCell(lb);
			   if(r.equals("unknown browser"))
			   {
				   wwb.write();
				   wwb.close();
				   rwb.close();
				   System.exit(0);
			   }
			   if(r.contains("failed"))
			   {
				   flag=1;
				   
			   }
		   }
	   }
	}
}
if(flag==0)
{
	Label l = new Label(nouc1,i,"passed",wcf);
	wsh1.addCell(l);
}
else
{
	Label l=new Label(nouc1,i,"failed",wcf);
	wsh1.addCell(l);
   }
   }
 }
}
catch(Exception ex)
{
	System.out.println(ex.getMessage());
}
wwb.write();
wwb.close();
rwb.close();
}
}