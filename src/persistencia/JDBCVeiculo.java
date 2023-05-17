/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.util.ArrayList;
import modelo.Veiculo; 
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author pedro
 */
public class JDBCVeiculo {
    
    Connection conexao;

    public JDBCVeiculo(Connection conexao) {
        this.conexao = conexao;
    }
    
    public void inserirVeiculo(Veiculo v){
        String sql = "insert into veiculo (idVeiculo, modeloVeiculo, valorAluguel, quantidadeModeloVeiculo) values (?, ?, ?, ?)";
        PreparedStatement ps;
        
        try{
            ps = this.conexao.prepareStatement(sql);
            ps.setInt(1, v.getIdVeiculo());
            ps.setString(2, v.getModeloVeiculo());
            ps.setInt(3, v.getValorAluguel());
            ps.setInt(4, v.getQuantidadeModeloVeiculo());
            ps.execute();
        } catch(SQLException e) {
            e.printStackTrace();
        }
        
    }   
    
    public ArrayList<Veiculo> listarVeiculo(){
        ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
        String sql = "select * from veiculo";
        
        try{
            Statement declaracao = conexao.createStatement();
            ResultSet resposta = declaracao.executeQuery(sql);
            
            while (resposta.next()){
                
                int idVeiculo = resposta.getInt("idVeiculo");
                String modeloVeiculo = resposta.getString("modeloVeiculo");
                int valorAluguel = resposta.getInt("valorAluguel");
                int quantidadeModeloVeiculo = resposta.getInt("quantidadeModeloVeiculo");
                
                Veiculo v = new Veiculo(idVeiculo, modeloVeiculo, valorAluguel, quantidadeModeloVeiculo);
                
                veiculos.add(v);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return veiculos;
    }
    
    public void apagarTudo(){
        String sql = "delete from veiculo";
        
        PreparedStatement ps;
        
        try{
            ps = this.conexao.prepareStatement(sql);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
