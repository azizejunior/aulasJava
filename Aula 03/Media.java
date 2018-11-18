import java.util.Scanner;

public class Media
{
   public static void main (String[] args)
   {
      float n1, n2, media;
      Scanner entrada;
      entrada = new Scanner(System.in);      
      
      System.out.print("Digite a primeira nota: ");
      n1 = entrada.nextFloat();
      System.out.print("Digite a segunda nota: ");
      n2 = entrada.nextFloat();
                       
      media = (n1 + n2)/2;
      
      if(media > 7)
         System.out.printf("Aprovada com %5.2f", media);
      else if(media >= 4)
         System.out.printf("Recuperacao com %5.2f", media);
      else
         System.out.printf("Reprovado com %5.2f", media);
   }
}      