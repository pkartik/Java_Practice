package JavaPractice.EYCodingQuestions;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.next();
            
            int count=0;
            
            for(int i=0; i<str.length()-1;i++){
                if(str.charAt(i)=='S' && str.charAt(i+1)=='N'|| str.charAt(i)=='N' && str.charAt(i+1)=='S'){
                    count++;
                }  
            }
            System.out.println(count);
        }
    }
}