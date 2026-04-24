
import java.util.Scanner;
public class part_b {
    static int[] getBinaryArray(int num ) {
        int[] binary=new int[32];
int index=31;
while(num>0){
    int remainder =num%2;
    binary[index]=remainder ;
    num=num/2;
    index--;

}  
  return binary;

    }
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int num = input.nextInt();
    int[] result = getBinaryArray(num);
    for (int i = 0; i < result.length; i++) {
        if(result[i]!=0){
System.out.print(result[i]);
        };
        
    }
    
    input.close();

}
}
