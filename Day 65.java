import java.util.Scanner;
public class day65 {
    
    public static void main(String[] args) {

  /*Buatlah program yang mengetahui gaji bersih yang 
    diterima karyawan setiap bulannya dengan 
    ketentuan:
    1. Gaji pokok masukkan melalui input
    2. Gaji lembur/jam adalah Rp. 55.000
    3. Lama lembur lembur dimasukkan melalui fungsi input()
  */
    Scanner input = new Scanner (System.in);
    System.out.print("Masukkan gaji pokok karyawan: Rp. ");
        double gajiPokok = input.nextDouble();
        System.out.print("Masukkan lama lembur: ");
        double lamaLembur = input.nextDouble();
        
        double gajiLembur = 55000 * lamaLembur;
        double gajiKotor = gajiPokok + gajiLembur;
        
        double pajak = 0.10  * gajiKotor;
        
        double gajiBersih = gajiKotor - pajak;
        
        System.out.println("Gaji Kotor: Rp. " + gajiKotor);
        System.out.println("Potongan pajak sebesar 10%: Rp. "+ pajak);
        System.out.println("Gaji Bersih: Rp. "+ gajiBersih);

    }
    
}
