package ar.edu.unlam.tallerwebI.tp1;

public class Alumno {
	private int primerParcial;
	private int segundoParcial;
	
	public int getPrimerParcial() {
		return primerParcial;
	}
	
	public int getSegundoParcial() {
		return segundoParcial;
	}
	
	public void calificarPrimerParcial(int nota) {
		primerParcial = nota;
	}
	
	public void calificarSegundoParcial(int nota) {
		segundoParcial = nota;
	}
	
	public boolean estaAprobado(){
		if(primerParcial >= 4){
			if(segundoParcial >=4){
				return true;
			}
		}
		return false;
	}
	
	public boolean estaPromocionado(){
		if(primerParcial >= 7){
			if(segundoParcial >=7){
				return true;
			}
		}
		return false;
	}
	
	



	
	
}
