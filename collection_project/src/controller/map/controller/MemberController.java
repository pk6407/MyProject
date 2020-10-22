package controller.map.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

import controller.map.model.vo.Member;

public class MemberController {
	
	private HashMap map = new HashMap();
	
	public boolean joinMembership(String id, Member m) {
		if(!map.containsKey(id)) {
			map.put(id,m);
			return true;
		}else {
			return false;
		}
	}
	
	public String logIn(String id, String password) {
		if(map.containsKey(id)) {
			Member m = (Member)map.get(id);
			String savePw = m.getPassword();
			
			if(savePw.equals(password))
				return m.getname();
			else
				return null;
		}
		return null;
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		boolean existedId = map.containsKey(id);
		
		Member m = (Member)map.get(id);
		String savedPw = m.getPassword();
		boolean existedPw = savedPw.equals(oldPw);
		
		if(existedId && existedPw) {
			m.setPassword(newPw);
			return true;
		}
		return false;
	}
	
	public void changeName(String id, String newName) {
		Member m = (Member)map.get(id);
		m.setName(newName);
	}
	
	public TreeMap sameName(String name) {
		TreeMap same = new TreeMap();
		Set set = map.keySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			String key = (String)it.next();
			Member m = (Member)map.get(key);
			if(m.getname().equals(name)) {
				same.put(key, name);
			}
		}
		return same;
	}
}
