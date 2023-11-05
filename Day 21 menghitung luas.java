package day21;

import java.util.Scanner;
//menghitung luas segitiga//
public class Main{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a , t;
        double luas;
        
        /*a : alas
          t : tinggi*/
        
        System.out.print("Alas : ");
        a = input.nextInt();
        System.out.print("Tinggi : ");
        t = input.nextInt();
        
        //rumus menghitung segitiga (½*a*t)//
        
        luas = 0.5 * a * t;
        System.out.println("Luas Segitiga : "+ luas);
    }  
}
