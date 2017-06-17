/*
 * Crie uma classe java TrocaNumero que contenha um método que receba dois
 * números NumA e NumB, nessa ordem, e imprima em ordem inversa, isto é, se os
 * dados lidos forem NumA = 5 e NumB = 9, por exemplo, devem ser impressos na
 * ordem NumA = 9 e NumB = 5
 */
package br.estacio.josmar.listaDois.programacao;

import java.util.Scanner;

/**
 *
 * @author josmar
 */
public class PrincipaTrocaNumeroExercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
 	TrocaNumeroExercicio12 numero = new TrocaNumeroExercicio12();
 	Scanner sc = new Scanner(System.in);
 		
 	System.out.println("Numero um: ");
 	int num1 = sc.nextInt();
 		
 	System.out.println("Numero dois: ");
 	int num2 = sc.nextInt();
 		
 	numero.num3(num1, num2);
 	sc.close();
 		
    }
}