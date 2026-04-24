
import java.util.Scanner;
public class part_c {
     static String decimalToBinary(int n)
    {String binary="";
        while (n>0){
            int remainder =n%2;
            binary=remainder + binary ;
            n=n/2;
        }
        return binary;

    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        String result= decimalToBinary(n);
        System.out.println("Binary equivalent: " + result);
   input.close(); 
  }}
       
