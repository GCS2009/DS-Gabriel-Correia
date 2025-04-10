public class Exercício10 {
    public static void main(String[] args) {
        
        int populacaoA = 80000;
        int populacaoB = 200000;
        double taxaA = 0.03;  
        double taxaB = 0.015;  
        int anos = 0;

        while (populacaoA <= populacaoB) {
            
            populacaoA += populacaoA * taxaA;
            populacaoB += populacaoB * taxaB;
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para que a população do país A ultrapasse ou iguale a população do país B.");
        System.out.println("População de A: " + populacaoA);
        System.out.println("População de B: " + populacaoB);
    }
}

