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
public class Pedido {
private int idPedido;
private String data;
private String hora;
private String observacao;
private int idPessoa;
private String tipoEtrega;
private String valor;
private char situação;

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getTipoEtrega() {
        return tipoEtrega;
    }

    public void setTipoEtrega(String tipoEtrega) {
        this.tipoEtrega = tipoEtrega;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public char getSituação() {
        return situação;
    }

    public void setSituação(char situação) {
        this.situação = situação;
    }
}
