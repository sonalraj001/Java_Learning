class Human{
    private int age=12;
    private String name="rahul";

    //variable outside human class should not be aceesed directly
    //these should be aceesed with the help of method
    //basically we binding are data with method so
    //no one from outside world can use variable directly
    //here we are encapsulating data and method 

    public int getage(){
        return age;
    }
    public String getName(){
        return name;
    }

    public void setname(String nama){
        this.name=nama;
    }

    public void setage(int age){
        this.age=age;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setage(34);
        obj.setname("sonal");
        System.out.println("Name :"+obj.getName());
    }
}
