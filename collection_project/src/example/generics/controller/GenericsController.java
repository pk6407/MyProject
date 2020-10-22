package example.generics.controller;

import java.util.ArrayList;
import java.util.Calendar;

import example.collection.map.model.vo.Snack;
import example.generics.model.vo.Parent;

public class GenericsController {

	public void doGenerics() {
		Parent<Integer, String>p = new Parent<>();
		p.getStudent();
		p.getDog();
		
		ArrayList<String>list1 = new ArrayList<>();
		ArrayList<String>list2 = new ArrayList<>();
		list2.addAll(list1);
		
		list1.subList(0, 1);
	}
	public <T extends Parent<Snack, Dog>> void method1(T t1, T t2) {
		t1.getStudent();
	}
	public <T extends Number> void method2(T t) {}
	public <T extends Calendar> void method3(T t) {}
	public <T extends Readable> void method4(T t) {}
	public <T extends Number & Readable> void method5(T t) {}
	
	public void method6(ArrayList<? extends Parent> a) {}
}
