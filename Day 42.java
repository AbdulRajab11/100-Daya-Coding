package day42;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menghitung Luas Dan Keliling Persegi");
        System.out.print("Masukkan Panjang Sisi : ");
        int sisi = input.nextInt();
        // Rumus Menghitung Luas Persegi
        int hasilSisi = sisi * sisi;
        // Rumus Menghitung Keliling Persegi
        int keliling = 4 * sisi;
        System.out.println("\nJika panjang Sisinya Adalah "+sisi+" Maka Luas Persegi Adalah "+hasilSisi+".\nDan Kelilingnya Adalah "+keliling);
    }
    
}
