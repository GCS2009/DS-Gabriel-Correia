import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        System.out.println("DIgite um núemro: ");
        int numero = leia.nextInt ();
        
        while (numero <=10 ){
            System.out.println("O numero e:"+numero);
            numero++;
        }
        
        }
        
    }
    

