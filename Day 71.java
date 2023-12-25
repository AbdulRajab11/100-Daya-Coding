public class day71 {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int sementara = a;
        
        a = b;
        b = sementara;
        
        System.out.println(a);
        System.out.println(b);
}
}
