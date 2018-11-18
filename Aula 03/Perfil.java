import java.util.Scanner;

public class Perfil
{
   public static void main (String args[])
   { 
      int dia, mes, ano, soma;
      Scanner entrada;
      entrada = new Scanner(System.in);       
      
      System.out.println("Insira o dia: ");
      dia = entrada.nextInt();
      System.out.println("Insira o mes: ");
      mes = entrada.nextInt();
      System.out.println("Insira o ano: ");
      ano = entrada.nextInt();
            
      soma = (((dia*100+mes)+ano)/100 + ((dia*100+mes)+ano)%100)%5; 
      
      switch(soma){
         case 0: System.out.println("Voce e timido(a)"); break;
         case 1: System.out.println("Voce e sonhador(a)"); break;
         case 2: System.out.println("Voce e paquerador(a)"); break;
         case 3: System.out.println("Voce e atraente"); break;
         case 4: System.out.println("Voce e irresistivel"); break;
      }
   }
}