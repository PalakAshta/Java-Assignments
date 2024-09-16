package CollectionAssign1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer array[]= {8,7,0,1,3,6,4};
		List<Integer> arr=new ArrayList<>();
		for(Integer i:array) {
			//System.out.println(i);
			arr.add(i);
		}
		Collections.sort(arr);
		//System.out.println(arr);
		System.out.println(arr.get(1));

	}

}
