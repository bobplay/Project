package project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import page.DeleteContent;
import page.IndexDynamic;
import page.LoginUser;
import page.UploadJob;
import page.UploadText;


import page.UploadTrip;
import page.Video;

import com.peilei.framework.BaseCase;

@Test
public class Login extends BaseCase{
	
	
	//登录1A娱乐
	@Test(dataProvider="login")
	public void ALoginYule(String admin,String passworld){
		driver.get("http://www.1ayule.com/my/dynamic?login=lg");
//		driver.manage().window().maximize();
//		LoginUser initElements = PageFactory.initElements(driver, LoginUser.class);
//		initElements.loginYule(admin, passworld);
		//对cookie处理绕过登录验证码
		driver.manage().deleteAllCookies();
		Cookie cookies = new Cookie("PHPSESSID", "0ilvlju2mnpraog5bc3pi6hqk3", "/");
		driver.manage().addCookie(cookies);	
		System.out.println(driver.manage().getCookieNamed("PHPSESSID").getValue());
		driver.get("http://www.1ayule.com/my/dynamic");			
	}
	
	@DataProvider(name="login")
	public static Object[][] dataLogin(Method m){
		if(m.getName().equalsIgnoreCase("ALoginYule")){
			return getData();
		}
		return null;
	}
	
	public static Object[][] getData(){
		Object[][] objs = null;
		BufferedReader bf = null;
		try {
			String str = null;
			ArrayList<Object[]> list = new ArrayList<Object[]>();
			 bf = new BufferedReader(new FileReader(new File("./src/test/resources/login.txt")));
			 while((str=bf.readLine())!=null){
				 String[] strs = str.split(",");
				 list.add(new Object[]{strs[0],strs[1]});
			 }
			 if(list.size()>0){
				 objs = new Object[list.size()][2];
				 for(int i=0;i<list.size();i++){
					 objs[i] = list.get(i);
				 }
			 }
			 return objs;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return objs;
		}
		
	}
	

	/**
	 * 切换窗口句柄后发布文本
	 */
//	public void BTextContent(){	
//		driver.navigate().to("http://www.1ayule.com/upload/text");
//		UploadText page_UploadText = PageFactory.initElements(driver, UploadText.class);
//		page_UploadText.commitText("今天天气好晴朗");
//	}
	
	//发布行程
//	public void DTrip(){
//		driver.get("http://www.1ayule.com/upload/trip");
//		 JavascriptExecutor removeAttribute = (JavascriptExecutor)driver;  
//		 //时间控件是只读模式，需要使用js去掉readonly
//		 removeAttribute.executeScript("var Date = document.getElementById('publish-time');Date.removeAttribute('readonly');");
//		UploadTrip initElements = PageFactory.initElements(driver, UploadTrip.class);
//		initElements.commitTrip("2016-08-20","望京soho");	
//		
//	}
	//发布通告
	
	public void Job(){
		driver.get("http://www.1ayule.com/job/pubone");
		UploadJob initElements = PageFactory.initElements(driver, UploadJob.class);
		initElements.setJob();
		
	}
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
