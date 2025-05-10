package br.com.joaoroberto.modelos;

public class Filme extends Titulo { //A palavra reservada "extends" é para ativar a herança.
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
