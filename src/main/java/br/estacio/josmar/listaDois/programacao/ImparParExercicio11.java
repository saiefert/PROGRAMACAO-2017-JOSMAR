/*
 * Escreva um programa que imprima na tela a soma dos números ímpares entre 0
 * e 30 e a multiplicação dos números pares entre 0 e 30.
 */
package br.estacio.josmar.listaDois.programacao;

/**
 *
 * @author josmar
 */
public class ImparParExercicio11 {

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