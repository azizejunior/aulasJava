import java.util.Scanner;

public class BotasPerdidas {

    public static void main(String args[]) {

        final int TAM = 20;
        int cont, i;
        double esq[] = new double[TAM];
        double dir[] = new double[TAM];
        cont = 0;

        for (i = 0; i < TAM; i++) {
            esq[i] = 0;
            dir[i] = 0;
        }

        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();

        for (i = 0; i < n; i++) {

            int par = entrada.nextInt();
            String lado = entrada.next();
            if (lado.equals("D"))
                dir[par - 30] += 1;
            else
                esq[par - 30] += 1;
        }

        for (i = 0; i < esq.length; i++) {
            if (esq[i] < dir[i])
                cont += esq[i];
            else
                cont += dir[i];
        }

        System.out.printf("%d", cont);
    }
}