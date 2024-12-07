package JavaPractice.StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortGivenListOfDecimalsInReverse {
    
    public static void main(String[] args) {
        List<Double> decimalList = Arrays.asList(12.45,23.58,17.13,42.89,33.78,71.85,56.98,21.12);
        System.out.println("------------------Printing in Descending Order-------------------------");
        decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("------------------Printing in Ascending Order-------------------------");
        decimalList.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
    }
}
