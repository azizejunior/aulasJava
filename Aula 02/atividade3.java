import java.util.Scanner;

public class atividade3
{
   public static void main (String args[])
   {
      Scanner input = new Scanner(System.in);
      float fahrenheit;
      float celsius; 
      
      System.out.print("Digite a temperatura em Fahrenheit: ");
      fahrenheit = input.nextFloat();
           
      celsius = ((fahrenheit - 32) * 5) / 9;
      
      System.out.printf("A temperatura em celsius e %5.2f\n", celsius);
      }
} 