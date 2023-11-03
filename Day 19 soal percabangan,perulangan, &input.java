package day19;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
     int a,b,angka;
        
        System.out.print("Masukkan Nilai Awal = ");
         a = in.nextInt();
        System.out.print("Masukkan Nilai Akhir = ");
        b = in.nextInt();
        
        
       if (a < b){
         for(angka = a; angka <= b; angka++){
         System.out.println(angka);
            }
         }else{
             for(angka = b; angka <= a; angka++){
             System.out.println(angka);
            }
        
             
        }
    }
}
