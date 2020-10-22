package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.BookController;
import vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	public void mainMenu() {
		
		System.out.println("==== Welcome KH Library ====");
		
		int menuNum = 0;
		do {
			System.out.println();
			System.out.println("====***** ���� �޴� *****====");
			System.out.println("1. �� ���� �߰�");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻� ��ȸ");
			System.out.println("4. ���� ����");
			System.out.println("5. ���� �� �������� ����");
			System.out.println("9. ����");
			
			System.out.println();
			System.out.println("�޴� ��ȣ �Է� : ");
			menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1 : insertBook(); break;
			case 2 : selectList(); break;
			case 3 : searchBook(); break;
			case 4 : deleteBook(); break;
			case 5 : ascBook(); break;
			case 9 : System.out.println("���α׷� ����"); break;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
			}
		}while(menuNum != 9);
	}

	public void insertBook() {
		System.out.println("å ������ �Է����ּ���.");
		System.out.print("������ : ");
		String title = sc.nextLine();
		System.out.print("���� �� : ");
		String author = sc.nextLine();
		System.out.print("�帣(1. �ι�/2. �ڿ�����/3. �Ƿ�/4. ��Ÿ) : ");
		int category = Integer.parseInt(sc.nextLine());
		System.out.print("���� : ");
		int price = Integer.parseInt(sc.nextLine());
		
		String cateName = null;
		switch(category) {
			case 1:
				cateName = "�ι�";
			case 2:
				cateName = "�ڿ�����";
			case 3:
				cateName = "�Ƿ�";
			case 4:
				cateName = "��Ÿ";
		}
		
		Book book = new Book(title, author, cateName, price);
		bc.insertBook(book);
	}
	
	public void selectList() {
		ArrayList bookList = bc.selectList();
		
		if(bookList.isEmpty())
			System.out.println("�����ϴ� ������ �����ϴ�.");
		else {
			for(int i=0; i<bookList.size();i++) {
				System.out.println("\t" + bookList.get(i));
			}
		}
	}
	
	public void searchBook() {
		System.out.print("�˻� Ű���� : ");
		String keyword = sc.nextLine();
		ArrayList searchList = bc.searchBook(keyword);
		
		if(searchList.isEmpty()) {
			System.out.println("�˻� ����� �����ϴ�.");
		}else {
			for(int i = 0; i<searchList.size(); i++) {
				System.out.println("\t" + searchList.get(i));
			}
		}
	}
	
	public void deleteBook() {
		System.out.print("������ ���� �� : ");
		String title = sc.nextLine();
		System.out.println("������ ���� �� : ");
		String author = sc.nextLine();
		
		Book remove = bc.deleteBook(title, author);
		
		if(remove !=null) {
			System.out.println("���������� �����Ǿ����ϴ�.");
		}else {
			System.out.println("������ ������ ã�� ���߽��ϴ�.");
		}
	}
	
	public void ascBook() {
		int result = bc.ascBook();
		
		if(result == 1) {
			System.out.println("���Ŀ� �����Ͽ����ϴ�.");
		}else {
			System.out.println("���Ŀ� �����Ͽ����ϴ�.");
		}
	}
}
