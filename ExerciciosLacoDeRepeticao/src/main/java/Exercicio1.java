import java.util.Scanner;

public class Exercicio1 {
    public static void main (String[] args){
        Scanner leia = new Scanner (System.in);
        
        System.out.println("Digite um numero");
        double numero1 = leia.nextDouble();
        
        System.out.println("Digite um segundo numero");
        double numero2 = leia.nextDouble();
    
        while (numero2 == 0){
            System.out.println("O numero digitado tem que ser diferente de zero");
            numero2 = leia.nextInt();
        }
        
        double divisao = numero1/numero2;
        
        System.out.println("A divisão dos números é: " +divisao);
    
    }
    
}
