package com.src;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionImpl {

	public static void main(String[] args) {
		//HashMap<Integer,String> nameList = new HashMap<Integer,String>();
		ConcurrentHashMap<Integer,String> nameList = new ConcurrentHashMap<Integer,String>();
		//ArrayList<String> copyList= new ArrayList<String>();
		//CopyOnWriteArrayList<String> copyList= new CopyOnWriteArrayList<String>();
		
		String str1="Apple";
		String str2="Orange";
		
		System.out.println(str1.compareTo(str2));
		
//		copyList.add("A");
//		copyList.add("B");
//		
//		System.out.println("Print me=="+copyList);
//		
//		Iterator it1= copyList.iterator();
//		while(it1.hasNext()) {
//			System.out.println(it1.next());
//			copyList.add("C");			
//		}
	//	System.out.println("CopyList=="+copyList);
		
		nameList.put(1, "Adi");
		nameList.put(5, "Vedi");
		nameList.put(3, "Chedi");		
		nameList.put(4, "Adi");
		//nameList.put(5, "Wedi");
		//nameList.put(null, "Kedi");
		//nameList.put(null, null);

		
		System.out.println("NameList Details==="+nameList);
		//Collections.sort(nameList);
		
		Set set = nameList.entrySet();
		
		System.out.println("Key and Values="+nameList.keySet());
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<Integer, String> me=(Map.Entry<Integer, String>)itr.next();
			nameList.put(6, "Wedi");
			System.out.println("Key Values=="+me.getKey());
			System.out.println("Value Values=="+me.getValue());
		}
	
	

	}

}
