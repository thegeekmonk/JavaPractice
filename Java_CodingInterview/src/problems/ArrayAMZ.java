package problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayAMZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,4,5,5,5,4,3,10};
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		
		for(int i = 0;i < arr.length;i++)
		{
			if(map.containsKey(arr[i]))
				map.put(arr[i],map.get(arr[i])+1);
			else
			    map.put(arr[i],1);
		}
		
		List<Integer> list = Arrays.asList(arr.length);
		
		System.out.println(list);
		
	}

}
