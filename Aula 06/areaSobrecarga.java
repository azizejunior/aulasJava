class areaSobrecarga{

   public static double area(double l1){
         return l1*l1;
   }
   
   public static double area(double l1, double l2){
         return l1*l2;
   }

	public static void main(String args[])
	{       
      double a = 3; 
	   double b = 4;
		
		System.out.println("Area do terreno quadrado: " + area(a));
      System.out.println("Area do terreno quadrado: " + area(b));
		System.out.println("Area do terreno retangular: " + area(a,b));		
	   System.exit(0);
	}
}


