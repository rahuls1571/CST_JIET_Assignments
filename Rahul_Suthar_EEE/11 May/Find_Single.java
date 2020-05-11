


public class Find_Single {

	public static void main(String[] args) {

		 int array_data[] = {1,1,5,2,3,2,3};
		 int array_size = array_data.length;
		 System.out.println("**********OUTPUT**********");
		 System.out.println("Single one element : "+ find_Single_element(array_data,array_size));		 
	}

	public static  int find_Single_element(int[] array_data,int array_size) {
	   
	  int res = array_data[0]; 
     for (int i = 1; i < array_size; i++) 
     {
   	  res = res ^ array_data[i]; 
     }
     
     return res; 
	   
  }

}
