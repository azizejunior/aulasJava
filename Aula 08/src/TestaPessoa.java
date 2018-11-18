import java.util.Scanner;

public class TestaPessoa{

   public static void main(String args[])
   {
      Funcionario f1 = new Funcionario("Joao da Silva","jsilva@gmail.com", 35);
      f1.exibedados();
            
      Funcionario f2 = new Funcionario("Maria dos Santos","msantos@gmail.com" ,23);
      f2.exibedados();
      
      Funcionario f3 = new Funcionario("Antonio Carlos","xxxxx@xxxx.xxx", 55);
      f3.exibedados();
      
      Funcionario f4 = new Funcionario("Ana Teixeira","xxxxx@xxxx.xxx");
      setMail("atex@terra.com");
      setIdade(32);
      f4.exibedados();
      
      Funcionario f5 = new Funcionario("Michele Gaya","xxxxx@xxxx.xxx");
      setMail("migaya@uol.com.br");
      setIdade(42);
      f5.exibedados();
      
      

      Instrutor i1 = new Instrutor("Thomas Luís da Rocha","tthomasluisdarocha@juliosimoes.com.br");
      i1.exibedados();
      i1.setDisciplina("matematica");
      i1.exibedados();
                  
      Instrutor i2 = new Instrutor("Guilherme Edson Márcio Carvalho","gui@gmail.com");
      i2.exibedados();
      i2.setDisciplina("portugues");
      i2.exibedados();
      
      Instrutor i3 = new Instrutor("Benício Vinicius Costa","bbenicioviniciuscosta@senioraereo.com.br","fisica");
      i3.exibedados();
      
      Instrutor i4 = new Instrutor("Luís Oliver da Luz","luisoliverdaluz_@doublemoore.com","geografia");
      i4.exibedados();

      Instrutor i5 = new Instrutor("Eduarda Sophia Novaes","eduardasophianovaes@damha.com.br");
      i5.exibedados();
      i5.setDisciplina("literatura");
      i5.exibedados();
      
               
      
      }
}





      
      
      
      
    