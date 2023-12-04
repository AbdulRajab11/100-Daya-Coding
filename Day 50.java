import java.util.Scanner;
public class day50 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Menghitung Luas Dan Keliling Lingkaran");
        
        System.out.print("Masukkan r (jari-jari) : ");
        double r = input.nextDouble();
        
        
        double phi = 3.14;
        double d = 2 * r;
        double L = phi * r * r;
        double K = phi * d;
        
        
        System.out.println("Jika r (jari-jari) Lingkaran Adalah = "+r);
        System.out.println("Maka Luas Lingkaran Adalah = "+L);
        System.out.println("Dan Keliling Lingkaran Adalah = "+K);
    }
    
    
}
