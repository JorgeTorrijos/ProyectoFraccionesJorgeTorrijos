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

		return entrada;
	}


	public static Fraccion suma(Fraccion sumando1, Fraccion sumando2) {

		int denominadorComun = sumando1.getDenominador() * sumando2.getDenominador();

		int num1 = sumando1.getNumerador() * sumando2.getDenominador();
		int num2 = sumando2.getNumerador() * sumando1.getDenominador();

		Fraccion suma = new Fraccion(num1+num2,denominadorComun);

		return simplifica(suma);


	}
	public static Fraccion multiplicacion(Fraccion sumando1, Fraccion sumando2) {

		int numerador = sumando1.getNumerador() * sumando2.getNumerador();
		int denominador = sumando1.getDenominador()* sumando2.getDenominador();

		Fraccion resultado = new Fraccion(numerador,denominador);

		return simplifica(resultado);

	}
	public static Fraccion division(Fraccion sumando1, Fraccion sumando2) {

		int numerador = sumando1.getNumerador() * sumando2.getDenominador();
		int denominador = sumando1.getDenominador()* sumando2.getNumerador();

		Fraccion resultado = new Fraccion(numerador,denominador);

		return simplifica(resultado);

	}

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
		return numerador + " / " + denominador;
	}

}
