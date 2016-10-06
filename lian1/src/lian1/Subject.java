package lian1;

import java.util.ArrayList;
import java.util.List;


public abstract class Subject {
	//��list���浱ǰ�Ĺ۲���
	private	List<Observer> observers =new ArrayList<Observer>();
	//���ӹ۲���
	public void Attach(Observer observer)
	{
		observers.add(observer);
	}
	//ɾ���۲���
	public void Detach(Observer observer)
	{
		observers.remove(observer);
	}
	//֪ͨ�۲���
	public void Notify()
	{
		for(Observer ob:observers)
		{
			ob.Update();//���ù۲��ߵĸ��·���
		}
			
	}
	
}
