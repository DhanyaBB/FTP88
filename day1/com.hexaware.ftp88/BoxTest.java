class BoxTest
{
    public void show(Object ob)
    {
//System.out.println(ob.getClass());
//System.out.println(ob.getClass().getSimpleName());

String name = ob.getClass().getSimpleName();
System.out.println(name);
if(name.equals("Integer"))
{
    System.out.println("Integer casting .....");
    int x = (Integer)ob;
}
if(name.equals("Double"))
{
    System.out.println("Double casting .....");
    double x = (Double)ob;
}
if(name.equals("String"))
{
    System.out.println("String casting .....");
    String x = (String)ob;
}
    }

     public static void main(String[] args)
     {
         int x = 12;
         double y = 12.5;
         String name = "hello" ;

         BoxTest obj = new BoxTest();
         obj.show(x);
         obj.show(y);
         obj.show(name);
     }
}
