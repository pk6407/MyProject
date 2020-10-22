package example.collection.list.model;

import java.util.Comparator;

import example.collection.list.model.vo.Student;

public class StudentComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		int standard = ((Student)o1).getScore();
		int object = ((Student)o2).getScore();
		
		if(standard > object) {
			return 1;
		}else if(standard == object) {
			return 0;
		}else {
			return -1;
		}
	}

}
