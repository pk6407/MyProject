package One;
import One.login;
import One.CoffeeShop;
import java.util.Scanner;

public class CoffeeShopMenu { 
	CoffeeShop[] coffeeshop = new CoffeeShop[8];
	Scanner sc = new Scanner(System.in);
	int total = 0;
	int coupon = 0;

	public void Menu() {
		for(int i=0; i<8; i++) {
			coffeeshop[i] = new CoffeeShop();
		} 
		coffeeshop[0].setName("�Ƹ޸�ī�� Hot");
		coffeeshop[0].setPrice(1500);
		coffeeshop[1].setName("�Ƹ޸�ī�� ice");
		coffeeshop[1].setPrice(2000);
		coffeeshop[2].setName("ī���ī");
		coffeeshop[2].setPrice(3000);
		coffeeshop[3].setName("ī��ḶŰ�߶�");
		coffeeshop[3].setPrice(3000);
		coffeeshop[4].setName("���Ʈ ������");
		coffeeshop[4].setPrice(3500);
		coffeeshop[5].setName("���� ������");
		coffeeshop[5].setPrice(4000);
		coffeeshop[6].setName("ġ������ũ");
		coffeeshop[6].setPrice(4500);
		coffeeshop[7].setName("��������ũ");
		coffeeshop[7].setPrice(4000);
		System.out.println("�ް�Ŀ�ǿ� ���Ű� ȯ���մϴ�. ");
		System.out.println("��� ������ ��ðڽ��ϱ�? 1.���� 2����");
		int a = sc.nextInt();
		if(a == 1) {
			System.out.println("����");
		}else if(a == 2) {
			System.out.println("����"); 	
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
		}
		int menuNum = 0;
		while(menuNum != 3) {
			System.out.println("1.�ֹ� 2.���� 3.����");
			menuNum = sc.nextInt();

			switch(menuNum) {
			case 1 : order(); break;
			case 2 : pay(); break;
			case 3 : System.out.println("���α׷��� �����մϴ�.");	break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");	break;
			}
		}
		sc.close();
	}
	public void order() {
		System.out.println("-------------------");
		System.out.println("====== �޴� ���� ======");
		System.out.println("1.Ŀ�� 2.������ 3.����Ʈ");
		System.out.println("-------------------");
		int choice = sc.nextInt();
		if(choice == 1) {
			Coffee();
		}else if(choice == 2) {
			smoothies();
		}else if(choice == 3) {
			dessert();
		}
	}
	public void Coffee() {
		System.out.println("--------------------");
		System.out.println("====== Ŀ�� ���� ======");
		System.out.println("1." + coffeeshop[0]);
		System.out.println("2." + coffeeshop[1]);
		System.out.println("3." + coffeeshop[2]);
		System.out.println("4." + coffeeshop[3]);
		System.out.println("--------------------");
		int choice1 = sc.nextInt();

		if(choice1 == 1) {
			System.out.println("�� �߰� �Ͻðڽ��ϱ�?");
			System.out.println("1.��(500�� �߰�)" + ", 2.�ƴϿ�");
			int b = sc.nextInt();
			if(b == 1) {
				total = total + coffeeshop[0].getPrice() + 500;
			}else if(b == 2) {
				total = total + coffeeshop[0].getPrice() + 500;
			}else {
				System.out.println("�߸� �Է��ϼ˽��ϴ�. �ٽ��Է����ּ���.");
			}
		}else if(choice1 == 2) {
			System.out.println("�� �߰� �Ͻðڽ��ϱ�?");
			System.out.println("1.��(500�� �߰�)" + ", 2.�ƴϿ�");
			int b = sc.nextInt();
			if(b == 1) {
				total = total + coffeeshop[1].getPrice() + 500;
			}else if(b == 2) {
				total = total + coffeeshop[1].getPrice() + 500;
			}else {
				System.out.println("�߸� �Է��ϼ˽��ϴ�. �ٽ��Է����ּ���.");
			}
		}else if(choice1 == 3) {
			System.out.println("�� �߰� �Ͻðڽ��ϱ�?");
			System.out.println("1.��(500�� �߰�)" + ", 2.�ƴϿ�");
			int b = sc.nextInt();

			if(b == 1) {
				total = total + coffeeshop[2].getPrice() + 500;
			}else if(b == 2) {
				total = total + coffeeshop[2].getPrice() + 500;
			}else {
				System.out.println("�߸� �Է��ϼ˽��ϴ�. �ٽ��Է����ּ���.");
			}
		}else if(choice1 == 4) {
			System.out.println("�� �߰� �Ͻðڽ��ϱ�?");
			System.out.println("1.��(500�� �߰�)" + ", 2.�ƴϿ�");
			int b = sc.nextInt();
			if(b == 1) {
				total = total + coffeeshop[3].getPrice() + 500;
			}else if(b == 2) {
				total = total + coffeeshop[3].getPrice() + 500;
			}else {
				System.out.println("�߸� �Է��ϼ˽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
	public void smoothies() {
		System.out.println("----------------------");
		System.out.println("====== ������ ���� ======");
		System.out.println("1." + coffeeshop[4]);
		System.out.println("2." + coffeeshop[5]);
		System.out.println("----------------------");
		int c = sc.nextInt();

		if(c == 1) {
			total = total + coffeeshop[4].getPrice();
		}else if(c == 2) {
			total = total + coffeeshop[5].getPrice();
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
		}
	}
	public void dessert() {
		System.out.println("---------------------");
		System.out.println("====== ����Ʈ ���� ======");
		System.out.println("1." + coffeeshop[6]);
		System.out.println("2." + coffeeshop[7]);
		System.out.println("---------------------");
		int d = sc.nextInt();

		if(d == 1) {
			total = total + coffeeshop[6].getPrice();
		}else if(d == 2) {
			total = total + coffeeshop[7].getPrice();
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
		}
	}
	public void pay() {
		System.out.println("====== ���� ��� ======"); 
		System.out.println("�� ���� �ݾ��� : " + total + "�� �Դϴ�.");
		System.out.println("--------------------");
	}
}
