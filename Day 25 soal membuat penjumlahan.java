package day25;

import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Angka Awal = ");
        int awal = sc.nextInt();
        System.out.print("Angka Akhir = ");
        int akhir = sc.nextInt();
        
        int total = 0;
        for (int i = awal; i <= akhir; i++) {
            total +=i;
            if (i < akhir) {
                System.out.print(i + "+");
            }else {
                System.out.print(i);
            }
        }System.out.println("="+total);
        
        
        
    }
   }
