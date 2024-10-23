/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visao;

/**
 *
 * @author Thiago
 */
public class Piramide {
    
    public Piramide (){
        this.altura = 0.0f;
        this.base = 0.0f;
    }
    
    public Piramide(float altura, float base){
        this.altura = altura;
        this.base = base;
    }
    
    private float altura;
    private float base;

    public float getaltura() {
        return altura;
    }

    public void setaltura(float altura) {
        this.altura = altura;
    }

    public float getbase() {
        return base;
    }

    public void setbase(float base) {
        this.base = base;
    }
    
    public float calcularVolume(){
        return (1.0f/3.0f * base * altura);
    }
    
}
