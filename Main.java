package CollectionAssign1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
public static void main(String srgd[]) {
	Map<Integer,String> mp=new HashMap<Integer,String>();
	mp.put(1,"Apple");
	mp.put(2,"Mango");
	mp.put(3,"Orange");
	mp.put(4,"Banana");
	mp.put(5,"Litchi");
	
	List<String> li=new ArrayList<>(mp.values());
	Collections.sort(li);
	System.out.println(li);
//	Collections.sort(li);
//	System.out.println(li);
//	for(Integer i : mp.keySet()) {
//		System.out.println(i);
//		Integer a=(Integer)i;
//	}
	
	
}
}
