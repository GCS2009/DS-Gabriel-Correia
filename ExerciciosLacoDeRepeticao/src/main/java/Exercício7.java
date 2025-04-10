import java.util.Scanner;

public class Exercício7 {
    public static void main (String[] args){
        Scanner leia = new Scanner (System.in);
    
        System.out.println("Digite um número maior que zero:");
        int numero = leia.nextInt();
    
        while (numero == 0){
            System.out.println("Número inválido! Digite um número maior que zero:");
            numero = leia.nextInt();
        }
    
        for (int i = 1; i <= numero; i++){
            System.out.println("Os seus números são:\n" +i);
        }
  }
}
