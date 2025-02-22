import java.util.Scanner;
public class FactorialCalculator{
 
  public static int getNonNegativeInteger(){
    Scanner input = new Scanner(System.in);
    int userNum;

    do {
      System.out.print("Enter a non-negative integer: ");
      userNum = input.nextInt();
    }while (userNum < 0);
    
   return userNum;
  }
 
  public static int calculateFactorial(int n){
    int result = 1;
   
      for (int i = 1; i <= n;i++){
    
        result = result * i;
      }
      return result;
    
  }
 
 
  public static void main(String[] args) {
    int userNum = getNonNegativeInteger();
    System.out.println("The factorial of " + userNum + " is: " + calculateFactorial(userNum));
  }
}