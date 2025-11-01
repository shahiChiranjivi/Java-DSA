

public class Arr3 {
  //time complexity O(log n)

  public static int BinarySearch(int numbers[], int key){
    int start = 0, end = numbers.length-1;
  
    while(start <=  end){
      int mid = (start + end)/2;
      if(numbers[mid] == key){
       return mid;
      }
       if(numbers[mid] > key){//left part
        end = mid-1;
      }
       else{//right part
        start = mid+1;
       }
    }
    return -1;
  }
  
  public static void main(String[] args){
  int numbers[] = {2,4,6,8,10,12,14};
  int key = 8;
  System.out.println("element found at index: "+ BinarySearch(numbers, key));
  }
}
