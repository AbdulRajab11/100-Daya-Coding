public class day77 {
    public static void main(String[] args) {

        int[] a = {7, 6, 9, 3, 5};
        int total = 0;
        double rata;
        
        System.out.print("Deret angka = ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            total += a[i];
        }
        System.out.println();
        System.out.println("Total = " + total);
        rata = total / a.length;
        System.out.println("Nilai Rata-Rata = " + rata);

    }
    
}
