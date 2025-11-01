/* 
 * finding max subarray sum 
 * using kadane's algorithm
 * optimal approach
 */

public class Kadanes_algorithm {
  public static void max_subarray_sum(int numbers[]){

    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;

    for(int i=0; i<numbers.length; i++){
      currSum += numbers[i];


      /*if any negative number appears make it zero 
       */
      if(currSum < 0){
        currSum = 0;

  
            }
             maxSum = Math.max(currSum, maxSum);
    }
  System.out.println("our max subarray sum is: "+ maxSum);

  }

  public static void main(String[] args){
    int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
    max_subarray_sum(numbers);

  }
  

}
