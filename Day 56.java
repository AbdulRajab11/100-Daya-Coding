import java.util.Scanner;
public class day56 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menghitung Luas Dan Keliling Persegi panjang");
        System.out.print("Masukkan Panjang Persegi : ");
        int p = input.nextInt();
        System.out.print("Masukkan Lebar Persegi : ");
        int l = input.nextInt();
        // Rumus Menghitung Luas Persegi Panjang
        int L = p * l;
        // Rumus Menghitung Keliling Persegi Panjang
        int k = 2 * (p + l);
        System.out.println("\nJika panjang Persegi Adalah "+ p +"\nLebarnya Adalah " + l + "\nMaka Luas Perseginya Adalah "+L+"\nDan Kelilingnya Adalah "+k);
    }
    
}
