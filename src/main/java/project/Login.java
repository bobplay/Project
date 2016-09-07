package project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import page.LoginUser;
import page.UploadJob;
import page.UploadMusic;
import page.UploadText;

import com.peilei.framework.BaseCase;

import mx4j.log.Log;

@Test
public class Login extends BaseCase{
	
	
	private static final RemoteWebDriver JavascriptExecutor = null;
	//登录1A娱乐
	private static Logger log = Logger.getLogger(Login.class);
	
	private String testText = "今天天气好晴朗";


	
	public void ALoginYule(){
		driver.get("http://www.1ayule.com/my/dynamic?login=lg");
		driver.manage().window().maximize();
		LoginUser initElements = PageFactory.initElements(driver, LoginUser.class);
		initElements.loginYule("90003105938", "1awang");
		//对cookie处理绕过登录验证码
//		driver.manage().deleteAllCookies();
//		Cookie cookies = new Cookie("PHPSESSID", "0ilvlju2mnpraog5bc3pi6hqk3", "/");
//		driver.manage().addCookie(cookies);	
//		System.out.println(driver.manage().getCookieNamed("PHPSESSID").getValue());
		driver.get("http://www.1ayule.com/my/dynamic	");		
		log.info("登录成功");
		Reporter.log("测试通过");
		int i = 1/0;
	}
	//发布音乐
	@Test(enabled=false)
	public void CMusic(){
		driver.get("http://www.1ayule.com/upload/music");
		UploadMusic initElements = PageFactory.initElements(driver, UploadMusic.class);
		initElements.musicCommit();
		
	}


	/**
	 * 切换窗口句柄后发布文本
	 */
//	public void BTextContent(){	
//		driver.navigate().to("http://www.1ayule.com/upload/text");
//		UploadText page_UploadText = PageFactory.initElements(driver, UploadText.class);
//		page_UploadText.commitText(testText);		
//		driver.get("http://www.1ayule.com/p/101305009/wenben");	
//		Handles();		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		JavascriptExecutor inner = (JavascriptExecutor)driver;
////		String tmp = (String) inner.executeScript("return document.getElementsByClassName('text').innerHTML;",);
//		WebElement element = driver.findElement(By.className("text"));
////		String tmp = (String) inner.executeScript("function Hello(){ return 'hello';} Hello(); ");
//		String tmp = (String) inner.executeScript(" return document.getElementsByClassName('text')[0].innerHTML;");
//		AssertJUnit.assertTrue(tmp.startsWith(testText));
//	}
	

//	
	//发布行程
//	public void DTrip(){
//		driver.get("http://www.1ayule.com/upload/trip");
//		 JavascriptExecutor removeAttribute = (JavascriptExecutor)driver;  
//		 //时间控件是只读模式，需要使用js去掉readonly
//		 removeAttribute.executeScript("var Date = document.getElementById('publish-time');Date.removeAttribute('readonly');");
//		UploadTrip initElements = PageFactory.initElements(driver, UploadTrip.class);
//		initElements.commitTrip("2016-08-202","望京soho");	
//		
//	}
	//发布通告
//	public void Job(){
//		driver.get("http://www.1ayule.com/job/pubone");
//		driver.manage().window().maximize();
//		UploadJob initElements = PageFactory.initElements(driver, UploadJob.class);
//		new WebDriverWait(driver, 3000).until(ExpectedConditions.titleIs("发布职位"));
//		JavascriptExecutor option1 = (JavascriptExecutor)driver;
//		option1.executeScript("var sel = document.getElementById('cate-select');sel.removeAttribute('style');");
//		initElements.setJob("bob参加活动");
//		System.out.println("控制台成功");		
//	}
	//进入用户主页查看原文
//		public void Dynamic(){
//			Handles();
//			driver.get("http://www.1ayule.com/p/101305009/dynamic");
//			IndexDynamic initElements = PageFactory.initElements(driver, IndexDynamic.class);
//			initElements.index();
//			driver.navigate().to("http://www.1ayule.com/p/101305009/wenben");
//			Handles();
//			initElements.textContent();
//			
//		}
		
	
//	//删除文本
//	public void DeleteContent(){
//		driver.navigate().to("http://www.1ayule.com/p/101305009/wenbendetail/id/30000");	
//		Handles();
//		DeleteContent initElements = PageFactory.initElements(driver, DeleteContent.class);
//		initElements.delContent();	
//		initElements.clickConfrim();
//	}
	
}
