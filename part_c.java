
import java.util.Scanner;
public class part_c {
     static String decimalToBinary(int number)
    {String binary="";
        while (number>0){
            int remainder =number%2;
            binary=remainder + binary;
            number=number/2;
        }
        return binary;

    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        String result= decimalToBinary(number);
        System.out.println("Binary equivalent: " + result);
   input.close(); 
  }}
       
