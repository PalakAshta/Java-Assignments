package CollectionAssign1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> mp=new HashMap<>();
		mp.put(1,71);
		mp.put(2,98);
		mp.put(4,16);
		mp.put(3,66);
		mp.put(4,-9);
		mp.put(5,87);
		
		List<Integer> li=new ArrayList<>();
		for(Integer i : mp.keySet()) {
			Integer age=mp.get(i);
			if(age>0) {
			boolean res=getRes(age);
			if(res)
			li.add(i);
			}
			else
				System.out.println("Invalid age for id "+i);
		}
		System.out.println(li);

	}
	public static boolean getRes(Integer age) {
		if(age>18)
			return true;
		else
			return false;
	}

	}


