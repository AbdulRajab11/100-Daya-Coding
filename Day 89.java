import java.util.Scanner;
public class day89 {
    public static void main (String[] args){
        Scanner x = new Scanner(System.in);
        
        String[] hewan = new String[10];
        
        for(int i = 0; i < hewan.length; i++){
            System.out.print("Hewan Ke-" + i + "  : ");
            hewan[i] = x.nextLine();
        }
        System.out.println("\n Daftar 10 nama hewan: ");
        for (String cetak : hewan){
            System.out.println(cetak);
        }
        
        
        if(hewan.length > 3){
            for(int i = 3; i < hewan.length - 1; i++){
                hewan[i] = hewan[i + 1];
            }
            hewan[hewan.length - 1] = null;
        }
        System.out.println("\n Setelah Hapus Index Ke-3 : ");
        for(String cetak : hewan){
            if(cetak != null){
                System.out.println(cetak);
            }
        }
        
        System.out.print("\n"+"Masukkan Nama Hewan Baru : ");
        hewan[hewan.length - 1] = x.nextLine();
        
        System.out.println("\n Daftar Setelah Penambahan : ");
        for(String cetak : hewan){
            System.out.println(cetak);
        }
        
        System.out.println("\n"+"Hewan Index Ke-8 : "+hewan[8]);
        
        
    }
}
      

