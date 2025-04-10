import java.util.Scanner;

public class Exercício12 {
    public static void main(String[] args) {
        try (Scanner leia = new Scanner(System.in)) {
            System.out.print("Quantos números você deseja informar? ");
            int n = leia.nextInt();
            if (n <= 0) {
                System.out.println("Quantidade inválida. O número deve ser maior que zero.");
                return;
            }   int menor, maior, soma = 0;
            System.out.print("Digite o 1º número: ");
            int numero = leia.nextInt();
            menor = maior = numero;
            soma += numero;
            for (int i = 2; i <= n; i++) {
                System.out.print("Digite o " + i + "º número: ");
                numero = leia.nextInt();
                
                if (numero < menor) {
                    menor = numero;
                }
                
                if (numero > maior) {
                    maior = numero;
                }
                
                soma += numero;
            }   System.out.println("\nResultado:");
            System.out.println("Menor valor: " + menor);
            System.out.println("Maior valor: " + maior);
            System.out.println("Soma dos valores: " + soma);
        }
    }
}
  
