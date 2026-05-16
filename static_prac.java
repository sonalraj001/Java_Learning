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

    static void show2(){
        System.out.println();
    }
}
public class static_prac {
    public static void main(String[] args) {
        
    
    //non static methid need to have object
    Mobile obj1=new Mobile();
    obj1.brand="samasung";
    obj1.price=20000;
    Mobile.name="Nokia";
    obj1.show();
    }
    
}
