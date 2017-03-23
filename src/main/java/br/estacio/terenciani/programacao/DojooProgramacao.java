/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.terenciani.programacao;

import javax.swing.JOptionPane;

/**
 *
 * @author josmar
 */
public class DojooProgramacao {
  /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Object[] vetorDeCidades = new Object[5];
        String cidadeDigitada; 
        
        for(int i=0; i<5;i++){
         cidadeDigitada = JOptionPane.showInputDialog(null, "Digite uma cidade");
            vetorDeCidades[i] = cidadeDigitada;
            
            System.out.println(vetorDeCidades[i]);
            
        }
        Object posicao = JOptionPane.showInputDialog(null, "Selecione uma"
                    + " cidade ", "Opções de cidade" , 
                    JOptionPane.INFORMATION_MESSAGE,
                    null,vetorDeCidades, vetorDeCidades[0]);
            
        JOptionPane.showMessageDialog(null, posicao);
           
        
        
    }
    
}

