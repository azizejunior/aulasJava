public class Instrutor extends Funcionario
{
   private String disciplina;
   
   public Instrutor(String name, String email, String disc)
   {
      super(name,email);
      this.disciplina = disc;
   }
   
   //M�todo que atualiza a disciplina   
   
   public void setDisciplina(String disc)
   {
      disciplina = disc;
   }

   //M�todo exibe os dados

   public void exibedados()
   {
      System.out.printf("A disciplina e %s\n", disciplina);
   }
}
