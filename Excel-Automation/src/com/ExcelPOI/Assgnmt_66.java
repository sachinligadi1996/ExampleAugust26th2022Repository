package com.ExcelPOI;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assgnmt_66 {

	public static void main(String[] args) {
		readContent();

	}

	private static void readContent()

	{
		FileInputStream fin=null;
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Sheet sh1=null;
		Row row=null;
		Cell cell=null;
		try
		{
			fin=new FileInputStream("E:\\EXCEL\\A66RW - Copy.xlsx");
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("Sheet1");
			int rc=sh.getPhysicalNumberOfRows();
			for(int r=0;r<rc;r++)
			{
				row=sh.getRow(r);
				int cc=row.getPhysicalNumberOfCells();
				for(int c=0;c<cc;c++)
				{
					cell=row.getCell(c);
					String data=cell.getStringCellValue();
					System.out.printf("%-12s",data); 
				}
				System.out.println();
			}
			if(sh1==null)

			sh1=wb.createSheet("Sheet2");
			row=sh.createRow(0);
			cell=row.createCell(0);
			cell.setCellValue("country1");
			row=sh.createRow(1);
			cell=row.createCell(0);
			cell.setCellValue("country1");
			row=sh.createRow(2);
			cell=row.createCell(0);
			cell.setCellValue("country1");
			row=sh.createRow(3);
			cell=row.createCell(0);
			cell.setCellValue("country1");
			row=sh.createRow(4);
			cell=row.createCell(0);
			cell.setCellValue("country1");
			row=sh.createRow(5);
			cell=row.createCell(0);
			cell.setCellValue("country1");
			row=sh.createRow(6);
			cell=row.createCell(0);
			cell.setCellValue("country1");
			row=sh.createRow(7);
			cell=row.createCell(0);
			cell.setCellValue("country1");
			row=sh.createRow(8);
			cell=row.createCell(0);
			cell.setCellValue("country1");
			row=sh.createRow(9);
			cell=row.createCell(0);
			cell.setCellValue("country1");
			row=sh.createRow(10);
			cell=row.createCell(0);
			cell.setCellValue("country1");
			row=sh.createRow(11);
			cell=row.createCell(0);
			cell.setCellValue("country1");
			row=sh.createRow(12);
			cell=row.createCell(0);
			cell.setCellValue("country1");
			row=sh.createRow(13);
			cell=row.createCell(0);
			cell.setCellValue("country1");
			row=sh.createRow(14);
			cell=row.createCell(0);
			cell.setCellValue("country1");
			row=sh.createRow(15);
			cell=row.createCell(0);
			cell.setCellValue("country1");
			row=sh.createRow(16);
			cell=row.createCell(0);
			cell.setCellValue("country1");
			row=sh.createRow(17);
			cell=row.createCell(0);
			cell.setCellValue("country1");
			row=sh.createRow(18);
			cell=row.createCell(0);
			cell.setCellValue("country1");
			row=sh.createRow(19);
			cell=row.createCell(0);
			cell.setCellValue("country1");
			

			fout=new FileOutputStream("E:\\EXCEL\\A66RW - Copy.xlsx");
			wb.write(fout);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				fout.close();
				wb.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}

	}
}

