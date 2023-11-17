
import java.util.Scanner;
public class day33 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan nilai 1 = ");
        int a = sc.nextInt();
        System.out.print("Masukkan nilai 2 = ");
        int b = sc.nextInt();
        int c = a+b;
        if (c %2 == 0){
            System.out.println(c+2);
        }else {
            System.out.println(c+1);
        }
        
        
    }
    
}
