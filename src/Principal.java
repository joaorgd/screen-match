import br.com.joaoroberto.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("Star Wars");
        meuFilme.setAnoDeLancamento(1977);
        meuFilme.setDuracaoEmMinutos(121);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(8);
        meuFilme.avalia(7);
        //System.out.println("Soma das Avaliações: " + meuFilme.somaDasAvalicoes);
        System.out.println("Total das Avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média das Avaliações: " + meuFilme.pegaMedia());
    }
}
