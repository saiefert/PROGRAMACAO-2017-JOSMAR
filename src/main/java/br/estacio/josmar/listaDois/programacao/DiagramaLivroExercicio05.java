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
public class DiagramaLivroExercicio05 {
 
 	private String nome;
 	private DiagramaAutorExercicio05 autor;
 	private double preco;
 	private int estoque;
 	 
 	public DiagramaLivroExercicio05(String nome, DiagramaAutorExercicio05 autor, double preco, int estoque) {
            this.nome = nome;
            this.autor = autor;
            this.preco = preco;
            this.estoque = estoque;
 	} 
 	public String getNome() {
 		return nome;
 	} 
 	public void setNome(String nome) {
 		this.nome = nome;
 	} 
 	public DiagramaAutorExercicio05 getDiagramaAutorExercicio05() {
 		return autor;
 	} 
 	public void setDiagramaAutorExercicio05(DiagramaAutorExercicio05 autor) {
 		this.autor = autor;
 	}
        public int getEstoque() {
 		return estoque;
 	} 
 	public void setEstoque(int estoque) {
 		this.estoque = estoque;
 	}        
 	public double getPreco() {
 		return preco;
 	} 
 	public void setPreco(double preco) {
 		this.preco = preco;
 	}
  	@Override
 	public String toString() {
 	return "Autor: " + this.nome + 
        "Preço: " + this.preco + 
        "Quantidade:  " + this.estoque;
 	} 
 }