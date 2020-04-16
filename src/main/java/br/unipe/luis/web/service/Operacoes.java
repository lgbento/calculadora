package br.unipe.luis.web.service;

public class Operacoes {
	
	private double x;
	private double y;
	
	public Operacoes() {
		super();
	}

	public Operacoes(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double somar() {
		return this.x + this.y;
	}
	
	public double subtrair() {
		return this.x - this.y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	
}
