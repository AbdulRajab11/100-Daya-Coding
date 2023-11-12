package day28;
public class Main {
    public static void main(String[] args) {
        int angka, pangkat, hasil;
        angka = 5;
        hasil = angka;
        pangkat = 3;
        for (int i = 1; i < pangkat; i++){
            hasil *= angka;
        }
        System.out.println(hasil);
    }
    
}
