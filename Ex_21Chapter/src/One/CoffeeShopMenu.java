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
		coffeeshop[0].setName("아메리카노 Hot");
		coffeeshop[0].setPrice(1500);
		coffeeshop[1].setName("아메리카노 ice");
		coffeeshop[1].setPrice(2000);
		coffeeshop[2].setName("카페모카");
		coffeeshop[2].setPrice(3000);
		coffeeshop[3].setName("카라멜마키야또");
		coffeeshop[3].setPrice(3000);
		coffeeshop[4].setName("요거트 스무디");
		coffeeshop[4].setPrice(3500);
		coffeeshop[5].setName("딸기 스무디");
		coffeeshop[5].setPrice(4000);
		coffeeshop[6].setName("치즈케이크");
		coffeeshop[6].setPrice(4500);
		coffeeshop[7].setName("초코케이크");
		System.out.println("메가커피에 오신걸 환영합니다. ");
		System.out.println("어느 곳에서 드시겠습니까? 1.매장 2포장");
		int a = sc.nextInt();
		if(a == 1) {
			System.out.println("매장");
		}else if(a == 2) {
			System.out.println("포장"); 	
		}else {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}
		int menuNum = 0;
		while(menuNum != 3) {
			System.out.println("1.주문 2.결제 3.종료");
			menuNum = sc.nextInt();

			switch(menuNum) {
			case 1 : order(); break;
			case 2 : pay(); break;
			case 3 : System.out.println("프로그램을 종료합니다.");	break;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");	break;
			}
		}
		sc.close();
	}
	public void order() {
		System.out.println("-------------------");
		System.out.println("====== 메뉴 선택 ======");
		System.out.println("1.커피 2.스무디 3.디저트");
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
		System.out.println("====== 커피 선택 ======");
		System.out.println("1." + coffeeshop[0]);
		System.out.println("2." + coffeeshop[1]);
		System.out.println("3." + coffeeshop[2]);
		System.out.println("4." + coffeeshop[3]);
		System.out.println("--------------------");
		int choice1 = sc.nextInt();

		if(choice1 == 1) {
			System.out.println("샷 추가 하시겠습니까?");
			System.out.println("1.네(500원 추가)" + ", 2.아니요");
			int b = sc.nextInt();
			if(b == 1) {
				total = total + coffeeshop[0].getPrice() + 500;
			}else if(b == 2) {
				total = total + coffeeshop[0].getPrice() + 500;
			}else {
				System.out.println("잘못 입력하셧습니다. 다시입력해주세요.");
			}
		}else if(choice1 == 2) {
			System.out.println("샷 추가 하시겠습니까?");
			System.out.println("1.네(500원 추가)" + ", 2.아니요");
			int b = sc.nextInt();
			if(b == 1) {
				total = total + coffeeshop[1].getPrice() + 500;
			}else if(b == 2) {
				total = total + coffeeshop[1].getPrice() + 500;
			}else {
				System.out.println("잘못 입력하셧습니다. 다시입력해주세요.");
			}
		}else if(choice1 == 3) {
			System.out.println("샷 추가 하시겠습니까?");
			System.out.println("1.네(500원 추가)" + ", 2.아니요");
			int b = sc.nextInt();
			
			if(b == 1) {
				total = total + coffeeshop[2].getPrice() + 500;
			}else if(b == 2) {
				total = total + coffeeshop[2].getPrice() + 500;
			}else {
				System.out.println("잘못 입력하셧습니다. 다시입력해주세요.");
			}
		}else if(choice1 == 4) {
			System.out.println("샷 추가 하시겠습니까?");
			System.out.println("1.네(500원 추가)" + ", 2.아니요");
			int b = sc.nextInt();
			if(b == 1) {
				total = total + coffeeshop[3].getPrice() + 500;
			}else if(b == 2) {
				total = total + coffeeshop[3].getPrice() + 500;
			}else {
				System.out.println("잘못 입력하셧습니다. 다시 입력해주세요.");
			}
		}
	}
	public void smoothies() {
		System.out.println("----------------------");
		System.out.println("====== 스무디 선택 ======");
		System.out.println("1." + coffeeshop[4]);
		System.out.println("2." + coffeeshop[5]);
		System.out.println("----------------------");
		int c = sc.nextInt();
		
		if(c == 1) {
			total = total + coffeeshop[4].getPrice() + 500;
		}else if(c == 2) {
			total = total + coffeeshop[5].getPrice() + 500;
		}else {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}
	}
	public void dessert() {
		System.out.println("---------------------");
		System.out.println("====== 디저트 선택 ======");
		System.out.println("1." + coffeeshop[6]);
		System.out.println("2." + coffeeshop[7]);
		System.out.println("---------------------");
		int d = sc.nextInt();
		
		if(d == 1) {
			total = total + coffeeshop[6].getPrice() + 500;
		}else if(d == 2) {
			total = total + coffeeshop[7].getPrice() + 500;
		}else {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}
	}
	public void pay() {
		System.out.println("====== 결제 목록 ======"); 
		System.out.println("총 결제 금액은 : " + total + "원 입니다.");
		System.out.println("--------------------");
	}
}
