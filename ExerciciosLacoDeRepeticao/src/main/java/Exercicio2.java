import java.util.Scanner;

public class Exercicio2 {
    public static void main (String[] args){
        try (Scanner leia = new Scanner(System.in)) {
            char novocalculo;
            do {
                
                System.out.println("Digite a primeira nota: ");
                double nota1 = leia.nextDouble();
                
                while (nota1 < 0 || nota1 > 10) {
                    System.out.println("NOTA INVÁLIDA! Digite a primeira nota (0 a 10): ");
                    nota1 = leia.nextDouble();
                }
                
                System.out.println("Digite a segunda nota: ");
                double nota2 = leia.nextDouble();
                
                while (nota2 < 0 || nota2 > 10) {
                    System.out.println("NOTA INVÁLIDA! Digite a segunda nota (0 a 10): ");
                    nota2 = leia.nextDouble();
                }
                
                
                double soma = nota1 + nota2;
                double media = soma / 2;
                
                System.out.printf("A média das notas é: %.2f%n", media);
                
                
                System.out.println("Deseja fazer um novo cálculo? (S/N)");
                novocalculo = leia.next().toUpperCase().charAt(0);
                
            } while (novocalculo == 'S'); // Repete se o usuário digitar 'S'
        }
        
     }
    }

