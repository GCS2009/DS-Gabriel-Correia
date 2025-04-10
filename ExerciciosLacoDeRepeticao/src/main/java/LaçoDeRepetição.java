import java.util.Scanner;

public class LaçoDeRepetição {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        System.out.println("Digite um número: ");
        int numero = leia.nextInt();
        
        for (int i = 0; i <= numero; i++){
            System.out.println("O seu número é: " + i);
        }
    }
    
}
