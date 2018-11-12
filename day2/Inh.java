class First{
    public void show(){
        System.out.println("First class");
    }
}

class Second extends First{
    public void display()
    {
        System.out.println("Second class");

    }
}

public class Inh{
    public static void main(String[] args)
    {
        Second obj=new Second();
        obj.show();
        obj.display();

    }
}