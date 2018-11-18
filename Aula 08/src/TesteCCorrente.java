import java.util.Scanner;

public class TesteCCorrente extends ContaCorrente{

   public static void main(String args[])
   {
      contacorrente cc1 = new ContaCorrente(12345,"Joao da Silva", 0);
      cc1.getInfos();
      
      contacorrente cc2 = new ContaCorrente(33446,"Maria dos Santos", 500.25);
      cc2.getInfos();
      
      contacorrente cc3 = new ContaCorrente(11122,"Jose Carlos Pereira", 1500.25);
      cc3.getInfos();
      
      Scanner entrada = new Scanner(System.in);
      
      System.out.printf("\nValor para deposito em c2: ");
      double vlr = entrada.nextDouble();      
      cc2.deposito(vlr);
      cc2.getInfos();
      
      System.out.printf("\nValor para saque em c2: ");
      cc2.saque(entrada.nextDouble());
      cc2.getInfos();
      
      System.out.printf("\nInsira o valor a creditar na conta 1: ");
      cc3.transferencia(cc1, entrada.nextDouble());
      cc3.getInfos();
      cc1.getInfos();
      
      cc1.set_titular("Jaime dos Reis");
      cc1.getInfos();
  }
}





      
      
      
      
    