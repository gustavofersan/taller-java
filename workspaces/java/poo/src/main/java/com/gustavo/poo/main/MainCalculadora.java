package com.gustavo.poo.main;

import com.gustavo.poo.bean.Calculadora;

public class MainCalculadora {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		System.out.println("Sumando 1 + 1");
		calc.sumar(1, 1);
		System.out.println("Resultado: " + calc.getResultado());
	}

}