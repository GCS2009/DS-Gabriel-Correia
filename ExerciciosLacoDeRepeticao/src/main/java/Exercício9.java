import java.util.Scanner;

public class Exercício9 {
    public static void main (String[] args){
        Scanner leia = new Scanner (System.in);
    
        System.out.println("Escolha um número de 1 a 10");
        int numero = leia.nextInt();
    
        System.out.println("Tabuada do número"+numero+"é:");
    
        for (int i = 1; i <= 10; i++){
            
            int resultado = numero * i;
            System.out.println(numero+" x "+i+" = " +resultado);
        }
  }
}
