package lian1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;



public class ConcreteSubject extends Subject {
	private String CurrentTime;
	//ͨ��������ñ仯 �������ֱ任���з��� һ�µķ������ݲ�ͬ�Ĺ۲�����ʵ�ֲ�ͬ������
	public String GetTime()
	{
	
	 
		return "��ǰʱ��Ϊ��"+CurrentTime;
	
	
	}
	public void SetTime()
	{
	
		
		Date date=new Date();
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		CurrentTime=format.format(date);
	
	
	}
}
