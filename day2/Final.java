class C1
{
   final void display()
    {
        System.out.println("IT IS A FINAL METHOD");
    }
}

class C2 extends C1
{
    public void display()
    {
        System.out.println("IT IS NOT A FINAL METHOD");
    }
}

public class Final
{
    public static void main(String[] args)
    {
        C2 obj=new C2();
        obj.display();
        obj.show();
    }
}