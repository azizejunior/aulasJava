public class Funcionario {

   //Atributos

   protected String nome;
   protected String mail;
   protected int idade;

   //M�todo construtor 1

   public Funcionario(String name, String email)
   {
      this.nome = nome;
      this.mail = email;
   }

   //M�todo construtor 2

    public Funcionario(String name, String email, int age)
   {
      this.nome = nome;
      this.mail = email;
      this.idade = age;
   }

   //M�todo que atualiza o email
   
   public void setMail(String email)
   {
      mail = email;
   }

   //M�todo que atualiza a idade

   public void setIdade(int age)
   {
      idade = age;
   }

   //M�todo exibe os dados

   public void get_saldo()
   {
      System.out.printf("O nome e %s\n", nome);
      System.out.printf("O E-mail e %s\n", mail);
      System.out.printf("A idade e %d\n", idade);
   }
}



