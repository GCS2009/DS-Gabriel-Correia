import java.util.Scanner;

    public class Exercicio2 {
        public static void main(String[] args) {
            Scanner leia = new Scanner(System.in);
          
            double nota1, nota2;
            String sn;
            char novocalculo;

            do {
            System.out.println("Qual é a nota da primeira avaliação:");
            nota1 = leia.nextDouble();
            
            while (nota1 < 0 || nota1 > 10){
                System.out.println("Digite uma nota entre 0 e 10");
                nota1 = leia.nextDouble();
            }
            
            System.out.println("Qual é a nota da segunda avaliação:");
            nota2 = leia.nextDouble();
            
            while (nota2 < 0 || nota2 > 10){
                System.out.println("Digite uma nota entre 0 e 10");
                nota2 = leia.nextDouble();
            }
            
            double somanota = nota1 + nota2;
            double media = somanota / 2;
            
            System.out.printf("A media da suas notas é: %.2f", media);

            System.out.println("\nNOVO CALCULO (S/N)? ");
            novocalculo = leia.next().toUpperCase().charAt(0);
        } while (novocalculo == 'S');
              
    }
}