package ar.edu.unlam.tallerwebI.figura;

public class Cuadrado {
	float lado;
		
	public Cuadrado (float l){
		lado=l;	
	}
	
	public float obtenerPerimetro(float lado){
		float perimetro =4*(lado);
		return perimetro;	
	}
	
	public float obtenerArea(float lado){
		float area = lado * lado;
		return area;
	}
}
