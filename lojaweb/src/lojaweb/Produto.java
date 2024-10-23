/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lojaweb;

/**
 *
 * @author Thiago
 */
public abstract class Produto {
    
    protected int codigo;
    
    public Produto(){
        
    }

     public Produto(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    abstract String descricaoCompleta();
    abstract float precoProduto();
    abstract String tipoProduto();
    
}
