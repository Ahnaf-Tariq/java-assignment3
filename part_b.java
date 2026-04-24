
import java.util.Scanner;
public class part_b {
    static int[] getBinaryArray(int number ) {
        int[] binary=new int[32];
int index=31;
while(number>0){
    int remainder =number%2;
    binary[index]=remainder ;
    number=number/2;
    index--;

}  
  return binary;

    }
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int number = input.nextInt();
    int[] result = getBinaryArray(number);
    for (int i = 0; i < result.length; i++) {
        if(result[i]!=0){
System.out.print(result[i]);
        };
        
    }
    
    input.close();

}
}
