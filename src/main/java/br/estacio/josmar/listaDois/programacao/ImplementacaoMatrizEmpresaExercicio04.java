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
public class ImplementacaoMatrizEmpresaExercicio04 {
  
 
    public ImplementacaoMatrizEmpresaExercicio04[] arrayColaboradores; 	
 	
    public void mostrarColaboradores(){
 	if (arrayColaboradores != null){
 	for(int i = 0; i < arrayColaboradores.length; i++ ){
 	System.out.println(arrayColaboradores[i].toString());
 	}
            } 		
 	}
 	public void quantidade(int quantidade){
 		arrayColaboradores = new ImplementacaoMatrizEmpresaExercicio04[quantidade];
 		
 	}
 	public void adicionaColaborador(int posicao, ImplementacaoMatrizEmpresaExercicio04 colaborador){
 		arrayColaboradores[posicao] = colaborador;
 	}
 	
}
