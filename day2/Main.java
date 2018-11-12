class Base { 
  int x; 
  Base(int xx) { 
    x = xx; 
  } 

  
} 
  
class Derived extends Base { 
  int y; 
  Derived(int xx, int yy) { 
    super(xx); 
    y = yy; 
  } 
   @Override
    public final String toString() {
        return "x = "+x+", y = "+y;

} 
} 
  
public class Main { 
  public static void main(String[] args) {   
    Base d = new Derived(10, 20); 
    System.out.println(d);
  } 
} 