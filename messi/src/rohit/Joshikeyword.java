package rohit;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import jxl.Sheet;
import jxl.Workbook;
import jxl.format.Alignment;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class Joshikeyword 
{
public static void main(String[] args) throws BiffException, IOException, WriteException 
{
File f=new File("book2.xls");
Workbook rwb=Workbook.getWorkbook(f);//read purpose
Sheet rsh1=rwb.getSheet(0);
int nour1=rsh1.getRows();
int nouc1=rsh1.getColumns();
Sheet rsh2=rwb.getSheet(0);
int nour2=rsh2.getRows();
int nouc2=rsh2.getColumns();
WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);//write purpose
WritableSheet wsh1=wwb.getSheet(0);
WritableSheet wsh2=wwb.getSheet(1);
WritableCellFormat cf=new WritableCellFormat();
cf.setAlignment(Alignment.JUSTIFY);
cf.setWrap(true); 
Date dt=new Date();
SimpleDateFormat df=new SimpleDateFormat("dd-MM-YYYY-hh-mm--ss");
String cname=df.format(dt);;
Label l1=new Label(nour1,0,cname,cf);
wsh1.addCell(l1);
Label l2=new Label(nour2,0,cname,cf);
wsh2.addCell(l2);
Mymethods mm=new Mymethods();//object creation
Method m[]=mm.getClass().getMethods();
try
{
for(int i=1;i<nour1;i++)
{
 int flag=0;
 String tid=rsh1.getCell(0,i).getContents();
 String mode=rsh1.getCell(2,i).getContents();
 if(mode.equalsIgnoreCase("yes"))
 {
  for(int j=1;j<nour2;j++)
	{
	String sid=rsh2.getCell(0,j).getContents();
	if(tid.equalsIgnoreCase(sid))
	{
		String mn=rsh2.getCell(2,j).getContents();
		String e=rsh2.getCell(3,j).getContents();
		String d=rsh2.getCell(4,j).getContents();
		String c=rsh2.getCell(5,j).getContents();
		System.out.println(mn+" "+e+" "+d+" "+c);
		for(int k=0;k<m.length;k++)
		{
		if(m[k].getName().equals(mn))
		{
		String r=(String) m[k].invoke(mn,e,d,c);
		Label lb=new Label(nour2,j,r,cf);
		wsh2.addCell(lb);
		if(r.equals("unknown browser"))
		{
			wwb.write();
			wwb.close();
			rwb.close();
		}
		if(r.contains("failed")||r.contains("interrupted"))
		{
			flag=1;
		}
	 }
	}//k closeing
	}
	}//j closeing	
  if(flag==0)
  {
	Label l=new Label(nour1,i,"passed",cf);
	wsh1.addCell(l);
  }
  else
  {
	  Label l=new Label(nour1,i,"failed",cf);
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

