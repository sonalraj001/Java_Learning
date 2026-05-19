import java.io.IOException;

public class IOexception {
    public static void main(String[] args) throws IOException {
        System.out.println("enter a number");
        int num=System.in.read();// this give ascii representation of value
        System.out.println(num);
    }
}
