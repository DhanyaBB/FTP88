public class demo{
    static {
        System.out.println("Static constructor...");
    }
    demo(){
        System.out.println("General constructor...");
    }
    public static void main(String[] args){
new demo();
    }
}