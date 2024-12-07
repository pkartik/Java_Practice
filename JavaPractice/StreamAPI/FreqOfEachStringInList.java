package JavaPractice.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqOfEachStringInList {

    public static void main(String[] args) {
        List<String> stationaryList = Arrays.asList("Pen","Eraser","Note Book","Pen","Pencil","Stapler","Notebook","Pencil");

        Map<String,Long> stationaryCountMap =stationaryList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        
        System.out.println(stationaryCountMap);
    
    }
    
}
