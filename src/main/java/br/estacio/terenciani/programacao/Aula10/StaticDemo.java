/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.terenciani.programacao.Aula10;

/**
 *
 * @author josmar
 */
public class StaticDemo {
    static int count = 0;
    private String nome;
    
    void incrementa(){
        count++;
    }
    
    void setNome (String nomeParametro){
        nome = nomeParametro;
    }
    
    public String getNome(){
        return nome;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StaticDemo objeto1 = new StaticDemo();
        StaticDemo objeto2 = new StaticDemo();
        
        objeto1.setNome("Josmar");
        objeto1.incrementa();
        
        objeto2.setNome("Saiefert");
        objeto2.incrementa();
        
        System.out.println("Objeto 1 count: " + objeto1.count);
        System.out.println("Objeto 2 count " + objeto2.count);
        
        System.out.println("Objeto 1 count " + objeto1.getNome());
        System.out.println("Objeto 2 count " + objeto2.getNome());
    }
    
}
