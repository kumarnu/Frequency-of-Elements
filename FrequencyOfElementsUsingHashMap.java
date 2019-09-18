import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElementsUsingHashMap {
	
	Map<String, Integer> frequencyCount(ArrayList<String> list) {
		
		Map<String, Integer>  map= new HashMap<String, Integer>();
		Integer count;
		for (String value : list) {
			count = map.get(value);
			if (count == null) {       //Note: Integer contains null value by default, but int contains 0
				map.put(value, 1);
			}
			else {
				map.put(value, count + 1);	
			}	
		}
		return map;
		
	}
	public static void main(String[] args) {
		FrequencyOfElementsUsingHashMap obj = new FrequencyOfElementsUsingHashMap();
		Map<String, Integer> result = new HashMap<String, Integer>();
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("Nitish");
		aList.add("Nabish");
		aList.add("Nitish");
		aList.add("Amogh");
		aList.add("Nitish");
		aList.add("Amogh");
		
		result = obj.frequencyCount(aList);
		System.out.println(result);

	}

}
