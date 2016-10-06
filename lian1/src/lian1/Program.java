package lian1;

public class Program implements Runnable {
	static ConcreteSubject subject=new ConcreteSubject();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建100个观察者
		for(int i=1;i<=100;i++)
		{
			ConcreteObserver observer=new ConcreteObserver("观察者"+i, subject);
			subject.Attach(observer);
			
		}
		Program program=new Program();
		Thread thread=new Thread(program);
		thread.start();
		

	}
	//每隔1分钟刷新一次时间
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
		subject.SetTime();
		subject.Notify();
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

}
