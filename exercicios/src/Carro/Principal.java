package Carro;

public class Principal {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.modelo = "Polo";
        carro.ano = 2018;
        carro.cor = "Branco";

        carro.exibeFichaTecnica();
        System.out.println("A idade do carro é: " + carro.exibeIdadeCarro(2025) + " ano(s)");
    }
}
