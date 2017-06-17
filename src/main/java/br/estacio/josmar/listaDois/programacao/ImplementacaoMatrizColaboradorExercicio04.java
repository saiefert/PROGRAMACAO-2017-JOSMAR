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
public class ImplementacaoMatrizColaboradorExercicio04 {

 	private String nome;
 	private String cargo;
 	private ImplementacaoMatrizColaboradorExercicio04 superior;
 
 	public String getNome() {
 		return nome;
 	}
 
 	public void setNome(String nome) {
 		this.nome = nome;
 	}
 
 	public String getCargo() {
 		return cargo;
 	}
 
 	public void setCargo(String cargo) {
 		this.cargo = cargo;
 	}
 
 	@Override
 	public String toString() {
 
 		return "Colaborador: " + this.nome + ", Cargo: " + this.cargo;
 	}
 
 }