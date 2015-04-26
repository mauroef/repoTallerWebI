package ar.edu.unlam.tallerwebI.figura;

public class Triangulo{//nombre de la clase
	float lado1, lado2, lado3;//lados de la figura para calcular perimtero
	float base, altura;//datos para calcular area
	
	public Triangulo(float valorLado1, float valorLado2, float valorLado3, float valorBase, float valorAltura){
		lado1=valorLado1;
		lado2=valorLado2;
		lado3=valorLado3;
		base=valorBase;
		altura=valorAltura;
	}
	
	public float calcularPerimetro(float lado1, float lado2, float lado3){
		float perimetro;
		perimetro=lado1 + lado2 + lado3;
		return perimetro;
	}
	
	public float calcularArea(float base, float altura){
		float area;
		area=base * altura / 2;
		return area;
	}
}

