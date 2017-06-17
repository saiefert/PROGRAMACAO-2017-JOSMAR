/*
 * Crie uma classe java MaiorNumero que contenha um método que receba dois
 * números inteiros e imprima o maior entre eles.
 */
package br.estacio.josmar.listaDois.programacao;

/**
 *
 * @author josmar
 */
public class maiorNumeroExercicio09 {
 
 	private int num1;
 	private int num2;
 
 	public int getNum1() {
 		return num1;
 	}
 
 	public void setNum1(int num1) {
 		this.num1 = num1;
 	}
 
 	public int getNum2() {
 		return num2;
 	}
 
 	public void setNum2(int num2) {
 		this.num2 = num2;
 	}
 
    public int num(int num1, int num2) {
 		if (num1 > num2) {
                    return num1;
                }else{
                    return num2;
                }
    }
 }