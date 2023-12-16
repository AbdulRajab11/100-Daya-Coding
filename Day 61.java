import java.util.Scanner;
public class day61 {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int lebar;
      int panjang;
      int volume;
      int tinggi;
      System.out.println("Masukan Panjang Limas :");
      panjang=sc.nextInt();
           
      System.out.println("Masukan Lebar Limas :");
      lebar=sc.nextInt();
           
      System.out.println("Masukan Tinggi Limas :");
      tinggi=sc.nextInt();
           
      // rumus Volume Limas = 1/3 x (1/2 x panjang x lebar) x tinggi
      volume = (((panjang*lebar)*1/2)*tinggi)*1/3;   
      System.out.println("\nHasil dari volume limas = " +volume);
    
    }
    
}
