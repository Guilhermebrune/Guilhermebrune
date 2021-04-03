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
public class PedidoHasProduto {
    private int idpedido;
    private int idproduto;
    private String observacao;
    private char situacao;

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    public int getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(int idproduto) {
        this.idproduto = idproduto;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public char getSituacao() {
        return situacao;
    }

    public void setSituacao(char situacao) {
        this.situacao = situacao;
    }
    
}
