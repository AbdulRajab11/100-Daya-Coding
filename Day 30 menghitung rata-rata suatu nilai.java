package day30;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rjb = 4;
        double nilai, total = 0, rata_rata;
        for (int i = 1; i <= rjb; i++){
            System.out.print(" Nilai ke-"+i+" =");
            nilai = sc.nextDouble();
            total += nilai;
        }
        rata_rata = total / rjb;
        System.out.println("_________________________");
        System.out.println("Total     = "+total);
        System.out.println("Rata-rata = "+rata_rata);
    }
    
}
