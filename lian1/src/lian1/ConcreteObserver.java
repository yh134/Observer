package lian1;

public class ConcreteObserver extends Observer {
	private String ObserverName;//��ǰ�۲��ߵ�����
	private ConcreteSubject SubjectName;//��ǰ�۲������
	//���µķ���
	@Override
	public void Update() {
		// TODO Auto-generated method stub
		System.out.println("��ǰ�۲���Ϊ��"+this.getObserverName()+"��ǰ�۲�������ǣ�"+SubjectName.getClass().getName());
		System.out.println("��ǰ�仯Ϊ��"+SubjectName.GetTime());
		
	}
	//�۲��߹��췽��
	public ConcreteObserver(String ObserverName,ConcreteSubject SubjectName)
	{
		
		this.ObserverName=ObserverName;
		this.SubjectName=SubjectName;
	}
	
	
	//��ȡ�����޸ĵ�ǰ�۲��ߵ�����
	
	
	
	public String getObserverName() {
		return ObserverName;
	}
	public void setObserverName(String observerName) {
		ObserverName = observerName;
	}
	
	
	
	//��ȡ���޸ĵ�ǰ�۲������
	public ConcreteSubject getSubjectName() {
		return SubjectName;
	}
	public void setSubjectName(ConcreteSubject subjectName) {
		SubjectName = subjectName;
	}
	

}
