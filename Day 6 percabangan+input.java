package day.pkg6.percabanganprodukbarang;
import java.util.Scanner;
public class Day6Percabanganprodukbarang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan kode barang:");
        int kode = input.nextInt();
        
        if (kode ==1) {
            System.out.println("Alat olahraga");
        } else if (kode == 2){
            System.out.println("Alat elektronik");
        } else if (kode == 3) {
            System.out.println("Alat masak");
            
        } else {
            System.out.println("Anda salah memasukkan kode");
        }
    }
    
}
