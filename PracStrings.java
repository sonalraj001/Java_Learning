public class PracStrings {
    public static void main(String[] args) {
        //ways to initialize string
        String a="string without creating object";

        //but a string is object so good way of intializing string is by making string
        String b=new String("String by object creation");

        System.out.println("b : "+b);
        System.out.println("a : "+a);

        //this will create s1 (address let  :103) in stack memory and Create String name Sonal in heap memory which
        // is called string pool
        String s1="Sonal";

        //here s2 will go to string pool and check do we have Sonal in string pool if it is there then 
        //it will use that as which will save memory
        String s2="Sonal";

        //let us create a string object of s3 with name sonal (let address = 100)
        String s3="sonal";

        //if we want to add some thing to s3
        s3=s3+"raj";

        //this s3 is now stored in another address in string pool(let 104)
        System.out.println(s3);

        //from this there come concept of immutable(unchange) and mutable string(change)

        //String s = "hello";

        // Internally ye:

        // h e l l o

        // characters ke form me store hoti hai.

    }
    
}
