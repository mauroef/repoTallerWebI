package ar.edu.unlam.tallerwebI.figura;

import org.junit.Test;

import ar.edu.unlam.tallerwebI.figura.Cuadrado;

public class CuadradoTest{
	
	@Test
	public void testDeOperaciones(){
		Cuadrado cuadrado1=new Cuadrado(6);
		cuadrado1.obtenerPerimetro(6);
		cuadrado1.obtenerArea(6);
		System.out.println("El perimetro del cuadrado es "+cuadrado1.obtenerPerimetro(6));
		System.out.println("El area del cuadrado es "+cuadrado1.obtenerArea(6));
	}
}