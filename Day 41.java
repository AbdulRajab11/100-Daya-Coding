package day41;

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("----------------------");
        System.out.println("Pola 8");
        System.out.println("----------------------");
        int pola8 = 5;
        System.out.println("5");
        for (int i = 0; i < pola8; i++) {
            for (int j = 0; j < pola8 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println("");
        }

        System.out.println("----------------------");
        System.out.println("Pola 9");
        System.out.println("----------------------");
        int pola9 = 5;
        System.out.println("5");
        for (int i = pola9; i >= 0; i--) {
            for (int j = 0; j < pola9 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("----------------------");
        System.out.println("Pola 10");
        System.out.println("----------------------");
        int pola10 = 5;
        System.out.println("5");
        for (int i = 0; i < pola10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = pola10; i >= 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
    
}
