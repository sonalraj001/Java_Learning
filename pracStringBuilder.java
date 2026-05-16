public class pracStringBuilder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("sonal ");
        sb.append("raj");
        System.out.println(sb);
    }
    //string buffer has 16extra space
    //string builder and stringbuffer difference is of thread safety
}
