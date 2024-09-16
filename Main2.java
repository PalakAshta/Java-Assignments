package CollectionAssign1;

import java.util.HashMap;
import java.util.Map;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Character str[]= {'a','c','a','a','a','c','b'};
     Map<Character, Integer> mp=new HashMap<Character, Integer>();
     for(Character i:str) {
    	 if(mp.containsKey(i))
    		mp.put(i,mp.get(i)+1);
    	 else
    		 mp.put(i,1);
     }
     System.out.println(mp);
     
     
	}

}
