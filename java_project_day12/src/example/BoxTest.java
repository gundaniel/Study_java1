package example;
//@SuppressWarnings("rawtypes")
class Box implements Comparable<Box>{
    private double volume;
    
    public Box(double volume) {
          this.volume = volume;
    }    
    public double getVolume() {
		return volume;
	}
   
    @Override  	
    public int compareTo(Box o) { // Object obj = b2 업캐스팅
	   if (this.volume < o.volume)  
		   return -1;
	   else if (this.volume > o.volume) 
		   return 1;
	   else 
		   return 0;
    }
}
public class BoxTest {
    public static void main(String[] args) {
          Box b1 = new Box(100.4);
          Box b2 = new Box(85.0);
          
          // compareTo 메서드에 비교할 대상을 명시하고 비교
          if (b1.compareTo(b2) > 0)
        	  System.out.println("b1이 b2보다 더 크다");
          else 
        	  System.out.println("b1가 b2와 같거나 작다");
    }
}