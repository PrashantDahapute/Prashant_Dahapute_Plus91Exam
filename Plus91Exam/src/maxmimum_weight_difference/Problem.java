package maxmimum_weight_difference;

import java.util.Arrays;

public class Problem {
	
	
	
	static void sort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		
		
	//Case 1 (Output=17)
		int []arr=new int[] {8,4,5,2,10}; // given array in input 1
		int k=2; //Number of  value in son group for input 1
		
		
//	//Case 2  (Output=2)	
//		int []arr=new int[] {1,1,1,1,1,1,1,1}; // given array in input 2
//		int k=3; // Number of  value in son group for input 2
		

		// Arrays Method
		Arrays.sort(arr); //Method given by Arrays class in java.util package
	
		// our method for sorting an array
		sort(arr); // also we can use method of our sorting logic
		
		//we can use either of them
		
		int son=0;
		int father=0;
		
		for(int i=0;i<arr.length;i++) {
			if(i<k) {
				son+=arr[i];
			}else {
				father+=arr[i];
			}
		}
			
		System.out.println(father-son);// this will give the weight differnce between father and son
		

	}

}
