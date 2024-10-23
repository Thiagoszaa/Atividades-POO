/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contgyn;

/**
 *
 * @author Thiago
 */

public class PessoaJuridica extends Pessoa{
    private int cnpj= 0;
    private String razaoSocial = "";
    private int inscricaoEstadual = 0;
    private String url = "";
    private float faturamentoBruto = 0;
 
    public PessoaJuridica(int cnpj, String razaoSocial, int inscricaoEstadual, String url, float faturamentoBruto) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.inscricaoEstadual = inscricaoEstadual;
        this.url = url;
        this.faturamentoBruto = faturamentoBruto;
    }
 
    public PessoaJuridica(int cnpj, String razaoSocial, int inscricaoEstadual, String url, float faturamentoBruto, String nome, String endereco, String email, int telefone, int codigo) {
        super(nome, endereco, email, telefone, codigo);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.inscricaoEstadual = inscricaoEstadual;
        this.url = url;
        this.faturamentoBruto = faturamentoBruto;
    }
 
    public int getCnpj() {
        return cnpj;
    }
 
    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
 
    public String getRazaoSocial() {
        return razaoSocial;
    }
 
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
 
    public int getInscricaoEstadual() {
        return inscricaoEstadual;
    }
 
    public void setInscricaoEstadual(int inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
 
    public String getUrl() {
        return url;
    }
 
    public void setUrl(String url) {
        this.url = url;
    }
 
    public float getFaturamentoBruto() {
        return faturamentoBruto;
    }
 
    public void setFaturamentoBruto(float faturamentoBruto) {
        this.faturamentoBruto = faturamentoBruto;
    }
 
    @Override
    float calcularImposto() {
        return (float) ((float)faturamentoBruto * 0.20);
    }
 
    @Override
    public String toString() {
        return "PessoaJuridica{" + "cnpj=" + cnpj + ", razaoSocial=" + razaoSocial + ", inscricaoEstadual=" + inscricaoEstadual + ", url=" + url + ", faturamentoBruto=" + faturamentoBruto + '}';
    }

}