public class Student{
    int sno;
    String sname;
    String city;
    char grade;

public Student(){

    }
     public Student(int argSno,String argSname,String argCity,char argGrade){
         this.sno=argSno;
         this.sname=argSname;
         this.city=argCity;
         this.grade=argGrade;

    }
     @Override
    public final String toString() {
        return "Sno "   + sno + "\nSName "   +sname + "\nCity  "  +city  + "\nGrade  " + grade;

}
}
