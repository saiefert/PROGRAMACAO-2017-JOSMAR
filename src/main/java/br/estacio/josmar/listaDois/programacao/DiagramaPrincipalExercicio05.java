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
public class DiagramaPrincipalExercicio05 {
 	
 	public static void main(String[] args) {
 		DiagramaAutorExercicio05 autor;
                autor = new DiagramaAutorExercicio05
                ("Josmar Saiefert", "josmar.saiefert@gmail.com", "Masculino");
 
 		DiagramaLivroExercicio05 livro;
                livro = new DiagramaLivroExercicio05("Livro ", autor, 10.00, 1);
 		System.out.println("\n");
 		System.out.println(livro.getDiagramaAutorExercicio05().toString());
 	}
  }
