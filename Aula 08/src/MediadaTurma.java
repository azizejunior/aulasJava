import java.util.Scanner;

public class MediadaTurma {
    public static void main(String args[]) {

        final int ALUNOS = 3;
        final int PROVAS = 4;
        int i, j;
        double somaAluno = 0;
        double mediaAluno;
        double notas[][] = new double[ALUNOS][PROVAS + 1];
        Scanner entrada = new Scanner(System.in);

        for (i = 0; i < ALUNOS; i++) {
            mediaAluno = 0;
            for (j = 0; j < PROVAS; j++) {
                System.out.printf("Digite a %d nota do %d aluno  ", j + 1, i + 1);
                notas[i][j] = entrada.nextDouble();
                mediaAluno += notas[i][j];
            }
            notas[i][j] = mediaAluno / j;
            somaAluno += notas[i][j];
            System.out.println();
        }

        somaAluno /= ALUNOS;
        System.out.println("***********************Notas***********************\n");
        System.out.printf("Media dos alunos da sala: %2.2f\n", somaAluno);


        for (i = 0; i < ALUNOS; i++) {
            System.out.printf("\n******************************************");
            System.out.printf("\n\t\t\t\tAluno %d ", i + 1);
            System.out.printf("\n******************************************\n");
            for (j = 0; j < PROVAS; j++)
                System.out.printf("\n\tNota da %d prova: %2.2f", j + 1, notas[i][j]);

            System.out.printf("\n\n\tMedia do aluno %d: %2.2f ", i + 1, notas[i][j]);
            if (notas[i][j] < somaAluno)
                System.out.println("\n\tNota abaixo da media\n");
            else
                System.out.println("\n\tParabens! Nota acima da media!\n");
            System.out.printf("******************************************\n\n", i + 1, notas[i][j]);
        }
    }
}
