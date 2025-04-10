import java.util.Scanner;

public class Exercício5 {
    public static void main (String[] args){
        Scanner leia = new Scanner (System.in);
        
        System.out.println("Escreva 10 números");
        
        int contador = 1;
        int maior = Integer.MIN_VALUE;
        
        while (contador <= 10){
            System.out.println("Digite o número"+contador+":");
        
            int numero = leia.nextInt();
            
            if (numero > maior){
                maior = numero;
            }
            
            contador++;
        }
        System.out.println("O maior número é:"+maior);
    }
}
