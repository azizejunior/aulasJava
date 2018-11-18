public class Retangulo{
   
   private double base;
   private double altura;
   
   public Retangulo(){
      this.altura = 1;
      this.base = 2;     
   }
   
    public Retangulo(double a){
      this.altura = a;
      this.base = a;                
   }
   
    public Retangulo(double a, double b){
      this.altura = a;
      this.base = b;         
   }
   
   public void setBase(double b){
      if(b < 0){
         System.out.println("A base nao pode ser negativa.");
      }
      else{
         base = b;
      }
   }
   
   public void setAltura(double a){
      if(a < 0){
         System.out.println("A altura nao pode ser negativa.");
      }
      else{
         altura = a;
      }
   }
   
   public double getArea(){
      return base*altura;
   }
   
   public double getPerimetro(){
      return 2 * base + 2 * altura;
   }
   
   public double getBase(){
      return base;
   }
   
   public double getAltura(){
      return altura;
   }
   
    public double getDiag(){
      return Math.sqrt(altura*altura + base*base);
   }
   
   public boolean eQuadrado(){
      if(base == altura){ return true; }
      else{return false;}         
   }
   
   public void getInfos(){
      System.out.printf("A base do retangulo e %.2f\n",getBase());
      System.out.printf("A altura do retangulo e %.2f\n",getAltura());
      System.out.printf("A area do retangulo e %.2f\n",getArea());
      System.out.printf("O perimetro do retangulo e %.2f\n",getPerimetro());
      System.out.printf("A diagonal do retangulo e %.2f\n",getDiag());
      System.out.printf("E quadrado? %s\n", eQuadrado()?"SIM":"NAO");      
   }  
}



      
   