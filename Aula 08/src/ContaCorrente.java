public class Funcionario {

   //Atributos

   protected String nome;
   protected String mail;
   protected int idade;

   //Método construtor 1

   public Funcionario(String name, String email)
   {
      this.nome = nome;
      this.mail = email;
   }

   //Método construtor 2

    public Funcionario(String name, String email, int age)
   {
      this.nome = nome;
      this.mail = email;
      this.idade = age;
   }

   //Método que atualiza o email
   
   public void setMail(String email)
   {
      mail = email;
   }

   //Método que atualiza a idade

   public void setIdade(int age)
   {
      idade = age;
   }

   //Método exibe os dados

   public void get_saldo()
   {
      System.out.printf("O nome e %s\n", nome);
      System.out.printf("O E-mail e %s\n", mail);
      System.out.printf("A idade e %d\n", idade);
   }
}



