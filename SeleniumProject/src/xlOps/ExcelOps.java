package xlOps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import functionalDriven.BusinessMethods;

public class ExcelOps {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		String strPath = System.getProperty("user.dir")+"\\src\\testData\\TestData.xlsx";
		String strOutPath = System.getProperty("user.dir")+"\\src\\results\\EmpResult.xlsx";
		FileInputStream fi = new FileInputStream(strPath);
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("EmpReg");
//		XSSFRow r = ws.getRow(0);
//		XSSFCell c = r.getCell(0);
		
//		System.out.println(c.getStringCellValue());
		
		int rc = ws.getLastRowNum();
//		int cc = r.getLastCellNum();
//		System.out.println(rc +"---"+cc);
		
		BusinessMethods bm = new BusinessMethods();
		bm.orgLaunch("Firefox", "http://orangehrm.qedgetech.com");
		bm.orgLogin("Admin", "Qedge123!@#");
		
		String res = "";
		
		for(int i = 1; i <= rc; i++){
			XSSFRow r = ws.getRow(i);
			
			XSSFCell c1 = r.getCell(0);
			XSSFCell c2= r.getCell(1);
			XSSFCell c3 = r.getCell(2);
			XSSFCell c4 = r.createCell(3);
			
			String f = c1.getStringCellValue();
			String l = c2.getStringCellValue();
			String eid = c3.getStringCellValue();
			
			System.out.println(f+"---"+l+"---"+eid);
			
			res = bm.orgEmpReg(f, l, eid);
			
			c4.setCellValue(res);
		}
		
		FileOutputStream fo = new FileOutputStream(strOutPath);
		wb.write(fo);
		wb.close();
		
		bm.orgLogout();
		bm.orgClose();
	}

}
