package kh.example;

import java.util.ArrayList;
import java.util.List;

import kh.example.Coffee.CoffeeType;
import kh.example.ddasda.RequestMethod;

public class Apple {

	public static void main(String[] args) {
		//for (Ÿ�� �����̸� : �迭(�÷���)
		final List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");

		for(String message : list) {
			System.out.println(message);
		}
		//�ڷ���[] �����̸� =
		//�ڷ��� �����̸�[] =
		final String[] strings = new String[5];
		for(int i = 0; i < 5; i++) {
			strings[i] = "A";
		}
		for(String value : strings) {
			System.out.println(value);
		}
		String a = "A";
		String b = "A";
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());

		int data = 777;
		double pi = 3.141592;
		String kor = "�����ٶ󸶹ٻ�";
		String eng = "ABCDEFGHI";

		String str1 = "ABC";
		String str2 = "ABC";
		String str3 = new String("ABC");

		System.out.println(str1 == str2);
		System.out.println(str1 == str3); 
		//foreach,enhanced for��
		//for(Ÿ�� �����̸� : �迭(�÷���)){
		//}
		/*���� ���� ����
		 * ��:���
		 * ��:�� ����� ��
		 * ���ǽ� : �� ����� boolean
		 */
		/*Ÿ���� ����
		 * ���� Ÿ��(primitive type)
		 * -���ÿ� �ٷ� ����
		 * ���� Ÿ��(referece type)
		 * -��ü�� ������ heap ������ �����ϰ�, �װ��� ����Ű�� ���� ����
		 */
		/*�迭
		 * 
		 * 1.Ÿ��[] �����̸�;
		 * 2.Ÿ�� �����̸�[];
		 * 3.Ÿ��[] �����̸� = new Ÿ��[����]
		 */
		//�迭 �ʱ�ȭ �Է�
		// Ÿ��[] �����̸� = {��,.....,��N};
		//Ÿ��[] �����̸� = new Ÿ��[����];
		final String[] fruits = {"grape", "apple"};
		int length = fruits.length;
		for(int i = 0; i < length; i++) {
			System.out.println(fruits[i]);
		}
		final String[] fruits1 = new String[2];
		fruits1[0] = "orange";
		fruits1[1] = "apple";
		for(String fruit: fruits1) {
			System.out.println(fruit);
		}
		/*�Ķ����(parameter)�� ����(argument)����
		 * y = f(x)
		 * x�� �Ķ����(parameter)
		 * y = f(5)
		 * 5�� ����(argument)
		 */
		int[][] m1 = new int[2][];	//A
		m1[0] = new int[] {1,2,3};	//B
		m1[1] = new int[] {4,5,6};	//C

		//��
		for(int i = 0; i < 2; i++) {
			//��
			for(int j= 0; j < 3; j++) {
				System.out.println(m1[i][j]);
			}

			//enum ����
			/* enum �������̸�{
			 * ��
			 * }
			 */
		}
			System.out.println(RequestMethod.CONNECT.name());
			System.out.println(RequestMethod.CONNECT.ordinal());
		
			//Ŭ���� ����
			//���������� class Ŭ�����̸�{
			//���������� ������
			
			//�߻�ȭ
			//��ü�� �𵨸��ϴ� ����ε�
			//�ʿ��� Ư¡�� �����ѵ�
			//������
			//�ൿ
			//Ŭ���� �̸� ��ü = new Ŭ�����̸�(������ ����);
			//��ü.�޼ҵ�(����);
			
			//ĸ��ȭ
			//�������� �������� ������ ����
			//��ü ������ ������
			//��ü�� �����ϴ� ���� �����Ǹ� �ൿ�� ������ ��ħ.
			
			//����������(Access Modifier)
			//private:�������� ��ü ����
			//protected:�������� ��Ű�� ����
			//public :�������� ��ü
			
			//���
			//�θ��� Ư���� ���� �޴� ����
			//�θ�ü - ������ü,superclass
			//�ڽİ�ü - ������ü,subclass
			
			//������(polymorphism)
	}
}