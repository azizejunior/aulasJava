import java.util.Scanner;

public class Modulo
{
   public static void main (String args[])
   {
      Scanner entrada = new Scanner(System.in);
      
      System.out.println("Digite um numero: ");
      double n = entrada.nextDouble();
      
      if(n < 0)
         n = -n;
         
      System.out.println("O modulo de n eh " + n);
   }
}