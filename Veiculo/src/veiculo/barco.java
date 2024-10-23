package veiculo;

public class barco extends veiculo {
    private double comprimento;

    public barco(String modelo, String fabricante, int ano, double comprimento) {
        super(modelo, fabricante, ano);
        this.comprimento = comprimento;
    }

    @Override
    public String ligar() {
        return "O barco está ligado.";
    }

    @Override
    public String desligar() {
        return "O barco está desligado.";
    }

    @Override
    public String mover() {
        return "O barco está se movendo.";
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public String toString() {
        return "barco do flamengo" + "comprimento=" + comprimento + '}';
    }
    
}
