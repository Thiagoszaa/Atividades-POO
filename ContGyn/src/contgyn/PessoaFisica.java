/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contgyn;

/**
 *
 * @author Thiago
 */
public class PessoaFisica extends Pessoa {
    private int cpf = 0;
    private int identidade = 0;
    private String sexo = "";
    private float rendaBruta = 0;
 
    public PessoaFisica(String sexo, int cpf, int identidade, int par2, String cpf_Example, String status) {
        this.cpf = cpf;
        this.identidade = identidade;
        this.sexo = sexo;
      
    }
 
    public PessoaFisica(int cpf, int identidade, String sexo, float rendaBruta, String nome, String endereco, String email, int telefone, int codigo) {
        super(nome, endereco, email, telefone, codigo);
        this.cpf = cpf;
        this.identidade = identidade;
        this.sexo = sexo;
        this.rendaBruta = rendaBruta;
    }
 
    public int getCpf() {
        return cpf;
    }
 
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
 
    public int getIdentidade() {
        return identidade;
    }
 
    public void setIdentidade(int identidade) {
        this.identidade = identidade;
    }
 
    public String getSexo() {
        return sexo;
    }
 
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
 
    public float getRendaBruta() {
        return rendaBruta;
    }
 
    public void setRendaBruta(float rendaBruta) {
        this.rendaBruta = rendaBruta;
    }
 
    @Override
    float calcularImposto() {
        if (rendaBruta < 1400) return 0;
        if (rendaBruta < 2100) return (float) ((float) rendaBruta * 0.10);
        if (rendaBruta < 2800) return (float) ((float) rendaBruta * 0.15);
        if (rendaBruta < 3600) return (float) ((float) rendaBruta * 0.25);
        else return (float) ((float)rendaBruta * 0.30);
    }
 
    @Override
    public String toString() {
        return "PessoaFisica{" + "cpf=" + cpf + ", identidade=" + identidade + ", sexo=" + sexo + ", rendaBruta=" + rendaBruta + '}';
    }
}