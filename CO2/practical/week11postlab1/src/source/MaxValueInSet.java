package source;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;
public class MaxValueInSet {
	 public static void main(String[] args) {
	        Set<Integer> numbers = new HashSet<>();
	        numbers.add(23);
	        numbers.add(42);
	        numbers.add(15);
	        numbers.add(8);
	        numbers.add(67);
	    int maxValue = Collections.max(numbers);	        
	        System.out.println("The maximum value in the set is: " + maxValue);
	    }
}
