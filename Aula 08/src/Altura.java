import java.util.Scanner;

public class Altura {
    public static void main(String args[]) {
        int i, cont = 0;
        final int PESSOAS = 5;
        double media, acum = 0;
        double altura[] = new double[PESSOAS] ;
        Scanner entrada = new Scanner(System.in);
        
        for (i = 0; i < PESSOAS; i++) {
            System.out.printf("Digite a altura da %d pessoa:  ", i + 1);
            altura[i] = entrada.nextDouble();
            acum += altura[i];
        }
        media = acum / PESSOAS;
        
        for (i = 0; i < PESSOAS; i++) 
            if (altura[i] > media)
               cont++;
               
        System.out.printf("Media das alturas das pessoas e: %2.2f\n", media);
        System.out.printf("Pessoas acima da media: %d\n", cont);    
    }
}

