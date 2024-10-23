/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visao;

/**
 *
 * @author Thiago
 */
public class Cilindro {
    
    public Cilindro(){
        this.raio = 1.0f;
        this.altura = 1.0f;
    }
    
    public Cilindro(float raio, float altura){
        this.raio = raio;
        this.altura = altura;
        
    }
    
    private float raio;
    private float altura;

    public float getraio() {
        return raio;
    }

    public void setraio(float raio) throws Exception {
        if(raio <= 0 ) throw new Exception("O Raio não pode se menor que  0");
        this.raio = raio;
    }

    public float getaltura() {
        return altura;
    }

    public void setaltura(float altura)  throws Exception {
        if(altura <= 0 ) throw new Exception("A altura não pode se menor que  0");
        this.altura = altura;
    }
    
    public float calcularAreaLateral(){
        return 2 * 3.1415f * raio * altura;
    }
    public float calcularAreaTotal(){
        return 2 * 3.1415f * raio * (altura + raio);            
    }
    public float calcularVolume(){
        return 3.1415f * raio * raio * altura;
    }
}
