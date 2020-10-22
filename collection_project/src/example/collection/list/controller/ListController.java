package example.collection.list.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import example.collection.list.model.StudentComparator;
import example.collection.list.model.vo.Student;

public class ListController {
	public void doList() {
		List list = new ArrayList(3);
		
		list.add(new Student("테스트", 0));
		list.add(new Student("도대담", 60));
		System.out.println("list : " + list);
		
		list.add(new Student("남나나", 90));
		System.out.println("현재 list에 담긴 element 개수 : " + list.size());
		
		list.add(new Student("하현호", 85));
		list.add(new Student("문미미", 66));
		System.out.println("list : " + list);
		System.out.println("현재 list에 담긴 element 개수 : " + list.size());
		
		list.add(0, new Student("류라라", 100));
		System.out.println("list : " + list);
		
		list.remove(new Student("테스트", 0));
		System.out.println("list : " + list);
		list.remove(1);
		System.out.println("list : " + list);
		
		// 정렬 방법1. Collections 클래스 이용
		//Collections.sort(list);
		//System.out.println("list 정렬1 : " + list);
		//Collections.sort(list, new StudentComparator());
		//System.out.println("list 정렬2 : " + list);
		
		//정렬 방법2. List 안에 있는 sort()메소드 이용
		list.sort(new StudentComparator());
		System.out.println("list 정렬 3 : " + list);
		
		// 3. 여러 타입의 데이터를 저장 가능하다
		list.add("끝");
		System.out.println("새로운 타입 삽입 : " + list);
		
		// set(int index, E e) : index번째 인덱스에 있는 요소를 E요소로 수정
		list.set(2, new Student("도대담", 31));
		System.out.println("list 수정 : " + list);
		
		//subList(int index1, int index2)
		// : index1번째 인덱스부터 index2번째 인덱스까지의 리스트 반환
		// index1 <== subList < index2
		List copyList = list.subList(2, 5);
		System.out.println("list 추출 : " + copyList);
		
		//retainAll(Collection c) : c와 겹치는부분만 빼고 모두 삭제
		list.retainAll(copyList);
		System.out.println("list 중복 부분 삭제 : " + list);
		
		if(list.contains(new Student("류라라", 100))) {
			int index = list.indexOf(new Student("류라라", 100));
			Student std = (Student)list.get(index);
			System.out.println(std.getName() + "님의 점수는 "
					+ std.getScore() + "점 입니다.");
	}else {
		System.out.println("존재하지 않습니다.");
	}
		// clear() : 저장된 모든 객체 삭제
		// isEmpty() : 리스트가 비었을 떄 true 반환
		list.clear();
		System.out.println("list : " + list);
		System.out.println("list가 비었나요? " + list.isEmpty());
}
}