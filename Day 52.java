import java.util.Scanner;
public class day52 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Username : ");
        String user = input.nextLine();
        System.out.print("Masukkan Password : ");
        int pass = input.nextInt();

        if(user.equals("Rajab") && pass == 31){
            System.out.println("Login Berhasil");
        }else{
            System.out.println("Login Gagal");
        }
}
}
