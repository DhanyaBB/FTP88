class B1{
    public void show(){
      
        System.out.println("show b1");
    }
}

class B2 extends B1{
    public void show(){  
        super.show();
        System.out.println("show b2");
    }
}
public class Sup1{
    public static void main(String[] args)
    {
        B2 obj = new B2();
        obj.show();
    }
}