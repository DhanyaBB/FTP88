class C1{
    public C1(){
        System.out.println("base class");
    }
}
    class C2 extends C1{
        public C2(){
System.out.println("Dervied class");
        }
    }
public class Inhc{
    public static void main(String[] args)
    {
        C2 obj=new C2();
    }
}