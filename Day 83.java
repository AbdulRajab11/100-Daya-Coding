import java.util.Random;
public class day83 {
    
    public static void main(String[] args) {
        Random sc = new Random ();
        int nomor = sc.nextInt();    
        for (int i = 1 ; i <= 7 ; i++){
             nomor = sc.nextInt(6)+1;
        
        System.out.println(nomor +" ");
        }
    }
    
}
