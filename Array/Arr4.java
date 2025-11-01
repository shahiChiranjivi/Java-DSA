

public class Arr4 {

  public static void ReverseArray(int numbers[]){

    int start = 0, end = numbers.length-1;

    while(start < end){

      //swap
      int temp = numbers[end];
      numbers[end] = numbers[start];
      numbers[start] = temp;

      start++;
      end--;
    }
  }
  
  public static void main(String[] args){
  int numbers[] = {2,4,6,8,10,12};
  ReverseArray(numbers);
   
  //print reverse array
  for(int i=0; i<=numbers.length-1; i++){
    System.out.print(numbers[i] + " ");
  }
    System.out.println();
  }

}
