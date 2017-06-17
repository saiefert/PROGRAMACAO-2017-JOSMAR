/*
 * Crie uma classe java NumeroDecrescente que contenha um método que receba
 * um número inteiro e imprima, em ordem decrescente, o valor do número até 0.
 */
package br.estacio.josmar.listaDois.programacao;

/**
 *
 * @author josmar
 */
public class NumeroDecrescenteExercicio10 {

 	private final int numero;
 	
 	public NumeroDecrescenteExercicio10(int numero){
 		this.numero = numero;
 	}
 	
 	public void printNumero(){
 		int descNum = numero + 1;
 		for(int j = numero; j >=0; j--){
 			descNum = descNum - 1;
 			System.out.println(descNum);
 		}
 	}
 
 }