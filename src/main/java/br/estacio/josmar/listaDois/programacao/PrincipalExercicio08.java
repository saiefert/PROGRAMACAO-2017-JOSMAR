/*
* Crie uma classe chamada Endereco que possua uma String rua e outra cep. Use o
* conceito de Encapsulamento para armazenar o valor de um cep de forma que a
* String que corresponda ao número do cep fique sempre no formato: “XXXXX-
* XXX” onde X representa um número de 0 a 9.
 */
package br.estacio.josmar.listaDois.programacao;

/**
 *
 * @author josmar
 */
public class PrincipalExercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
 		EnderecoExercicio08 endereco =  new EnderecoExercicio08();
 		
 		endereco.FormaCep(79086430);
 		System.out.println(endereco.getCep());
 	}
 	
 }
