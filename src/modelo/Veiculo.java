/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author pedro
 */
public class Veiculo {
    private int idVeiculo;
    private String modeloVeiculo;
    private int valorAluguel;
    private int quantidadeModeloVeiculo;

    public Veiculo () {}
    
    public Veiculo(int idVeiculo, String modeloVeiculo, int valorAluguel, int quantidadeModeloVeiculo) {
        this.idVeiculo = idVeiculo;
        this.modeloVeiculo = modeloVeiculo;
        this.valorAluguel = valorAluguel;
        this.quantidadeModeloVeiculo = quantidadeModeloVeiculo;
    }

   
    
    
    
    

    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public int getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(int valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public int getQuantidadeModeloVeiculo() {
        return quantidadeModeloVeiculo;
    }

    public void setQuantidadeModeloVeiculo(int quantidadeModeloVeiculo) {
        this.quantidadeModeloVeiculo = quantidadeModeloVeiculo;
    }
    
    
    
}
