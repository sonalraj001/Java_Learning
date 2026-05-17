class A{
    public A()
    {
        System.out.println("in A");
    }
    public A(int n){
        System.out.println("in A int");
    }
}
class B extends A{
    public B(){
        System.out.println("in B");
    }
    public B(int n){
        System.out.println("in B int");
    }

}
public class Demo_Super {
    public static void main(String[] args) {
        B obj= new B();
        //in A
        //in B
        //siper is there in every class
        //therefore it is calling parent class default constructor 
        //but you want parametrize constructor then you hvae to make some chnagr and passs
        //super(n) this will call parametrize cons of parent class
        //this()  it will call constructor of same class
    }
}
