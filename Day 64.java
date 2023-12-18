import java.util.Scanner;
public class day64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka = ");
        int angka = sc.nextInt();
        int hasil = angka % 2;
        String kondisi = hasil == 0 ? "Genap" : "Ganjil";
        System.out.println(angka + " adalah angka " + kondisi);

    }

}
