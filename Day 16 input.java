package day16;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        String Nama,Nim,Prodi,Asal;
        int Umur;
        Scanner input = new Scanner(System.in);
        System.out.println("Nama : ");
        Nama = input.nextLine();
        System.out.println("Nim : ");
        Nim = input.nextLine();
        System.out.println("Prodi : ");
        Prodi = input.nextLine();
        System.out.println("Asal : ");
        Asal = input.nextLine();
        System.out.println("Umur : ");
        Umur = input.nextInt();
        
        System.out.println(Nama+Nim+Prodi+Asal+Umur);
    }
    
}
