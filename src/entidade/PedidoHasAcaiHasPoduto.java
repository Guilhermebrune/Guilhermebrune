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
public class PedidoHasAcaiHasPoduto {
   
    private int idPedido;
    private int idAcai;
    private int idAcaiHasProduto;
    private String observacao; 

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdAcai() {
        return idAcai;
    }

    public void setIdAcai(int idAcai) {
        this.idAcai = idAcai;
    }

    public int getIdAcaiHasProduto() {
        return idAcaiHasProduto;
    }

    public void setIdAcaiHasProduto(int idAcaiHasProduto) {
        this.idAcaiHasProduto = idAcaiHasProduto;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
