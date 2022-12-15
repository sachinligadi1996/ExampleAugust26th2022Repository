package com.ExcelPOI;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assigmt_1
{
	public static void main(String[]args) 
	{
		writeContent();
	}
	private static void writeContent()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			wb=new XSSFWorkbook();
			sh=wb.createSheet("Sheet1");
			row=sh.createRow(0);
			cell=row.createCell(0);
			cell.setCellValue("Flower1");
			row=sh.createRow(1);
			cell=row.createCell(0);
			cell.setCellValue("Flower2");
			row=sh.createRow(2);
			cell=row.createCell(0);
			cell.setCellValue("Flower3");
			row=sh.createRow(3);
			cell=row.createCell(0);
			cell.setCellValue("Flower4");
			row=sh.createRow(4);
			cell=row.createCell(0);
			cell.setCellValue("Flower5");
			row=sh.createRow(5);
			cell=row.createCell(0);
			cell.setCellValue("Flower6");
			row=sh.createRow(6);
			cell=row.createCell(0);
			cell.setCellValue("Flower7");
			row=sh.createRow(7);
			cell=row.createCell(0);
			cell.setCellValue("Flower8");
			row=sh.createRow(8);
			cell=row.createCell(0);
			cell.setCellValue("Flower9");
			row=sh.createRow(9);
			cell=row.createCell(0);
			cell.setCellValue("Flower10");
			row=sh.createRow(10);
			cell=row.createCell(0);
			cell.setCellValue("Flower11");
			row=sh.createRow(11);
			cell=row.createCell(0);
			cell.setCellValue("Flower12");
			row=sh.createRow(12);
			cell=row.createCell(0);
			cell.setCellValue("Flower13");
			row=sh.createRow(13);
			cell=row.createCell(0);
			cell.setCellValue("Flower14");
			row=sh.createRow(14);
			cell=row.createCell(0);
			cell.setCellValue("Flower15");
			row=sh.createRow(15);
			cell=row.createCell(0);
			cell.setCellValue("Flower16");
			row=sh.createRow(16);
			cell=row.createCell(0);
			cell.setCellValue("Flower17");
			row=sh.createRow(17);
			cell=row.createCell(0);
			cell.setCellValue("Flower18");
			row=sh.createRow(18);
			cell=row.createCell(0);
			cell.setCellValue("Flower19");
			row=sh.createRow(19);
			cell=row.createCell(0);
			cell.setCellValue("Flower20");
			
			fout=new FileOutputStream ("E:\\EXCEL\\A1Flower.xlsx");
			wb.write(fout);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			try
			{
				fout.close();
				wb.close();
			}catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
