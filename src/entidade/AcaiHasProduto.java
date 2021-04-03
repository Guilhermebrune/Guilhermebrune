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
public class AcaiHasProduto {
    
    private int idacai;
    private int idProduto;
    private String observacao;    

    public int getIdacai() {
        return idacai;
    }

    public void setIdacai(int idacai) {
        this.idacai = idacai;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
