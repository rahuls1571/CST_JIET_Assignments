/* Process!
   1.Defined no of block let say 10.
   2.Now here fig show the number  of blocks.
              [10]
           [6][ 9]      
        [3][5][ 8]
     [1][2][4][ 7]
     total number of block : 10.
   3. now we start for 1 stair it means we use 1 block and remaining block are 9;
   4. now we go to 2 stair which is locate at 3 position(here [3]) here we use 2 block and remaining block are 7;
   5. now we go to 3 stair which is locate at [6] here we use 3 block and remaining block are 4;
   6. now we go to 4 stair which is locate at[10] here we use 4 block and remaining block are 0;
   7. and we get the max. height of the staircase!
 */
public class Max_height_staircase {
	public static void main(String[] args) {
  
        int NO_blocks = 10;
		System.out.println("**********OUTPUT**********");
		System.out.println("maximum height of the staircase : " +(max_height_staircase(NO_blocks)));
	}
	public static int max_height_staircase(int blocks)
	{
	    int stairs = 0;
	    while (blocks != 0)
	    {
	       if (stairs + 1 <= blocks)
	        {
	            stairs++;
	            System.out.println("No. of Stairs : "+stairs);
	            blocks = blocks - stairs;
	            System.out.println("No. of Block  : "+blocks);
	        }
	       else{ break; }     
	    }
	    return stairs;
	}
}




