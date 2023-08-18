package driverscripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import functionalDriven.BusinessMethods;

public class Hybrid {

	public static void main(String[] args) throws IOException, InterruptedException {
		Date d = new Date();
		SimpleDateFormat s = new SimpleDateFormat("ddMMYYYYHHmmss");
		String dd = s.format(d);
		
		String strPath = System.getProperty("user.dir")+"\\src\\testData\\Hybrid.xlsx";
		String strOutPath = System.getProperty("user.dir")+"\\src\\results\\Hybridres"+dd+".xlsx";
		BusinessMethods bm = new BusinessMethods();
		String res = null;
		FileInputStream fi = new FileInputStream(strPath);
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet tcSht = wb.getSheet("Testcase");
		XSSFSheet tsSht = wb.getSheet("Teststeps");
		XSSFSheet tdSht = wb.getSheet("TestData");
		XSSFSheet empRegSht = wb.getSheet("EmpReg");
		
		int tcRc = tcSht.getLastRowNum();
		int tsRc = tsSht.getLastRowNum();
		int erRc = empRegSht.getLastRowNum();
		
		for(int i = 1; i <= tcRc; i++){
			tcSht.getRow(i).createCell(3);
			String exe = tcSht.getRow(i).getCell(2).getStringCellValue();
			
			if (exe.equalsIgnoreCase("Y")) {
				String tcShtTcId = tcSht.getRow(i).getCell(0).getStringCellValue();
				
				for(int j = 1; j <= tsRc; j++){
					String tsShtTcId = tsSht.getRow(j).getCell(0).getStringCellValue();
					
					if (tcShtTcId.equalsIgnoreCase(tsShtTcId)) {
						String key = tsSht.getRow(j).getCell(3).getStringCellValue();
						
						switch (key) {
						case "Launch":
							String br = tdSht.getRow(1).getCell(0).getStringCellValue();
							String url = tdSht.getRow(1).getCell(1).getStringCellValue();
							res = bm.orgLaunch(br, url);
							break;
						case "login":
							String u = tdSht.getRow(1).getCell(2).getStringCellValue();
							String p = tdSht.getRow(1).getCell(3).getStringCellValue();
							res = bm.orgLogin(u, p);
							break;
						case "logout":
							res = bm.orgLogout();
							bm.orgClose();
							break;
						case "Empreg":
							for(int k = 1; k <= erRc; k++){
								String f = empRegSht.getRow(k).getCell(0).getStringCellValue();
								String l = empRegSht.getRow(k).getCell(1).getStringCellValue();
								String eid = empRegSht.getRow(k).getCell(2).getStringCellValue();
								res = bm.orgEmpReg(f, l, eid);
								
								empRegSht.getRow(k).createCell(3).setCellValue(res);
							}
							break;
						case "Usereg":
							String ename = tdSht.getRow(1).getCell(7).getStringCellValue();
							String uname = tdSht.getRow(1).getCell(8).getStringCellValue();
							String pwd = tdSht.getRow(1).getCell(9).getStringCellValue();
							res = bm.orguserReg(ename, uname, pwd);
							break;
						case "Ulogin":
							String un = tdSht.getRow(1).getCell(8).getStringCellValue();
							String pd = tdSht.getRow(1).getCell(9).getStringCellValue();
							res = bm.orgLogin(un, pd);
							break;
						default:
							System.out.println("Use a proper keyword");
							break;
						}
						//Result updation in test steps sheet
						tsSht.getRow(j).createCell(4).setCellValue(res);
						//Result in updation in test case sheet
						if(!tcSht.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Fail")){
							tcSht.getRow(i).getCell(3).setCellValue(res);
						}
					}
				}
				
			}else{
				tcSht.getRow(i).getCell(3).setCellValue("BLOCKED");
			}
		}
		FileOutputStream fo = new FileOutputStream(strOutPath);
		wb.write(fo);
		wb.close();

	}

}
