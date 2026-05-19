import java.util.*;
public class Comparator_prac {
    public static void main(String[] args) {
        
        Comparator<Integer> com= new Comparator<Integer>()
        {
            public int compare(Integer i,Integer j){
                if(i%10 > j%10)
                    return 1;
                else
                    return -1;
            }
        };
        

        List<Integer> nums = new ArrayList<>();
        nums.add(23);
        nums.add(34);
        nums.add(92);

        Collections.sort(nums,com);
        System.out.println(nums);
    }
}
