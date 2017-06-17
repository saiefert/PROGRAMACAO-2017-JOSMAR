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
public class EnderecoExercicio08 {
	
        private String cep;
	private String rua;
	
        public String getCep() {
 		return cep;
 	}
 	public void setCep(String cep) {
 		this.cep = cep;
 	}
 	
 	public String getRua() {
 		return rua;
 	}
 	public void setRua(String rua) {
 		this.rua = rua;
 	}
 	 	
 	public void FormaCep(int cep){
 		String stringCep = cep + "";
 		String PrimeiraSeparacao;
                PrimeiraSeparacao = stringCep.substring(0,5);
 		String UltimaSeparacao;
                UltimaSeparacao = stringCep.substring(5, 8);
 		this.cep = PrimeiraSeparacao + "-" + UltimaSeparacao;
 	}
 }
