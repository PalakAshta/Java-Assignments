package CollectionAssign1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<Integer> li=new ArrayList<Integer>();
    li.add(1);
    li.add(2);
    li.add(3);
    li.add(4);
    Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
    for(Integer i:li) {
    	mp.put(i,i*i);
    }
    System.out.println(mp);
	}

}
