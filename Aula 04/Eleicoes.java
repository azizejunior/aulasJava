import java.util.Scanner;

public class Eleicoes
{
   public static void main (String args[])
   { 
      int numDepFed = 0, numDepEst = 0, numSen1 = 0, numSen2 = 0, numGov = 0, numPres = 0, resp = 0;
      
      Scanner entrada;
      entrada = new Scanner(System.in);  
      
      do{
         System.out.println("\nDeputado Federal (4 digitos): ");
         numDepFed = entrada.nextInt();
         
         switch(numDepFed){
            case 1111: System.out.println("Aline Monica - PTC, confirma? (1-Sim e 2-Nao)"); 
            resp = entrada.nextInt(); break;
            case 2222: System.out.println("Rodrigues Bombeiro - PATRI, confirma? (1-Sim e 2-Nao)"); 
            resp = entrada.nextInt(); break;
            case 3333: System.out.println("Aguiar da Pipoca - PMN, confirma? (1-Sim e 2-Nao)"); 
            resp = entrada.nextInt(); break;
            case 4444: System.out.println("Aires Ribeiro - PDT, confirma? (1-Sim e 2-Nao)"); 
            resp = entrada.nextInt(); break;
            case 5555: System.out.println("Ana Couto - PRB, confirma? (1-Sim e 2-Nao)"); 
            resp = entrada.nextInt(); break;
            case 6666: System.out.println("Arlindo Araujo - PPS, confirma? (1-Sim e 2-Nao)"); 
            resp = entrada.nextInt(); break;
            default: System.out.println("Numero errado - Voto Nulo - confirma? (1-Sim e 2-Nao)");
         }
     } while (resp!=1);
     
     do{
         System.out.println("\nDeputado Estadual (5 digitos): ");
         numDepEst = entrada.nextInt();
         
         switch(numDepEst){
            case 11111: System.out.println("11111 - Abel Barreto - PSTU, confirma? (1-Sim e 2-Nao)"); 
            resp = entrada.nextInt(); break;
            case 22222: System.out.println("22222 - Ademir da Guia - PHS, confirma? (1-Sim e 2-Nao)"); 
            resp = entrada.nextInt(); break;
            case 33333: System.out.println("33333 - Ademilson Marceneiro - MDB, confirma? (1-Sim e 2-Nao)"); 
            resp = entrada.nextInt(); break;
            case 44444: System.out.println("44444 - Adriana Pierin - PDT, confirma? (1-Sim e 2-Nao)"); 
            resp = entrada.nextInt(); break;
            case 55555: System.out.println("55555 - Alan Bezerra do Povo - PT, confirma? (1-Sim e 2-Nao)"); 
            resp = entrada.nextInt(); break;
            case 66666: System.out.println("66666 - Alice Limberg - PSDB, confirma? (1-Sim e 2-Nao)"); 
            resp = entrada.nextInt(); break;
            default: System.out.println("Numero errado - Voto Nulo - confirma? (1-Sim e 2-Nao)");
         }
     } while (resp!=1);
     
     do{
         System.out.println("\nSenador - 1 vaga (3 digitos): ");
         numSen1 = entrada.nextInt();
         
         switch(numSen1){
            case 111: System.out.println("111 - Eduardo Suplicy - PT, confirma? (1-Sim e 2-Nao)"); 
            resp = entrada.nextInt(); break;
            case 222: System.out.println("222 - Major Olimpio - PSL, confirma? (1-Sim e 2-Nao)"); 
            resp = entrada.nextInt(); break;
            case 333: System.out.println("333 - Maurren Maggi - PSB, confirma? (1-Sim e 2-Nao)"); 
            resp = entrada.nextInt(); break;
            default: System.out.println("Numero errado - Voto Nulo - confirma? (1-Sim e 2-Nao)");
         }
     } while (resp!=1);
     
      do{
         System.out.println("\nSenador - 2 vaga (3 digitos): ");
         numSen2 = entrada.nextInt();
         
         switch(numSen2){
            case 444: System.out.println("444 - Mario Covas - PODE, confirma? (1-Sim e 2-Nao)"); 
            resp = entrada.nextInt(); break;
            case 555: System.out.println("555 - Mara Gabrilli - PSDB, confirma? (1-Sim e 2-Nao)"); 
            resp = entrada.nextInt(); break;
            case 666: System.out.println("666 - NIvaldo Orlandi - PCO, confirma? (1-Sim e 2-Nao)"); 
            resp = entrada.nextInt(); break;
            default: System.out.println("Numero errado - Voto Nulo - confirma? (1-Sim e 2-Nao)");
         }
     } while (resp!=1);
     
      do{
         System.out.println("\nGovernador (2 digitos): ");
         numGov = entrada.nextInt();
         
         switch(numGov){
            case 11: System.out.println("11 - Joao Doria - PSDB, confirma? (1-Sim e 2-Nao)"); 
            resp = entrada.nextInt(); break;
            case 22: System.out.println("22 - Professora Lisete - PSOL, confirma? (1-Sim e 2-Nao)"); 
            resp = entrada.nextInt(); break;
            case 33: System.out.println("33 - Paulo Skaf - MDB, confirma? (1-Sim e 2-Nao)"); 
            resp = entrada.nextInt(); break;
            default: System.out.println("Numero errado - Voto Nulo - confirma? (1-Sim e 2-Nao)");
         }
     } while (resp!=1);
     
      do{
         System.out.println("\nPresidente (2 digitos): ");
         numPres = entrada.nextInt();
         
         switch(numPres){
            case 11: System.out.println("11 - Ciro Gomes - PDT, confirma? (1-Sim e 2-Nao)"); 
            resp = entrada.nextInt(); break;
            case 22: System.out.println("22 - Cabo Daciolo - PATRI, confirma? (1-Sim e 2-Nao)"); 
            resp = entrada.nextInt(); break;
            case 33: System.out.println("33 - Jair Bolsonaro - PSL, confirma? (1-Sim e 2-Nao)"); 
            resp = entrada.nextInt(); break;
            default: System.out.println("Numero errado - Voto Nulo - confirma? (1-Sim e 2-Nao)");
         }
     } while (resp!=1);
     System.out.println("FIM");
  }
}






     
     
     
     
     
     
   