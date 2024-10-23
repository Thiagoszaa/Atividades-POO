/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package lojaweb;


/**
 *
 * @author Thiago
 */
public class Livro extends Produto {
    
    private String titulo = " ";
    private String tradutor = " ";
    private String editora = " ";
    private int anopublicacao = 0;
    private float preco = 0;  


    public Livro(String titulo, String tradutor, String editora, int anopublicacao, float preco) {
        this.titulo = titulo;
        this.tradutor = tradutor;
        this.editora = editora;
        this.anopublicacao = anopublicacao;
        this.preco = preco;
    }

    public Livro(String titulo, String tradutor, String editora, int anopublicacao, int codigo, float preco) {
        super(codigo);
        this.titulo = titulo;
        this.tradutor = tradutor;
        this.editora = editora;
        this.anopublicacao = anopublicacao;
        this.preco = preco;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTradutor() {
        return tradutor;
    }

    public void setTradutor(String tradutor) {
        this.tradutor = tradutor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnopublicacao() {
        return anopublicacao;
    }

    public void setAnopublicacao(int anopublicacao) {
        this.anopublicacao = anopublicacao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    
    @Override
    String descricaoCompleta() {
        return "Título: " + titulo + ", Tradutor: " + tradutor + ", Editora: " + editora + ", Ano de Publicação: " + anopublicacao;
    }

    @Override
    float precoProduto() {
        return 12.0f;
    }

    @Override
    String tipoProduto() {
        return "Livro";
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", tradutor=" + tradutor + ", editora=" + editora + ", anopublicacao=" + anopublicacao + ", preco=" + preco + '}';
    }
}
