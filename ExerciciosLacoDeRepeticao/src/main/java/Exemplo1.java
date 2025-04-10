import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        System.out.println("Digite um número: ");
        int numero = leia.nextInt();
        
        for (int i = numero; i <= 10; i++){
            System.out.println("O seu número é: " + i);
        }
    }
    
}

