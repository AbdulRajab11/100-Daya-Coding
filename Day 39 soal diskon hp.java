package day39;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int pilihan, tipe;
        double diskon, harga, totalHarga, totalDiskon;
        String member, tipeHp;

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Iphone\n2. Xiaomi\n3. Realme ");

        System.out.print("\nMasukkan merek hp : ");
        pilihan = sc.nextInt();

        if (pilihan == 1) {
            System.out.println("1. Iphone 13 Pro Max\nRp. 25.000.000\n2. Iphone 12 Pro Max\nRp. 18.000.000");
            System.out.print("Tipe hp : ");
            tipe = sc.nextInt();
            if (tipe == 1) {
                harga = 25000000;
                tipeHp = "Iphone 13 Pro Max";
                System.out.println("\n========================================");
                System.out.println("Anda memilih hp " + tipeHp + "\nDengan harga Rp. " + harga);
                System.out.println("========================================");
                System.out.print("Punya kartu member (y/n) ? : ");
                member = sc.next();
                if (member.equalsIgnoreCase("y")) {
                    System.out.println("========================================");
                    System.out.println("Mendapatkan diskon 5%");
                    diskon = 0.05;
                    totalDiskon = harga * diskon;
                    System.out.println("\nAnda mendapat diskon sebanyak Rp. " + totalDiskon);
                    totalHarga = harga - totalDiskon;
                    System.out.println("\nTotal harga adalah Rp. " + totalHarga);
                    System.out.println("========================================");
                } else {
                    System.out.println("========================================");
                    System.out.println("\nAnda tidak mendapatkan diskon");
                    System.out.println("Total harga adalah Rp. " + harga);
                    System.out.println("\n========================================");
                }
            }
            if (tipe == 2) {
                harga = 18000000;
                tipeHp = "Iphone 12 Pro Max";
                System.out.println("\n========================================");
                System.out.println("Anda memilih hp " + tipeHp + "\nDengan harga Rp. " + harga);
                System.out.println("========================================");
                System.out.print("Punya kartu member (y/n) ? : ");
                member = sc.next();
                if (member.equalsIgnoreCase("y")) {
                    System.out.println("========================================");
                    System.out.println("Mendapatkan diskon 5%");
                    diskon = 0.05;
                    totalDiskon = harga * diskon;
                    System.out.println("\nAnda mendapat diskon sebanyak Rp. " + totalDiskon);
                    totalHarga = harga - totalDiskon;
                    System.out.println("\nTotal harga adalah Rp. " + totalHarga);
                    System.out.println("========================================");
                } else {
                    System.out.println("========================================");
                    System.out.println("\nAnda tidak mendapatkan diskon");
                    System.out.println("Total harga adalah Rp. " + harga);
                    System.out.println("\n========================================");
                }
            }else{
                System.err.println("========================================");
                System.out.println("Pilihan tidak sesuai");
            }
        }
        if (pilihan == 2) {
            System.out.println("1. Xiaomi Note 12 Pro\nRp. 3.500.000\n2. Xiaomi Note 13 Pro+\nRp. 8.000.000");
            System.out.print("Tipe hp : ");
            tipe = sc.nextInt();
            if (tipe == 1) {
                harga = 3500000;
                tipeHp = "Xiaomi Note 12 Pro";
                System.out.println("\n========================================");
                System.out.println("Anda memilih hp " + tipeHp + "\nDengan harga Rp. " + harga);
                System.out.println("========================================");
                System.out.print("Punya kartu member (y/n) ? : ");
                member = sc.next();
                if (member.equalsIgnoreCase("y")) {
                    System.out.println("========================================");
                    System.out.println("Mendapatkan diskon 5%");
                    diskon = 0.05;
                    totalDiskon = harga * diskon;
                    System.out.println("\nAnda mendapat diskon sebanyak Rp. " + totalDiskon);
                    totalHarga = harga - totalDiskon;
                    System.out.println("\nTotal harga adalah Rp. " + totalHarga);
                    System.out.println("========================================");
                } else {
                    System.out.println("========================================");
                    System.out.println("\nAnda tidak mendapatkan diskon");
                    System.out.println("Total harga adalah Rp. " + harga);
                    System.out.println("\n========================================");
                }
            }
            if (tipe == 2) {
                harga = 8000000;
                tipeHp = "Xiaomi Note 13 Pro+";
                System.out.println("\n========================================");
                System.out.println("Anda memilih hp " + tipeHp + "\nDengan harga Rp. " + harga);
                System.out.println("========================================");
                System.out.print("Punya kartu member (y/n) ? : ");
                member = sc.next();
                if (member.equalsIgnoreCase("y")) {
                    System.out.println("========================================");
                    System.out.println("Mendapatkan diskon 5%");
                    diskon = 0.05;
                    totalDiskon = harga * diskon;
                    System.out.println("\nAnda mendapat diskon sebanyak Rp. " + totalDiskon);
                    totalHarga = harga - totalDiskon;
                    System.out.println("\nTotal harga adalah Rp. " + totalHarga);
                    System.out.println("========================================");
                } else {
                    System.out.println("========================================");
                    System.out.println("\nAnda tidak mendapatkan diskon");
                    System.out.println("Total harga adalah Rp. " + harga);
                    System.out.println("\n========================================");
                }
            }else{
                System.err.println("========================================");
                System.out.println("Pilihan tidak sesuai");
            }
        }
        if (pilihan == 3) {
            System.out.println("1. Realme 11 4G\nRp. 3.500.000\n2. Realme 10 Pro 5G\nRp. 4.000.000");
            System.out.print("Tipe hp : ");
            tipe = sc.nextInt();
            if (tipe == 1) {
                harga = 3500000;
                tipeHp = "Realme 11 4G";
                System.out.println("\n========================================");
                System.out.println("Anda memilih hp " + tipeHp + "\nDengan harga Rp. " + harga);
                System.out.println("========================================");
                System.out.print("Punya kartu member (y/n) ? : ");
                member = sc.next();
                if (member.equalsIgnoreCase("y")) {
                    System.out.println("========================================");
                    System.out.println("Mendapatkan diskon 5%");
                    diskon = 0.05;
                    totalDiskon = harga * diskon;
                    System.out.println("\nAnda mendapat diskon sebanyak Rp. " + totalDiskon);
                    totalHarga = harga - totalDiskon;
                    System.out.println("\nTotal harga adalah Rp. " + totalHarga);
                    System.out.println("========================================");
                } else {
                    System.out.println("========================================");
                    System.out.println("\nAnda tidak mendapatkan diskon");
                    System.out.println("Total harga adalah Rp. " + harga);
                    System.out.println("\n========================================");
                }
            }
            if (tipe == 2) {
                harga = 4000000;
                tipeHp = "Realme 10 Pro 5G";
                System.out.println("\n========================================");
                System.out.println("Anda memilih hp " + tipeHp + "\nDengan harga Rp. " + harga);
                System.out.println("========================================");
                System.out.print("Punya kartu member (y/n) ? : ");
                member = sc.next();
                if (member.equalsIgnoreCase("y")) {
                    System.out.println("========================================");
                    System.out.println("Mendapatkan diskon 5%");
                    diskon = 0.05;
                    totalDiskon = harga * diskon;
                    System.out.println("\nAnda mendapat diskon sebanyak Rp. " + totalDiskon);
                    totalHarga = harga - totalDiskon;
                    System.out.println("\nTotal harga adalah Rp. " + totalHarga);
                    System.out.println("========================================");
                } else {
                    System.out.println("========================================");
                    System.out.println("\nAnda tidak mendapatkan diskon");
                    System.out.println("Total harga adalah Rp. " + harga);
                    System.out.println("\n========================================");
                }
            }else{
                System.err.println("========================================");
                System.out.println("Pilihan tidak sesuai");
            }
        }

    }

}
    
