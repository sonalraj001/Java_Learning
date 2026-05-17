enum status{
    //status is class here 
    //enum class extend Enum class
    //these are object of class
    PENDING,
    RUNNING,
    FAILED,
    SUCCESS
}
public class Enums {
    public static void main(String[] args) {
        int i=5;
        status s= status.SUCCESS;
        System.out.println(s.toString());//in java enum are original printed as number so we shoul
        //chnage it type if we want to print

        // to get whole status we can get it in array
        status [] ss =status.values();
        // System.out.println(ss[0]);

        for(status a:ss){
            System.out.println(a+" : "+a.ordinal());
        }

        status s1 = status.SUCCESS;

        switch (s1) 
        {
            case PENDING:
                System.out.println("please wait");
                break;

            case RUNNING:
                System.out.println("please wait");
                break;

            case FAILED:
                System.out.println("please wait");
                break;
        
            default:
                System.out.println("Done");
                break;
        }
    }
}
