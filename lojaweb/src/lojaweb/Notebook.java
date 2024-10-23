/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lojaweb;

/**
 *
 * @author Thiago
 */

public class Notebook extends Produto {
    
    private String nome = " ";
    private String modelo = " ";
    private String memoriaRam = " ";
    private String capacidadeSsdHd = " ";
    private String processador = " ";
    private String tamanhoTela = " ";
    private String sistemaOperacional = " ";
    private float preco = 0;  

    
    public Notebook(String nome, String modelo, String memoriaRam, String capacidadeSsdHd, String processador, String tamanhoTela, String sistemaOperacional, float preco) {
        this.nome = nome;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.capacidadeSsdHd = capacidadeSsdHd;
        this.processador = processador;
        this.tamanhoTela = tamanhoTela;
        this.sistemaOperacional = sistemaOperacional;
        this.preco = preco;
    }

    public Notebook(String nome, String modelo, String memoriaRam, String capacidadeSsdHd, String processador, String tamanhoTela, String sistemaOperacional, int codigo, float preco) {
        super(codigo);
        this.nome = nome;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.capacidadeSsdHd = capacidadeSsdHd;
        this.processador = processador;
        this.tamanhoTela = tamanhoTela;
        this.sistemaOperacional = sistemaOperacional;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getCapacidadeSsdHd() {
        return capacidadeSsdHd;
    }

    public void setCapacidadeSsdHd(String capacidadeSsdHd) {
        this.capacidadeSsdHd = capacidadeSsdHd;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(String tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

   
    @Override
    String descricaoCompleta() {
        return "Notebook " + nome + " - Modelo: " + modelo + ", RAM: " + memoriaRam + ", Armazenamento: " + capacidadeSsdHd 
                + ", Processador: " + processador + ", Tela: " + tamanhoTela + ", SO: " + sistemaOperacional;
    }

    @Override
    float precoProduto() {
        return preco;
    }

    @Override
    String tipoProduto() {
        return "Notebook";
    }

   
    @Override
    public String toString() {
        return "Notebook{" + "nome=" + nome + ", modelo=" + modelo + ", memoriaRam=" + memoriaRam + ", capacidadeSsdHd=" + capacidadeSsdHd + 
                ", processador=" + processador + ", tamanhoTela=" + tamanhoTela + ", sistemaOperacional=" + sistemaOperacional + ", preco=" + preco + '}';
    }
}
