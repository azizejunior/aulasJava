import java.util.Scanner;
public class Perfil
{
   static void perfil() throws NumberFormatException, StringIndexOutOfBoundsException
   {
      Scanner entrada = new Scanner(System.in);
      System.out.print("Digite uma data dd/mm/aaaa: ");
      String s = entrada.nextLine();
      String dStr = s.substring(0,2); // Seleciona Dia
      String mStr = s.substring(3,5); // Seleciona Mês
      String aStr = s.substring(6,10); // Seleciona Ano
      int x = (Integer.parseInt(dStr)*100)+Integer.parseInt(mStr); // ((Dia*100)+Mês)
      int y = Integer.parseInt(aStr); // Ano inteiro
      int a = x+y;
      int b = a%100;
      a/=100;
      int r = a+b;
      r%=5;
      switch(r)
      {
         case 0: System.out.println("Timido");
         break;
         case 1: System.out.println("Sonhador");
         break;
         case 2: System.out.println("Paquerador");
         break;
         case 3: System.out.println("Atraente");
         break;
         case 4: System.out.println("Irresistivel");
         break;
         default : System.out.println("Data inserida incorretamente: " + s);
      }
   }
   
   public static void main(String [] args)
   {
      // StringIndexOutOfBoundsException NumberFormatException
      try{
      perfil();
      } catch (NumberFormatException e){ // Trata Exceção
         System.out.println("Erro: " + e + ". Ao digitar a data digite apenas numeros!!!");
      } catch (StringIndexOutOfBoundsException e){ //Trata exceção
         System.out.println("Erro: " + e + ". Digite a data no formato correto!!!"); 
      }
      System.exit(0);
   }
}