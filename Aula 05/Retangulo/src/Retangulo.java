class Retangulo {
   private double base, altura;
   
   public Retangulo(){ }
   
   public void setBase(double b){
      if (b>0)
          base = b;
      else
          base = 0;
      }   
      public double getBase()
      {
          return base;
      }
      
      public void setAltura(double a){
      if (a>0)
          altura = a;
      else
          altura = 0;
      }
      public double getAltura()
      {
          return altura;
      }
      public double getArea()
      {
          return base * altura;
      }
      public double getPerimetro()
      {
          return 2*base + 2*altura;
      }
}
              
          
      
              
      

        
      
      
      

      