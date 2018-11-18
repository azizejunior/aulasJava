import java.util.Scanner;

class TestaCirc 
{
	public static void main(String args[]){

		double raio;

		Circunferencia circ = new Circunferencia();
		Scanner dado = new Scanner(System.in);  

		System.out.print("Digite o raio: ");
		raio = dado.nextDouble();   
		dado.close();

		circ.setRaio(raio);      

		System.out.printf("\nA area da circunferencia e: %.2f", circ.getArea());
		System.out.printf("\nO comprimento da circunferencia e: %.2f", circ.getComprimento());
		System.out.printf("\nO diametro da circunferencia e: %.2f\n", circ.getDiametro());        
	}
}


