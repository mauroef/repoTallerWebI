package ar.edu.unlam.tallerwebI.cuenta;

public class CajaDeAhorro {
	
	//atributos
	double sueldo;
	
	//constructor
	public CajaDeAhorro(){
		sueldo=0;
	}
	
	//metodos
	public double operacionDepositar(double sueldo){
		if(sueldo>0){
			this.sueldo=this.sueldo+sueldo;
		}
		else{
			System.out.println("No se permiten ingresos negativos.");
		}
		return this.sueldo;
	}
	
	public double operacionExtraer(double sueldo){
		if(this.sueldo>=sueldo){
			this.sueldo=this.sueldo-sueldo;
		}
		else{
			System.out.println("Limite de extraccion superado.");
		}
		return this.sueldo;
	}
		
	public double consultaDeSueldo(){
		return this.sueldo;
	
	}
}
