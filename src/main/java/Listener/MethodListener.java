package Listener;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import project.ScreenShort;

public class MethodListener extends TestListenerAdapter{
	public void onTestFailure(ITestResult tr){
		super.onTestFailure(tr);
		try {
			ScreenShort.takeScreentShot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
