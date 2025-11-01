

public class Arr5 {
  public static void PairsArray(int numbers[]){
   
    //total pairs
   // int tp = 0;
    for(int i=0; i<numbers.length; i++){
      int curr = numbers[i];
      for(int j=i+1; j<numbers.length; j++){
        System.out.print("(" + curr + "," + numbers[j] + ")");
       // tp++;
      }
      System.out.println();
    }
   //System.out.println("total pairs are: " + tp);
  }
  

  public static void main(String[] args){
 int numbers[] = {2,4,6,8,10};
 PairsArray(numbers);
  }
}
