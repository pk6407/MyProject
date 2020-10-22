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
			
			map.put("�����", new Snack("§��",1500));
			map.put("������", new Snack("�ܸ�",2500));
			map.put("��������Ĩ", new Snack("§��",1500));
			map.put("��ҹ�", new Snack("����� ��",1000));
			System.out.println(map);
			
			map.put("�����", new Snack("�ſ��",1500));
			System.out.println(map);
			
			System.out.println(map.containsKey("�����"));
			System.out.println(map.containsValue(new Snack("§��",1500)));
			
			System.out.println(map.get("�����"));
			System.out.println(map.get("Ȩ����"));
			
			System.out.println(map.values());
			
			System.out.println();
			
			Set<String> set1 = map.keySet();
			Iterator<String> it1 = set1.iterator();
			while(it1.hasNext()) {
				String key = it1.next();
				System.out.printf("Ű : %s, �� : %s%n" , key , map.get(key));
			}
			
			for(Object o : map.keySet()) {
				System.out.printf("Ű : %s, �� : %s%n" , o , map.get(o));
			}
			
			System.out.println();
			
			Set<Entry<String, Snack>> set2 = map.entrySet();
			Iterator<Entry<String,Snack>> it2 = set2.iterator();
			while(it2.hasNext()) {
				Map.Entry<String, Snack> me = it2.next();
				System.out.printf("Ű : %s, �� : %s%n" , me.getKey() , me.getValue());
			}
			
			System.out.println();
			
			for(Map.Entry<String, Snack>o : set2) {
				System.out.printf("Ű : %s, �� : %s%n" , o.getKey(), o.getValue());
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
			prop.setProperty("ä��", "����");
			prop.setProperty("����", "���");
			prop.setProperty("����", "����");
			prop.setProperty("ä��", "�Ǹ�");
			System.out.println(prop);
			
			System.out.println(prop.getProperty("ä��"));
			System.out.println(prop.getProperty("ä��", "����"));
			System.out.println(prop.getProperty("����", "����"));
			
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
