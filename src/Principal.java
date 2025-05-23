import br.com.joaoroberto.calculo.CalculdadoraDeTempo;
import br.com.joaoroberto.calculo.FiltroRecomendacao;
import br.com.joaoroberto.modelos.Episodio;
import br.com.joaoroberto.modelos.Filme;
import br.com.joaoroberto.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("Star Wars Episode IV: A New Hope");
        meuFilme.setAnoDeLancamento(1977);
        meuFilme.setDuracaoEmMinutos(121);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(8);
        meuFilme.avalia(7);
        //System.out.println("Soma das Avaliações: " + meuFilme.somaDasAvalicoes);
        System.out.println("Total das Avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média das Avaliações: " + meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2004);
        lost.setTemporadas(6);
        lost.setEpisodiosPorTemporada(18);
        lost.setMinutosPorEpisodio(50);
        lost.exibeFichaTecnica();
        System.out.println("Duração da maratona Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Star Wars Episode V: The Empire Strikes Back");
        outroFilme.setAnoDeLancamento(1980);
        outroFilme.setDuracaoEmMinutos(124);

        CalculdadoraDeTempo calculadora = new CalculdadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println("A duração do filme é de: " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacao(300);
        filtro.filtra(episodio);
    }
}
