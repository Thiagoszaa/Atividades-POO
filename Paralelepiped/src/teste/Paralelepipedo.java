/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

/**
 *
 * @author Thiago
 */
public class Paralelepipedo {
    
    public Paralelepipedo (){
        this.altura = 0.0f;
        this.largura = 0.0f;
        this.comprimento = 0.0f;
                
    }
    
    public Paralelepipedo(float altura, float largura, float comprimento){
        this.altura = altura;
        this.comprimento = comprimento;
        this.largura = largura; 
    }
    
   private float altura;
   private float largura ;
   private float comprimento;

    public float getaltura() {
        return altura;
    }

    public void setaltura(float altura) {
        this.altura = altura;
    }

    public float getlargura() {
        return largura;
    }

    public void setlargura(float largura) {
        this.largura = largura;
    }

    public float getcomprimento() {
        return comprimento;
    }

    public void setcomprimento(float comprimento) {
        this.comprimento = comprimento;
    }
    
   public float calcularVolume(){
        return altura *  comprimento * largura;
    }
   public float calcularArea(){
       return 2 *(altura * largura + altura * comprimento + largura * comprimento);
   }

 
   }
