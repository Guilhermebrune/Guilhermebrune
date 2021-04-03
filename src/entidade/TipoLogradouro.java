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
public class TipoLogradouro {
    private int idTipoLogradouro;
    private String nome;
    private String descricao;

    public int getIdTipoLogradouro() {
        return idTipoLogradouro;
    }

    public void setIdTipoLogradouro(int idTipoLogradouro) {
        this.idTipoLogradouro = idTipoLogradouro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
