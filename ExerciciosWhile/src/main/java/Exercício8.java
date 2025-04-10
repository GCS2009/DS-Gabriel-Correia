import java.util.Scanner;

public class Exercício8 {
    public static void main (String[] args){
        Scanner leia = new Scanner (System.in);
    
        System.out.print("Digite o tamanho do lado do quadrado (1 a 20):");
        int tamanho = leia.nextInt();
        
        if(tamanho < 1 || tamanho > 20){
            System.out.println("Tamanho inválido. Por favor digite um número de 1 a 20");
        }
        else{
            for(int linha = 1; linha <= tamanho; linha++){
                for(int coluna = 1; coluna <= tamanho; coluna++){
                    if (linha == 1 || linha == tamanho || coluna == 1 || coluna == tamanho){
                    System.out.print("*"); 
                    }
                    else{
                    System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
        }
}

