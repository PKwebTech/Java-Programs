package Map;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeSetMain {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> hob=new TreeMap<Integer,String>();
		hob.put(101,"Pravin");
		hob.put(102,"Vishal");
		hob.put(103,"Rahul");
		System.out.println(hob);
		Set<Entry<Integer,String>>entries= hob.entrySet();
		for(Entry<Integer,String> ent:entries) {
			System.out.println(ent.getKey()+" : "+ent.getValue());
		}

	}

}
