import java.util.Scanner;
public class day78 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

        String[] buah = {"Apel", "Anggur", "Mangga","Durian"};
        String cari;
        int tentukan = 0;
        
        for (int i = 0; i < buah.length; i++) {
            System.out.println((i + 1) + ". " + buah[i] + " ");
        }
        System.out.println();
        System.out.print("Cari : ");
        cari = s.nextLine();
        for (int i = 0; i < buah.length; i++) {
            if (cari.equalsIgnoreCase(buah[i])) {
                System.out.println("Nomor " + (i + 1));
                tentukan++;
            }
        }if (tentukan == 0) {
                System.err.println("Data tidak ditemukan❗");
            }

    }

}
