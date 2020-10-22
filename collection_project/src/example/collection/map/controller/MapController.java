package example.collection.map.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

import example.collection.map.model.SnackComparator;
import example.collection.map.model.vo.Snack;
import sun.nio.cs.CharsetMapping.Entry;

public class MapController {

		public void doMap() {
			Map<String, Snack> map = new HashMap();
			
			map.put("»õ¿ì±ø", new Snack("Â§¸À",1500));
			map.put("´ÙÀÌÁ¦", new Snack("´Ü¸À",2500));
			map.put("Æ÷Å×ÀÌÅäÄ¨", new Snack("Â§¸À",1500));
			map.put("°í¼Ò¹Ì", new Snack("°í¼ÒÇÑ ¸À",1000));
			System.out.println(map);
			
			map.put("»õ¿ì±ø", new Snack("¸Å¿î¸À",1500));
			System.out.println(map);
			
			System.out.println(map.containsKey("»õ¿ì±ø"));
			System.out.println(map.containsValue(new Snack("Â§¸À",1500)));
			
			System.out.println(map.get("»õ¿ì±ø"));
			System.out.println(map.get("È¨·±º¼"));
			
			System.out.println(map.values());
			
			System.out.println();
			
			Set<String> set1 = map.keySet();
			Iterator<String> it1 = set1.iterator();
			while(it1.hasNext()) {
				String key = it1.next();
				System.out.printf("Å° : %s, °ª : %s%n" , key , map.get(key));
			}
			
			for(Object o : map.keySet()) {
				System.out.printf("Å° : %s, °ª : %s%n" , o , map.get(o));
			}
			
			System.out.println();
			
			Set<Entry<String, Snack>> set2 = map.entrySet();
			Iterator<Entry<String,Snack>> it2 = set2.iterator();
			while(it2.hasNext()) {
				Map.Entry<String, Snack> me = it2.next();
				System.out.printf("Å° : %s, °ª : %s%n" , me.getKey() , me.getValue());
			}
			
			System.out.println();
			
			for(Map.Entry<String, Snack>o : set2) {
				System.out.printf("Å° : %s, °ª : %s%n" , o.getKey(), o.getValue());
			}
		
		
		System.out.println();
		
		Map<String , Snack> map2 = new TreeMap<String, Snack>();
		map2.putAll(map);
		System.out.println(map2);
		
		Map<String, Snack> map3 = new TreeMap<String, Snack>(new SnackComparator());
		map3.putAll(map2);
		System.out.println(map3);
		}
		public void doProperties() {
			Properties prop = new Properties();
			prop.setProperty("Ã¤¼Ò", "¿ÀÀÌ");
			prop.setProperty("°úÀÏ", "»ç°ú");
			prop.setProperty("°£½Ä", "Á©¸®");
			prop.setProperty("Ã¤¼Ò", "ÇÇ¸Á");
			System.out.println(prop);
			
			System.out.println(prop.getProperty("Ã¤¼Ò"));
			System.out.println(prop.getProperty("Ã¤¼Ò", "¹ö¼¸"));
			System.out.println(prop.getProperty("°ú¸ñ", "¼öÇÐ"));
			
			Enumeration e = prop.propertyNames();
			while(e.hasMoreElements()) {
				String key = (String)e.nextElement();
				System.out.println(key + "/" + prop.getProperty(key));
			}
		}
		
		public void fileSave() {
			try(FileOutputStream fos = new FileOutputStream("test.properties")){
				Properties prop = new Properties();
				prop.setProperty("title", "Properties Practice");
				prop.setProperty("width", "1920");
				prop.setProperty("height", "1080");
				prop.setProperty("language", "kor");
				
				prop.store(fos, "Properties Test File");
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		public void fileOper() {
			try(FileInputStream fis = new FileInputStream("test.properties")){
				Properties prop = new Properties();
				
				prop.load(fis);
				System.out.println(prop);
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
}
