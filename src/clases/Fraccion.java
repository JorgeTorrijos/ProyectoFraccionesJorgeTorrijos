package clases;




public class Fraccion {
	private int numerador;
	private int denominador;

	public Fraccion(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public static Fraccion simplifica(Fraccion entrada) {

		int numerador = Math.abs(entrada.getNumerador());
		int denominador = Math.abs(entrada.getDenominador());

		int metodo = entrada.mcd();

		numerador/=metodo;
		denominador/=metodo;

		return new Fraccion(numerador,denominador);

	}

	public int mcd(){ //MAXIMO COMUN DIVISOR

		int n=Math.abs(this.getNumerador());
		int d=Math.abs(this.getDenominador());
		if(d==0){
			return n;
		}
		int r;
		while(d!=0){
			r=n%d;
			n=d;
			d=r;
		}
		return n;
	}

	/*
	public static Fraccion suma(Fraccion sumando1, Fraccion sumando2) {
	}
	public static Fraccion multiplicacion(Fraccion sumando1, Fraccion sumando2) {
	}
	public static Fraccion division(Fraccion sumando1, Fraccion sumando2) {
	}
*/
	public int getNumerador() {
		return numerador;
	}

	public int getDenominador() {
		return denominador;
	}


	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	@Override
	public String toString() {
		return denominador + " / " + numerador;
	}

}
