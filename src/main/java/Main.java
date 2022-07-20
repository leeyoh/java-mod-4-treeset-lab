import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 1, 4, 5, 2, 34, 36, 5, 4, 23, 45, 6, 8, 56, 34, 37 };
        ArrayList<Integer> res = getNums(numbers);
        System.out.println(res); // [34, 36, 37, 45, 56]
    }

    public static ArrayList<Integer> getNums(int[] nums) {
        TreeSet<Integer> tSet = new TreeSet<>();
        for(int n : nums){
            if(n > 25){
                tSet.add(n);
            }
        }

        return new ArrayList<Integer>(){{
            addAll(tSet);
        }};
    }
}