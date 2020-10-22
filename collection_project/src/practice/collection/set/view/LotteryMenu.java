package practice.collection.set.view;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

import practice.collection.set.controller.LotteryController;
import practice.collection.set.model.vo.Lottery;

public class LotteryMenu {
	private Scanner sc =new Scanner(System.in);
	private LotteryController lc = new LotteryController();
	
	public void mainMenu() {
		System.out.println("====== KH ��÷ ���α׷� ======");
		
		int menuNum = 0;
		while(menuNum != 9) {
			System.out.println("====***** ���� �޴� *****====");
			System.out.println("1. ��÷ ��� �߰�");
			System.out.println("2. ��÷ ��� ����");
			System.out.println("3. ��÷ ��� Ȯ��");
			System.out.println("4. ���ĵ� ��÷ ��� Ȯ��");
			System.out.println("5. ��÷ ��� �˻�");
			System.out.println("9. ����");
			
			System.out.println();
			System.out.print("�޴� ��ȣ �Է� : ");
			menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1: insertObject(); break;
			case 2: deleteObject(); break;
			case 3: winObject(); break;
			case 4: searchWinner(); break;
			case 9: System.out.println("���α׷� ����"); return;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
			}
		}
	}
	
	public void insertObject() {
		System.out.println("�߰��� ��÷ ��� �� : ");
		int lotteryObject = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < lotteryObject; i++){
			System.out.println("�̸� : ");
			String name = sc.nextLine();
			System.out.println("�ڵ�����ȣ('-'����) : ");
			String phone = sc.nextLine();
			
			Lottery l = new Lottery(name,phone);
			boolean result = lc.insertObject(l);
			if(!result) {
				i--;
				System.out.println("�ߺ��� ����Դϴ�. �ٽ� �Է����ּ���.");
			}
			System.out.println();
		}
		System.out.println(lotteryObject + "�� �߰� �Ϸ�Ǿ����ϴ�.");
	}
	
	public void deleteObject() {
		System.out.println("������ ����� �̸��� �ڵ��� ��ȣ�� �Է��ϼ���");
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�ڵ��� ��ȣ('-'����) : ");
		String phone = sc.nextLine();
		
		Lottery l = new Lottery(name,phone);
		boolean result = lc.deleteObject(l);
		if(result)
			System.out.println("���� �Ϸ�Ǿ����ϴ�.");
		else
			System.out.println("�������� �ʴ� ����Դϴ�.");
	}
	
	public void winObject() {
		System.out.println(lc.winObject());
	}
	
	public void sortedWinObject() {
		TreeSet set = lc.sortedWinobject();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.hasNext());
		}
	}
	
	public void searchWinner() {
		System.out.println("�˻��� ����� �̸��� �ڵ��� ��ȣ�� �Է��ϼ���");
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�ڵ��� ��ȣ('-'����) : ");
		String phone = sc.nextLine();
		
		Lottery l = new Lottery(name,phone);
		boolean result = lc.searchWinner(l);
		if(result)
			System.out.println("�����մϴ�. ��÷ ��Ͽ� �����մϴ�.");
		else
			System.out.println("��Ÿ������ ��÷ ��Ͽ� �������� �ʽ��ϴ�.");
	}
}
