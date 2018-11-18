import java.util.Scanner;

class testaRetangulo 
{
    public static void main(String args[]){
      
      // inicializando 3 instãncias de formas diferentes //

      Retangulo ret1 = new Retangulo();                  //Nenhum parametro
      Retangulo ret2 = new Retangulo(5);                 //Um parametro  
      Retangulo ret3 = new Retangulo(6.5,9.4);           //Dois Parametros  
      
      // teste da função que imprime as informações das 3 instãncias //
      
      ret1.getInfos();
      System.out.printf("\n");
      ret2.getInfos();
      System.out.printf("\n");
      ret3.getInfos();

      System.out.printf("****************************************************************\n\n\n");
      
      // alterando valores das 3 instãncias //
      
      ret1.setAltura(15.1);
      ret1.setBase(6.4);
      
      ret2.setAltura(3.5);
      ret2.setBase(7.3);
      
      ret3.setAltura(3.8);
      ret3.setBase(12.9);
      
      // Testando os metodos com 3 instãncias //      
      
      System.out.printf("Base do Retangulo ret1: %.2f\n", ret1.getBase());
      System.out.printf("Altura do Retangulo ret1: %.2f\n", ret1.getAltura());
      System.out.printf("Area do Retangulo ret1: %.2f\n", ret1.getArea());
      System.out.printf("Perimetro do Retangulo ret1: %.2f\n", ret1.getPerimetro());
      System.out.printf("Diagonal do Retangulo ret1: %.2f\n\n", ret1.getDiag());
            
      System.out.printf("Base do Retangulo ret2: %.2f\n", ret2.getBase());
      System.out.printf("Altura do Retangulo ret2: %.2f\n", ret2.getAltura());
      System.out.printf("Area do Retangulo ret2: %.2f\n", ret2.getArea());
      System.out.printf("Perimetro do Retangulo ret2: %.2f\n", ret2.getPerimetro());
      System.out.printf("Diagonal do Retangulo ret2: %.2f\n\n", ret2.getDiag());
      
      System.out.printf("Base do Retangulo ret1: %.3f\n", ret3.getBase());
      System.out.printf("Altura do Retangulo ret1: %.3f\n", ret3.getAltura());
      System.out.printf("Area do Retangulo ret1: %.3f\n", ret3.getArea());
      System.out.printf("Perimetro do Retangulo ret3: %.2f\n", ret3.getPerimetro());
      System.out.printf("Diagonal do Retangulo ret3: %.2f\n", ret3.getDiag());
      System.out.printf("****************************************************************\n\n\n");
      
      // teste da função que imprime as informações das 3 instãncias apos mudanças //
      
      ret1.getInfos();
      System.out.printf("\n");
      ret2.getInfos();
      System.out.printf("\n");
      ret3.getInfos();
      System.out.printf("\n");
      System.out.printf("****************************************************************\n\n\n");      
    }
}  
    
      






  