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
public class ImparParExercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int x = 0, impar=0, i;
    float par = 0;
    
    for(i=0; i<30; i++){
        if(i%2==0){
	if(i>2){
	par = par*i;
	}
        else{
	par = i;
	}
}
        else{
        impar = impar+i;
        }
    }
        System.out.printf("A soma dos impares é: %d", impar);
        System.out.printf("\nA Multiplicação dos pares é: %.2f", par);
    }
}