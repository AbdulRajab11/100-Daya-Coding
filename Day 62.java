import java.util.Scanner;
public class Day62 {
   public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        double phi = 3.14;
        double r, tinggi, s;  // s = Panjang Garis Pelukis
    double luasP, volume;
 
        System.out.println("Hitung Luas Permukaan dan Volume Kerucut \n\n");
 
        System.out.print(" Masukkan Jari-jari     : ");
        r = userInput.nextDouble();
       
        System.out.print(" Masukkan Tinggi        : ");
        tinggi = userInput.nextDouble();
 
        System.out.print(" Masukkan Panjang Garis : ");
        s = userInput.nextDouble();
 
        luasP = phi * r * (r + s);
        System.out.println("\n Luas Permukaannya : " + luasP);
 
        volume = 1/(double)3 * phi * r * r * tinggi;
        System.out.println(" Volume Kerucutnya  : " + volume);
    }
}
