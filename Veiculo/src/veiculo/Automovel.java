/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veiculo;

/**
 *
 * @author Thiago
 */

public class Automovel extends veiculo {
    private int numPortas = 0;
    
    

    public Automovel(String modelo, String fabricante, int ano, int numPortas) {
        super(modelo, fabricante, ano);
        this.numPortas = numPortas;
    }

      @Override
    public String ligar() {
        return "O automovel está ligado.";
    }

    @Override
    public String desligar() {
        return "O automovel está desligado.";
    }

    @Override
    public String mover() {
        return "O automovel está se movendo.";
    }
    
  
    

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    @Override
    public String toString() {
        return "Automovel{" + "numPortas=" + numPortas + '}';
    }
    

  
}
