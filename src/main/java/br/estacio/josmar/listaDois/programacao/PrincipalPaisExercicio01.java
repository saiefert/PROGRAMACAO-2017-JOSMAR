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
public class PrincipalPaisExercicio01 {
	
	public static void main(String[] args) {
	
		PaisExercicio01 brasil = new PaisExercicio01("Brasil", "Brasilia", 8515767.049);
		PaisExercicio01 bolivia = new PaisExercicio01("Bolivia", "Sucre", 1098581);
		PaisExercicio01 chile = new PaisExercicio01("Chile", "Santiago", 756950);
		PaisExercicio01 colombia = new PaisExercicio01("Colombia", "Bogotá", 1138914);
		
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
	
	private static void imprimeFronteira(PaisExercicio01[] paises) {
		for(PaisExercicio01 pais : paises) {
			System.out.print(pais.getNome() + " ");
		}
		System.out.println();
	}
}
