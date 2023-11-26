package references;

import java.util.HashMap;
import java.util.Map;

public class keySearchUsingValue {
	public static void main(String[] args) {
		System.out.println("start ---------------");
		Map<String, String> paramMap = new HashMap<>();
        paramMap.put("1", "A");
        paramMap.put("2", "B");
        paramMap.put("3", "C");
        paramMap.put("4", "D");

        Map<String, String> answerMap = new HashMap<>();
        answerMap.put("A", "X");
        answerMap.put("C", "Y");
        answerMap.put("E", "Z");

        printMatchingValues(paramMap, answerMap);
        
        System.out.println("end ---------------");
        
        String arr[] = {"13", "44", "ato", "pocka"};
        
        
        System.out.println(Character.isDigit(arr[1].charAt(0)));
        
        System.out.println(Character.isDigit(arr[2].charAt(0)));
        
        
    }

    private static void printMatchingValues(Map<String, String> paramMap, Map<String, String> answerMap) {
        for (String answerValue : answerMap.values()) {
            if (paramMap.containsKey(answerValue)) {
                String correspondingValue = paramMap.get(answerValue);
                System.out.println(correspondingValue);
            }
        }
    }
}
