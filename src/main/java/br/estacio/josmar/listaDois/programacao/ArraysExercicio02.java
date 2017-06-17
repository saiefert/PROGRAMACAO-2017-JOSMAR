/*
 * Implementação da classe Arrays
 */
package br.estacio.josmar.listaDois.programacao;

/**
 *
 * @author josmar
 */
public class ArraysExercicio02 {
        
    int[] inteiros;
    
    public int[] getInt() {
        return inteiros;
 	}
    public void setInt(int[] inteiros) {
        this.inteiros = inteiros;
 	}
        
    public void numeros(int num1, int num2) {
        inteiros[num1] = num2;
        }        
    public void contador(int contador) {
 		inteiros = new int[contador];
 	} 	
    public int soma() {
 	int total = 0;
 	for (int j = 0; j < inteiros.length; j++) {
 	total = total + inteiros[j];
 	}
 	return total;
 	} 
}
