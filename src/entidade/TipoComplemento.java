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
public class TipoComplemento {
    private int idTipoComplemento;
    private String nome;
    private String descricao;

    public int getIdTipoComplemento() {
        return idTipoComplemento;
    }

    public void setIdTipoComplemento(int idTipoComplemento) {
        this.idTipoComplemento = idTipoComplemento;
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
