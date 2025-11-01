


public class Arr1 {

  public static int LinearSearch(int arr[], int key){

    for(int i=0; i<arr.length; i++){
      if(arr[i] == key){
        return key;
      }
    }
    return -1;
  }

  public static void main(String[] args){
    int arr[] = {2,4,6,8,10,12};
    int key = 5;
    int idx = LinearSearch(arr, key);
    System.out.println(idx);

    if(idx == -1){
      System.out.println("key not found");
    }
    else{
      System.out.println("key found at index " + idx);
    }
  }
}
