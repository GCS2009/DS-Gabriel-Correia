import java.util.Scanner;

public class Exercício11 {
    public static void main(String[] args) {
        try (Scanner leia = new Scanner(System.in)) {
            System.out.print("Digite um número inteiro para calcular o fatorial: ");
            int numero = leia.nextInt();
            
            long fatorial = 1;
            
            System.out.print(numero + "! = ");
            
            for (int i = numero; i > 0; i--) {
                fatorial *= i;
                System.out.print(i);
                
                if (i > 1) {
                    System.out.print(".");
                }
            }
            
            System.out.println(" = " + fatorial);
        }
    }
}



