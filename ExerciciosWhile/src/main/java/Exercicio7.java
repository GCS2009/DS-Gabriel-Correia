import java.util.Scanner;

public class Exercicio7{
    public static void main (String[] args){
        Scanner leia = new Scanner (System.in);

        System.out.println("Digite o tamanho do lado do quadrado (1 a 20): ");
        int tamanho = leia.nextInt();
    
        if(tamanho < 1 || tamanho > 20){
            System.out.println("Tamanho inválido. Por favor, digite um número entre 1 e 20:");
        }
        else{
            int linha = 1;
        
            while (linha <= tamanho){
                int coluna =1;
            
                while (coluna <= tamanho){
                    System.out.print("*");
                    
                    coluna++;
                }
            
                System.out.println();
            
                linha++;
            }
        }
  }
}