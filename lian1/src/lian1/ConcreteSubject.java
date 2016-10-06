package lian1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;



public class ConcreteSubject extends Subject {
	private String CurrentTime;
	//通过方法获得变化 并将这种变换进行返回 一下的方法根据不同的观察主题实现不同的内容
	public String GetTime()
	{
	
	 
		return "当前时间为："+CurrentTime;
	
	
	}
	public void SetTime()
	{
	
		
		Date date=new Date();
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		CurrentTime=format.format(date);
	
	
	}
}
