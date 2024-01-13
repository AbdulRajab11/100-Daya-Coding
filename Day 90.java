import java.util.ArrayList;
public class day90 {
    public static void main(String[] args) {
        ArrayList data = new ArrayList();
        //Data dari ArrayList
        data.add("Rajab");
        data.add("Informatika");
        data.add('E');
        data.add(1);
        data.add("Mateng");
        
        //menghapus nilai pada index tertentu
        data.remove("ganteng");
        
        //Menampilkan isi data ArrayList
        System.out.println("Isi Data ArrayList : "+data);
        
        //Menampilkan banyak isi data dari ArrayLis
        System.out.println("Data ArrayList Berjumlah "+data.size());
    }
}
