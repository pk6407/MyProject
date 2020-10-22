package controller.map.view;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import controller.map.controller.MemberController;
import controller.map.model.vo.Member;

public class MemberMenu {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public void mainMenu() {
		System.out.println("======= KH ����Ʈ =======");
		
		int menuNum = 0;
		while(menuNum != 9) {
			System.out.println("====***** ���� �޴� *****====");
			System.out.println("1. ȸ������");
			System.out.println("2. �α���");
			System.out.println("3. ���� �̸� ȸ�� ã��");
			System.out.println("9. ����");
			
			System.out.println();
			System.out.println("�޴� ��ȣ �Է� : ");
			menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1 : joinMembership(); break;
			case 2 : logIn(); memberMenu(); break;
			case 9 : System.out.println("���α׷� ����"); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
	
	public void sameName() {
		System.out.print("�˻��� �̸� : ");
		String name= sc.nextLine();
		
		TreeMap same = mc.sameName(name);
		Set set = same.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Map.Entry me = (Map.Entry)it.next();
			System.out.println(me.getValue() + "-" + me.getKey());
		}
	}
	
	public void memberMenu() {
		int menuNum = 0;
		while(true) {
			System.out.println("====***** ȸ�� �޴� *****====");
			System.out.println("1. ��й�ȣ �ٲٱ�");
			System.out.println("2. �̸��ٲٱ�");
			System.out.println("3. �α׾ƿ�");
			
			System.out.println();
			System.out.println("�޴� ��ȣ �Է� : ");
			menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1 : changePassword(); break;
			case 2 : changeName(); break;
			case 3 : System.out.println("�α׾ƿ� �Ǿ����ϴ�."); return;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
	
	public void joinMembership() {
		while(true) {
			System.out.print("���̵� : ");
			String id = sc.nextLine();
			System.out.print("��й�ȣ : ");
			String password = sc.nextLine();
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			
			Member m = new Member(password, name);
			if(mc.joinMembership(id,m)) {
				System.out.println("���������� ȸ������ �Ϸ��Ͽ����ϴ�.");
				break;
			}else {
				System.out.println("�ߺ��� ���̵��Դϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
	
	public void logIn() {
		
		while(true) {
			System.out.print("���̵� : ");
			String id = sc.nextLine();
			System.out.print("��й�ȣ : ");
			String password = sc.nextLine();
			
			String name = mc.logIn(id, password);
			if(name != null) {
				System.out.println(name + "��, ȯ���մϴ�!");
				break;
			}else {
				System.out.println("Ʋ�� ���̵� �Ǵ� ��й�ȣ�Դϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
	
	public void changePassword() {
		while(true) {
			System.out.print("���̵� : ");
			String id = sc.nextLine();
			System.out.print("���� ��й�ȣ : ");
			String oldPw = sc.nextLine();
			System.out.println("���ο� ��й�ȣ : ");
			String newPw = sc.nextLine();
			
			boolean result = mc.changePassword(id, oldPw, newPw);
			if(result) {
				System.out.println("��й�ȣ ���濡 �����߽��ϴ�.");
				break;
			}else {
				System.out.println("��й�ȣ ���濡 �����߽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
	
	public void changeName() {
		while(true) {
			System.out.print("���̵� : ");
			String id = sc.nextLine();
			System.out.print("��й�ȣ : ");
			String password = sc.nextLine();
			
			String name = mc.logIn(id, password);
			if(name != null) {
				System.out.println("���� ������ �̸� : " + name);
				System.out.print("������ �̸� : ");
				String newName = sc.nextLine();
				
				mc.changeName(id, newName);
				System.out.println("�̸� ���濡 �����߽��ϴ�.");
				break;
			}else {
				System.out.println("�̸� ���濡 �����߽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
}
