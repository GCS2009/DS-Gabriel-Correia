import java.util.Scanner;

public class Exercício4 {
    public static void main (String[] args) {
        Scanner leia = new Scanner (System.in);
        
        System.out.println("Quantos alunos tem na sua sala?");
        int alunos = leia.nextInt();
        
        int contador = 1;
        double somaNotas = 0;
        
        while (contador <= alunos){
            System.out.println("Digite a nota do aluno"+contador+":");
            double nota = leia.nextDouble();
            
            somaNotas += nota;
            contador ++;
        }
        
        double mediaGeral = somaNotas / alunos;
        
        System.out.println("A média geral da turma é" +mediaGeral);
    }
}
