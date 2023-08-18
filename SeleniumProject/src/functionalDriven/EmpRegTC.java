package functionalDriven;

import java.io.IOException;

public class EmpRegTC {

	public static void main(String[] args) throws InterruptedException, IOException {
		BusinessMethods bm = new BusinessMethods();
		
		String res = bm.orgLaunch("Firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res = bm.orgLogin("Admin", "Qedge123!@#");
		System.out.println("Application Login "+res);
		
		res = bm.orgEmpReg("Swetha", "Sayini", "SS854479");
		System.out.println("Employee Registration "+res);
		
		res = bm.orgLogout();
		System.out.println("Application Logout "+res);

		bm.orgClose();
		System.out.println("Browser Clossed successfully");

	}

}
