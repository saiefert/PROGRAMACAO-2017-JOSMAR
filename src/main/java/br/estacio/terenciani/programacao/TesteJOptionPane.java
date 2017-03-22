/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.terenciani.programacao;
import javax.swing.JOptionPane;
/**
 *
 * @author aluno
 */
public class TesteJOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome");
        //System.out.println(retorno);
        String sobrenome = JOptionPane.showInputDialog(null, "Digite seu sobrenome" );
        JOptionPane.showMessageDialog(null, nome +" "+ sobrenome+"!"
        , "Nome Completo", JOptionPane.INFORMATION_MESSAGE);
        
        int opcao = JOptionPane.showConfirmDialog(null,"Deseja realmente sair?", "Logout",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(opcao==0){
            JOptionPane.showMessageDialog(null,"Logout efetuando com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "Você cancelou seu logout");
        }
       
    }
    
}
