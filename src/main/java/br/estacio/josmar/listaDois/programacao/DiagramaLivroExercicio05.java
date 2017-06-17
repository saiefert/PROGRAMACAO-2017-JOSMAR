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