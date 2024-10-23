/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lojaweb;

/**
 *
 * @author Thiago
 */

public class Tv extends Produto {
    private String modelo;
    private String marca;
    private String sistemaOperacional;
    private String tamanhoTela;
    private float preco;  

    public Tv(String modelo, String marca, String sistemaOperacional, String tamanhoTela, float preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.sistemaOperacional = sistemaOperacional;
        this.tamanhoTela = tamanhoTela;
        this.preco = preco;
    }

    public Tv(String modelo, String marca, String sistemaOperacional, String tamanhoTela, int codigo, float preco) {
        super(codigo);
        this.modelo = modelo;
        this.marca = marca;
        this.sistemaOperacional = sistemaOperacional;
        this.tamanhoTela = tamanhoTela;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(String tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    String descricaoCompleta() {
        return "TV " + marca + " - Modelo: " + modelo + ", Tela: " + tamanhoTela + ", Sistema Operacional: " + sistemaOperacional;
    }

    @Override
    float precoProduto() {
        return preco; 
    }

    @Override
    String tipoProduto() {
        return "Tv";
    }

    @Override
    public String toString() {
        return "Tv{" + "modelo=" + modelo + ", marca=" + marca + ", sistemaOperacional=" + sistemaOperacional + ", tamanhoTela=" + tamanhoTela + ", preco=" + preco + '}';
    }
}

