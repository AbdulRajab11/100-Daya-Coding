package day22;

public class Main {
    
    public static void main(String[] args) {
        int N = 16;
        for( int i = 1; i <= N; i++){
            for(int j = 1; j < i; j++){
                System.out.print("* ");
            }
            System.out.println("*");
        }
    }
    
}
