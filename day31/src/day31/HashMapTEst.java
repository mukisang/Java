package day31;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapTEst {
	public static void main(String[] args) {
		HashMap<String, Integer> m = new HashMap<>();
		m.put("»ç°ú", 2000);
		m.put("±Ö", 1000);
		m.put("Å°À§", 3000);
		
		Set<Entry<String, Integer>> mset = m.entrySet();
		Iterator<Entry<String, Integer>> iter = mset.iterator();
		while(iter.hasNext())
		{
			Entry<String, Integer> e = iter.next();
			System.out.println(e.getKey()+" : "+e.getValue());
		}
		
		
		
	}
	
	
	
}
