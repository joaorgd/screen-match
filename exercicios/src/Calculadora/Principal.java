package Calculadora;

public class Principal {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.num = 100;

        System.out.println("O dobro de " + calculadora.num + " é: " + calculadora.dobro());
    }
}
