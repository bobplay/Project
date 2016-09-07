package project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.velocity.texen.util.FileUtil;
import org.openqa.selenium.OutputType;

import com.peilei.framework.BaseCase;

public class ScreenShort {
//	private void takeScreenShot(ITestResult tr) {
//		SimpleDateFormat formatter = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
//		String mDateTime = formatter.format(new Date());
//		String fileName = mDateTime + "_" + tr.getName();
//	//	String filePath = BaseCase.driver.getScreenshotAs(fileName);
//		 String  filePath = ((TakesScreenshot)BaseCase.driver).getScreenshotAs(OutputType.FILE).getPath();
//		org.testng.Reporter.setCurrentTestResult(tr);
//		org.testng.Reporter.log(filePath);
//               //这里实现把图片链接直接输出到结果文件中，通过邮件发送结果则可以直接显示图片
//		org.testng.Reporter.log("<img src=\"../" + filePath + "\"/>");
//
//	}
	  private final static String SCREEN_SHOT_PATH = "test-output/screen-shot";  
	    private static String SCREEN_SHOT_NAME = null;  
	  
	    public static void takeScreentShot() throws IOException {  
	        File screenShotDir = new File(SCREEN_SHOT_PATH);  
	        if (!screenShotDir.exists()) {  
	            screenShotDir.mkdirs();  
	        }  
	  
	        SCREEN_SHOT_NAME = String.valueOf(new Date().getTime()) + ".jpg";  
	        FileUtil.file(BaseCase.driver.getScreenshotAs(OutputType.FILE).toString(),  
	                new File(SCREEN_SHOT_PATH + "/" + SCREEN_SHOT_NAME).toString());
	    }  
	  
	    public static String getScreenShotPath() {  
	        return SCREEN_SHOT_PATH;  
	    }  
	  
	    public static String getScreenShotName() {  
	        return SCREEN_SHOT_NAME;  
	    }  

}
