/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.model;

/**
 *
 * @author igor
 */
public class Aluno {

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the rga
     */
    public String getRga() {
        return rga;
    }

    /**
     * @param rga the rga to set
     */
    public void setRga(String rga) {
        this.rga = rga;
    }

    /**
     * @return the cod_disc
     */
    public int getCod_disc() {
        return cod_disc;
    }

    /**
     * @param cod_disc the cod_disc to set
     */
    public void setCod_disc(int cod_disc) {
        this.cod_disc = cod_disc;
    }
    private int codigo;
    private String nome;
    private String rga;
    private int cod_disc;
}
