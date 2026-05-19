import java.util.ArrayList;
import java.util.*;

public class Collection_prac {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<Integer>();

        nums.add(3);
        nums.add(4);
        nums.add(65);

        for(int n:nums){
            System.out.println(n);
        }

    }
}
