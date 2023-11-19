
    package day35;

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("----------------------");
        System.out.println("Pola 5");
        System.out.println("----------------------");
        int pola5 = 7;
        for (int i = pola5; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
    
}
