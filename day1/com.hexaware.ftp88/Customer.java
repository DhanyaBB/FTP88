public class Customer
{
 private int custId;
 private String name;
 private String gender;
 private double premAmt;
@Override
public final boolean equals(Object ob)
    {
        Customer c = (Customer)ob;
        if(c.gender==gender && c.premAmt==premAmt)
        {
            return true;
        }
        else
        {
            return false;
        }
    }




@Override 
public final String toString()
{
 return "cust id " +custId + "Name " +name+ " gender " +gender+ "premium " +premAmt;
}

public static void main(String[] args)
{
    Customer c1=new Customer();
    c1.custId = 1;
    c1.name = "Dhanya" ;
    c1.gender = "female" ;
    c1.premAmt=6788;

     Customer c2=new Customer();
    c2.custId = 1;
    c2.name = "Dhanya" ;
    c2.gender = "female" ;
    c2.premAmt=6788;

    System.out.println(c1.equals(c2));
}

}