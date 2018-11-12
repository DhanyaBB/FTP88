public class ArrayEmploy {
    public static void main(String[] args) {
Employ e1=new Employ();
e1.empno=1;
e1.name="dhanya";
e1.basic=8888;

Employ e2=new Employ();
e2.empno=2;
e2.name="Manjesh";
e2.basic=666666;

Employ e3=new Employ();
e3.empno=3;
e3.name="Dhanya Manjesh Gowda";
e3.basic=99999999;

Employ[] arrEmploy = new Employ[]{e1,e2,e3};
for(Employ e : arrEmploy){
    System.out.println(e);
}
    }
}