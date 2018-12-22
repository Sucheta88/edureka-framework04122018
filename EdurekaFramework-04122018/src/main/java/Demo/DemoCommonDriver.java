package Demo;

import commonLibs.implementation.CommonDriver;
import commonLibs.implementation.ScreenshotControl;

public class DemoCommonDriver {

	public static void main(String[] args) {
		try {
			CommonDriver cd = new CommonDriver("Chrome");
			ScreenshotControl screenshotControl = new ScreenshotControl(cd.getDriver());
			cd.setPageLoadTimeOut(40);
			cd.setElementDetectionTimeOut(20);
			cd.navigateToFirstURL("http:qatechhub.com");

			String filename = System.getProperty("user.dir") + "/screenshots/testimg5.jpeg";

			screenshotControl.captureAndSaveScreenshot(filename);

			System.out.println(cd.getTitle());
			cd.closeAllBrowser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
