class Employ {
    int empno;
    String name;
    double basic;
    public Employ(){

    }

    public Employ(int argEmpno,String argName,double argBasic)
    {
        this.empno=argEmpno;
        this.name=argName;
        this.basic=argBasic;
    }

    @Override
    public final String toString() {
        return " Empno "   + empno + " Name "   +name + " Salary "  +basic;

    }
}