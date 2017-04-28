/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.josmar.revisao;
import javax.swing.JOptionPane;

/**
 *
 * @author josmar
 */
public class Exercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Object[] vetorCidades = new Object[5];
         String cidade;
         
         for(int i=0;i<5;i++){
             cidade=JOptionPane.showInputDialog("Digite uma Cidade");
             if(cidade==null){
                 JOptionPane.showMessageDialog(null,"Você Cancelou!");
                 System.exit(0);             
             }else if(cidade.equals("")){
                 JOptionPane.showMessageDialog(null,"Digite ou Cancele!",
                         "Erro", JOptionPane.ERROR_MESSAGE);
                 i--;       
             }else{
                 vetorCidades[i]=cidade;
             }
                 
         }
         Object posicao = JOptionPane.showInputDialog(null, "Selecione uma"
                     + " cidade ", "Opções de cidade" , 
                     JOptionPane.INFORMATION_MESSAGE,
                     null,vetorCidades, vetorCidades[0]);
             
         JOptionPane.showMessageDialog(null, "Você selecionou " + posicao + "!");
    }
    
}