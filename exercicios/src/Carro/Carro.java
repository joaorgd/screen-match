package Carro;

public class Carro {
    String modelo, cor;
    int ano, idadeAtual;

    void exibeFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
    }

    int exibeIdadeCarro(int idadeAtual){
        return idadeAtual -= ano;
    }
}