package day4;

public class Main {
    
    public static void main(String[] args) {
        
        /*Sambo ingin membeli sebuah pc gaming seharga 150jt,
        sambo adalah seorang pengusaha yang penghasilannya 13jt / bulan,
        dia harus membayar tagihan rumah 4jt / bulan, dan dia harus membiayai
        3 orang anaknya yang masih sekolah dan seorang istri,
        maksimal uang yg dapat dia tabung adalah 5jt/bulan, 
        ank pertamanya harus membayar 2jt/bulan dan 2 orang anaknya lagi 
        harus membayar 1jt/bulan, sisanya diberikan kepada istrinya untuk 
        kebutuhan sehari-hari pertanyaannya, berapa tahun sambo harus menabung 
        untuk  bisa membeli pc gaming tersebut???*/
        
        double HargaPC = 150000000;
        double Tabungan = 5000000;
        double Bulan = 12;
        
        System.out.println("lama waktu menabung yang dibutuhkan Sambo agar dapat membeli PC adalah");
        System.out.println("Total "+(HargaPC/Tabungan)+" Bulan");
        System.out.println(" atau "+(HargaPC/Tabungan/Bulan)+(" Tahun"));
        System.out.println("Jadi total waktu yang dibutuhkan Sambo untuk membeli sebuah PC adalah 30 Bulan atau 2.5 Tahun");
        
        
    }
    
}
