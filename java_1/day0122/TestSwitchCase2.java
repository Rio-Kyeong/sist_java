package day0122;

/**
 *	swhitch~case �� break ���
 *	break�� ������ swich ������ ���� ������
 * @author SIST
 */
public class TestSwitchCase2 {

	public static void main(String[] args) {
		
		int i =20;
		switch (i) {
			case 0: System.out.println("��"); break;
			case 1: System.out.println("��"); 
			case 2: System.out.println("��"); break;
			case 3: System.out.println("��"); break;
			default : System.out.println("����"); 
		}//end switch
		//break�� switch~case, while, do~while �ȿ����� ����� �� �ִ�.
		
		System.out.println("---------------------------------------------------");
		
		int year =1998;
		switch (year % 12) { //�츦 ���Ϸ��� �¾�ظ� 12�� ���� ������ ���
			case 0: System.out.println("�����̶�"); break;
			case 1: System.out.println("�߶�"); 
			case 2: System.out.println("����"); break;
			case 3: System.out.println("������"); break;
			case 4: System.out.println("���"); break;
			case 5: System.out.println("�Ҷ�"); break;
			case 6: System.out.println("ȣ���̶�"); break;
			case 7: System.out.println("�䳢��"); break;
			case 8: System.out.println("���"); break;
			case 9: System.out.println("���"); break;
			case 10: System.out.println("����"); break;
			default : System.out.println("���"); 
		}//end switch
		
	}//main

}//class
