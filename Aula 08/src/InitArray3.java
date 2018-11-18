public class InitArray3
{
    public static void main(String args[])
    {
        final int TAM = 10;
        int a[] = new int [TAM];

        for(int i = 0; i <TAM; i++)
            a[i] = 2 + 2*i;
        System.out.printf("%s %8s\n","Indice", "Valor");

        for(int i = 0; i <TAM; i++)
            System.out.printf("%6d %8d\n", i, a[i]);
    }
}
