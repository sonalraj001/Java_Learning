class Human{
    private int age;
    private String name;

    //constructor is method which is called when we create a object
    //make constructor without argument
    //default constructor
    public Human(){
        System.out.println("no args constructor");
    }
    public Human(int age){
        this.age=age;
        System.out.println(age);
    }
    public Human(String name){
        this.name=name;
        System.out.println(name);
    }
    public Human(int age,String name){
        this.age=age;
        this.name=name;
        System.out.println(age+""+name);
    }
}
public class constructor {
    public static void main(String[] args) {
        Human h1=new Human();
        Human h2=new Human("Sonal");
        
        
    }
}
