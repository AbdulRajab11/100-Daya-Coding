package day40;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("----------------------");
        System.out.println("Pola 6");
        System.out.println("----------------------");
        int pola6 = 7;
        System.out.println("7");
        for (int i = 0; i < pola6; i++) {
            for (int j = 0; j < pola6 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        System.out.println("----------------------");
        System.out.println("Pola 7");
        System.out.println("----------------------");
        int pola7 = 7;
        System.out.println("7");
        for (int i = pola7; i >= 0; i--) {
            for (int j = 0; j < pola7 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
