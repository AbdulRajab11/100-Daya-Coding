package day12;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan nilai n = ");
        int n = input.nextInt();
        
        for (int i = 1; i <= n; i++ ){
            System.out.println(i+". Rajab");
        }
    }
    
}
