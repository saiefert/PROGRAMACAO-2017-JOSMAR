/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.josmar.revisao;

/**
 *
 * @author josmar
 */
public class TimeFutebolExercicio13 {
   private String nome;
    private String presidente;
    private String cores;
    private String jogadores;
    private String estadio;
    private String ct;
    private double renda;
    private String titulos;
    private String tecnico;
    
    public String getNome(){
        return nome;
    }
    public String getPresidente(){
        return presidente;
    }
    public String getTecnico(){
        return tecnico;
    }
    public double getRenda(){
        return renda;
    }
    
    public void nomeNome (String nomeParametro){
        nome = nomeParametro;
    }
    void rendaRenda (double rendaParametro){
        renda = rendaParametro;        
    }
    void presidentePresidente (String presidenteParametro){
        presidente = presidenteParametro;
    }
    void tecnicoTecnico (String tecnicoParametro){
        tecnico = tecnicoParametro;
    }
}
