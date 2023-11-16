package day32;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        
        System.out.println("========== PILIHAN PAKET DATA TELKOMSEL ==========");
        System.out.println("1. 50 GB 30 Hari = Rp. 100000\n2. 21 GB 30 Hari = Rp. 60000\n3. 10 GB 30 Hari = Rp. 35000\n4. 5  GB 30 Hari = Rp. 15000");
        
        System.out.print("MASUKKAN PILIHAN KUOTA ANDA SESUAI NOMOR = ");
        int pilihan = sc.nextInt();
        
        switch(pilihan){
            case 1:
                System.out.println("Selamat, Paket 50 GB anda selama 30 Hari Rp.100000 telah aktif");
                break;
            case 2:
                System.out.println("Selamat, Paket 21 GB anda selama 30 Hari Rp.60000 telah aktif");
                break;
            case 3:
                System.out.println("Selamat, Paket 10 GB anda selama 30 Hari Rp.35000 telah aktif");
                break;
            case 4:
                System.out.println("Selamat, Paket 5 GB anda selama 30 Hari Rp.15000 telah aktif");
                break;
        }
        

    }
    
}
