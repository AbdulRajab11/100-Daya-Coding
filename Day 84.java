import java.util.Scanner;
import java.util.Random;
public class day84 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random pw = new Random();
        System.out.print("Masukkan jumlah angka acak : ");
        int jumlah = sc.nextInt();
        System.out.print("Masukkan batas atas : ");
        int atas = sc.nextInt();
        int nomor = pw.nextInt();
        
        for(int i = 1 ; i <= jumlah ; i++){
            nomor = pw.nextInt(atas) + 1;
            
            System.out.println(nomor + " ");
        }
    }
    
}
