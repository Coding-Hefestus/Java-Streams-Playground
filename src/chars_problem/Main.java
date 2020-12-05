package chars_problem;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	
	
	public static void main(String[] args) {
		
		String str = "<<<^v<>";
		//String str = "<<<";
		
		//String str = "^vv<v";
		
	
		
		int result = (int) (str.length() - IntStream.range(0, str.length())
													.mapToObj(i -> str.charAt(i))
													//Function.identity() -> like identity functions in math, what comes in, it goes out
													.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) 
													.entrySet().stream()
													.max(Map.Entry.comparingByValue())
													.get()
													.getValue());
	
		System.out.println(result);
		

	}
			

}
