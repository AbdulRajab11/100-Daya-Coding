public class day85 {
    // Prosedur
    public static void nama(){
        String nama = "Abdul";
        int umur    = 19;
        System.out.println(nama +" "+ umur+"th");
    }
    
    // Fungsi
    public static String biodata(){
        String nama = "Rajab";
        int umur    = 17;
        return nama+" "+umur+"th";
    }
    
    public static void main(String[] args) {
        nama();
        System.out.println(biodata());
    }
    
}
