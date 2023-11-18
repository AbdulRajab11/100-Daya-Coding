package day34;

import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.print ("Masukkan angka : ");
        int a = sc.nextInt();
        
        System.out.print ("Batas angka : ");
        int b = sc.nextInt();
        
        if (a %2 ==0){
            for(int i = 1; i < b; i+=2){
                System.out.println(i);
            }
        }else {
            for(int i = 1; i <= b; i++){
                i++;
                System.out.println(i);
            }
        }
        
        
        
    }
    
}
