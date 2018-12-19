package Demo;

import commonLibs.implementation.CommonDriver;

public class DemoCommonDriver {

	public static void main(String[] args)  {
		try {
			CommonDriver cd= new CommonDriver("Chrome");
			cd.setPageLoadTimeOut(40);
			cd.setElementDetectionTimeOut(20);
			cd.navigateToFirstURL("http:qatechhub.com");
			System.out.println(cd.getTitle());
			cd.closeAllBrowser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
