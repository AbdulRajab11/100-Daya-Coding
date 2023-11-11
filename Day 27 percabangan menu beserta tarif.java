package day26;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tujuan,tarif = null;
        int pilihan;
        System.out.println("      Tujuan Travel    ");
        System.out.println("1. Majene\n2. Polman\n3. Makassar");
        System.out.print(" Tujuan yg Dipilih : ");
        pilihan = input.nextInt();
        if(pilihan ==1){
            tujuan = "Majene";
            tarif  = "130.000,00";
        }else if(pilihan== 2){
            tujuan = "Polman";
            tarif  = "150.000,00";
        }else if(pilihan == 3){
            tujuan = "Makassar";
            tarif  = "250.000,00";
        }else{
            tujuan = "tujuan tidak tersedia";
            tarif  = "(tidak ditentukan)";
        }
        System.out.println("_______________________");
        System.out.println(" Berikut tujuan beserta tarifnya ");
        System.out.println(tujuan+" - Rp "+tarif);
        
    }
    
}
