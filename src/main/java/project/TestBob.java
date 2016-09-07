package project;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.jetty.start.Main;
import org.testng.annotations.Test;

public class TestBob {
	public static void bob(){
		System.out.println("bob  I love you");
		long millis = System.currentTimeMillis()+7*24*3600*1000;
		SimpleDateFormat sd = new SimpleDateFormat("YYYY-MM-dd");		
		System.out.println(sd.format(millis));
	}
	public static void main(String[] args) {
		bob();
	}
	
}
