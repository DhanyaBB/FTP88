public class Poly2
{
    public int sum(){
        return 5;
    }
    public int sum(int x ){
        return x+7;
    }
    public int sum(int x, int y){
        return x+y;
    }
    public static void main(String[] args)
    {
        Poly2 obj=new Poly2();
        System.out.println(obj.sum());
        System.out.println(obj.sum(5));
        System.out.println(obj.sum(5,4));
    }
    
}