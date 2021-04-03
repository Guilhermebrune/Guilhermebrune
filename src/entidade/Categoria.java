/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author guilherme
 */
public class Categoria {
    private int idCategoria;
    private String nomeCategoria;
    private char situacao;

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public char getSituacao() {
        return situacao;
    }

    public void setSituacao(char situacao) {
        this.situacao = situacao;
    }
}
