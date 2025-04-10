import java.util.Scanner;

public class Exercício6 {
    public static void main (String[] args){
        Scanner leia = new Scanner (System.in);
    
        int numero = leia.nextInt();
    
        for (int i = 1; i <= numero; i++){
            System.out.println("O seu número é:\n" +i);
        }
   }
}
