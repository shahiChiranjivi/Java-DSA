

public class Arr9 {
  /*large elements come to the end of array by
   * swapping with adjacent elements
   */

  public static void BubbleSort(int arr[]){

    for(int i=0; i<arr.length-1; i++){
      for(int j=0; j<arr.length-i-1; j++){

        if(arr[j] > arr[j+1]){

          //swap
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;

        }
      }
    }
  }

  public static void printArray(int arr[]){
    for(int i=0; i<arr.length-1; i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }

  public static void main(String args[]){
    int arr[] = {7,8,3,1,2};
    BubbleSort(arr);
    printArray(arr);
  }
}
