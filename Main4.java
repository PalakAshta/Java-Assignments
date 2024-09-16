package CollectionAssign1;

import java.util.HashMap;
import java.util.Map;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> mp=new HashMap<>();
		mp.put(1,71);
		mp.put(2,98);
		mp.put(3,66);
		mp.put(4,87);
		Map<Integer,String> newMap=new HashMap<>();
		for(Integer i : mp.keySet()) {
			Integer marks=mp.get(i);
			String medal=setMedal(marks);
			newMap.put(i,medal);
		}
		System.out.println(newMap);

	}
	public static String setMedal(Integer marks) {
		if(marks>=90)
			return "Gold";
		else if(marks>=80 && marks<90)
			return "Silver";
		else if(marks>=70 && marks<80)
			return "Bronze";
		else
			return "None";
	}

}
