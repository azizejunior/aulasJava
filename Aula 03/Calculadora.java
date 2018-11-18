import java.util.Scanner;

public class Calculadora
{
   public static void main (String args[])
   {
      Scanner eStr = new Scanner(System.in);
      Scanner eNum = new Scanner(System.in);
      
      System.out.println("Digite o primeiro numero: ");
      double x = eNum.nextDouble();
      
      System.out.println("Digite um operador '+' '-' '*' '/': ");
      String s = eStr.nextLine();
      
      System.out.println("Digite o primeiro numero: ");
      double y = eNum.nextDouble();
      
      char op = s.charAt(0);
      
      switch(op){
         case '+': System.out.print("Resultado = " + (x+y)); break;
         case '-': System.out.print("Resultado = " + (x-y)); break;
         case '*': System.out.print("Resultado = " + (x*y)); break;
         case '/': System.out.print((y==0)? "Impossivel dividir por 0" : "Resultado= " + (x/y)); break;         
         default: System.out.print("Operador inválido:" + op);
      }
   }
}