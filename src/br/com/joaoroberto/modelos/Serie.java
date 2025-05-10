package br.com.joaoroberto.modelos;

public class Serie {
    private int temporadas;
    private boolean ativa;
    private int episodioPorTemporada;
    private int minutoPorTemporada;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodioPorTemporada() {
        return episodioPorTemporada;
    }

    public void setEpisodioPorTemporada(int episodioPorTemporada) {
        this.episodioPorTemporada = episodioPorTemporada;
    }

    public int getMinutoPorTemporada() {
        return minutoPorTemporada;
    }

    public void setMinutoPorTemporada(int minutoPorTemporada) {
        this.minutoPorTemporada = minutoPorTemporada;
    }
}
