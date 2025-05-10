package Musica;

public class Principal {
    public static void main(String[] args) {

        Musica musica = new Musica();

        musica.titulo = "first order of business";
        musica.artista = "Baby Keem";
        musica.anoLancamento = 2021;

        musica.exibeFichaTecnica();

        musica.recebeAvaliacao(8);
        musica.recebeAvaliacao(6);
        musica.recebeAvaliacao(9);
        System.out.println("A média de avaliações é: " + musica.recebeMedia());
        System.out.println("O número de avaliações é: " + musica.numAvaliacoes);
    }
}
