import java.util.Scanner;
public class Day75 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int angka_rahasia = 8;
        do {


            System.out.print ("Masukkan Angka : ");
            int angka = sc.nextInt();
            if (angka == angka_rahasia ){
                System.out.println("🥳Selamat Anda Benar🥳");
                break;
                
            }else{
                System.out.println("🤪Anda Salah, COBA LAGI🤪");
            }


        }while(true);

    }

}
