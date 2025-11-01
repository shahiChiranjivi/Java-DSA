

public class Arr2 {


  public static int FindLargestSmallestElement(int arr[]){

    int largest = Integer.MIN_VALUE; // 
    int smallest = Integer.MAX_VALUE; // 
    for(int i=0; i<arr.length; i++){
      if(largest < arr[i]){
        largest = arr[i];
      }
      if(smallest > arr[i]){
        smallest = arr[i];
      }
      
    }
  
   System.out.println("smallest value in array is: " + smallest);
    return  largest;
  }

  public static void main(String[] args){
  int arr[] = {1,8,3,7,6,2};
  int res = FindLargestSmallestElement(arr);
  System.out.println("largest element in array is " +res);
  }
}
