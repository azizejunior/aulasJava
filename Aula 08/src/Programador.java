public class Programador extends Funcionario
{
   private String linguagem;
   private String sistOper;
   
   public Programador(String name, String email, String lang)
   {
      super(name,email);
      this.linguagem = lang;
   }
   
   //Método que atualiza a linguagem   
   
   public void setLinguagem(String lang)
   {
      linguagem = lang;
   }

   //Método que atualiza o sistema peracional 
   
   public void setSo(String so)
   {
      sistOper = so;
   }

   //Método exibe os dados

   public void exibedados()
   {
      System.out.printf("a linguagem e %s\n", linguagem);
      System.out.printf("O sistema operacional e %s\n", sistOper);
   }
}
