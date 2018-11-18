public class Instrutor extends Funcionario
{
   private String disciplina;
   
   public Instrutor(String name, String email, String disc)
   {
      super(name,email);
      this.disciplina = disc;
   }
   
   //Método que atualiza a disciplina   
   
   public void setDisciplina(String disc)
   {
      disciplina = disc;
   }

   //Método exibe os dados

   public void exibedados()
   {
      System.out.printf("A disciplina e %s\n", disciplina);
   }
}
