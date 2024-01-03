import java.util.Scanner;
public class day79 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int nilai = sc.nextInt();
        
        if(nilai >=85 && nilai <=100){
            System.out.println("A");
        }if(nilai >=70 && nilai <=84){
            System.out.println("B");
        }if(nilai >=55 && nilai <=69){
            System.out.println("C");
        }if(nilai >=40 && nilai <=54){
            System.out.println("D");
        }if(nilai >=0 && nilai <=39){
            System.out.println("E");
        }
    }
    
}
