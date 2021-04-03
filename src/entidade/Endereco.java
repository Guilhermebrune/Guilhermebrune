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
public class Endereco {
    private int idEndereco;
    private String logradouro;
    private int numero;
    private String complemento;
    private int IdTipoComplemento;
    private String cep;
    private int idTipoComplemento;

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getIdTipoComplemento() {
        return IdTipoComplemento;
    }

    public void setIdTipoComplemento(int IdTipoComplemento) {
        this.IdTipoComplemento = IdTipoComplemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getTipoComplemento() {
        return idTipoComplemento;
    }

    public void setTipoComplemento(int idTipoComplemento) {
        this.idTipoComplemento = idTipoComplemento;
    }
}
