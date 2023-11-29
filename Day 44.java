public class day44 {
    
    public static void main(String[] args) {
        int[] NilaiMahasiswa = {78,86,56,68,93,71,70,65,81,59};
        System.out.println("Nilai Mahasiswa yang Memenuhi Standar Adalah : ");
        int NilaiStandar = 70;
        for(int nilai : NilaiMahasiswa){
            if(nilai >= NilaiStandar){
                System.out.println(nilai);
            }
        }
        
    }
    
}
