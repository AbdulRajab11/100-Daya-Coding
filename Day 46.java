public class day46 {
    
    public static void main(String[] args) {
        int []NilaiMahasiswa = {70,90,86,95,78};
        int angka = 0;
        
        for(int nilai : NilaiMahasiswa){
            angka += nilai;
        }System.out.println(angka);
    }
    
}
