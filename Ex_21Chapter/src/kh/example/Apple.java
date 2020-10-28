package kh.example;

import java.util.ArrayList;
import java.util.List;

public class Apple {

	public static void main(String[] args) {
		//for (타입 변수이름 : 배열(컬렉션)
		final List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");

		for(String message : list) {
			System.out.println(message);
		}
		//자료형[] 변수이름 =
		//자료형 변수이름[] =
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
		String kor = "가나다라마바사";
		String eng = "ABCDEFGHI";

		String str1 = "ABC";
		String str2 = "ABC";
		String str3 = new String("ABC");

		System.out.println(str1 == str2);
		System.out.println(str1 == str3); 
		//foreach,enhanced for문
		//for(타입 변수이름 : 배열(컬렉션)){
		//}
		/*문과 식의 차이
		 * 문:명령
		 * 식:평가 결과가 값
		 * 조건식 : 평가 결과가 boolean
		 */
		/*타입의 종류
		 * 원시 타입(primitive type)
		 * -스택에 바로 저장
		 * 참조 타입(referece type)
		 * -객체는 실제로 heap 공간에 존재하고, 그것을 가리키는 값이 스택
		 */
		/*배열
		 * 
		 * 1.타입[] 변수이름;
		 * 2.타입 변수이름[];
		 * 3.타입[] 변수이름 = new 타입[길이]
		 */
		//배열 초기화 입력
		// 타입[] 변수이름 = {값,.....,값N};
		//타입[] 변수이름 = new 타입[길이];
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
		/*파라미터(parameter)랑 인자(argument)차이
		 * y = f(x)
		 * x가 파라미터(parameter)
		 * y = f(5)
		 * 5가 인자(argument)
		 */
		int[][] m1 = new int[2][];	//A
		m1[0] = new int[] {1,2,3};	//B
		m1[1] = new int[] {4,5,6};	//C
		
		//행
		for(int i = 0; i < 2; i++) {
			//열
			for(int j= 0; j < 3; j++) {
				System.out.println(m1[i][j]);
			}
		}
	}
}
