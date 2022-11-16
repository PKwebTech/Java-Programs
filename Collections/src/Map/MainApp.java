package Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MainApp {

	public static void main(String[] args) {
		LinkedHashMap<Long,String>tm=new LinkedHashMap<Long,String>();
		tm.put(987654321l, "Ravi");
	    tm.put(876543456l, "Bharathi");
		tm.put(789023456l, "Kiran");
		tm.put(98765432345l, "Ravi");
		System.out.println(tm);
		
		Set<Entry<Long,String>> entries=tm.entrySet();
		for(Entry<Long,String> ent:entries) {
			System.out.println(ent.getKey()+" : "+ent.getValue());
		}
			}

}
