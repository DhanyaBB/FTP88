public class Student {
    private String firstname;
    private String lastname;
    private String city;
    private char grade;

   @Override
public final boolean equals(Object ob)
    {
        Student c = (Student)ob;
        if(c.firstname==firstname && c.lastname==lastname && c.city==city && c.grade==grade)
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
 return "firstname " +firstname + "lastname " +lastname+ " city " +city+ "grade " +grade;
}

public static void main(String[] args)
{
    Student c1=new Student();
    c1.firstname = "Dhanya";
    c1.lastname = "Goudar" ;
    c1.city = "hubli" ;
    c1.grade='A';
    Student c2=new Student();
    c2.firstname = "Dhanya";
    c2.lastname = "Goudar" ;
    c2.city = "hubli" ;
    c2.grade='A';

    

    System.out.println(c1.equals(c2));
}

}