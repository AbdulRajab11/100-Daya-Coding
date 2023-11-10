package day26;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tujuan = null;
        int pilihan;
        System.out.println("      Tujuan Travel    ");
        System.out.println("1. Topoyo\n2. Karossa\n3. Tikke");
        System.out.print(" Tujuan yg Dipilih : ");
        pilihan = input.nextInt();
        if(pilihan ==1){
            tujuan = "Topoyo";
        }else if(pilihan== 2){
            tujuan = "Karossa";
        }else if(pilihan == 3){
            tujuan = "Tikke";
        }else{
            tujuan = "tujuan tidak tersedia";
        }
        System.out.println("_______________________");
        System.out.println(tujuan);
        
    }
    
}
