/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista2;

/**
 *
 * @author Thiago
 */
public class Graduado extends Estudante {
    private int anoConclusao;
    private int anoColacaoGrau;
    private String numDiploma;

    public Graduado() {
    
    }

    public Graduado(String nome, String endereco, String telefone, String email, String matricula, String curso, String campus, int anoConclusao, int anoColacaoGrau, String numDiploma) {
        super(nome, endereco, telefone, email, matricula, curso, campus);
        this.anoConclusao = anoConclusao;
        this.anoColacaoGrau = anoColacaoGrau;
        this.numDiploma = numDiploma;
    }

    public int getAnoConclusao() {
        return anoConclusao;
    }

    public void setAnoConclusao(int anoConclusao) {
        this.anoConclusao = anoConclusao;
    }

    public int getAnoColacaoGrau() {
        return anoColacaoGrau;
    }

    public void setAnoColacaoGrau(int anoColacaoGrau) {
        this.anoColacaoGrau = anoColacaoGrau;
    }

    public String getNumDiploma() {
        return numDiploma;
    }

    public void setNumDiploma(String numDiploma) {
        this.numDiploma = numDiploma;
    }

    @Override
    public String toString() {
        return super.toString() + " Graduado [anoConclusao=" + anoConclusao + ", anoColacaoGrau=" + anoColacaoGrau + ", numDiploma=" + numDiploma + "]";
    }
}
