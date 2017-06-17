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
