package lian1;

public class ConcreteObserver extends Observer {
	private String ObserverName;//当前观察者的名字
	private ConcreteSubject SubjectName;//当前观察的主题
	//更新的方法
	@Override
	public void Update() {
		// TODO Auto-generated method stub
		System.out.println("当前观察者为："+this.getObserverName()+"当前观察的主题是："+SubjectName.getClass().getName());
		System.out.println("当前变化为："+SubjectName.GetTime());
		
	}
	//观察者构造方法
	public ConcreteObserver(String ObserverName,ConcreteSubject SubjectName)
	{
		
		this.ObserverName=ObserverName;
		this.SubjectName=SubjectName;
	}
	
	
	//获取或者修改当前观察者的名字
	
	
	
	public String getObserverName() {
		return ObserverName;
	}
	public void setObserverName(String observerName) {
		ObserverName = observerName;
	}
	
	
	
	//获取或修改当前观察的主题
	public ConcreteSubject getSubjectName() {
		return SubjectName;
	}
	public void setSubjectName(ConcreteSubject subjectName) {
		SubjectName = subjectName;
	}
	

}
