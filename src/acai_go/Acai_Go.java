   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acai_go;

import java.sql.*;
import javax.swing.JOptionPane;
import tela.FrmPrincipal;

/**
 *
 * @author guilherme
 */
public class Acai_Go {

    /**
     */
    
    public static Connection conexao;
    
    public static void main(String[] args) {
        // TODO code application logic here
   
        if(abrirConexao()){
            new FrmPrincipal().setVisible(true);
        } else {
                    JOptionPane.showMessageDialog(null,"falha");
                    }
        }
    
    
        public static boolean abrirConexao() {
            
         try {
            String dbdriver = "org.postgresql.Driver";
            String dburl = "jdbc:postgresql://localhost:5432/AcaiGo";
            String dbuser = "postgres";
            String dbsenha = "postgres";

            // Carrega Driver do Banco de Dados
            Class.forName(dbdriver);

            if (dbuser.length() != 0) // conexão COM usuário e senha
            {
                conexao = DriverManager.getConnection(dburl, dbuser, dbsenha);
            } else // conexão SEM usuário e senha
            {
                conexao = DriverManager.getConnection(dburl);
            }

            return true;

        } catch (Exception e) {
            System.err.println("Erro ao tentar conectar: " + e);
            return false;
        }

/* Salvar 

        try {
            Statement st = XXX.conexao.createStatement();
            int resultado = st.executeUpdate("INSERT INTO XXX VALUES (DEFAULT, XXX-DADOS");
            
        } catch (Exception e) {
            System.out.println("Erro salvar xxx = " +e);
        }
		
		
/* Listar 

        try {
            Statement st = XXX.conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM XXX");
            
            if (resultado.isBeforeFirst()) {
                while (resultado.next()) {
		      // captura dados do ResultSet
		      resultado.getInt("xxx-campo");
		      resultado.getString("xxx-campo");
                }
            }
        } catch (Exception e) {
            System.out.println("Erro consultar xxx = " +e);
        }
       */
        }
    
}
