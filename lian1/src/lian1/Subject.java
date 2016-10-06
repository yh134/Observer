package lian1;

import java.util.ArrayList;
import java.util.List;


public abstract class Subject {
	//用list保存当前的观察者
	private	List<Observer> observers =new ArrayList<Observer>();
	//增加观察者
	public void Attach(Observer observer)
	{
		observers.add(observer);
	}
	//删除观察者
	public void Detach(Observer observer)
	{
		observers.remove(observer);
	}
	//通知观察者
	public void Notify()
	{
		for(Observer ob:observers)
		{
			ob.Update();//调用观察者的更新方法
		}
			
	}
	
}
