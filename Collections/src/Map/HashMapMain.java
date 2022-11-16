package Map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapMain {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hob=new HashMap<Integer,String>();
		hob.put(101,"Pravin");
		hob.put(102,"Vishal");
		hob.put(103,"Rahul");
		System.out.println(hob);
		
		Set<Entry<Integer,String>>entries= hob.entrySet();
		for(Entry<Integer,String> ent:entries) {
			System.out.println(ent.getKey()+" "+ent.getValue());
		}

	}

}
