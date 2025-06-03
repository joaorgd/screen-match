package br.com.joaoroberto.modelos;

import br.com.joaoroberto.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel { //A palavra reservada "extends" é para ativar a herança.
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + getAnoDeLancamento() + ")";
    }
}
