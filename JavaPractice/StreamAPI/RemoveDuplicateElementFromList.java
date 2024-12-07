package JavaPractice.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElementFromList {
    public static void main(String[] args) {
    
    List<String> listofStrings = Arrays.asList("Java","Python","C#","Java","Kotlin","Python");

    List<String> uniqueStrings = listofStrings.stream().distinct().collect(Collectors.toList());

    System.out.println(uniqueStrings);
    
    }
}
