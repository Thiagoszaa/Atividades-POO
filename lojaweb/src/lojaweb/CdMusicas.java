/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lojaweb;

/**
 *
 * @author Thiago
 */
public class CdMusicas extends Produto {
    
    private String nomeAlbum = " ";
    private String banda = " ";
    private String cantor = " ";
    private String generoMusical = " ";
    private float preco = 0 ;  

    public CdMusicas(String nomeAlbum, String banda, String cantor, String generoMusical, float preco) {
        this.nomeAlbum = nomeAlbum;
        this.banda = banda;
        this.cantor = cantor;
        this.generoMusical = generoMusical;
        this.preco = preco;
    }

    public CdMusicas(String nomeAlbum, String banda, String cantor, String generoMusical, int codigo, float preco) {
        super(codigo);
        this.nomeAlbum = nomeAlbum;
        this.banda = banda;
        this.cantor = cantor;
        this.generoMusical = generoMusical;
        this.preco = preco;
    }

    // Getters e Setters
    public String getNomeAlbum() {
        return nomeAlbum;
    }

    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    
    @Override
    String descricaoCompleta() {
        return "Álbum: " + nomeAlbum + ", Banda: " + banda + ", Cantor: " + cantor + ", Gênero: " + generoMusical;
    }

    @Override
    float precoProduto() {
        return preco;
    }

    @Override
    String tipoProduto() {
        return "Música";
    }

    @Override
    public String toString() {
        return "CdMusicas{" + "nomeAlbum=" + nomeAlbum + ", banda=" + banda + ", cantor=" + cantor + ", generoMusical=" + generoMusical + ", preco=" + preco + '}';
    }
    
    
}