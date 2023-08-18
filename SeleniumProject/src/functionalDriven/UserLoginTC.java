package functionalDriven;

import java.io.IOException;

public class UserLoginTC {

	public static void main(String[] args) throws InterruptedException, IOException {
		BusinessMethods bm = new BusinessMethods();
		
		String res = bm.orgLaunch("Firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res = bm.orgLogin("AAASwethaSayini854796", "Test@854796851256");
		System.out.println("Application Login "+res);
		
		res = bm.orgLogout();
		System.out.println("Application Logout "+res);

		bm.orgClose();
		System.out.println("Browser Clossed successfully");

	}

}
