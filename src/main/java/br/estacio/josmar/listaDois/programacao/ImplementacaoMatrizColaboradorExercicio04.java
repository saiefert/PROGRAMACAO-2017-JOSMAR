/*
 * Implementação da classe Matriz
 * Criar uma classe Funcionario com as variáveis de instância: nome, cargo e superior
 * (chefe)
 * Criar uma classe Empresa que contém um Array de funcionários
 * Criar um método “listarFuncionarios” que imprima todos os funcionários de uma
 * empresa
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