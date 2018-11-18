import java.util.Scanner;

class AplicacaoRetangulo 
{
    public static void main(String args[]){

        Retangulo retang = new Retangulo();
        Scanner dado = new Scanner(System.in);
        double base, alt;
        
        System.out.print("Digite a base:");
        base = dado.nextDouble();
        System.out.print("Digite a altura:");
        alt  = dado.nextDouble();
        
        retang.setBase(base);
        retang.setAltura(alt);
        
        System.out.printf("\nA área do retangulo            é %.2f", retang.getArea()     );
        System.out.printf("\nO perímetro do retangulo é %.2f", retang.getPerimetro() );
    }
}
    

