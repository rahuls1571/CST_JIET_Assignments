/*Process! 
   1. 9^5 means 9 XOR 5 which can be write in binary form like this 1001 XOR 0101 = 1100 means 12.
   2. 5^4 means 5 XOR 4 which can be write in binary form like this 0101 XOR 0100 = 0001 means 1.
   3. minXOR value well be 1.
   
    XOR Table : 
    A B   Y= A XOR B
    0 0   0
    0 1   1
    1 0   1
    1 1   0
*/

public class Pair_of_integer {
	
	 static int minXOR(int arr[], int n) 
	    { 
	        int min_xor = Integer.MAX_VALUE; // Initialize result 
	        for (int i = 0; i < n; i++) { 
	            for (int j = i + 1; j < n; j++) 
	            {
	               min_xor = Math.min(min_xor, arr[i] ^ arr[j]); 
	            }
	        }    
	        return min_xor; 
	    }
	
	public static void main(String[] args) {

		  int arr[] = { 9, 5, 4 }; 
	      int n = arr.length; 
	      System.out.println("**********OUTPUT**********");
	      System.out.println( "the pair of integers in the array which have minimum XOR value : " + minXOR(arr, n)); 
	}

}

	
	
