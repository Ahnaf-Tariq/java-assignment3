
import java.util.Scanner;
public class part_a {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any integer: ");
        int number = input.nextInt();
        String binary = "";
        while (number>0){
            int remainder =number%2;
            binary=remainder + binary ;
            number=number/2;
        }
        System.out.println("Binary equivalent: " + binary);
   input.close(); }
}
