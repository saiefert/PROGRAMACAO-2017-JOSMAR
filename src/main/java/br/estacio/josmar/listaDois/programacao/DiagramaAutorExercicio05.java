/*
 * Criar um método main que leia os nomes e cargos dos funcionários do console.
 * Crie objetos Funcionario com cada um deles e armazene no vetor da classe empresa
 * Criar as duas classes e seu relacionamento
 * Criar uma classe separada para testes que cria uma instância de cada uma das classes
 * Note que para criar um livro é preciso criar um autor
 * Imprimir o nome do livro, preço e quantidade no estoque
 * Através da instância de livro, recuperar o autor e imprimir o seu nome, email e sexo
 */
package br.estacio.josmar.listaDois.programacao;

/**
 *
 * @author josmar
 */
public class DiagramaAutorExercicio05 {     
	private String nome;
 	private String email;
 	private String sexo;
 
public DiagramaAutorExercicio05(String nome, String email, String sexo) {
 	this.nome = nome;
 	this.email = email;
 	this.sexo = sexo;
 	}
 
 	public String getName() {
 		return nome;
 	}
 
 	public void setName(String name) {
 		this.nome = nome;
 	}
 
 	public String getEmail() {
 		return email;
 	}
 
 	public void setEmail(String email) {
 		this.email = email;
 	}
 
 	public String getSexo() {
 		return sexo;
 	}
 
 	public void setSexo(String sexo) {
 		this.sexo = sexo;
 	}
 
        @Override
  	public String toString() {
 	return "Autor:" + "" + this.nome + "\n" 
        + "Email: " + this.email + "\n"
        + "Sexo: " + this.sexo;
 	}
 	
 	
 
 }
