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
