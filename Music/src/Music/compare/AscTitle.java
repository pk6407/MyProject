package Music.compare;

import java.util.Comparator;

import Music.Music;

public class AscTitle implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		Music m1 = (Music)o1;
		Music m2 = (Music)o2;
		
		String standard = m1.getTitle();
		String object = m2.getTitle();
		
		int result = standard.compareTo(object);
		
		String singer1 = m1.getSinger();
		String singer2 = m2.getSinger();
		
		if(result ==0)
			return singer1.compareTo(singer2);
		
		return result;
	}
}
