public class InitArray5 {

    public static void main(String args[])
    {
        int a1 [][] = {{1,2},{3},{4,5,6}};
        System.out.println("\nImpressao por linha");
        exibeArray(a1);
    }

    public static void exibeArray(int v[][])
    {
        int i, j;
        for(i = 0; i < v.length; i++)
        {
            for(j = 0; j < v[i].length; j++)
                System.out.printf("v[%d][%d] = %d  ", i, j, v[i][j]);
            System.out.println();
        }
    }
}
