package practice.generics.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import practice.generics.controller.FarmController;
import practice.generics.model.vo.Farm;
import practice.generics.model.vo.Fruit;
import practice.generics.model.vo.Nut;
import practice.generics.model.vo.Vegetable;

public class FarmMenu {
	
	private Scanner sc = new Scanner(System.in);
	private FarmController fc = new FarmController();
	
	public void mainMenu() {
		System.out.println("======= KH ��Ʈ =======");
		
		int menuNum = 0;
		while(menuNum != 9) {
			System.out.println("====***** ���� �޴� *****====");
			System.out.println("1. ���� �޴�");
			System.out.println("2. �մ� �޴�");
			System.out.println("9. ����");
			
			System.out.println();
			System.out.println("�޴� ��ȣ �Է� : ");
			menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1 : adminMenu(); break;
			case 2 : customerMenu(); break;
			case 9 : System.out.println("���α׷� ����"); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
	public void adminMenu() {
		int menuNum = 0;
		while(menuNum != 9) {
			System.out.println("====*****���� �޴� *****====");
			System.out.println("1. �� ��깰 �߰�");
			System.out.println("2. ���� ����");
			System.out.println("3. ���� ����");
			System.out.println("4. ��깰 ���");
			System.out.println("9. �������� ���ư���");
			
			System.out.println();
			System.out.println("�޴� ��ȣ �Է� : ");
			menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1 : addNewkind(); break;
			case 2 : removekind(); break;
			case 3 : changeAmount(); break;
			case 4 : printFarm(); break;
			case 9 : return;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
	public void customerMenu() {
		int menuNum = 0;
		while(menuNum != 9) {
			System.out.println("����KH��Ʈ ��깰 ����");
			printFarm();
			System.out.println();
			
			System.out.println("====***** �� �޴� *****====");
			System.out.println("1. ��깰 ���");
			System.out.println("2. ��깰 ����");
			System.out.println("3. ������ ��깰 ����");
			System.out.println("9. �������� ���ư���");
			
			System.out.println();
			System.out.print("�޴� ��ȣ �Է� : ");
			menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1 : buyFarm(); break;
			case 2 : removeFarm(); break;
			case 3 : printBuyFarm(); break;
			case 9 : return;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ��Է����ּ���.");
			}
		}
	}
	public void addNewkind() {
		
		while(true) {
			System.out.println("1. ����/ 2. ä��/ 3. �߰�");
			System.out.print("�߰��� ���� ��ȣ : ");
			int kind = sc.nextInt();
			sc.nextLine();
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("���� : ");
			int amount = sc.nextInt();
			sc.nextLine();
			
			Farm f = null;
			switch(kind) {
			case 1 : f = new Fruit("����", name); break;
			case 2 : f = new Vegetable("ä��", name); break;
			case 3 : f = new Nut("�߰�", name); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ��Է����ּ���.");
			}
			if(fc.addNewkind(f, amount)) {
				System.out.println("�� ��깰�� �߰��Ǿ����ϴ�.");
				break;
			}else {
				System.out.println("�� ��깰 �߰��� �����Ͽ����ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
	public void removekind() {
		
		while(true) {
			System.out.println("1. ����/ 2. ä��/ 3. �߰�");
			System.out.print("������ ���� ��ȣ : ");
			int kind = sc.nextInt();
			sc.nextLine();
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			
			Farm f = null;
			switch(kind) {
			case 1 : f = new Fruit("����", name); break;
			case 2 : f = new Vegetable("ä��", name); break;
			case 3 : f = new Nut("�߰�", name); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
			if(fc.removekind(f)) {
				System.out.println("��깰 ������ �����Ͽ����ϴ�.");
				break;
			}else {
				System.out.println("��깰 ������ �����Ͽ����ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
	public void changeAmount() {
		
		while(true) {
			System.out.println("1. ����/ 2. ä��/ 3. �߰�");
			System.out.print("������ ���� ��ȣ : ");
			int kind = sc.nextInt();
			sc.nextLine();
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("������ ���� : ");
			int amount = Integer.parseInt(sc.nextLine());
			
			Farm f = null;
			switch(kind) {
			case 1 : f = new Fruit("����", name); break;
			case 2 : f = new Vegetable("ä��", name); break;
			case 3 : f = new Nut("�߰�", name); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
			if(fc.changeAmount(f, amount)) {
				System.out.println("��깰 ������ �����Ǿ����ϴ�.");
				break;
			}else {
				System.out.println("��깰 ���� ������ �����Ͽ����ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
	public void printFarm() {
		HashMap<Farm, Integer> result = fc.printFarm();
		Set<Farm> set = result.keySet();
		Iterator<Farm> it = set.iterator();
		while(it.hasNext()) {
			Farm key = it.next();
			System.out.println(key + "(" +result.get(key) + "��)");
		}
	}
	public void buyFarm() {
		while(true) {
			System.out.println("1. ����/ 2. ä��/ 3. �߰�");
			System.out.print("���� ���� ��ȣ : ");
			int kind = sc.nextInt();
			sc.nextLine();
			System.out.print("������ �� : ");
			String buy = sc.nextLine();
			
			Farm f = null;
			switch(kind) {
			case 1 : f = new Fruit("����", buy); break;
			case 2 : f = new Vegetable("ä��", buy); break;
			case 3 : f = new Nut("�߰�", buy); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
			if(fc.buyFarm(f)) {
				System.out.println("���ſ� �����Ͽ����ϴ�.");
				break;
			}else {
				System.out.println("��Ʈ�� ���� �����̰ų� ������ �����ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
	public void removeFarm() {
		while(true) {
			System.out.println("1. ����/ 2. ä��/ 3. �߰�");
			System.out.print("��� ���� ��ȣ : ");
			int kind = sc.nextInt();
			sc.nextLine();
			System.out.print("���� ����� �� : ");
			String remove = sc.nextLine();
			
			Farm f = null;
			switch(kind) {
			case 1 : f = new Fruit("����", remove); break;
			case 2 : f = new Vegetable("ä��", remove); break;
			case 3 : f = new Nut("�߰�", remove); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
			if(fc.removeFarm(f)) {
				System.out.println("���� ��ҿ� �����Ͽ����ϴ�.");
				break;
			}else {
				System.out.println("���� ��Ͽ� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
	public void printBuyFarm() {
		ArrayList<Farm> list = fc.printBuyFarm();
		Iterator<Farm> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}