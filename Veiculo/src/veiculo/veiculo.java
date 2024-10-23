/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veiculo;

/**
 *
 * @author Thiago
 */
public abstract class veiculo {
    protected String modelo = " ";
    protected String fabricante = " ";
    protected int ano = 0;

    public veiculo(String modelo, String fabricante, int ano) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.ano = ano;
    }

    public  abstract String ligar();
    public abstract String desligar();
    public abstract String mover();

    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    

    
    @Override
    public String toString() {
        return "Veículo [modelo=" + modelo + ", fabricante=" + fabricante + ", ano=" + ano + "]";
    }
}
