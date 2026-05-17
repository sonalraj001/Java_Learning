public class Exception_prac {
    public static void main(String[] args) {
        int i=0;
        int j=0;

        int nums[] =new int [5];
        StringBuffer abc=new StringBuffer("rcb");
        try{
            j=18/i;
            // System.out.println(abc.length());
            // System.out.println(nums[1]);
            // System.out.println(nums[5]);
            if(j==0){
                System.out.println("Error: cannot divide by 0");
                throw new ArithmeticException();
                
        }
            

        }

        catch(ArithmeticException e){
            //this will catch only arithemetic exception
            //handle the error here
            j=18/1;
            System.out.println(j+" error handled");

        }

        catch(ArrayIndexOutOfBoundsException index){
            //this will catch out of bond index
            //for each error write different catch
            System.out.println("decrease array limit");
        }
        catch(Exception e){
            System.out.println("Somethigin is not working go and check");
        }
    }
}
