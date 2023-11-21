package day37;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        double totalHarga, ronaldo, messi, kurang, diskon;
            ronaldo = 540000;
            messi = 230000;
            kurang = 0.2;
        
        if (ronaldo >= 300000){
            diskon = ronaldo * kurang;
            totalHarga = diskon + messi;
            System.out.println("Total Belanja Messi dan Ronaldo adalah "+totalHarga);
       
        }
    }
    
} 
