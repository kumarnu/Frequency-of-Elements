import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class FrequencyOfElementsUsingHashSet {
	
	HashSet<String> frequencyCount(ArrayList<String> list) {
		// HashSet does not allow duplicate elements as it implements Set Interface. 
		// Objects are inserted based on their hash code.
		// HashSet is created and elements of ArrayList are inserted into the set
		HashSet<String> set = new HashSet<String>(list);
		
		for (String value : set) {
			System.out.println(value + ":" + Collections.frequency(list, value));
			
		}
		return set;		
	}

	public static void main(String[] args) {
		FrequencyOfElementsUsingHashSet obj = new FrequencyOfElementsUsingHashSet();
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("Nitish");
		aList.add("Nabish");
		aList.add("Nitish");
		aList.add("Amogh");
		aList.add("Nitish");
		aList.add("Amogh");
		
		obj.frequencyCount(aList);
	}

}
