import java.util.Scanner;
public class day73 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka batas : ");
        int angka_batas = sc.nextInt();
        for(int i = 1; i <= angka_batas; i++){
            if(i % 2 == 0){
                System.out.println(i +". genap");
            }else{
                System.out.println(i +". ganjil");
            }
        }
    }
    
}
