import java.util.Scanner;

public class Exercicio1 {
     public static void main(String[] args) {
          Scanner leia = new Scanner(System.in);
          
          double numero1, numero2;
          
          System.out.println("Digiteb um número:");    
          numero1 = leia.nextDouble();
          
          System.out.println("Digite outro número:");    
          numero2 = leia.nextDouble();
     
          while(numero2 == 0) {
              System.out.println("VALOR INVALIDO. Digite outro valor:");
              numero2 = leia.nextDouble();
          }
          double divisao = numero1 / numero2;
          
          System.out.printf("A divisão do primeiro valor pelo segundo é: %.2f", divisao);
     }
}
