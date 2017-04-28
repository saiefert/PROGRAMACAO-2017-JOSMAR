/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.josmar.revisao;

/**
 *
 * @author josmar
 */
public class PrincipalPaisExercicio16 {
	
	public static void main(String[] args) {
	
		PaisExercicio16 brasil = new PaisExercicio16("Brasil", "Brasilia", 8515767.049);
		PaisExercicio16 bolivia = new PaisExercicio16("Bolivia", "Sucre", 1098581);
		PaisExercicio16 chile = new PaisExercicio16("Chile", "Santiago", 756950);
		PaisExercicio16 colombia = new PaisExercicio16("Colombia", "Bogotá", 1138914);
		
		System.out.println("\n");
		System.out.println(brasil.equals(brasil));
		System.out.println(brasil.equals(bolivia));
		System.out.println(chile.equals(chile));
		
		brasil.setFronteiras(bolivia, colombia);
		bolivia.setFronteiras(brasil, chile);
		chile.setFronteiras(bolivia, chile);
		colombia.setFronteiras(brasil);
		
		System.out.println("\n");
		imprimeFronteira(brasil.getFronteiras());
		imprimeFronteira(bolivia.getFronteiras());
		imprimeFronteira(chile.getFronteiras());
		imprimeFronteira(colombia.getFronteiras());
		
		System.out.println("\n");
		imprimeFronteira(brasil.vizinhosEmComum(chile));
		imprimeFronteira(colombia.vizinhosEmComum(bolivia));
	}	
	
	private static void imprimeFronteira(PaisExercicio16[] paises) {
		for(PaisExercicio16 pais : paises) {
			System.out.print(pais.getNome() + " ");
		}
		System.out.println();
	}
}
