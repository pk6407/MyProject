package example.collection.list.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import example.collection.list.model.StudentComparator;
import example.collection.list.model.vo.Student;

public class ListController {
	public void doList() {
		List list = new ArrayList(3);
		
		list.add(new Student("�׽�Ʈ", 0));
		list.add(new Student("�����", 60));
		System.out.println("list : " + list);
		
		list.add(new Student("������", 90));
		System.out.println("���� list�� ��� element ���� : " + list.size());
		
		list.add(new Student("����ȣ", 85));
		list.add(new Student("���̹�", 66));
		System.out.println("list : " + list);
		System.out.println("���� list�� ��� element ���� : " + list.size());
		
		list.add(0, new Student("�����", 100));
		System.out.println("list : " + list);
		
		list.remove(new Student("�׽�Ʈ", 0));
		System.out.println("list : " + list);
		list.remove(1);
		System.out.println("list : " + list);
		
		// ���� ���1. Collections Ŭ���� �̿�
		//Collections.sort(list);
		//System.out.println("list ����1 : " + list);
		//Collections.sort(list, new StudentComparator());
		//System.out.println("list ����2 : " + list);
		
		//���� ���2. List �ȿ� �ִ� sort()�޼ҵ� �̿�
		list.sort(new StudentComparator());
		System.out.println("list ���� 3 : " + list);
		
		// 3. ���� Ÿ���� �����͸� ���� �����ϴ�
		list.add("��");
		System.out.println("���ο� Ÿ�� ���� : " + list);
		
		// set(int index, E e) : index��° �ε����� �ִ� ��Ҹ� E��ҷ� ����
		list.set(2, new Student("�����", 31));
		System.out.println("list ���� : " + list);
		
		//subList(int index1, int index2)
		// : index1��° �ε������� index2��° �ε��������� ����Ʈ ��ȯ
		// index1 <== subList < index2
		List copyList = list.subList(2, 5);
		System.out.println("list ���� : " + copyList);
		
		//retainAll(Collection c) : c�� ��ġ�ºκи� ���� ��� ����
		list.retainAll(copyList);
		System.out.println("list �ߺ� �κ� ���� : " + list);
		
		if(list.contains(new Student("�����", 100))) {
			int index = list.indexOf(new Student("�����", 100));
			Student std = (Student)list.get(index);
			System.out.println(std.getName() + "���� ������ "
					+ std.getScore() + "�� �Դϴ�.");
	}else {
		System.out.println("�������� �ʽ��ϴ�.");
	}
		// clear() : ����� ��� ��ü ����
		// isEmpty() : ����Ʈ�� ����� �� true ��ȯ
		list.clear();
		System.out.println("list : " + list);
		System.out.println("list�� �������? " + list.isEmpty());
}
}