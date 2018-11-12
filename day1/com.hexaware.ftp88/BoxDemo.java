class BoxDemo
{
    public static void main(String[] args)
    {
        int x = 12;
        double b=12.4;
        String name = "hexaware" ;


        Object obj1 = x;
        Object obj2 = b;
         Object obj3 = name;

         //unboxing

         int x1 = (Integer)obj1;
         double b1 = (double)obj2;
         String name1= (String)obj3;
         
         System.out.println(" x1 values " +x1);
         System.out.println(" b1 values " +b1);
         System.out.println(" name1 values " +name1); 
    }
}