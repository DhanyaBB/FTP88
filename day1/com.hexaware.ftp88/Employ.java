
import java.util.Objects;
class Employ
{
    private int empno;
    private String name;
    private double basic;

    @Override
    public final boolean equals(Object ob)
    {
        Employ e = (Employ)ob;
        if(Objects.equals(empno,e.empno) && Objects.equals(name,e.name) && Objects.equals(basic,e.basic))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
@Override
public final int hashCode()
{
    return Objects.hash(empno,name,basic);
}
    @Override
    public final String toString()
    {
        return  " empno " +empno+ 
         " name " +name + 
         " basic " +basic ;
    }

    public static void main(String[] args)
    {
        Employ e1=new Employ();

        e1.empno=1;
        e1.name="dhanya";
        e1.basic=20000;
        Employ e2=new Employ();

        e2.empno=1;
        e2.name="dhanya";
        e2.basic=20000;
        System.out.println(e1.hashCode());
         System.out.println(e2.hashCode());
        

       //System.out.println(e1==e2);
      // System.out.println(e1.equals(e2));
     //  System.out.println(e1);


    }
}