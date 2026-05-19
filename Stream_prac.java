import java.util.Arrays;
import java.util.List;

public class Stream_prac {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3,5,2,4,5);

        // nums.forEach(v ->System.out.println(v));  
        int result = nums.stream()
        .filter(n->n%2==0)
        .map(n->n*2)
        .reduce(0,(c,e) -> c+e);

        System.out.println(result);

    }
}
