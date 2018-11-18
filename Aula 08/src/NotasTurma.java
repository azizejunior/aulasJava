import java.util.Scanner;

public class NotasTurma
{
    public static void main(String args[])
    {
        final int ALUNOS = 3;
        final int PROVAS = 2;
        int i,j;
        double media;
        double notas [][] = new double[ALUNOS][PROVAS];

        Scanner entrada  = new Scanner(System.in);

        for(i=0; i < ALUNOS; i++){
            System.out.printf("\nDigite as notas do %do aluno: ", i + 1);
            for (j = 0; j < PROVAS; j++)
                notas[i][j] = entrada.nextDouble();
        }

        System.out.println();
        System.out.println("Notas e media");

        for(i=0; i < ALUNOS; i++) {

            System.out.printf("\nAluno %d: ", i + 1);
            media = 0;

            for (j = 0; j < PROVAS; j++) {
                System.out.printf("\n%2.2f", notas[i][j]);
                media += notas[i][j];
            }
            System.out.printf("\n-Media: %2.2f \n", media / PROVAS);
        }
    }
}
