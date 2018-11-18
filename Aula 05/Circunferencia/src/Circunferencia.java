class Circunferencia {
	
	final double PI = 3.14159265;
	double raio;

	public Circunferencia(){ 
		
	}

	public void setRaio(double r){
		if (r > 0)
			raio = r;
		else
			raio = 0;
	}   
	
	public double getRaio()
	{
		return raio;
	}    

	public double getDiametro()
	{
		return raio*2;
	}
	
	public double getArea()
	{
		return (Math.pow(raio,2)) * PI;
	}
	
	public double getComprimento()
	{
		return 2* PI * raio;
	}
	
}




      

        
      
      
      

      
