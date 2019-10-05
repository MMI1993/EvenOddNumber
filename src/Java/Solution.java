package Java;

import java.util.ArrayList;
import java.util.List;

//Write a method that returns a comma separated string
//based on a given list of integers.
//Each element should be preceded by the letter 'e' if
//the number is even, and preceded by the letter 'o' if
//the number is odd.
//For example, if the input list is (3,44,5,10),
//the output should be 'o3 e44 o5 e10'.
public class Solution {
    public static StringBuilder getInput1(List<Integer> numbers) {
        String stringEven = "e";
        String stringOdd = "o";
        StringBuilder input1 = new StringBuilder();

        for(Integer str : numbers) {
            if (str % 2 == 0) {
            }
            input1.append("e" + str + " " );
       // } else {
            input1.append("o" + str + " ");
        }

        return input1;
    }
    public static void main(String[] args) {
        List<Integer>numbers = new ArrayList<>();
        numbers.add(3);
        numbers. add(44);
        numbers.add(5);
        numbers.add(10);
        getInput1(numbers);
        System.out.println();
    }
}
