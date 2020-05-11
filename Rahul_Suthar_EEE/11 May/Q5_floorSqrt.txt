public class FloorSqrt {	
	public static void main(String[] args) {
  
		  int x = 17;
		  if(x%2 == 0) 
		  {    System.out.println("**********OUTPUT**********");
			   System.out.println("Perfect Square!");
		       System.out.println("Square Root : "+ floorSqrt(x)); 
		  }
		  else
		  {
			   System.out.println("**********OUTPUT**********");
			   System.out.println("Not A Perfect square!");
	           System.out.println("Floor Of A Square Root : "+ floorSqrt(x)); 
		  }	  
    }
	public static int floorSqrt(int x) 
	    { 
	        if (x == 0 || x == 1) 
	            return x; 
	  
	        int i = 1, result = 1;        
	        while (result <= x) { 
	            i++; 
	            result = i * i; 
	        } 
	        return i - 1; 
	    }
}






