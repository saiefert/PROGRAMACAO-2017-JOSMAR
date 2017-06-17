/*
 * Escreva uma classe que represente um país. Um país tem como atributos o seu
 * nome, o nome da capital, sua dimensão em Km 2 e uma lista de países com os quais
 * ele faz fronteira. Represente a classe e forneça os seguintes construtores e método:
 * a) Construtor que inicialize o nome, capital e a dimensão do país;
 * b) Métodos de acesso (obter/get) para as propriedades indicadas no item (a);
 * c) Um método que permita verificar se dois países são iguais. Dois países são iguais se
 * tiverem o mesmo nome e a mesma capital. A assinatura deste método deve ser:
 * d) public boolean equals(final Pais outro);
 * e) Um método que define quais outros países fazem fronteira (note que um país não pode
 * fazer fronteira com ele mesmo);
 * f) Um método que retorne a lista de países que fazem fronteira;
 * g) Um método que receba um outro país como parâmetro e retorne uma lista de vizinhos
 * comuns aos dois países.
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
