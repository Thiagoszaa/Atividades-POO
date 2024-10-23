/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contgyn;

/**
 *
 * @author Thiago
 */
abstract public class Pessoa {
    protected String nome = "";
    protected String endereco = "";
    protected String email = "";
    protected int telefone = 0;
    protected int codigo = 0;
 
    public Pessoa() {
    }
 
    public Pessoa(String nome, String endereco, String email, int telefone, int codigo) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.codigo = codigo;
    }
 
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public String getEndereco() {
        return endereco;
    }
 
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public int getTelefone() {
        return telefone;
    }
 
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
 
    public int getCodigo() {
        return codigo;
    }
 
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    abstract float calcularImposto();
}