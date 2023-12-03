import java.util.Scanner;
public class day49 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjang, lebar, tinggi, hasil;
        System.out.println("Menghitung Luas Balok");
        System.out.println("=============================");

        
        System.out.print("Masukan Panjang Balok: ");
        panjang = input.nextInt();
        System.out.print("Masukan Lebar balok: ");
        lebar = input.nextInt();
        System.out.print("Masukan Tinggi Balok: ");
        tinggi = input.nextInt();

        
        hasil =  2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));

        System.out.println("Luas Balok tersebut adalah: " + hasil);

    }
}
    
    
