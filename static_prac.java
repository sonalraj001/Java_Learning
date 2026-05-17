class Mobile{
    //instance variable
    String brand;
    int price;

    //class variable
    static String name;

    void show(){
        System.out.println(brand+" "+price+" "+name);
    }

    //static method
    //we can only use static variable in static method
    //we cant access non static variable in static method
    //because when we create object of it then object wont know which class variable is it
    // static void show2(){
    //     System.out.println(brand+" "+price" "+name);
    // }
    
    //but we can do it indirectly
    public static void show3(Mobile obj){
        System.out.println(obj.brand+" "+obj.price+" "+obj.name);
    }
}
public class static_prac {
    public static void main(String[] args) {
        
    
    //non static methid need to have object
    Mobile obj1=new Mobile();
    obj1.brand="samasung";
    obj1.price=20000;
    Mobile.name="Nokia";

    Mobile obj2=new Mobile();
    obj2.brand="NOKIA";
    obj2.price=19000;
    Mobile.name="Nokia";

    obj2.show3(obj2);
    }
    //one more thing is that object is instantiated after class creation 
    //therefore static method is called first then constructor is called
    
}
