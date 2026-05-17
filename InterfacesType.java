@FunctionalInterface
interface A{
    void show(int i);
}

//interface nedd a classs for objject

public class InterfacesType {
    public static void main(String[] args) {
        //there are 3 type of interfec in java
        //normal more than 1 function
        //Functional 1 function
        //marker no function

        // A obj = new A()
        // {
        //     public void show()
        //     {
        //         System.out.println("in show");
        //     }
        // };
        // obj.show();

        //we can do it in this way also

        //we can create lamda expression of it also
        // A obj = () ->{
        //     System.out.println("lambda expression calling show");
        // };
        // obj.show();

        A obj = (int x) -> {
            System.out.println("lambda with arguent "+x);
        };

        obj.show(10);
    }
}
