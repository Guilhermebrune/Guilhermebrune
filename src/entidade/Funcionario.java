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
public class Funcionario {
    private int id;
    private String cargo;
    private String senha;
    private String dataadmissao;
    private int pessoas_idpessoas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDataadmissao() {
        return dataadmissao;
    }

    public void setDataadmissao(String dataadmissao) {
        this.dataadmissao = dataadmissao;
    }

    public int getPessoas_idpessoas() {
        return pessoas_idpessoas;
    }

    public void setPessoas_idpessoas(int pessoas_idpessoas) {
        this.pessoas_idpessoas = pessoas_idpessoas;
    }
}

