package day24;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int nilai;
        nilai = input.nextInt();
        String predikat = null;
        if(nilai > 100){
            predikat = "nilai tdak sesuai";
        }else if(nilai >=85){
            predikat = "A";
        }else if (nilai >= 75){
            predikat = "B";
        }else if(nilai >=65){
            predikat = "C";
        }else if(nilai >=50){
            predikat = "D";
        }else if(nilai <50){
            predikat = "E";
        }
        System.out.println("Nilai = "+nilai);
        System.out.println("Predikat = "+predikat);
    }
    
}
