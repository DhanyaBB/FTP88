class Employ {

    int empno;
    String name;
    double basic;
    public Employ() {

    }

    public Employ(int argEmpno, String argName, double argBasic) {
        this.empno = argEmpno;
        this.name = argName;
        this.basic = argBasic;
    }

    @Override
    public final String toString() {
        return "Empno " + empno + " Name " + name + " Basic " +basic;
    }
}

class Alka extends Employ {

    public Alka(int argEmpno, String argName, double argBasic) {
        super(argEmpno, argName, argBasic);
    }
}

class Rashmi extends Employ {
    public Rashmi(int argEmpno, String argName, double argBasic) {
        super(argEmpno, argName, argBasic);
    }
}

public class Employ1 {
    public static void main(String[] args) {
        Employ e1 = new Alka(1, "Alka", 88234); 
        System.out.println(e1);

        Employ e2 = new Rashmi(3, "Rashmi", 88233);
        System.out.println(e2);
    }
}