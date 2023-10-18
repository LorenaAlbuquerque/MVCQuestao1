package model;

public class OperacoesModel {
	public int somar(int a, int b, int c) {
		return a + b + c;
	}

	public int subtrair(int a, int b, int c) {
		return a - b - c;
	}

	public int multiplicar(int a, int b, int c) {
		return a * b * c;
	}

	public double dividir(int a, int b, int c) {
		return (double) a / b / c;
	}

	public int restoDivisao(int a, int b, int c) {
		return a % b % c;
	}
}
