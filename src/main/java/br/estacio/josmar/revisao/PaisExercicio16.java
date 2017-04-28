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
public class PaisExercicio16 {
    private String nome, capital;
	private double dimensao;
	private PaisExercicio16[] fronteiras;

	public PaisExercicio16(String nome, String capital, double dimensao) {
		this.nome = nome;
		this.capital = capital;
		this.dimensao = dimensao;
	}

	
	public boolean equals(PaisExercicio16 outro) {
		return this.nome.equals(outro.getNome())
				&& this.capital.equals(outro.getCapital());
	}

	public void setFronteiras(PaisExercicio16... paises) {
		
		int quantidadePaisesIguais = 0;
		for(int i = 0; i < paises.length; i++) {
			if(this.equals(paises[i])) {
				quantidadePaisesIguais++;
			}
		}
		
		this.fronteiras = new PaisExercicio16[paises.length - quantidadePaisesIguais];
		int idxFronteira = 0;
		for(int i = 0; i < paises.length; i++) {
			if(!this.equals(paises[i])) {
				this.fronteiras[idxFronteira] = paises[i];
				idxFronteira++;
			}
		}
		
	}
	
	public PaisExercicio16[] getFronteiras() {
		return this.fronteiras;
	}
	
	public PaisExercicio16[] vizinhosEmComum(PaisExercicio16 outro) {
		int totaisIguais = 0;
		for(PaisExercicio16 fronteiraPais: this.fronteiras) {
			for(PaisExercicio16 fronteiraOutro: outro.fronteiras) {
				if(fronteiraPais.equals(fronteiraOutro)) {
					totaisIguais++;
				}
			}
		}
		
		if(totaisIguais > 0) {
			int idxVizinhos = 0;
			PaisExercicio16[] mesmosVizinhos = new PaisExercicio16[totaisIguais];
			for(PaisExercicio16 fronteiraPais: this.fronteiras) {
				for(PaisExercicio16 fronteiraOutro: outro.fronteiras) {
					if(fronteiraPais.equals(fronteiraOutro)) {
						mesmosVizinhos[idxVizinhos] = fronteiraOutro;
						idxVizinhos++;
					}
				}
			}
			
			return mesmosVizinhos;
		}
		
		return null;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public double getDimensao() {
		return dimensao;
	}

	public void setDimensao(double dimensao) {
		this.dimensao = dimensao;
	}

}        
