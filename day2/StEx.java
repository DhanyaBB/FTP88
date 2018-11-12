public class StEx{
    public static void show(){
        System.out.println("from show methpod");
    }
    public void display()
    {
        System.out.println("from dispaly method");
    }
public static void main(String[] args)
{
    StEx.show();
    new StEx().display();
}
}