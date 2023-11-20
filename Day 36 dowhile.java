package day36;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String lanjut;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("-------- Pilihan Menu Crepes --------");
            System.out.println("1. Beef Burger \nRp. 30.000");
            System.out.println("2. Pepperoni Pizza \nRp. 28.000");
            System.out.println("3. Chili Box \nRp. 27.000");
            System.out.println("4. Crispy Chicken BBQ \nRp. 28.000");
            System.out.println("5. Meat Lovers Pizza \nRp. 30.000");
            double harga, totalHarga;
            int pilihan, pesanan;
            System.out.println();
            System.out.println("============================");
            System.out.print("\nPilih Menu Anda : ");
            pilihan = sc.nextInt();

            if (pilihan == 1) {
                System.out.print("\nTentukan Porsi Pesanan Anda : ");
                pesanan = sc.nextInt();
                System.out.println("\n============================");
                harga = 30000;
                totalHarga = harga * pesanan;
                System.out.println("\nAnda memesan " + pesanan + " Beef Burger\nDengan total harga : Rp. " + totalHarga);
                System.out.println("\n===== TERIMA KASIH! =====");
            } else if (pilihan == 2) {
                System.out.print("\nTentukan Porsi Pesanan Anda : ");
                pesanan = sc.nextInt();
                System.out.println("\n============================");
                harga = 28000;
                totalHarga = harga * pesanan;
                System.out.println("\nAnda memesan " + pesanan + " Pepperoni Pizza\nDengan total harga : Rp. " + totalHarga);
                System.out.println("\n===== TERIMA KASIH! =====");
            } else if (pilihan == 3) {
                System.out.print("\nTentukan Porsi Pesanan Anda : ");
                pesanan = sc.nextInt();
                System.out.println("\n============================");
                harga = 27000;
                totalHarga = harga * pesanan;
                System.out.println("\nAnda memesan " + pesanan + " Chili Box\nDengan total harga : Rp. " + totalHarga);
                System.out.println("\n===== TERIMA KASIH! =====");
            }else if (pilihan == 4) {
                System.out.print("\nTentukan Porsi Pesanan Anda : ");
                pesanan = sc.nextInt();
                System.out.println("\n============================");
                harga = 28000;
                totalHarga = harga * pesanan;
                System.out.println("\nAnda memesan " + pesanan + " Crispy Chicken BBQ\nDengan total harga : Rp. " + totalHarga);
                System.out.println("\n===== TERIMA KASIH! =====");
            }else if (pilihan == 5) {
                System.out.print("\nTentukan Porsi Pesanan Anda : ");
                System.out.println("\n============================");
                pesanan = sc.nextInt();
                harga = 30000;
                totalHarga = harga * pesanan;
                System.out.println("\nAnda memesan " + pesanan + " Meat Lovers Pizza\nDengan total harga : Rp. " + totalHarga);
                System.out.println("\n===== TERIMA KASIH! =====");
            }else {
                System.err.println("\nPesanan Anda Tidak Tersedia");
            }

            System.out.print("Masih ingin memesan (y/n) ? : ");
            lanjut = sc.next();
            System.out.println();

        } while (lanjut.equalsIgnoreCase("y"));
        System.out.println("----------------------------------------");

    }
}
