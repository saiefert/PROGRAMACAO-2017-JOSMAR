/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 
    public int contador(int num1, int num2) {
 		if (num1 > num2) {
                    return num1;
                }else{
                    return num2;
                }
    }
 }