public class Emp {
    private int empno;
    private String name;
    private double basic;

    public static void main(String[] args)
    {
        Emp e1=new Emp();

        e1.empno=1;
        e1.name="dhanya";
        e1.basic=555555555;

        System.out.println("Employ number " +e1.empno);
        System.out.println("employ name " +e1.name);
        System.out.println("basic " +e1.basic);
    }
}