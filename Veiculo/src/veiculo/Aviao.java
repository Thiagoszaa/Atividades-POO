/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veiculo;

/**
 *
 * @author Thiago
 */
public class Aviao extends veiculo {
    private int capacidadePassageiros;

    public Aviao(String modelo, String fabricante, int ano, int capacidadePassageiros) {
        super(modelo, fabricante, ano);
        this.capacidadePassageiros = capacidadePassageiros;
    }

   @Override
    public String ligar() {
        return "O avião está ligado.";
    }

    @Override
    public String desligar() {
        return "O avião está desligado.";
    }

    @Override
    public String mover() {
        return "O avião está se movendo.";
    }


    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    @Override
    public String toString() {
        return "Aviao do Flamengo" + "capacidadePassageiros=" + capacidadePassageiros + '}';
    }

    

}
