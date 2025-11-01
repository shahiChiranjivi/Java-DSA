

public class Arr8 {
  
  /*
   * finding maximum subarray sum
   * using naive / brute force approach
   * time complexity O(n^3)
   * space complexity O(1)
   */
  public static void Max_Subarray_Sum(int numbers[]){

    int maxSum = Integer.MIN_VALUE;
    int currSum = 0;

    for(int i=0; i<numbers.length; i++){ //first loop
      int start = i;

      for(int j=i; j<numbers.length; j++){ // second loop
        int end = j; 
        currSum = 0;

        for(int k=start; k<=end; k++) { //third loop
        currSum  += numbers[k];
        }
        System.out.println(currSum);
        if(maxSum < currSum){
          maxSum = currSum;
        }
      }
      
    }
    System.out.println("max sum is: "+ maxSum);

  }  

    
  
  public static void main(String[] args){
    int numbers[] = {2,4,6,8,10};
  Max_Subarray_Sum(numbers);
  }
}
