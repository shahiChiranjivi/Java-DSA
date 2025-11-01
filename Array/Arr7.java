


public class Arr7{

  /*
   * Finding maximum subarray sum 
   * using prefix sum array / approach
   * time complexity O(n^2)
   * space complexity O(n)
   */
  public static void Max_Subarray_Sum2(int numbers[]){

   int currSum = 0;
   int maxSum = Integer.MIN_VALUE ;
  int prefix[] = new int[numbers.length];

  //calculate prefix array
  prefix[0] = numbers[0];
  for(int i=1; i<prefix.length; i++){
    prefix[i] = prefix[i-1] + numbers[i];
  }

  //logical part
  for(int i=0; i<numbers.length; i++){
    int start = i;

    for(int j=i; j<numbers.length; j++){
      int end = j;

      currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

      if(maxSum < currSum){
        maxSum = currSum;
      }
    }
  }
  System.out.println("max sum is: " + maxSum);
  }


public static void main(String[] args){
  int numbers[] = {1, -2, 6, -1, 3};
 Max_Subarray_Sum2(numbers);

}
}