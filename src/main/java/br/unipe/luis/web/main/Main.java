package br.unipe.luis.web.main;

import javax.swing.JOptionPane;

import br.unipe.luis.web.service.Operacoes;

public class Main {

	public static void main(String[] args) {

		
		String num1 = JOptionPane.showInputDialog(null,"Informe o Número1: ");
		String num2 = JOptionPane.showInputDialog(null,"Informe o Número2: ");
		
		Operacoes op = new Operacoes(Double.parseDouble(num1),Double.parseDouble(num2));
		
		JOptionPane.showMessageDialog(null, String.valueOf(op.somar()));
		JOptionPane.showMessageDialog(null, String.valueOf(op.subtrair()));
		
	}

}
