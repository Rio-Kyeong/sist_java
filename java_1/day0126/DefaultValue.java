package day0126;

/**
 *	instance variable�� �⺻��(default value)
 * @author SIST
 */
public class DefaultValue {
	///instance variable : Ŭ�����ȿ� instance ���������� �׳� ����� �� �ִ� ����///
	
	///�⺻�� �������� 
	int a; //������ �⺻�� 0
	char b; //������ �⺻ �� : \u0000 (UniCode�� �ڵ�â���� ���� ����� �� ����)
	float c; //�Ǽ��� �⺻ �� : 0.0
	boolean d; //�Ҹ��� �⺻�� : false
	///������ ��������
	DefaultValue dv; //class : null
	String s; //String : null
	int[] arr;  //array : null
	
	/**
	 * instance method
	 */
	public void methodA() { //instance ���������� instance variable�� �׳� ��ü�� ���� ����� �� �ִ�.
		System.out.println(a);
	}
	
	/**
	 * static method
	 */
	public static void methodB() { 
	//	System.out.println(a); // static ���������� instance variable�� �ݵ�� ��üȭ�Ͽ� ����ؾ��Ѵ�.
	}
	
	public static void main(String[] args) {
	//�ν��Ͻ������� �� ���θ޼ҵ忡�� ������ϴ°�?
	//java DefaultValue �� Ŭ������ �����ϸ� main method�� ���� ó�� ����ȴ�.
	//class field�� �������� �ʴ´� - �ν��Ͻ� ������ �޸𸮿� �ö��� �ʴ´�
	//System.out.println(dv); <-�ȵ� ��üȭ �ʿ�
	
	//��üȭ : Ŭ������ ��ü�� = new Ŭ������(); - �ν��Ͻ������� �޸𸮿� �ö󰣴� - ��밡��
	//new : ��ü ������ Ű����
	DefaultValue dv = new DefaultValue(); //��üȭ
	//������ ��� : ��ü��.������
	System.out.println("������ : "+dv.a);
	System.out.println("������ : ["+dv.b+"]");
	System.out.println("�Ǽ��� : "+dv.c);
	System.out.println("�Ҹ��� : "+dv.d);
	System.out.println("class : "+dv.dv);
	System.out.println("String : "+dv.s);
	System.out.println("array : "+dv.arr);
	System.out.println("--------------------------------------");
	//instance ������ ��ü���� �����ǰ� ���Ǵ� ����
	DefaultValue dv1 = new DefaultValue();
	DefaultValue dv2 = new DefaultValue();
	
	dv1.a = 500; 
	System.out.println("dv1.a : "+dv1.a);
	System.out.println("dv2.a : "+dv2.a);
	
	
		
		
		
	}//main

}//class