 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.Categoria;
import java.sql.*;

/**
 *
 * @author guilherme
 */
public class CategoriaDAO {
    
    public boolean salvar (Categoria categoria){
       /* Salvar */
        try {
            Statement st = acai_go.Acai_Go.conexao.createStatement();
            String sql = "INSERT INTO categoria VALUES "
                    +"(DEFAULT,"
                    +"'"+ categoria.getNomeCategoria() + "',"
                    +"'"+ categoria.getSituacao() + "')";
            
            System.out.println(sql);
            
            int resultado = st.executeUpdate(sql);
            
            return true;
        } catch (Exception e) {
            System.out.println("Erro salvar Categoria  = " +e);
             return false;
        }
   		
       
    }
    
    public boolean atualizar (Categoria categoria){
        return true;
    }
    
    
    
} 
