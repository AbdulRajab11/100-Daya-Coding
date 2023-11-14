package day29;

public class Main {
    
    public static void main(String[] args) {
        int angka = 8;
        int hasil = angka;
        System.out.print(angka +"! =");
        
    for(int i = angka ; i>0; i--){
        System.out.print(i);
        if (i>1){
            System.out.print(" x ");
        }
        if (angka !=i){
            hasil *= i;
        }
    }
        System.out.println("");
        System.out.println("   = "+hasil);
    }
    
}
