class C1{
    public int sum(int x,int y)
    {
        return x+y;
    }
    public int sum(){
        return 5;
    }
    public C1(){
System.out.println("base class");
    }
}
    class C2 extends C1{
        public double sum(int x,int y)
        {
            return x+y;
        }
        public double sum()
        {
            return 4.5;
        }
        public C2(){
System.out.println("Dervied class");
        }
    }
public class Inhc{
    public static void main(String[] args)
    {
        C2 obj=new C2();
        obj.sum(4,3);
        obj.sum(4,3);
    }
}

//its not possible to use different type to overload 