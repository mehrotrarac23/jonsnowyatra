package com.yatra.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.hpsf.Property;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;



public class GetData 
{
   public static String getDataFromProperty(String filepath,String key)
   {
	   String value =null;
	   try
	   {
	   File f = new File(filepath);
	   FileInputStream fis = new FileInputStream(f);
	   Properties pro = new Properties();
	   pro.load(fis);
	   value=(String)pro.get(key);
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	   return value;
   }
   
   public static String getDataFromExcel(String filepath,String sheetname,int rowindex, int cellindex)
   {
	   String data=null;
	   try
	   {
	   File f = new File(filepath);
	   FileInputStream fis = new FileInputStream(f);
	   Workbook wb =WorkbookFactory.create(fis);
	   Sheet st =wb.getSheet(sheetname);
	   Row r= st.getRow(rowindex);
	   Cell c = r.getCell(cellindex);
	   data=c.toString();
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	   
	   return data;
   }
}
	   
	  