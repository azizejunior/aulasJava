public class contacorrente1 {

   //Atributos

   private int numeroConta;
   private String titular;
   private double saldo;

   //M�todo construtor 1

   public contacorrente1()
   {
   }

   //M�todo construtor 2

   public contacorrente1(int numeroConta, String titular, double saldo) {
       if(saldo < 0)
           System.out.println("Valor de saldo invalido.");
       else{
           this.numeroConta = numeroConta;
           this.titular = titular;
           this.saldo = saldo;
       }
   }

   //M�todo Nomeia o titular da conta

   protected void set_titular(String titular)
   {
      this.titular = titular;
   }

   //M�todo divulga o nome do titular da conta

   public void get_titular(String titular)
   {
      System.out.printf("Nome do titular da conta: %s", titular);
   }

   //M�todo exibe o saldo

   protected double get_saldo()
   {
      return saldo;
   }

   //M�todo exibe o numero da conta

   public void get_conta()
   {
      System.out.printf("Numero da conta: %d", numeroConta);
   }

   //M�todo para dep�sito em conta

   public void deposito(double valor)
   {
      if (valor < 0)
         System.out.println("Valor de saldo invalido.");
      else
         saldo += valor;
   }

   //M�todo para saque da conta

   protected double saque(double valor) {
       if (valor >= saldo) {
           System.out.println("Valor insuficiente de fundos para o saque.");
           return -1;
       }
       else {
           saldo -= valor;
           return valor;
       }
   }

   //M�todo para exibir infos da conta

    public void getInfos()
   {
       System.out.print("\n******************************************");
       System.out.printf("\nConta   : %d", this.numeroConta);
       System.out.printf("\nTitular : %s", this.titular);
       System.out.printf("\nSaldo   : R$ %.2f", this.saldo);
       System.out.print("\n******************************************");
   }

    //M�todo para transferencia entre contas correntes

    protected void transferencia(contacorrente1 ccDestino, double valor){
        if (this.get_saldo() >= valor){
            this.saque(valor);
            ccDestino.deposito(valor);
            System.out.print("\n==========================================");
            System.out.printf("\nTransferencia realizada com sucesso.");
            System.out.print("\n==========================================");
        }
        else{
            System.out.print("\n==========================================");   
            System.out.println("\nFundos insuficientes para a transferencia.");
            System.out.print("\n==========================================");        
        }
    }

}



