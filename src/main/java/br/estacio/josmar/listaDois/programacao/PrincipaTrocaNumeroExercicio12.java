/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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