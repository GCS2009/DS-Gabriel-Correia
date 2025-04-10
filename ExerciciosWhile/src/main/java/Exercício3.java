import java.util.Scanner;

public class Exercício3 {
    public static void main (String[] args){
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite um número");
        int numero = leia.nextInt();
        
        System.out.println("\nNúmeros pares de 1 até"+numero+":");
        
        for (int i = 1;i<=numero;i++){
            if (i % 2 == 0){
                System.out.println(i+"");   
            }
        }
       
        System.out.println("\n\nNúumeros ímpares de 1 até" +numero+ ":");
        
        for (int i = 1; i <= numero;i++){
            if (i % 2 != 0){
                System.out.println(i+"");
            }
        }  
      }   
    }

