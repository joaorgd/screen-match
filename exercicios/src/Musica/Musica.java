package Musica;

public class Musica {
    String titulo, artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibeFichaTecnica(){
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
    }

    void recebeAvaliacao(double nota){
        avaliacao += nota;
        numAvaliacoes++;
    }

    double recebeMedia(){
        return avaliacao / numAvaliacoes;
    }
}
