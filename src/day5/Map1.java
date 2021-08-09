package day5;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <Integer, String> ht=new Hashtable<>();
		ht.put(100, "Ram");
		ht.put(100, "Java");
		ht.put(253, "C++");
		ht.put(4550, "Python");
		ht.put(10045, "PHP");
		ht.put(10078, "MYSQL");
		ht.put(100684, "AWS");
		ht.put(100747, "cws");
		Iterator<Entry<Integer,String>> i=ht.entrySet().iterator();
		while(i.hasNext()) {
			Entry<Integer,String> e=i.next();
			if(e.getKey()==null||e.getValue()==null)
		}
	}

}
