
import java.util.Scanner;
public class part_a {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int n = input.nextInt();
        String binary = "";
        while (n>0){
            int remainder =n%2;
            binary=remainder + binary ;
            n=n/2;
        }
        System.out.println("Binary equivalent: " + binary);
   input.close(); }
}
