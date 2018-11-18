import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.IOException;
public class Eleicao18
{
   static void eleicao() throws InputMismatchException // Laço termina apenas quando opção de voto = 2018
   {
      // Variaveis
      Scanner sc = new Scanner(System.in); 
      int v,cB=0,cA=0,cD=0,vT=0,vB=0,vN=0;
      // Entrada de dados
      do { // Laço termina apenas quando opção de voto = 2018
         System.out.println("+=======================URNA-ELERONICA======================+");
         System.out.printf("+ [17] Jair Bolsonaro\t[30] Joao Amoedo\t[51] Cabo Daciolo +\n");
         System.out.println("+===========================================================+");
         System.out.println("+ [0] Nulo\t[1] Branco                                      +");
         System.out.println("+===========================================================+");
         System.out.printf("  Eleitor: %d\t\t Opcao de voto:", vT+1); 
         v = sc.nextInt();
         switch (v)
         {
            case 0: vN++; vT++;
            break;
            case 1: vB++; vT++;
            break;
            case 17: cB++; vT++;
            break;
            case 30: cA++; vT++;
            break;
            case 51: cD++;vT++;
            break;
            case 2018: System.out.println("+===========================================================+");
            System.out.println("+ Fim da eleicao 2018!                                      +");
            System.out.println("+======================APURACAO-ELEICAO=====================+");
            break;
            default: System.out.printf("\nErro: candidato numero %d inexistente!\n", v);
         }
      }while(v!=2018);
      // Apuração votos e dados da eleição 2018
      v = vT-vB-vN;
      cB = (cB*100)/v;
      cA = (cA*100)/v;
      cD = (cD*100)/v;
      vB = (vB*100)/vT;
      vN = (vN*100)/vT;
      // Saída de dados
      if(cB>50 && cB>cA && cB>cD){  
         System.out.println("+ Candidato Vencedor: Jair Bolsonaro!!!                     +");
      } else if (cA>50 && cA>cD){
         System.out.println("+ Candidato Vencedor: Joao Amoedo!!!                        +");
      } else if (cD>50){
         System.out.println("+ Candidato Vencedor: Cabo Daciolo!!!                       +");
      } else {
         System.out.println("+ Eleicao prolongada para segundo turno!!!                  +");
      }
      System.out.println("+=======================DADOS-GERAIS========================+");
      System.out.printf("+ Jair Bolsonaro: %d%% dos votos\n", cB);
      System.out.printf("+ Joao Amoedo: %d%% dos votos\n", cA);
      System.out.printf("+ Cabo Daciolo: %d%% dos votos\n", cD);
      System.out.printf("+ Votos em Branco: %d\t\t Votos Nulos: %d \n", vB, vN);
      System.out.printf("+ Votos validos: %d\t\t Total de Votos: %d ", v,vT);
   }
   public static void main(String [] args)
   {
      try{
         eleicao();
      } catch (InputMismatchException e) {
         System.out.println("Erro: caractere indevido! InputMismatchException");
      }
   }
}