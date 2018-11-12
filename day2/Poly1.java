class Poly1{
public void  show(String x){
    System.out.println("show method--x"+x);
}
public void  show(boolean x){
    System.out.println("show method--x"+x);
}

public static void main(String[] args)
{
    Poly1 obj = new Poly1();
    
    obj.show("hexaware");
    obj.show(true);
}
}