public class InitArray2 {
    public static void main(String args[]){
        int diadoMes[] = {0, 31, 28, 31, 30, 31, 31, 30, 31,30,31,30,31};

        String meses[] = {"","Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dec"};

        System.out.printf("%s %9s\n","Mes","Dias");

        for(int i = 1; i <diadoMes.length; i++)
            System.out.printf("%02d (%3s) %4d\n", i, meses[i], diadoMes[i]);
    }
}