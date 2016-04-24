import java.util.Scanner;
        
public class AverageAnArray {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double[] values = new double[10];
    System.out.print("Enter ten double values: ");
    for (int i = 0; i < 10; i++)
      values[i] = input.nextDouble();
    
    System.out.println("The average value is " + average(values));
  }  // main
  
  public static int average(int[] array){
    int sum = 0;
    for (int i = 0; i < 10; i++){
      sum += array[i];  
    }
    
    return sum / 10;
  }  // average
  
  public static double average(double[] array){
    double sum = 0;
    for (int i = 0; i < 10; i++){
      sum += array[i];  
    }
    
    return sum / 10;  
  } // average
} // class AverageAnArray
