
public class Calculadora {
	
	private double x;
	private double y;
	
	public double somar(double x, double y) {
		return x+y;
	}
	
	public double subtrair(double x, double y) {
		return x-y;
	}
	
	public double multiplicar(double x, double y) {
		return x*y;
	}
	
	public double dividir(double x, double y) {
		double resultado=0;
		if(y!=0) {
			resultado = x/y;
			
		}else {
		System.out.println("Erro! Não existe divisão por 0!");
		}
		return resultado;
	}
}
