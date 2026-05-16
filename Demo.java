class Student{
    String name;
    int roll;
    int marks;
}
public class Demo{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="sonal";
        s1.roll=22;
        s1.marks=34;

        Student s2=new Student();
        s2.name="raj";
        s2.roll=24;
        s2.marks=44;

        Student s3=new Student();
        s3.name="sonal";
        s3.roll=26;
        s3.marks=31;
        System.out.println(s1.name);

        Student ss[] =new Student[3];

        ss[0]=s1;
        ss[1]=s2;
        ss[2]=s3;
        for(Student i :ss){
            System.out.println(i.name +" "+i.marks+" "+i.roll);
        }
    }

}