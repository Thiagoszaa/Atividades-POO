/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visao;

/**
 *
 * @author Thiago
 */
public class Esfera {
    
    public Esfera (){
        this.raio = 0.0f;
    }
    
    public Esfera(float raio){
        this.raio = raio;
    }
    
    private float raio;

    public float getraio() {
        return raio;
    }

    public void setraio(float raio) throws Exception{
       {
        if(raio <= 0 ) throw new Exception("O Raio não pode se menor que  0");
        this.raio = raio;
    }
    }
    
    public float calcularArea(){
        return 4*3.1415f * raio * raio;
    }
    public float calcularVolume(){
        return (4/3)*3.1415f * (raio *raio*raio);
    }
    
    
}